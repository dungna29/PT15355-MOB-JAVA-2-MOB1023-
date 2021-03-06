/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB6_Va_FINAL_ASS;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Nguyen Anh Dung
 */
public class Main extends javax.swing.JFrame {

    Service service;
    UserPOLY userPOLY;

    /**
     * Creates new form Main
     */
    public Main() throws ClassNotFoundException, IOException {
        initComponents();
        service = new Service();
        setLocationRelativeTo(null);// Khi hiển thị chương trình sẽ hiển thị ở giữa
        setResizable(false);// Không cho phép Resize Form   
        loadTable();
    }

    void lamMoi() {
        txt_user.setText(null);
        txt_matkhau.setText(null);
        txt_mk2.setText(null);
    }

    void loadTable() throws ClassNotFoundException, IOException {
        String[] headerTable = {"Id", "Mật Khẩu"};

        for (int i = 0; i < tbl_User.getColumnCount(); i++) {
            TableColumn column = tbl_User.getTableHeader().getColumnModel().getColumn(i);
            column.setHeaderValue(headerTable[i]);
        }

        //DefaultTableModel
        DefaultTableModel defaultTableModel = (DefaultTableModel) tbl_User.getModel();
        defaultTableModel.setRowCount(0);

        //Lấy dữ liệu ra từ File đọc lên
        List<UserPOLY> lstUserPOLYs = service.getListUserPOLYs();
        for (UserPOLY x : lstUserPOLYs) {
            defaultTableModel.addRow(new Object[]{x.getUserID(), x.getPass()});
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        txt_user = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_matkhau = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_mk2 = new javax.swing.JTextField();
        btn_LamMoi = new javax.swing.JButton();
        Time = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btn_SuaTk = new javax.swing.JButton();
        btn_XoaTk = new javax.swing.JButton();
        btn_TimKiem = new javax.swing.JButton();
        btn_TaoTK = new javax.swing.JButton();
        Quyền1 = new javax.swing.JLabel();
        cbc_PhanQuyen = new javax.swing.JComboBox<>();
        Quyền = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        btn_ReadFile = new javax.swing.JButton();
        btn_SAVE = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_User = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Tài Khoản:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 76, -1, -1));

