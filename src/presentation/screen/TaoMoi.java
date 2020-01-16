/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation.screen;

import presentation.screen.Main;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static presentation.screen.Main.bang_phu;
import static presentation.screen.Main.dung_thu_thap;
import static presentation.screen.Main.thu_thap;

/**
 *
 * @author hantr
 */
public class TaoMoi extends javax.swing.JFrame {

    /**
     * Creates new form TaoMoi
     */
    public TaoMoi() {
        initComponents();
        this.setLocationRelativeTo(null);
        ten.setText("NewCollection");
        valid.setVisible(false);
        setResizable(false);
        //setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ten = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        diachi = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        OK_taomoi = new javax.swing.JButton();
        Apply = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        valid = new javax.swing.JLabel();
        OK_rename = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tạo mới lần thu thập");

        jLabel1.setText("Tên ");

        ten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tenActionPerformed(evt);
            }
        });

        jLabel2.setText("Địa chỉ chứa thông tin thu thập");

        jButton1.setText("Browser");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        OK_taomoi.setText("OK");
        OK_taomoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OK_taomoiActionPerformed(evt);
            }
        });

        Apply.setText("Apply");
        Apply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApplyActionPerformed(evt);
            }
        });

        jButton4.setText("Cancel");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        valid.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        valid.setForeground(new java.awt.Color(255, 0, 0));
        valid.setText("Vui lòng nhập đầy đủ các thông tin!");

        OK_rename.setText("OK");
        OK_rename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OK_renameActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(diachi, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(26, 26, 26)
                                .addComponent(ten))
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(valid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(OK_taomoi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OK_rename)
                .addGap(25, 25, 25)
                .addComponent(Apply)
                .addGap(34, 34, 34)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valid)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OK_taomoi)
                    .addComponent(Apply)
                    .addComponent(jButton4)
                    .addComponent(OK_rename))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tenActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JFileChooser f = new JFileChooser();
        f.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        f.showSaveDialog(null);
        diachi.setText("" + f.getSelectedFile());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Main.tao_lan_thu_thap_moi.setVisible(true);
        Main.mo_lan_thu_thap_cu.setVisible(true);

        //Main.thu_thap.setEnabled(false);
        //Main.dung_thu_thap.setEnabled(false);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void OK_taomoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OK_taomoiActionPerformed
        // TODO add your handling code here:
        if (ten.getText().equals("") || diachi.getText().equals("")) {
            valid.setVisible(true);

        } else {
            Main.editt.setEnabled(true);
            thu_thap.setEnabled(true);
            dung_thu_thap.setEnabled(true);
            Main.tabpane.setVisible(true);
            Main.trang_thai_thu_thap_pane.setVisible(true);
            Main.ten.setText(ten.getText());
            Main.diachi.setText(diachi.getText());
            Main.loadTable(false, Main.bang1, Main.listAllVolatile);
            Main.loadTable(false, Main.bang2, Main.listAllNonVolatile);
            Main.nut_xem.setVisible(false);
            Main.nut_refresh.setVisible(false);

            bang_phu.setModel(new DefaultTableModel());
            // Model for Table
            DefaultTableModel model = new DefaultTableModel();
            bang_phu.setModel(model);

            // Add Column
            model.addColumn("TÊN THÔNG TIN");
            model.addColumn("OUTPUT");
            Main.b1.setVisible(true);
            Main.b2.setVisible(true);
            Main.chon_tat_ca.setVisible(true);

            this.dispose();
        }

    }//GEN-LAST:event_OK_taomoiActionPerformed

    private void ApplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApplyActionPerformed
        // TODO add your handling code here:
        if ((ten.getText().equals("") == false) && (diachi.getText().equals("") == false)) {
            valid.setVisible(false);
        }
    }//GEN-LAST:event_ApplyActionPerformed

    private void OK_renameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OK_renameActionPerformed
        // TODO add your handling code here:
        if (ten.getText().equals("") || diachi.getText().equals("")) {
            valid.setVisible(true);
        } else {
            Main.ten.setText(ten.getText());
            Main.diachi.setText(diachi.getText());
            this.dispose();
        }

    }//GEN-LAST:event_OK_renameActionPerformed

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
            java.util.logging.Logger.getLogger(TaoMoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaoMoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaoMoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaoMoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaoMoi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton Apply;
    public static javax.swing.JButton OK_rename;
    public static javax.swing.JButton OK_taomoi;
    public static javax.swing.JTextField diachi;
    private javax.swing.JButton jButton1;
    public static javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JTextField ten;
    private javax.swing.JLabel valid;
    // End of variables declaration//GEN-END:variables
}
