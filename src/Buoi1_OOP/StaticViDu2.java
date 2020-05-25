/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi1_OOP;

/**
 *
 * @author Nguyen Anh Dung
 */
public class StaticViDu2 {

    private static int tempStatic =0 ;//Được khởi tạo 1 lần duy nhất và có thể thay đổi giá trị
//    private int tempStatic = 0;

    void demsoSinhVien() {
        tempStatic++;
        this.inra();
    }

    void inra() {
        System.out.println("Sinh viên số:" + tempStatic);
    }

    public static void main(String[] args) {
        StaticViDu2 st = new StaticViDu2();
        st.demsoSinhVien();
        StaticViDu2 st2 = new StaticViDu2();
        st2.demsoSinhVien();
        StaticViDu2 st3 = new StaticViDu2();
        st3.demsoSinhVien();
    }

}
