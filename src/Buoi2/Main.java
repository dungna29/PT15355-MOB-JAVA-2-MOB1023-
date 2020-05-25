/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author LegendNguyen
 */
public class Main {

    static Scanner scr = new Scanner(System.in);
    static String _input = "";

    public static void main(String[] args) {
        Iservice iservice = new Service();
        iservice.addTeacher("", "", "", 0, "", "", _input, 0);              
        do {
            Menu();
            System.out.print("hãy gọi 1 chức năng theo số đánh dấu :");
            _input = scr.nextLine();
            Pattern pattern = Pattern.compile("\\d+");
            Matcher matcher = pattern.matcher(_input);
            if (!matcher.matches()) {
                System.out.println("\nbạn vừa nhập không phải số .vui lòng nhập lại :");
            } else {
                switch (Integer.parseInt(_input)) {
                    case 1:
                       
                        if ( iservice.addTeacher("", "", "", 0, "", "", "", 0)) {
                            System.out.println("Bạn đã thêm thành công");
                        }else{
                            System.out.println("Bạn đã thêm không thành công");
                        }
                        break;
                    case 2:
                        iservice.deleteTeacher("");
                        break;
                    case 3:
                        iservice.editTeacher("");
                        break;
                    case 4:
                        for (Teacher x : iservice.getListTeacher()) {
                           // System.out.println(x.OutputPerson());
                        }
                        break;
                    case 5:
                        break;
                    case 11:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("chức năng bạn vừa chọn không tồn tại");
                }
            }
        } while (true);
    }

    static void Menu() {
        System.out.println(" ======================Quản Lý Giáo Viên============");
        System.out.println("|-----------------------------------------------------------|");
        System.out.println("| 1. Thêm Giáo Viên               |");
        System.out.println("| 2. Xóa Giáo Viên                           |");
        System.out.println("| 3. Sửa Giáo Viên                               |");
        System.out.println("| 4. Lấy Danh Sách Giáo Viên                             |");
        System.out.println("|11.thoát chương trình                                      |");
        System.out.println("------------------------------------------------------------|");
    }

}
