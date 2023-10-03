/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import clases.Cuadrado;
import clases.Figura;
import clases.Rectangulo;
import javax.swing.JOptionPane;

/**
 *
 * @author labtecweb10
 */
public class Main extends javax.swing.JFrame {

    // 1 = square 2 = Rect
    private int figure;

    /**
     * Creates new form Main
     */
    public Main() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        radioSquare = new javax.swing.JRadioButton();
        radioRect = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        txtLlado = new javax.swing.JTextField();
        txtWidth = new javax.swing.JTextField();
        labelRect = new javax.swing.JLabel();
        buttonCalculate = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        labelRes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(radioSquare);
        radioSquare.setText("Cuadrado");
        radioSquare.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                radioSquareStateChanged(evt);
            }
        });
        getContentPane().add(radioSquare, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 114, -1, -1));

        buttonGroup1.add(radioRect);
        radioRect.setText("Rectangulo");
        getContentPane().add(radioRect, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 114, -1, -1));

        jLabel1.setText("Valor de un lado");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 166, -1, -1));
        getContentPane().add(txtLlado, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 190, 100, -1));
        getContentPane().add(txtWidth, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 190, 100, -1));

        labelRect.setText("Valor del ancho");
        getContentPane().add(labelRect, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 166, -1, -1));

        buttonCalculate.setText("Calcular  Area");
        buttonCalculate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonCalculateMouseClicked(evt);
            }
        });
        getContentPane().add(buttonCalculate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, -1, -1));

        jLabel3.setText("Calculadora de area");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 36, -1, -1));
        getContentPane().add(labelRes, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 150, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCalculateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCalculateMouseClicked

        String val1 = this.txtLlado.getText().trim();
        String val2 = this.txtWidth.getText().trim();
        
        float lado1 = 0;
        float lado2 = 0;

        try {
            lado1 = Float.valueOf(val1);
            lado2 = Float.valueOf(val2);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Solo debe ingresar valores flotantes");
        }

        
        Figura obj;
        
        if (figure == 1) {
            obj = new Cuadrado(lado1);
        } else {
            obj = new Rectangulo(lado1, lado2);
        }
        
        float response = obj.calcularArea();
        
        labelRes.setText(String.valueOf(response));

    }//GEN-LAST:event_buttonCalculateMouseClicked

    private void radioSquareStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_radioSquareStateChanged
        figure = radioSquare.isSelected() ? 1 : 2;
        txtWidth.setVisible(!radioSquare.isSelected());
        labelRect.setVisible(!radioSquare.isSelected());
    }//GEN-LAST:event_radioSquareStateChanged

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCalculate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labelRect;
    private javax.swing.JLabel labelRes;
    private javax.swing.JRadioButton radioRect;
    private javax.swing.JRadioButton radioSquare;
    private javax.swing.JTextField txtLlado;
    private javax.swing.JTextField txtWidth;
    // End of variables declaration//GEN-END:variables
}
