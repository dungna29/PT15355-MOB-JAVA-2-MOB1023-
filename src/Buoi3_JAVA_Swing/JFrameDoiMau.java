/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi3_JAVA_Swing;

import java.awt.Color;
import java.util.Vector;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nguyen Anh Dung
 */
public class JFrameDoiMau extends javax.swing.JFrame {

    /**
     * Creates new form JFrameDoiMau
     */
    public JFrameDoiMau() {
        initComponents();
        setLocationRelativeTo(null);
        init();
        radiobutton();
        table();

    }
    Vector vtcData = new Vector();
    void table() {
        //Vector chứa header
        Vector vtcHeader = new Vector();
        vtcHeader.add("Mã Sinh Viên");
        vtcHeader.add("Tên");
        vtcHeader.add("Ngày Sinh");
        vtcHeader.add("Số điện thoại");
        //Vector chứa data
        
        Vector vtcRow1 = new Vector();
        vtcRow1.add("ph00532");
        vtcRow1.add("Nguyễn Anh Dũng");
        vtcRow1.add("03/11/1998");
        vtcRow1.add("0865880779");
        vtcData.add(vtcRow1);
        //Đổ dữ liệu vào bảng
        table_1.setModel(new DefaultTableModel(vtcData, vtcHeader));

    }

    void radiobutton() {
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radiobutton_btn1);
        buttonGroup.add(radiobutton_btn2);
    }

    void init() {
//        DefaultComboBoxModel boxModel = new DefaultComboBoxModel();
//        boxModel.addElement("Nam");
//        boxModel.addElement("nữ");
//        cbc_GioiTinh.setModel(boxModel);
//        cbc_GioiTinh.setSelectedIndex(1);
//        String name = (String) cbc_GioiTinh.getSelectedItem();
//        lbl_lable.setText(name);

        String[] data = {
            "Việt Nam", "United States", "Singapore", "Malaysia"
        };
        cbc_GioiTinh.setModel(new DefaultComboBoxModel(data));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_DoiMau = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        btn_Ok = new javax.swing.JButton();
        lbl_lable = new javax.swing.JLabel();
        check_remmberPass = new javax.swing.JCheckBox();
        cbc_GioiTinh = new javax.swing.JComboBox<>();
        radiobutton_btn1 = new javax.swing.JRadioButton();
        radiobutton_btn2 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_1 = new javax.swing.JTable();
        lbltemdungna29 = new javax.swing.JLabel();
        txt_msv = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_DoiMau.setText("Đổi mầu");
        btn_DoiMau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DoiMauActionPerformed(evt);
            }
        });

        txtName.setText("Nhập tên vào");
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        btn_Ok.setText("OK");
        btn_Ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_OkActionPerformed(evt);
            }
        });

        lbl_lable.setText("jLabel1");

        check_remmberPass.setText("jCheckBox1");

        cbc_GioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));
        cbc_GioiTinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbc_GioiTinhActionPerformed(evt);
            }
        });

        radiobutton_btn1.setText("jRadioButton1");

        radiobutton_btn2.setText("jRadioButton2");

        table_1.setModel(new javax.swing.table.DefaultTableModel(
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
        table_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_1);

        lbltemdungna29.setText("jLabel1");

        txt_msv.setText("jTextField1");

        txtname.setText("jTextField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_DoiMau)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btn_Ok)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 702, Short.MAX_VALUE)
                .addComponent(lbl_lable)
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(check_remmberPass)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(lbltemdungna29))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_msv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cbc_GioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(radiobutton_btn2)
                            .addComponent(radiobutton_btn1))
                        .addGap(86, 86, 86))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(cbc_GioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(btn_DoiMau)
                .addGap(1, 1, 1)
                .addComponent(radiobutton_btn1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radiobutton_btn2))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Ok)
                    .addComponent(lbl_lable))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(check_remmberPass)
                        .addGap(95, 95, 95)
                        .addComponent(lbltemdungna29)
                        .addGap(84, 84, 84)
                        .addComponent(txt_msv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_DoiMauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DoiMauActionPerformed
        //System.out.println("Đổi mầu nè");
        //JOptionPane.showMessageDialog(this, "Xin chào các bạn đến với JAVA2");
        //JOptionPane.showConfirmDialog(this, "Xin chào");
        //btn_DoiMau.setBackground(Color.red);
        //this.getContentPane().setBackground(Color.red);

        int output = JOptionPane.showConfirmDialog(this,
                "Click any button",
                "HocLapTrinh.vn",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE);

        if (output == JOptionPane.YES_OPTION) {
            lbltemdungna29.setText("Yes selected.");
        } else if (output == JOptionPane.NO_OPTION) {
            lbltemdungna29.setText("No selected.");
        } else if (output == JOptionPane.CANCEL_OPTION) {
            lbltemdungna29.setText("Cancel selected.");
        }


    }//GEN-LAST:event_btn_DoiMauActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btn_OkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_OkActionPerformed
        String name = txtName.getText();
        lbl_lable.setText(name);
//        new Main().setVisible(true);// Mở form cần mở lên
//       this.dispose();//Đóng form hiện tại        
        boolean temp = check_remmberPass.isSelected();


    }//GEN-LAST:event_btn_OkActionPerformed

    private void cbc_GioiTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbc_GioiTinhActionPerformed
        String name = (String) cbc_GioiTinh.getSelectedItem();
        lbl_lable.setText(name);
    }//GEN-LAST:event_cbc_GioiTinhActionPerformed

    private void table_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_1MouseClicked
       int index = table_1.getSelectedRow();
       Vector vector = (Vector) vtcData.get(index);
       String id = (String) vector.get(0);
       String name = (String) vector.get(1);
       txt_msv.setText(id);
       txtname.setText(name);
       
    }//GEN-LAST:event_table_1MouseClicked

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
            java.util.logging.Logger.getLogger(JFrameDoiMau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameDoiMau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameDoiMau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameDoiMau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameDoiMau().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_DoiMau;
    private javax.swing.JButton btn_Ok;
    private javax.swing.JComboBox<String> cbc_GioiTinh;
    private javax.swing.JCheckBox check_remmberPass;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_lable;
    private javax.swing.JLabel lbltemdungna29;
    private javax.swing.JRadioButton radiobutton_btn1;
    private javax.swing.JRadioButton radiobutton_btn2;
    private javax.swing.JTable table_1;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txt_msv;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
