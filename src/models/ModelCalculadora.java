/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Octaviano
 */
public class ModelCalculadora {
    private float numero1=0.0f;
    private float numero2=0.0f;
    private String operacion=""; //esta variable sirve para almacenar que aoprador fue seleccionado
    //para posteriormente realizar su operacion. 
    private float resultado=0.0f; 

    public float getNumero1() {
        return numero1;
    }

    public void setNumero1(float numero1) {
        this.numero1 = numero1;
    }

    public float getNumero2() {
        return numero2;
    }

    public void setNumero2(float numero2) {
        this.numero2 = numero2;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    } 
    
    public float operaciones(){ 
        // compara si la opracion seleccionada es igual al simbolo
        if (operacion.equals("+")){
            return resultado = numero1 + numero2;
        }
        if (operacion.equals("-")){
            return resultado = numero1 - numero2;
        }
        if (operacion.equals("*")){
            return resultado = numero1 * numero2;
        }
        if (operacion.equals("/")){
            return resultado = numero1 / numero2;
        }
        if (operacion.equals("%")){
            return resultado = numero1 % numero2;
        }
        return 0;
        
    }    
}

