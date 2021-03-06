/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author LegendNguyen
 */
public class JFrameMain extends javax.swing.JFrame {

    Iservice iservice = new Service();
    ArrayList<Teacher> arrayListTeachers = new ArrayList<>();
    UtilitiesQL utilitiesQL = new UtilitiesQL();

    /**
     * Creates new form JFrameMain
     */
    public JFrameMain() {       
        
        initComponents();
        setLocationRelativeTo(null);// Khi hiển thị chương trình sẽ hiển thị ở giữa
        setResizable(false);// Không cho phép Resize Form      
        //iservice.getListTeacherFake();
        GetDateTimeNow();
        loadTblGiaoVien();//Load danh sách giáo viên lên
        loadCbcNamSinh();
        loadCbcTruong();

    }

    void loadCbcTruong() {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) cbc_Truong.getModel();
        cbc_Truong.setModel(comboBoxModel);
        if (iservice.getLstTruong().length == 0) {
            return;
        }
        for (String x : iservice.getLstTruong()) {
            cbc_Truong.addItem(String.valueOf(x));
        }

    }

    void loadCbcNamSinh() {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) cbc_NamSinh.getModel();
        cbc_NamSinh.setModel(comboBoxModel);
        for (int x : iservice.getLstNamSinh()) {
            cbc_NamSinh.addItem(String.valueOf(x));
        }

    }

    void loadTblGiaoVien() {
        String headerTblGiaoVien[] = {"Mã Giáo Viên", "Tên Giáo Viên", "Tên Đệm", "Họ",
            "Năm Sinh", "Địa Chỉ", "Trường Học", "Giờ Dậy"};
        //Chạy một vòng lặp dựa vào số cột của bảng đã được cấu hình ở giáo diện phần model
        for (int i = 0; i < tbl_BangGiaoVien.getColumnCount(); i++) {
            //Gọi đến lớp Cột của bảng và lấy giá trị tại cột đó để gán tên cột
            TableColumn column1 = tbl_BangGiaoVien.getTableHeader().getColumnModel().getColumn(i);
            column1.setHeaderValue(headerTblGiaoVien[i]);
        }
        //Lấy dữ liệu từ lớp Service thông qua interface chính là Iservice
        DefaultTableModel defaultTableModel = (DefaultTableModel) tbl_BangGiaoVien.getModel();
        defaultTableModel.setRowCount(0);
        ArrayList<Teacher> arrLstTeacher = iservice.getListTeacher();
        for (Teacher x : arrLstTeacher) {
            defaultTableModel.addRow(new Object[]{x.getTeacherID(), x.getFirstName(),
                x.getMidleName(), x.getLastName(), x.getYearOfBird(),
                x.getAddress(), x.getSchool(), x.getHours()});

        }
    }

    void GetDateTimeNow() {
        Thread clock = new Thread() {

            public void run() {
                try {
                    while (true) {
                        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                        //DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                        Calendar cal = Calendar.getInstance();
                        lbl_TimeNow.setText(dateFormat.format(cal.getTime()));
                        Thread.sleep(1000);
                    }

                } catch (InterruptedException ex) {
                    Logger.getLogger(JFrameMain.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        clock.start();

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
        btn_ThemGiaoVien = new javax.swing.JButton();
        btn_SuaGiaoVien = new javax.swing.JButton();
        btn_XoaGiaoVien = new javax.swing.JButton();
        btn_TimKiemGiaoVien = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_BangGiaoVien = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_Ten = new javax.swing.JTextField();
        txt_Ho = new javax.swing.JTextField();
        txt_TenDem = new javax.swing.JTextField();
        txt_SoGioDay = new javax.swing.JTextField();
        cbc_Truong = new javax.swing.JComboBox<>();
        txt_MaGiaoVien = new javax.swing.JTextField();
        cbc_NamSinh = new javax.swing.JComboBox<>();
        lbl_TimeNow = new javax.swing.JLabel();
        btn_Thoat = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtare_DiaChi = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("Chương Trình Quản Lý Giáo Viên DungNA29"); // NOI18N
        addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
                formAncestorMoved(evt);
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("Chương trình quản lý Giáo Viên");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 11, -1, -1));

        btn_ThemGiaoVien.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_ThemGiaoVien.setText("Thêm Giáo Viên");
        btn_ThemGiaoVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThemGiaoVienActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ThemGiaoVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(748, 73, 200, 46));

        btn_SuaGiaoVien.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_SuaGiaoVien.setText("Sửa Giáo Viên");
        btn_SuaGiaoVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SuaGiaoVienActionPerformed(evt);
            }
        });
        getContentPane().add(btn_SuaGiaoVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(748, 130, 200, 46));

        btn_XoaGiaoVien.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_XoaGiaoVien.setText("Xóa Giáo Viên");
        btn_XoaGiaoVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XoaGiaoVienActionPerformed(evt);
            }
        });
        getContentPane().add(btn_XoaGiaoVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(748, 187, 200, 46));

        btn_TimKiemGiaoVien.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_TimKiemGiaoVien.setText("Tìm Kiếm Giáo Viên");
        getContentPane().add(btn_TimKiemGiaoVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(748, 244, 200, 46));

        tbl_BangGiaoVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        tbl_BangGiaoVien.setShowGrid(false);
        tbl_BangGiaoVien.setShowHorizontalLines(true);
        tbl_BangGiaoVien.setShowVerticalLines(true);
        tbl_BangGiaoVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_BangGiaoVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_BangGiaoVien);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 373, 950, 292));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Tên:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 115, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Họ:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 76, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Tên đệm:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 154, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Năm sinh:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 193, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Địa chỉ:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 229, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Trường:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 115, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Mã giáo viên:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 76, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Số giờ dậy:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 154, -1, -1));

        txt_Ten.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txt_Ten, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 112, 221, -1));

        txt_Ho.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_Ho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_HoMouseClicked(evt);
            }
        });
        txt_Ho.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txt_HoInputMethodTextChanged(evt);
            }
        });
        txt_Ho.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_HoKeyPressed(evt);
            }
        });
        getContentPane().add(txt_Ho, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 73, 221, -1));

        txt_TenDem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txt_TenDem, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 151, 221, -1));

        txt_SoGioDay.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txt_SoGioDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 151, 240, -1));

        cbc_Truong.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(cbc_Truong, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 112, 240, -1));

        txt_MaGiaoVien.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txt_MaGiaoVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 73, 240, -1));

        cbc_NamSinh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(cbc_NamSinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 221, -1));

        lbl_TimeNow.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_TimeNow.setForeground(new java.awt.Color(255, 0, 51));
        lbl_TimeNow.setText("Time");
        getContentPane().add(lbl_TimeNow, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, -1, -1));

        btn_Thoat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_Thoat.setText("Thoát");
        getContentPane().add(btn_Thoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(748, 301, 200, 46));

        txtare_DiaChi.setColumns(20);
        txtare_DiaChi.setRows(5);
        jScrollPane2.setViewportView(txtare_DiaChi);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 229, 221, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formAncestorMoved(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_formAncestorMoved
        if (txt_Ten.getText().equals(null)) {
            return;
        }
        
      
    }//GEN-LAST:event_formAncestorMoved

    private void btn_ThemGiaoVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThemGiaoVienActionPerformed
        if (txt_Ho.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Bạn không được để Họ null");
            txt_Ho.setText(null);
            return;
        } else if (txt_Ten.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Bạn không được để Tên null");
            txt_Ten.setText(null);
            return;
        } else if (txt_TenDem.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Bạn không được để Tên Đệm null");
            txt_TenDem.setText(null);
            return;
        } else if (cbc_NamSinh.getSelectedItem().equals(null)) {
            JOptionPane.showMessageDialog(this, "Bạn không được để Năm Sinh null");
            return;
        } else if (txtare_DiaChi.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Bạn không được để Địa Chỉ null");
            txtare_DiaChi.setText(null);
            return;
        } else if (txt_MaGiaoVien.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Bạn không được để Mã Giáo Viên null");
            txt_MaGiaoVien.setText(null);
            return;
        } else if (iservice.checkMaGiaoVienTonTai(txt_MaGiaoVien.getText())) {
            JOptionPane.showMessageDialog(this, "Mã Giáo Viên Đã Tồn Tại");
            txt_MaGiaoVien.setText(null);
            return;
        } else if (txt_SoGioDay.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Bạn không được để Giờ Dạy null");
            txt_SoGioDay.setText(null);
            return;
        } else if (!utilitiesQL.KiemTraKieuSo(txt_SoGioDay.getText())) {
            JOptionPane.showMessageDialog(this, "Bạn phải dùng số ở số giờ dậy");
            txt_SoGioDay.setText(null);
            return;
        }
        Teacher teacher = new Teacher(txt_MaGiaoVien.getText().trim(),
                Double.parseDouble(txt_SoGioDay.getText().trim()),
                 utilitiesQL.StringCamelCase(txt_Ten.getText().trim()),
                utilitiesQL.StringCamelCase(txt_TenDem.getText().trim()),
                utilitiesQL.StringCamelCase(txt_Ho.getText().trim()),
                Integer.parseInt((String) cbc_NamSinh.getSelectedItem()),
                txtare_DiaChi.getText().trim(),
                cbc_Truong.getSelectedItem().toString());
        if (iservice.addTeacher(teacher)) {
            JOptionPane.showMessageDialog(this, "Đã thêm thành công");
            loadTblGiaoVien();
        }else{
            JOptionPane.showMessageDialog(this, "Thất Bại");
        }

    }//GEN-LAST:event_btn_ThemGiaoVienActionPerformed

    private void btn_SuaGiaoVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SuaGiaoVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_SuaGiaoVienActionPerformed

    private void btn_XoaGiaoVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XoaGiaoVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_XoaGiaoVienActionPerformed

    private void txt_HoInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txt_HoInputMethodTextChanged

    }//GEN-LAST:event_txt_HoInputMethodTextChanged

    private void txt_HoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_HoKeyPressed
