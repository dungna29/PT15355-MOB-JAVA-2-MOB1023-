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
    static Iservice iservice = new Service();

    public static void main(String[] args) {
        // iservice.getListTeacher();
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
                        System.out.print("Mời bạn nhập vào mã Giáo Viên cần xóa");
                        String idgv = scr.nextLine();
                        if (iservice.deleteTeacher(idgv)) {
                            System.out.println("Đã xóa thành công");
                        } else {
                            System.out.println("Đã xóa không thành công");
                        }
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        for (Teacher x : iservice.getListTeacher()) {
                            System.out.println(x.getTeacherID());
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

    static void inDsGV() {

    }

}
