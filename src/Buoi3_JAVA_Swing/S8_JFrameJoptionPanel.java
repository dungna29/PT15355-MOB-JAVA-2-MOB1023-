/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi3_JAVA_Swing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author LegendNguyen
 */
public class S8_JFrameJoptionPanel extends javax.swing.JFrame {

    /**
     * Creates new form JFrameJoptionPanel
     */
    public S8_JFrameJoptionPanel() {
        initComponents();
    }

    boolean KiemTraKieuSo(String input) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    boolean KiemTraKieuChu(String input) {
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_check = new javax.swing.JButton();
        txt_CheckSo = new javax.swing.JTextField();
        lbl_ThongBao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_check.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_check.setText("CHECK");
        btn_check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_checkActionPerformed(evt);
            }
        });

        txt_CheckSo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_CheckSo.setText("Nhập số nguyên");

        lbl_ThongBao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_ThongBao.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_CheckSo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(lbl_ThongBao))
                    .addComponent(btn_check, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_CheckSo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_ThongBao))
                .addGap(18, 18, 18)
                .addComponent(btn_check, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_checkActionPerformed
        if (KiemTraKieuSo(txt_CheckSo.getText())) {
           int a;
            a = JOptionPane.showConfirmDialog(this, "Bạn đã nhập đúng kiểu số nguyên","DUNGNA29",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);
            if (a == JOptionPane.YES_OPTION) {
                lbl_ThongBao.setText("Người dùng đã chọn Yes");
            }else if(a == JOptionPane.NO_OPTION){
                lbl_ThongBao.setText("Người dùng đã chọn No");
            }else if(a == JOptionPane.CANCEL_OPTION){
                lbl_ThongBao.setText("Người dùng đã chọn Cancel");
            }
        } else if (KiemTraKieuChu(txt_CheckSo.getText())) {
            JOptionPane.showConfirmDialog(this, "Bạn đã nhập kiểu chữ vui lòng nhập lại");
        } else {
            JOptionPane.showConfirmDialog(this, "Bạn đã nhập kiểu ký tự vui lòng nhập đúng số nguyên");
        }

//        if (KiemTraKieuSo(txt_CheckSo.getText())) {
//            JOptionPane.showMessageDialog(this, "Bạn đã nhập đúng kiểu số nguyên");
//        } else if (KiemTraKieuChu(txt_CheckSo.getText())) {
//            JOptionPane.showMessageDialog(this, "Bạn đã nhập kiểu chữ vui lòng nhập lại");
//        } else {
//            JOptionPane.showMessageDialog(this, "Bạn đã nhập kiểu ký tự vui lòng nhập đúng số nguyên");
//        }
    }//GEN-LAST:event_btn_checkActionPerformed

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
            java.util.logging.Logger.getLogger(S8_JFrameJoptionPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(S8_JFrameJoptionPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(S8_JFrameJoptionPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(S8_JFrameJoptionPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new S8_JFrameJoptionPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_check;
    private javax.swing.JLabel lbl_ThongBao;
    private javax.swing.JTextField txt_CheckSo;
    // End of variables declaration//GEN-END:variables
}