        txt_user.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txt_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 76, 240, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Mật khẩu:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 116, -1, -1));

        txt_matkhau.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txt_matkhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 116, 240, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Nhắc lại MK:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 156, -1, -1));

        txt_mk2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txt_mk2, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 156, 240, -1));

        btn_LamMoi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_LamMoi.setText("Làm Mới");
        btn_LamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LamMoiActionPerformed(evt);
            }
        });
        getContentPane().add(btn_LamMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 26, 100, 46));

        Time.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Time.setForeground(new java.awt.Color(0, 0, 204));
        Time.setText("Time");
        getContentPane().add(Time, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 26, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setText("QUẢN LÝ TÀI KHOẢN");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 27, -1, -1));

        btn_SuaTk.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_SuaTk.setText("Sửa TK");
        btn_SuaTk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SuaTkActionPerformed(evt);
            }
        });
        getContentPane().add(btn_SuaTk, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 134, 160, 46));

        btn_XoaTk.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_XoaTk.setText("Xóa TK");
        btn_XoaTk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XoaTkActionPerformed(evt);
            }
        });
        getContentPane().add(btn_XoaTk, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 76, 150, 46));

        btn_TimKiem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_TimKiem.setText("Tìm Kiếm");
        btn_TimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TimKiemActionPerformed(evt);
            }
        });
        getContentPane().add(btn_TimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 136, 150, 46));

        btn_TaoTK.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_TaoTK.setText("Tạo TK");
        btn_TaoTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TaoTKActionPerformed(evt);
            }
        });
        getContentPane().add(btn_TaoTK, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 77, 160, 46));

        Quyền1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Quyền1.setText("Phân Quyền:");
        getContentPane().add(Quyền1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        cbc_PhanQuyen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cbc_PhanQuyen, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 70, -1));

        Quyền.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Quyền.setText("Giới Tính:");
        getContentPane().add(Quyền, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, -1, -1));

        jRadioButton2.setText("Nam");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, -1, -1));

        jRadioButton1.setText("Nữ");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("ĐỀ THI LAB 6");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, -1, -1));

        btn_ReadFile.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_ReadFile.setText("READ FILE");
        btn_ReadFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ReadFileActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ReadFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 470, 150, 46));

        btn_SAVE.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_SAVE.setText("SAVE");
        btn_SAVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SAVEActionPerformed(evt);
            }
        });
        getContentPane().add(btn_SAVE, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 470, 150, 46));

        tbl_User.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbl_User);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 760, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_LamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LamMoiActionPerformed
        txt_user.setText(null);
        txt_matkhau.setText(null);
        txt_mk2.setText(null);

    }//GEN-LAST:event_btn_LamMoiActionPerformed

    private void btn_SuaTkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SuaTkActionPerformed
        if (txt_user.getText().isBlank() && txt_matkhau.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Bạn không được để null các ô khi muốn sửa");
            return;
        } else if (service.getIndexUser(txt_user.getText()) == - 1) {
            JOptionPane.showMessageDialog(this, "Tài khoản không tìm thấy trong danh sách");
            return;
        } else {
            try {
                String userinput = txt_user.getText().trim();
                String pasString = txt_matkhau.getText().trim();
                userPOLY = new UserPOLY(userinput, pasString);
                if (service.suaTaiKhoan(userPOLY)) {
                    try {
                        JOptionPane.showMessageDialog(this, "Bạn đã sửa thành công");
                        lamMoi();
                        loadTable();
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Sửa thất bại");
                }
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_btn_SuaTkActionPerformed

    private void btn_XoaTkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XoaTkActionPerformed
        if (txt_user.getText().isBlank() && txt_matkhau.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Bạn không được để null các ô khi muốn sửa");
            return;
        } else if (service.getIndexUser(txt_user.getText()) == - 1) {
            JOptionPane.showMessageDialog(this, "Tài khoản không tìm thấy trong danh sách");
            return;
        }
        int a = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn xóa không", "Cảnh Báo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (a == JOptionPane.YES_OPTION) {
            try {
                if (service.xoaTaiKhoan(service.getIndexUser(txt_user.getText().trim()))) {
                    JOptionPane.showMessageDialog(this, "Bạn đã xóa thành công");
                    loadTable();
                    lamMoi();
                }else{
                    JOptionPane.showMessageDialog(this, "Bạn đã xóa thất bại");
                }
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (a == JOptionPane.NO_OPTION) {
            
        }
    }//GEN-LAST:event_btn_XoaTkActionPerformed

    private void btn_TimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TimKiemActionPerformed
        try {
            String temp = JOptionPane.showInputDialog("Mời bạn nhập User cần tìm");
            if (temp.isBlank()) {
                return;
            }
            int a = service.getIndexUser(temp);
            txt_user.setText(service.getListUserPOLYs().get(a).getUserID());
            txt_matkhau.setText(service.getListUserPOLYs().get(a).getPass());
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_TimKiemActionPerformed

    private void btn_TaoTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TaoTKActionPerformed
        String userinput = txt_user.getText().trim();
        String pasString = txt_matkhau.getText().trim();
        if (service.getIndexUser(userinput) != - 1) {
            JOptionPane.showMessageDialog(this, "Tài khoản đã tồn tại");
        } else {
            userPOLY = new UserPOLY(userinput, pasString);
            try {
                if (service.themTaiKhoan(userPOLY)) {
                    JOptionPane.showMessageDialog(this, "Bạn đã thêm thành công");
                    loadTable();
                } else {
                    JOptionPane.showMessageDialog(this, "Bạn đã thêm thất bại");
                }
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btn_TaoTKActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void btn_ReadFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReadFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ReadFileActionPerformed

    private void btn_SAVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SAVEActionPerformed

    }//GEN-LAST:event_btn_SAVEActionPerformed

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
                try {
                    new Main().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Quyền;
    private javax.swing.JLabel Quyền1;
    private javax.swing.JLabel Time;
    private javax.swing.JButton btn_LamMoi;
    private javax.swing.JButton btn_ReadFile;
    private javax.swing.JButton btn_SAVE;
    private javax.swing.JButton btn_SuaTk;
    private javax.swing.JButton btn_TaoTK;
    private javax.swing.JButton btn_TimKiem;
    private javax.swing.JButton btn_XoaTk;
    private javax.swing.JComboBox<String> cbc_PhanQuyen;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_User;
    private javax.swing.JTextField txt_matkhau;
    private javax.swing.JTextField txt_mk2;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
