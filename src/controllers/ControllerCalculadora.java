/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
    import models.ModelCalculadora;
    import views.ViewCalculadora;
    import extras.DataValidation;
/**
 *
 * @author Octaviano
 */
public class ControllerCalculadora {
    ModelCalculadora modelCalculadora;
    ViewCalculadora viewCalculadora;  
    DataValidation dataValidation = new DataValidation();
    
    
   ActionListener al = new ActionListener() {
        @Override
        
        public void actionPerformed(ActionEvent e) {
          modelCalculadora.setNumero1(dataValidation.String2Float(viewCalculadora.jtf_numero1.getText()));
          modelCalculadora.setNumero2(dataValidation.String2Float(viewCalculadora.jtf_numero2.getText()));
          if (e.getSource()== viewCalculadora.jb_suma)modelCalculadora.setOperacion("+");
          else if (e.getSource()== viewCalculadora.jb_resta)modelCalculadora.setOperacion("-");
          else if (e.getSource()== viewCalculadora.jb_multiplicacion)modelCalculadora.setOperacion("*");
          else if (e.getSource()== viewCalculadora.jb_division)modelCalculadora.setOperacion("/");
          else if (e.getSource()== viewCalculadora.jb_modulo)modelCalculadora.setOperacion("%");
          else if (e.getSource()== viewCalculadora.jb_limpiar)jb_limpiar_action_performed();
          viewCalculadora.jl_resultado.setText(String.valueOf(modelCalculadora.operaciones()));
        }   
    };
   
    public ControllerCalculadora(ModelCalculadora modelCalculadora, ViewCalculadora viewCalculadora) {
        viewCalculadora.setVisible(true);
        this.modelCalculadora = modelCalculadora;
        this.viewCalculadora = viewCalculadora;
        this.viewCalculadora.jb_suma.addActionListener(al);
        this.viewCalculadora.jb_resta.addActionListener(al);
        this.viewCalculadora.jb_multiplicacion.addActionListener(al);
        this.viewCalculadora.jb_division.addActionListener(al);
        this.viewCalculadora.jb_modulo.addActionListener(al);
        this.viewCalculadora.jb_limpiar.addActionListener(al);
        initComponents();
    }
    public void jb_limpiar_action_performed() { //boton Limpiar
        viewCalculadora.setVisible(true);
        float numero1=0.0f;
        float numero2=0.0f;
        float resultado=0.0f;
        this.viewCalculadora.jtf_numero1.setText(String.valueOf(numero1));
        this.viewCalculadora.jtf_numero2.setText(String.valueOf(numero2));
        this.viewCalculadora.jl_resultado.setText(String.valueOf(resultado));
    } 
    public void initComponents(){
        viewCalculadora.setVisible(true);
        viewCalculadora.setTitle("Calculadora");
        viewCalculadora.setLocationRelativeTo(null);
        viewCalculadora.jtf_numero1.setText(String.valueOf(modelCalculadora.getNumero1()) );
        viewCalculadora.jtf_numero2.setText(String.valueOf(modelCalculadora.getNumero2()) );
        viewCalculadora.jl_resultado.setText(String.valueOf(modelCalculadora.getOperacion()) );
    }  

}