//        txt_MaGiaoVien.setText(txt_Ho.getText());
    }//GEN-LAST:event_txt_HoKeyPressed

    private void txt_HoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_HoMouseClicked
        // TODO add your handling code here:s
    }//GEN-LAST:event_txt_HoMouseClicked

    private void tbl_BangGiaoVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_BangGiaoVienMouseClicked
//         int temp = tbl_BangGiaoVien.getSelectedRow();
//         txt_MaGiaoVien.setText(arrayListTeachers.get(temp).getTeacherID());
    }//GEN-LAST:event_tbl_BangGiaoVienMouseClicked

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
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_SuaGiaoVien;
    private javax.swing.JButton btn_ThemGiaoVien;
    private javax.swing.JButton btn_Thoat;
    private javax.swing.JButton btn_TimKiemGiaoVien;
    private javax.swing.JButton btn_XoaGiaoVien;
    private javax.swing.JComboBox<String> cbc_NamSinh;
    private javax.swing.JComboBox<String> cbc_Truong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_TimeNow;
    private javax.swing.JTable tbl_BangGiaoVien;
    private javax.swing.JTextField txt_Ho;
    private javax.swing.JTextField txt_MaGiaoVien;
    private javax.swing.JTextField txt_SoGioDay;
    private javax.swing.JTextField txt_Ten;
    private javax.swing.JTextField txt_TenDem;
    private javax.swing.JTextArea txtare_DiaChi;
    // End of variables declaration//GEN-END:variables
}
