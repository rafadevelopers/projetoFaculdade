/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projetoacademia;

/**
 *
 * @author abner
 */
public class TelaTreinos extends javax.swing.JFrame {

    /**
     * Creates new form TelaTreinos
     */
    public TelaTreinos() {
        initComponents();
         lblTreinoA.setVisible(false);
        lblTreinoB.setVisible(false);
        lblTreinoC.setVisible(false);
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
        lblTreinoA = new javax.swing.JLabel();
        lblTreinoB = new javax.swing.JLabel();
        lblTreinoC = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmnTreinoA = new javax.swing.JMenu();
        jmnTrenoA = new javax.swing.JMenuItem();
        jmnTreinoB = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        lblTreinoA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/736b9d666682553e91b79bd50d583e95.jpg"))); // NOI18N
        lblTreinoA.setText("treino A");
        jPanel1.add(lblTreinoA);
        lblTreinoA.setBounds(0, 0, 320, 320);

        lblTreinoB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/736b9d666682553e91b79bd50d583e95.png"))); // NOI18N
        lblTreinoB.setText("TreinoB");
        jPanel1.add(lblTreinoB);
        lblTreinoB.setBounds(0, 0, 320, 300);

        lblTreinoC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/zxcxzczxc.png"))); // NOI18N
        lblTreinoC.setText("TreinoC");
        jPanel1.add(lblTreinoC);
        lblTreinoC.setBounds(0, 0, 320, 338);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 320, 350);

        jmnTreinoA.setText("Treinos");

        jmnTrenoA.setText("Treino A");
        jmnTrenoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnTrenoAActionPerformed(evt);
            }
        });
        jmnTreinoA.add(jmnTrenoA);

        jmnTreinoB.setText("Treino B");
        jmnTreinoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnTreinoBActionPerformed(evt);
            }
        });
        jmnTreinoA.add(jmnTreinoB);

        jMenuItem3.setText("Treino C");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jmnTreinoA.add(jMenuItem3);

        jMenuBar1.add(jmnTreinoA);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(332, 395));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmnTrenoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnTrenoAActionPerformed
         lblTreinoA.setVisible(true);
        lblTreinoB.setVisible(false);
        lblTreinoC.setVisible(false);
    }//GEN-LAST:event_jmnTrenoAActionPerformed

    private void jmnTreinoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnTreinoBActionPerformed
        lblTreinoA.setVisible(false);
        lblTreinoB.setVisible(true);
        lblTreinoC.setVisible(false);
    }//GEN-LAST:event_jmnTreinoBActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        lblTreinoA.setVisible(false);
        lblTreinoB.setVisible(false);
        lblTreinoC.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaTreinos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaTreinos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaTreinos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaTreinos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaTreinos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu jmnTreinoA;
    private javax.swing.JMenuItem jmnTreinoB;
    private javax.swing.JMenuItem jmnTrenoA;
    private javax.swing.JLabel lblTreinoA;
    private javax.swing.JLabel lblTreinoB;
    private javax.swing.JLabel lblTreinoC;
    // End of variables declaration//GEN-END:variables
}
