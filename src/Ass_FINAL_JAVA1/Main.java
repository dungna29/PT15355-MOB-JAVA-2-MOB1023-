/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Asm;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ACER
 */
public class Main {

    static Scanner scr = new Scanner(System.in);
    static String _input = "";

    public static void main(String[] args) {
        Services sv = new Services();
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
                        MenuSVGV();
                        System.out.println("hãy gọi 1 chức năng theo số đánh dấu :");
                        _input = scr.nextLine();
                        Pattern pattern1 = Pattern.compile("\\d+");
                        Matcher matcher1 = pattern1.matcher(_input);
                        if (!matcher1.matches()) {
                            System.out.println("\nbạn vừa nhập không phải số .vui lòng nhập lại :");
                        } else {
                            switch (Integer.parseInt(_input)) {
                                case 1:
                                    sv.AddStudent();
                                    break;
                                case 2:
                                    sv.AddTeacher();
                                    break;
                                default:
                                    System.out.println("chức năng bạn chọn không tồn tại");
                                    break;
                            }
                            break;
                        }
                    case 2:
                        sv.SuaGV();
                        break;
                    case 3:
                        sv.SuaSV();
                        break;
                    case 4:
                        MenuSVGV();
                        System.out.println("hãy gọi 1 chức năng theo số đánh dấu :");
                        _input = scr.nextLine();
                        Pattern pattern2 = Pattern.compile("\\d+");
                        Matcher matcher2 = pattern2.matcher(_input);
                        if (!matcher2.matches()) {
                            System.out.println("\nbạn vừa nhập không phải số .vui lòng nhập lại :");
                        } else {
                            switch (Integer.parseInt(_input)) {
                                case 1:
                                    sv.InDSSV();
                                    break;
                                case 2:
                                    sv.InDSGV();
                                    break;
                                default:
                                    System.out.println("chức năng bạn chọn không tồn tại");
                                    break;
                            }
                            break;
                        }
                    case 5:
                        sv.TimSV();
                        break;
                    case 6:
                        sv.XoaSV();
                        break;
                    case 7:
                        sv.ExcellenceStudent();
                        break;
                    case 8:
                        MenuSVGV();
                        System.out.println("hãy gọi 1 chức năng theo số đánh dấu :");
                        _input = scr.nextLine();
                        Pattern pattern3 = Pattern.compile("\\d+");
                        Matcher matcher3 = pattern3.matcher(_input);
                        if (!matcher3.matches()) {
                            System.out.println("\nbạn vừa nhập không phải số .vui lòng nhập lại :");
                        } else {
                            switch (Integer.parseInt(_input)) {
                                case 1:
                                    sv.SapXapSV();
                                    break;
                                case 2:
                                    sv.SapXapGV();
                                    break;
                                default:
                                    System.out.println("chức năng bạn chọn không tồn tại");
                                    break;
                            }
                            break;
                        }
                    case 9:
                        sv.Teacher300Hours();
                        break;
                    case 10:
                        MenuSV();
                        System.out.println("hãy gọi 1 chức năng theo số đánh dấu :");
                        _input = scr.nextLine();
                        Pattern pattern4 = Pattern.compile("\\d+");
                        Matcher matcher4 = pattern4.matcher(_input);
                        if (!matcher4.matches()) {
                            System.out.println("\nbạn vừa nhập không phải số .vui lòng nhập lại :");
                        } else {
                            switch (Integer.parseInt(_input)) {
                                case 1:
                                    sv.HocBongStudent();
                                    break;
                                case 2:
                                    sv.HocLaiStudent();
                                    break;
                                default:
                                    System.out.println("chức năng bạn chọn không tồn tại");
                                    break;
                            }
                            break;
                        }
                    case 11:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("chức năng bạn vừa chọn không tồn tại");
                }
            }
        } while (true);
    }

    static void MenuSVGV() {
        System.out.println(" ==================== CHỌN SV || GV ============");
        System.out.println("|-----------------------------------------------|");
        System.out.println("| 1.SINH VIÊN                                   |");
        System.out.println("| 2. GIÁO VIÊN .                                |");
        System.out.println("------------------------------------------------|");
    }

    static void MenuSV() {
        System.out.println(" ============ CHỌN HỌC BỔNG || HỌC LẠI =========");
        System.out.println("|-----------------------------------------------|");
        System.out.println("| 1.HỌC BỔNG                                    |");
        System.out.println("| 2.HỌC LẠI    .                                |");
        System.out.println("------------------------------------------------|");
    }

    static void Menu() {
        System.out.println(" ======================QL sinh viên và giáo viên============");
        System.out.println("|-----------------------------------------------------------|");
        System.out.println("| 1.thêm mới sinh viên và thêm mới giáo viên.               |");
        System.out.println("| 2. chỉnh sửa giáo viên theo mã.                           |");
        System.out.println("| 3. chỉnh sửa SV theo mã SV.                               |");
        System.out.println("| 4. DS sinh viên và giáo viên.                             |");
        System.out.println("| 5..tìm kiếm sinh viên theo mã sinh viên                   |");
        System.out.println("| 6. xóa sinh viên theo mã số                               |");
        System.out.println("| 7.xuất 5 sinh viên có diểm cao hoặc thấp                  |");
        System.out.println("| 8. Sắp xếp sinh viên và giáo viên theo tên.               |");
        System.out.println("| 9. xuất 5 giáo viên có số giờ dạy hơn 300 giờ             |");
        System.out.println("|10.xuất danh sách sinh viên được học bổng hoặc học lại     |");
        System.out.println("|11.thoát chương trình                                      |");
        System.out.println("------------------------------------------------------------|");
    }
}
