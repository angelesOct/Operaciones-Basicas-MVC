/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author Octaviano
 */
public class ViewCalculadora extends javax.swing.JFrame {

    /**
     * Creates new form ViewCalculadora
     */
    public ViewCalculadora() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp_TITULO = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jp_CONTENIDO = new javax.swing.JPanel();
        jl_numero1 = new javax.swing.JLabel();
        jl_numero2 = new javax.swing.JLabel();
        jtf_numero1 = new javax.swing.JTextField();
        jtf_numero2 = new javax.swing.JTextField();
        jb_suma = new javax.swing.JButton();
        jb_resta = new javax.swing.JButton();
        jb_multiplicacion = new javax.swing.JButton();
        jb_division = new javax.swing.JButton();
        jb_modulo = new javax.swing.JButton();
        jb_limpiar = new javax.swing.JButton();
        jl_R = new javax.swing.JLabel();
        jl_resultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jp_TITULO.setBackground(new java.awt.Color(153, 0, 0));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CALCULADORA BASICA");

        javax.swing.GroupLayout jp_TITULOLayout = new javax.swing.GroupLayout(jp_TITULO);
        jp_TITULO.setLayout(jp_TITULOLayout);
        jp_TITULOLayout.setHorizontalGroup(
            jp_TITULOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_TITULOLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jp_TITULOLayout.setVerticalGroup(
            jp_TITULOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_TITULOLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel6)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jl_numero1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jl_numero1.setText("Numero 1");

        jl_numero2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jl_numero2.setText("Numero 2");

        jb_suma.setBackground(new java.awt.Color(153, 0, 0));
        jb_suma.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jb_suma.setForeground(new java.awt.Color(255, 255, 255));
        jb_suma.setText("+");

        jb_resta.setBackground(new java.awt.Color(153, 0, 0));
        jb_resta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jb_resta.setForeground(new java.awt.Color(255, 255, 255));
        jb_resta.setText("-");

        jb_multiplicacion.setBackground(new java.awt.Color(153, 0, 0));
        jb_multiplicacion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jb_multiplicacion.setForeground(new java.awt.Color(255, 255, 255));
        jb_multiplicacion.setText("*");

        jb_division.setBackground(new java.awt.Color(153, 0, 0));
        jb_division.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jb_division.setForeground(new java.awt.Color(255, 255, 255));
        jb_division.setText("/");

        jb_modulo.setBackground(new java.awt.Color(153, 0, 0));
        jb_modulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jb_modulo.setForeground(new java.awt.Color(255, 255, 255));
        jb_modulo.setText("%");

        jb_limpiar.setBackground(new java.awt.Color(153, 0, 0));
        jb_limpiar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jb_limpiar.setForeground(new java.awt.Color(255, 255, 255));
        jb_limpiar.setText("limpiar");

        javax.swing.GroupLayout jp_CONTENIDOLayout = new javax.swing.GroupLayout(jp_CONTENIDO);
        jp_CONTENIDO.setLayout(jp_CONTENIDOLayout);
        jp_CONTENIDOLayout.setHorizontalGroup(
            jp_CONTENIDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_CONTENIDOLayout.createSequentialGroup()
                .addGroup(jp_CONTENIDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_numero1)
                    .addComponent(jl_numero2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_CONTENIDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtf_numero2)
                    .addComponent(jtf_numero1)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_CONTENIDOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_CONTENIDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jb_suma, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(jb_division, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jp_CONTENIDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_resta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jb_modulo, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jp_CONTENIDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jb_multiplicacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jb_limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)))
        );
        jp_CONTENIDOLayout.setVerticalGroup(
            jp_CONTENIDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_CONTENIDOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_CONTENIDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_numero1)
                    .addComponent(jtf_numero1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jp_CONTENIDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_numero2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_numero2))
                .addGap(18, 39, Short.MAX_VALUE)
                .addGroup(jp_CONTENIDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_suma, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_resta, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_multiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jp_CONTENIDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_division, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_modulo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jl_R.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jl_R.setText("RESULTADO: ");

        jl_resultado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jl_resultado.setText("0.0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_TITULO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jp_CONTENIDO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jl_R)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_resultado)
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jp_TITULO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jp_CONTENIDO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jl_R)
                            .addComponent(jl_resultado))))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel jLabel6;
    public javax.swing.JButton jb_division;
    public javax.swing.JButton jb_limpiar;
    public javax.swing.JButton jb_modulo;
    public javax.swing.JButton jb_multiplicacion;
    public javax.swing.JButton jb_resta;
    public javax.swing.JButton jb_suma;
    public javax.swing.JLabel jl_R;
    public javax.swing.JLabel jl_numero1;
    public javax.swing.JLabel jl_numero2;
    public javax.swing.JLabel jl_resultado;
    public javax.swing.JPanel jp_CONTENIDO;
    public javax.swing.JPanel jp_TITULO;
    public javax.swing.JTextField jtf_numero1;
    public javax.swing.JTextField jtf_numero2;
    // End of variables declaration//GEN-END:variables
}
