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
public class SinhVien extends Person {

    private String MaSV;
    private double DiemTrungBinh;
    int a;

    // Hàm tạo không có tham số truyền vào.
    public SinhVien() {
        System.out.println("Contructor Sinh Vien");
        
    }

    // Hàm tạo có tham số truyền vào.
    public SinhVien(String MaSV, double DiemTrungBinh, String Ho, String Ten, String TenDem, String SoDienThoai, String DiaChi) {
        super(Ho, Ten, TenDem, SoDienThoai, DiaChi);
        this.MaSV = MaSV;
        this.DiemTrungBinh = DiemTrungBinh;
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    void inputSinhVien() {

    }

    @Override
    void input() {
        System.out.println("Tôi là hàm input của lớp Sinh Viên");
        //Logic code lại cũng được
        //Hàm mới

    }

    @Override
    void edit() {

    }

    void dungna() {

    }

    void dungna(String name) {

    }

    void dungna(String name, String sdt) {

    }

    void dungna(String name, String sdt, int namsinh) {

    }   
   

}
