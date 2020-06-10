/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi2;

import java.util.ArrayList;

/**
 *
 * @author LegendNguyen
 */
public interface Iservice {

    public String school = "Poly";

    boolean addTeacher(Teacher teacher);//Thêm mới giáo viên

    boolean editTeacher(String TeacherID);//Sửa giáo viên

    boolean deleteTeacher(String TeacherID);//Xóa giáo viên
    
    boolean findTeacher(String TeacherID);// Tìm kiếm giáo viên

    ArrayList<Teacher> getListTeacher();// Trả 1 danh sách giáo viên
    
    void getListTeacherFake();//
    int[] getLstNamSinh();//Trả ra một mảng năm sinh để đổ vào combobox
    String[] getLstTruong();//Trả về một danh sách các trường
    boolean checkMaGiaoVienTonTai(String maGV);// Kiểm tra mã giáo viên tồn tại

}
