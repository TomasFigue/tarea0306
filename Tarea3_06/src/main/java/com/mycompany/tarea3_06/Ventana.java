/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tarea3_06;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author tom59
 */
public class Ventana extends javax.swing.JFrame implements MouseListener {

    /**
     * Creates new form Ventana
     */
    public Ventana() {
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

        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 672, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 468, Short.MAX_VALUE)
        );

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estrella", "C??rculo", "Cuadrado", "Rect??ngulo", "Tri??ngulo" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Figura");

        jLabel2.setText("Color");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Amarillo", "Azul", "Rojo", "Verde" }));

        jButton1.setText("Graficar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Borrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(247, 247, 247)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBox1, 0, 127, Short.MAX_VALUE)
                                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(23, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(32, 32, 32)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int fig, col;


    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        fig = this.jComboBox1.getSelectedIndex();
        col = this.jComboBox2.getSelectedIndex();

        //
        if (fig == 0 && col == 0) {
            Tarea3_06.EstrellaA(jPanel1.getGraphics());
        }
        if (fig == 0 && col == 1) {
            Tarea3_06.EstrellaAZ(jPanel1.getGraphics());
        }
        if (fig == 0 && col == 2) {
            Tarea3_06.EstrellaR(jPanel1.getGraphics());
        }
        if (fig == 0 && col == 3) {
            Tarea3_06.EstrellaG(jPanel1.getGraphics());
        }
        //
        if (fig == 1 && col == 0) {
            Tarea3_06.CirculoA(jPanel1.getGraphics());
        }
        if (fig == 1 && col == 1) {
            Tarea3_06.CirculoAZ(jPanel1.getGraphics());
        }
        if (fig == 1 && col == 2) {
            Tarea3_06.CirculoR(jPanel1.getGraphics());
        }
        if (fig == 1 && col == 3) {
            Tarea3_06.CirculoG(jPanel1.getGraphics());
        }
        //
        if (fig == 2 && col == 0) {
            Tarea3_06.CuadradoA(jPanel1.getGraphics());
        }
        if (fig == 2 && col == 1) {
            Tarea3_06.CuadradoAZ(jPanel1.getGraphics());
        }
        if (fig == 2 && col == 2) {
            Tarea3_06.CuadradoR(jPanel1.getGraphics());
        }
        if (fig == 2 && col == 3) {
            Tarea3_06.CuadradoG(jPanel1.getGraphics());
        }
        //
        if (fig == 3 && col == 0) {
            Tarea3_06.RectanguloA(jPanel1.getGraphics());
        }
        if (fig == 3 && col == 1) {
            Tarea3_06.RectanguloAZ(jPanel1.getGraphics());
        }
        if (fig == 3 && col == 2) {
            Tarea3_06.RectanguloR(jPanel1.getGraphics());
        }
        if (fig == 3 && col == 3) {
            Tarea3_06.RectanguloG(jPanel1.getGraphics());
        }
        //
        if (fig == 4 && col == 0) {
            Tarea3_06.TrianguloA(jPanel1.getGraphics());
        }
        if (fig == 4 && col == 1) {
            Tarea3_06.TrianguloAZ(jPanel1.getGraphics());
        }
        if (fig == 4 && col == 2) {
            Tarea3_06.TrianguloR(jPanel1.getGraphics());
        }
        if (fig == 4 && col == 3) {
            Tarea3_06.TrianguloG(jPanel1.getGraphics());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.jPanel1.removeAll();
        this.jPanel1.repaint();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        fig = this.jComboBox1.getSelectedIndex();
        col = this.jComboBox2.getSelectedIndex();
        if (fig == 0 && col == 0) {
            Tarea3_06.EstrellaA(jPanel1.getGraphics());
        }
        if (fig == 0 && col == 1) {
            Tarea3_06.EstrellaAZ(jPanel1.getGraphics());
        }
        if (fig == 0 && col == 2) {
            Tarea3_06.EstrellaR(jPanel1.getGraphics());
        }
        if (fig == 0 && col == 3) {
            Tarea3_06.EstrellaG(jPanel1.getGraphics());
        }
        //
        if (fig == 1 && col == 0) {
            Tarea3_06.CirculoA(jPanel1.getGraphics());
        }
        if (fig == 1 && col == 1) {
            Tarea3_06.CirculoAZ(jPanel1.getGraphics());
        }
        if (fig == 1 && col == 2) {
            Tarea3_06.CirculoR(jPanel1.getGraphics());
        }
        if (fig == 1 && col == 3) {
            Tarea3_06.CirculoG(jPanel1.getGraphics());
        }
        //
        if (fig == 2 && col == 0) {
            Tarea3_06.CuadradoA(jPanel1.getGraphics());
        }
        if (fig == 2 && col == 1) {
            Tarea3_06.CuadradoAZ(jPanel1.getGraphics());
        }
        if (fig == 2 && col == 2) {
            Tarea3_06.CuadradoR(jPanel1.getGraphics());
        }
        if (fig == 2 && col == 3) {
            Tarea3_06.CuadradoG(jPanel1.getGraphics());
        }
        //
        if (fig == 3 && col == 0) {
            Tarea3_06.RectanguloA(jPanel1.getGraphics());
        }
        if (fig == 3 && col == 1) {
            Tarea3_06.RectanguloAZ(jPanel1.getGraphics());
        }
        if (fig == 3 && col == 2) {
            Tarea3_06.RectanguloR(jPanel1.getGraphics());
        }
        if (fig == 3 && col == 3) {
            Tarea3_06.RectanguloG(jPanel1.getGraphics());
        }
        //
        if (fig == 4 && col == 0) {
            Tarea3_06.TrianguloA(jPanel1.getGraphics());
        }
        if (fig == 4 && col == 1) {
            Tarea3_06.TrianguloAZ(jPanel1.getGraphics());
        }
        if (fig == 4 && col == 2) {
            Tarea3_06.TrianguloR(jPanel1.getGraphics());
        }
        if (fig == 4 && col == 3) {
            Tarea3_06.TrianguloG(jPanel1.getGraphics());
        }
    }//GEN-LAST:event_jPanel1MouseClicked

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

@Override
public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

