/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi1_OOP;

/**
 *
 * @author LegendNguyen
 */
public class SinhVien_AB extends Person_AB{

    private String MaSV;
    private double DiemTrungBinh;
    int a;

    // Hàm tạo không có tham số truyền vào.
    public SinhVien_AB() {
    }

    // Hàm tạo có tham số truyền vào.   
    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    @Override
    void input() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void edit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
