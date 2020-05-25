/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi1_OOP;

import java.util.List;

/**
 *
 * @author Nguyen Anh Dung
 */
public interface IService {
    //vãn khai báo được biến như bt trong interface cấm khai bao sử dụng từ khóa private
    int a = 0;
    //Cấm khai báo các hàm có body
   

    void hamThem(String name, String Tuoi, String Sdt, String Msv);

    void hamSua(String Msv);

    void hamXoa(String Msv);

    List<SinhVien> getDanhSachSinhVien();

}
