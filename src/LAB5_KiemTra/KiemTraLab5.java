/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB5_KiemTra;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author LegendNguyen
 */
public class KiemTraLab5 extends javax.swing.JFrame {

    //1. Yêu cầu trên phần giao diện phải gọi đến service để gọi các chức năng ra sử dụng
    Service service;
    //2. Khai báo 1 đối tượng của bài toán ở đây là User
    UserPOLY userTemp;

    /**
     * Creates new form KiemTraLab5
     */
    public KiemTraLab5() throws IOException, ClassNotFoundException {
        service = new Service();
        initComponents();
        LoadTable();
        setLocationRelativeTo(null);// Khi hiển thị chương trình sẽ hiển thị ở giữa
        setResizable(false);// Không cho phép Resize Form      
        //iservice.getListTeacherFake();
    }

    void LoadTable() throws IOException, ClassNotFoundException {
        String headerUser[] = {"ID", "Mật Khẩu"};
        //Chạy một vòng lặp dựa vào số cột của bảng đã được cấu hình ở giáo diện phần model

        for (int i = 0; i < tbl_User.getColumnCount(); i++) {
            //Gọi đến lớp Cột của bảng và lấy giá trị tại cột đó để gán tên cột
            TableColumn column1 = tbl_User.getTableHeader().getColumnModel().getColumn(i);
            column1.setHeaderValue(headerUser[i]);
        }
        //Lấy dữ liệu từ lớp Service thông qua interface chính là Iservice
        DefaultTableModel defaultTableModel = (DefaultTableModel) tbl_User.getModel();
        defaultTableModel.setRowCount(0);

        List<UserPOLY> arrLstTeacher = (List<UserPOLY>) service.getListUser();
        for (UserPOLY x : arrLstTeacher) {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_User = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btn_ThemTk = new javax.swing.JButton();
        btn_SuaTK = new javax.swing.JButton();
        btn_XoaTk = new javax.swing.JButton();
        btn_TimKiem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Tài Khoản:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        txt_user.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txt_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 240, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Mật khẩu:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        txt_matkhau.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txt_matkhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 240, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Nhắc lại MK:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        txt_mk2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txt_mk2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 240, -1));

        btn_LamMoi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_LamMoi.setText("Làm Mới");
        btn_LamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LamMoiActionPerformed(evt);
            }
        });
        getContentPane().add(btn_LamMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 100, 46));

        tbl_User.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        tbl_User.setShowGrid(false);
        tbl_User.setShowHorizontalLines(true);
        tbl_User.setShowVerticalLines(true);
        tbl_User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_UserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_User);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 740, 210));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("ĐỀ THI LAB 6");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setText("ĐĂNG KÝ TÀI KHOẢN");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 11, -1, -1));

        btn_ThemTk.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_ThemTk.setText("Tạo Tài khoản");
        btn_ThemTk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThemTkActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ThemTk, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 160, 46));

        btn_SuaTK.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_SuaTK.setText("Sửa TK");
        btn_SuaTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SuaTKActionPerformed(evt);
            }
        });
        getContentPane().add(btn_SuaTK, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 160, 46));

        btn_XoaTk.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_XoaTk.setText("Xóa TK");
        btn_XoaTk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XoaTkActionPerformed(evt);
            }
        });
        getContentPane().add(btn_XoaTk, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, 150, 46));

        btn_TimKiem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_TimKiem.setText("Tìm Kiếm");
        btn_TimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TimKiemActionPerformed(evt);
            }
        });
        getContentPane().add(btn_TimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, 150, 46));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_LamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LamMoiActionPerformed
        txt_user.setText(null);
        txt_matkhau.setText(null);


    }//GEN-LAST:event_btn_LamMoiActionPerformed

    private void tbl_UserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_UserMouseClicked
        try {
            int temp = tbl_User.getSelectedRow();
            txt_user.setText(service.getListUser().get(temp).getUserID());
            txt_matkhau.setText(service.getListUser().get(temp).getPass());
        } catch (IOException ex) {
            Logger.getLogger(KiemTraLab5.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(KiemTraLab5.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tbl_UserMouseClicked

    private void btn_ThemTkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThemTkActionPerformed
        try {
            String user = txt_user.getText().trim();
            String pass = txt_matkhau.getText().trim();
            userTemp = new UserPOLY(user, pass);

            //Gọi vào service sử dụng chức năng thêm
            if (service.themTaiKhoan(userTemp)) {
                LoadTable();//Thêm xong thì load lại bảng để chương trình đọc file lên
            }

        } catch (IOException ex) {
            Logger.getLogger(KiemTraLab5.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(KiemTraLab5.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_ThemTkActionPerformed

    private void btn_XoaTkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XoaTkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_XoaTkActionPerformed

    private void btn_TimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TimKiemActionPerformed
        String temp = JOptionPane.showInputDialog("Mời bạn nhập tên");
    }//GEN-LAST:event_btn_TimKiemActionPerformed

    private void btn_SuaTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SuaTKActionPerformed
        int a = JOptionPane.showConfirmDialog(this, "Bạn đã nhập đúng kiểu số nguyên",
                "DUNGNA29", JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE);
        if (a == JOptionPane.YES_OPTION) {

        } else if (a == JOptionPane.NO_OPTION) {

        }
    }//GEN-LAST:event_btn_SuaTKActionPerformed

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
            java.util.logging.Logger.getLogger(KiemTraLab5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KiemTraLab5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KiemTraLab5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KiemTraLab5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new KiemTraLab5().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(KiemTraLab5.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(KiemTraLab5.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_LamMoi;
    private javax.swing.JButton btn_SuaTK;
    private javax.swing.JButton btn_ThemTk;
    private javax.swing.JButton btn_TimKiem;
    private javax.swing.JButton btn_XoaTk;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_User;
    private javax.swing.JTextField txt_matkhau;
    private javax.swing.JTextField txt_mk2;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
