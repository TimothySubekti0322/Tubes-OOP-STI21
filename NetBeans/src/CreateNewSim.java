/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ilmag
 */
public class CreateNewSim extends javax.swing.JFrame {

    /**
     * Creates new form CreateNewSim
     */
    public CreateNewSim() {
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

        txtFieldSimName = new javax.swing.JTextField();
        lblCreateNewSim = new javax.swing.JLabel();
        lblKekenyangan = new javax.swing.JLabel();
        lblMood = new javax.swing.JLabel();
        progbarMood = new javax.swing.JProgressBar();
        progbarKekenyangan = new javax.swing.JProgressBar();
        lblKesehatan = new javax.swing.JLabel();
        progbarKesehatan = new javax.swing.JProgressBar();
        lblNama = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        lblPekerjaan = new javax.swing.JLabel();
        scrollpaneStatus = new javax.swing.JScrollPane();
        txtpaneStatus = new javax.swing.JTextPane();
        lblStatus = new javax.swing.JLabel();
        scrollpanePekerjaan = new javax.swing.JScrollPane();
        textpanePekerjaan = new javax.swing.JTextPane();
        lblUang = new javax.swing.JLabel();
        lblProgBarMood = new javax.swing.JLabel();
        lblProgBarKekenyangan = new javax.swing.JLabel();
        lblProgBarKesehatan = new javax.swing.JLabel();
        txtFieldUang = new javax.swing.JTextField();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtFieldSimName.setText("Melly");
        txtFieldSimName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldSimNameActionPerformed(evt);
            }
        });

        lblCreateNewSim.setFont(new java.awt.Font("Public Sans", 1, 12)); // NOI18N
        lblCreateNewSim.setText("CREATE NEW SIM");

        lblKekenyangan.setFont(new java.awt.Font("Public Sans", 0, 12)); // NOI18N
        lblKekenyangan.setText("Kekenyangan");

        lblMood.setFont(new java.awt.Font("Public Sans", 0, 12)); // NOI18N
        lblMood.setText("Mood");

        lblKesehatan.setFont(new java.awt.Font("Public Sans", 0, 12)); // NOI18N
        lblKesehatan.setText("Kesehatan");

        lblNama.setFont(new java.awt.Font("Public Sans", 0, 12)); // NOI18N
        lblNama.setText("Nama");

        btnCreate.setText("CREATE");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        lblPekerjaan.setFont(new java.awt.Font("Public Sans", 0, 12)); // NOI18N
        lblPekerjaan.setText("Pekerjaan");

        txtpaneStatus.setText("Sim baru tidak punya status.");
        scrollpaneStatus.setViewportView(txtpaneStatus);

        lblStatus.setFont(new java.awt.Font("Public Sans", 0, 12)); // NOI18N
        lblStatus.setText("Status");

        textpanePekerjaan.setText("Programmer $45/hari");
        scrollpanePekerjaan.setViewportView(textpanePekerjaan);

        lblUang.setFont(new java.awt.Font("Public Sans", 0, 12)); // NOI18N
        lblUang.setText("Uang");

        lblProgBarMood.setFont(new java.awt.Font("Public Sans", 0, 12)); // NOI18N
        lblProgBarMood.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProgBarMood.setText("100");

        lblProgBarKekenyangan.setFont(new java.awt.Font("Public Sans", 0, 12)); // NOI18N
        lblProgBarKekenyangan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProgBarKekenyangan.setText("100");

        lblProgBarKesehatan.setFont(new java.awt.Font("Public Sans", 0, 12)); // NOI18N
        lblProgBarKesehatan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProgBarKesehatan.setText("100");

        txtFieldUang.setText("$2.147.483.647");
        txtFieldUang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldUangActionPerformed(evt);
            }
        });

        btnClose.setFont(new java.awt.Font("Public Sans SemiBold", 1, 12)); // NOI18N
        btnClose.setText("X");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollpaneStatus)
                    .addComponent(txtFieldSimName)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrollpanePekerjaan, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPekerjaan))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtFieldUang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblUang))
                            .addComponent(btnCreate, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblCreateNewSim)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnClose))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblNama)
                                .addComponent(lblStatus)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblKesehatan)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(progbarKesehatan, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(lblMood)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(progbarMood, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(lblKekenyangan)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(progbarKekenyangan, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(lblProgBarMood, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblProgBarKesehatan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(lblProgBarKekenyangan))))
                            .addGap(0, 0, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCreateNewSim)
                    .addComponent(btnClose))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNama)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFieldSimName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblKekenyangan)
                    .addComponent(progbarKekenyangan, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProgBarKekenyangan, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(progbarMood, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMood)
                    .addComponent(lblProgBarMood))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(progbarKesehatan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblKesehatan, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(lblProgBarKesehatan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblStatus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollpaneStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPekerjaan)
                    .addComponent(lblUang))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtFieldUang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCreate))
                    .addComponent(scrollpanePekerjaan))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFieldSimNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldSimNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldSimNameActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCreateActionPerformed

    private void txtFieldUangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldUangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldUangActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCloseActionPerformed

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
            java.util.logging.Logger.getLogger(CreateNewSim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateNewSim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateNewSim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateNewSim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateNewSim().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel lblCreateNewSim;
    private javax.swing.JLabel lblKekenyangan;
    private javax.swing.JLabel lblKesehatan;
    private javax.swing.JLabel lblMood;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblPekerjaan;
    private javax.swing.JLabel lblProgBarKekenyangan;
    private javax.swing.JLabel lblProgBarKesehatan;
    private javax.swing.JLabel lblProgBarMood;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblUang;
    private javax.swing.JProgressBar progbarKekenyangan;
    private javax.swing.JProgressBar progbarKesehatan;
    private javax.swing.JProgressBar progbarMood;
    private javax.swing.JScrollPane scrollpanePekerjaan;
    private javax.swing.JScrollPane scrollpaneStatus;
    private javax.swing.JTextPane textpanePekerjaan;
    private javax.swing.JTextField txtFieldSimName;
    private javax.swing.JTextField txtFieldUang;
    private javax.swing.JTextPane txtpaneStatus;
    // End of variables declaration//GEN-END:variables
}
