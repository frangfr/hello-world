/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia3programafinal;

/**
 *
 * @author Instructor
 */
public class MenuReportes extends javax.swing.JFrame {

    /**
     * Creates new form MenuReportes
     */
    public MenuReportes() {
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

        jBfalla = new javax.swing.JButton();
        jBtrabajador = new javax.swing.JButton();
        jBocurrencia = new javax.swing.JButton();
        jBreportes = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jBvolver1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBfalla.setText("Reporte 1");
        jBfalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBfallaActionPerformed(evt);
            }
        });

        jBtrabajador.setText("Reporte 2");
        jBtrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtrabajadorActionPerformed(evt);
            }
        });

        jBocurrencia.setText("Reporte 3");
        jBocurrencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBocurrenciaActionPerformed(evt);
            }
        });

        jBreportes.setText("Reporte 4");
        jBreportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBreportesActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Reportes");

        jBvolver1.setText("Regresar");
        jBvolver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBvolver1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBvolver1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(91, 91, 91))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBfalla, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBocurrencia, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBreportes, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jBvolver1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBfalla)
                    .addComponent(jBtrabajador)
                    .addComponent(jBreportes)
                    .addComponent(jBocurrencia))
                .addContainerGap(236, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBfallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBfallaActionPerformed
        // TODO add your handling code here:
        TablaFalla tf=new TablaFalla();
        dispose();
        tf.show();
    }//GEN-LAST:event_jBfallaActionPerformed

    private void jBtrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtrabajadorActionPerformed
        // TODO add your handling code here:
        TablaTrabajador tt=new TablaTrabajador();
        dispose();
        tt.show();
    }//GEN-LAST:event_jBtrabajadorActionPerformed

    private void jBocurrenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBocurrenciaActionPerformed
        // TODO add your handling code here:
        TablaOcurrencia to=new TablaOcurrencia();
        dispose();
        to.show();
    }//GEN-LAST:event_jBocurrenciaActionPerformed

    private void jBreportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBreportesActionPerformed
        // TODO add your handling code here:
        MenuReportes mr=new MenuReportes();
        dispose();
        mr.show();
    }//GEN-LAST:event_jBreportesActionPerformed

    private void jBvolver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBvolver1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBvolver1ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuReportes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBfalla;
    private javax.swing.JButton jBocurrencia;
    private javax.swing.JButton jBreportes;
    private javax.swing.JButton jBtrabajador;
    private javax.swing.JButton jBvolver1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
