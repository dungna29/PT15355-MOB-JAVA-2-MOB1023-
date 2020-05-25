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
public class Person {

    private String Ho;
    private String Ten;
    private String TenDem;
    private String SoDienThoai;
    private String DiaChi;

    public Person() {
    }

    public Person(String Ho, String Ten, String TenDem, String SoDienThoai, String DiaChi) {
        this.Ho = Ho;
        this.Ten = Ten;
        this.TenDem = TenDem;
        this.SoDienThoai = SoDienThoai;
        this.DiaChi = DiaChi;
    }

    public String getHo() {
        return Ho;
    }

    public void setHo(String Ho) {
        this.Ho = Ho;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public String getTenDem() {
        return TenDem;
    }

    public void setTenDem(String TenDem) {
        this.TenDem = TenDem;
    }

    public String getSoDienThoai() {
        return SoDienThoai;
    }

    public void setSoDienThoai(String SoDienThoai) {
        this.SoDienThoai = SoDienThoai;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    void input() {
        System.out.println("Tôi là lớp cha");

    }

    void edit() {

    }

    void delete() {

    }   

}
