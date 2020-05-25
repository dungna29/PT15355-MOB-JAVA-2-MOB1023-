/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Asm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Services {

    ArrayList<Student> arrayListStudents = new ArrayList<>();
    ArrayList<Teacher> arrayListTeachers = new ArrayList<>();
    UtilitiesQL utilitiesQL = new UtilitiesQL();
    Scanner scr = new Scanner(System.in);

    public Services() {
        Student st1 = new Student("ph12160", 10, "phung ", "van", "hung11", 2001, "so 1 ngo 2");
        Student st2 = new Student("ph121601", 7.5, "phung ", "van", "hung12", 2001, "so 12 ngo 2");
        Student st3 = new Student("ph121602", 4, "phung ", "van", "hung131", 2001, "so 13 ngo 2");
        Student st4 = new Student("ph121602", 8, "phung ", "van", "hung132", 2001, "so 13 ngo 2");
        Student st5 = new Student("ph121602", 9.5, "phung ", "van", "hung133", 2001, "so 13 ngo 2");
        Student st6 = new Student("ph121602", 9, "phung ", "van", "hung134", 2001, "so 13 ngo 2");
        Student st7 = new Student("ph121602", 8.9, "phung ", "van", "hung135", 2001, "so 13 ngo 2");
        Student st8 = new Student("ph121602", 9.8, "phung ", "van", "hung136", 2001, "so 13 ngo 2");
        arrayListStudents.add(st1);
        arrayListStudents.add(st2);
        arrayListStudents.add(st3);
        arrayListStudents.add(st4);
        arrayListStudents.add(st5);
        arrayListStudents.add(st6);
        arrayListStudents.add(st7);
        arrayListStudents.add(st8);
        Teacher tc1 = new Teacher("ph678", 500, "Nguyen", "Van", "Anh1", 1995, "số 3 ngõ 125");
        Teacher tc2 = new Teacher("ph6781", 400, "Nguyen", "Van", "Anh12", 1997, "số 3 ngõ 125");
        Teacher tc3 = new Teacher("ph6782", 100, "Nguyen", "Van", "Anh13", 2001, "số 3 ngõ 125");
        arrayListTeachers.add(tc1);
        arrayListTeachers.add(tc2);
        arrayListTeachers.add(tc3);

        Collections.sort(arrayListStudents, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getGpa() > o2.getGpa()) {
                    return -1;
                } else if (o1.getGpa() < o2.getGpa()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
    }

    public void AddStudent() {
        String fullName = "";
        String yearOfBird;
        String StudentID = "";
        String gpa;
        String addressSV;
        String tempName;
        String tempGPA;
        System.out.println("bạn muốn thêm bao nhiêu sinh viên :");
        String input = scr.nextLine();
        if (!utilitiesQL.KiemTraKieuSo(input)) {
            System.out.println("bạn nhập sai định dạng ");
        } else {
            for (int i = 0; i < Integer.parseInt(input); i++) {
                System.out.println("mời bạn nhập sinh viên số " + (i + 1) + ":");
                do {
                    System.out.print("mời bạn nhập cả <họ> <tên đệm> <tên> : ");
                    fullName = scr.nextLine();
                    tempName = utilitiesQL.StringCamelCase(fullName);
                    if (tempName.equals("không thể convert đươc chuỗi")) {
                        System.out.println("bạn vui lòng nhập đúng định dạng");
                    }
                } while (tempName.equals("không thể convert đươc chuỗi"));
                do {
                    System.out.print("mời bạn nhập năm sinh : ");
                    yearOfBird = scr.nextLine();
                    if (!utilitiesQL.KiemTraKieuSo(yearOfBird)) {
                        System.out.println("mời bạn nhập đúng kiểu số ");
                    }
                    if (yearOfBird.length() < 4 || yearOfBird.length() > 4) {
                        System.out.println("mời bạn nhập đúng định dạng 4 số");
                    }
                } while (!utilitiesQL.KiemTraKieuSo(yearOfBird) || (yearOfBird.length() < 4 || yearOfBird.length() > 4) );
                do {
                    System.out.print("mời bạn nhập mã sinh viên :");
                    StudentID = scr.nextLine();
                    if (!CheckIDStudent(StudentID)) {
                        System.out.println("mã SV đã tồn tại mời bạn nhập lại");
                    }
                } while (!CheckIDStudent(StudentID));
                do {
                    System.out.print("mời bạn nhập điểm trung bình GPA :");
                    gpa = scr.nextLine();
                    tempGPA = gpa.replace(".", "");
                    if (!utilitiesQL.KiemTraKieuSo(tempGPA)) {
                        System.out.println("mời bạn nhập đúng kiểu số vd:9 hoặc 8.5");
                    }
                    if (Double.parseDouble(gpa) > 10.0) {
                        System.out.println("mời bạn nhập điểm đúng định dạng dưới 10 vd:9 hoặc 8.5 :");
                    }
                } while (!utilitiesQL.KiemTraKieuSo(tempGPA) || Double.parseDouble(gpa) > 10.0);
                System.out.print("mời bạn nhập địa chỉ : ");
                addressSV = scr.nextLine();
                String[] arrFullName = fullName.split("\\s+");
                Student st = new Student();
                st.setFirstName(arrFullName[0]);
                st.setMidleName(arrFullName[1]);
                st.setLastName(arrFullName[2]);
                st.setYearOfBird(Integer.parseInt(yearOfBird));
                st.setStudentID(StudentID);
                st.setGpa(Double.parseDouble(gpa));
                st.setAddress(addressSV);
                arrayListStudents.add(st);
            }
        }
    }

    boolean CheckIDStudent(String studentID) {
        if (CheckListStudent()) {
            System.out.println("list student không có giá trị");
        } else {
            for (Student x : arrayListStudents) {
                if (x.getStudentID().equalsIgnoreCase(studentID)) {
                    return false;
                }
            }
        }
        return true;
    }

    boolean CheckListStudent() {
        return arrayListStudents.isEmpty();
    }

    boolean CheckListTeacher() {
        return arrayListTeachers.isEmpty();
    }

    public void AddTeacher() {
        String fullName = "";
        String tempName;
        String yearOfBird;
        String TeacherID = "";
        String hours;
        String tempHours;
        String addressGV;
        System.out.print("bạn muốn thêm bao nhiêu giáo viên : ");
        String input = scr.nextLine();
        if (!utilitiesQL.KiemTraKieuSo(input)) {
            System.out.println("bạn nhập sai định dạng");
        } else {
            for (int i = 0; i < Integer.parseInt(input); i++) {
                System.out.println("mời nhập giáo viên số : " + (i + 1));
                do {
                    System.out.print("mời bạn nhập cả [họ] [tên đệm] [tên] :");
                    fullName = scr.nextLine();
                    tempName = utilitiesQL.StringCamelCase(fullName);
                    if (tempName.equals("không thể convert đươc chuỗi")) {
                        System.out.println("bạn vui lòng nhập đúng định dạng [họ] [tên đệm] [tên");
                    }
                } while (tempName.equals("không thể convert đươc chuỗi"));
                do {
                    System.out.print("mời bạn nhập năm sinh :");
                    yearOfBird = scr.nextLine();
                    if (yearOfBird.length() < 4 || yearOfBird.length() > 4) {
                        System.out.println("mời bạn nhập sinh đúng với định dạng 4 số ví dụ : 2020");
                    }
                    if (!utilitiesQL.KiemTraKieuSo(yearOfBird)) {
                        System.out.println("mời bạn nhập đúng kiểu số");
                    }
                } while (!utilitiesQL.KiemTraKieuSo(yearOfBird) || yearOfBird.length() < 4);
                do {
                    System.out.print("mời bạn nhập mã giáo viên :");
                    TeacherID = scr.nextLine();
                    if (!CheckIDStudent(TeacherID)) {
                        System.out.println("mã GV đã tồn tại mời bạn nhập lại");
                    }
                } while (!CheckIDStudent(TeacherID));
                do {
                    System.out.print("mời bạn nhập số giờ giảng dạy :");
                    hours = scr.nextLine();
                    tempHours = hours.replace(".", "");
                    if (!utilitiesQL.KiemTraKieuSo(tempHours)) {
                        System.out.println("mời bạn nhập đúng kiểu số vd:9 hoặc 8.5");
                    }
                    if (Double.parseDouble(hours) > 100000) {
                        System.out.println("nghe vô lý  :");
                    }
                } while (!utilitiesQL.KiemTraKieuSo(tempHours) || Double.parseDouble(hours) > 100000);
                System.out.print("mời bạn nhập địa chỉ : ");
                addressGV = scr.nextLine();
                String[] arrFullname = utilitiesQL.StringCamelCase(fullName).split("\\s+");
                Teacher tc = new Teacher();
                tc.setFirstName(arrFullname[0]);
                tc.setMidleName(arrFullname[1]);
                tc.setLastName(arrFullname[2]);
                tc.setYearOfBird(Integer.parseInt(yearOfBird));
                tc.setTeacherID(TeacherID);
                tc.setHours(Double.parseDouble(hours));
                tc.setAddress(addressGV);
                arrayListTeachers.add(tc);
            }
        }
    }

    public void XoaSV() {
        String StudentID;
        do {
            System.out.print("mời bạn nhập vào mã sinh viên muốn xóa :");
            StudentID = scr.nextLine();
            if (CheckIDStudent(StudentID)) {
                System.out.println("mã SV không tồn tại ");
            }
        } while (CheckIDStudent(StudentID));
        for (int i = 0; i < arrayListStudents.size(); i++) {
            if (StudentID.equals(arrayListStudents.get(i).getStudentID())) {
                System.out.println("đã xóa thành công sinh viên ");
                arrayListStudents.remove(i);
            }
        }
    }

    public void SuaSV() {
        String StudentID;
        do {
            System.out.print("mời bạn nhập vào mã sinh viên muốn sửa :");
            StudentID = scr.nextLine();
            if (CheckIDStudent(StudentID)) {
                System.out.println("mã SV không tồn tại ");
            }
        } while (CheckIDStudent(StudentID));
        for (int i = 0; i < arrayListStudents.size(); i++) {
            if (StudentID.equals(arrayListStudents.get(i).getStudentID())) {
                String input;
                int tuoi;
                double diem;
                System.out.println("mời bạn sửa lại first name : ");
                input = scr.nextLine();
                arrayListStudents.get(i).setFirstName(input);
                System.out.println("mời bạn sửa lại midle name : ");
                input = scr.nextLine();
                arrayListStudents.get(i).setMidleName(input);
                System.out.println("mời bạn sửa lại last name : ");
                input = scr.nextLine();
                arrayListStudents.get(i).setLastName(input);
                System.out.println("mời bạn sửa lại tuổi : ");
                tuoi = scr.nextInt();
                arrayListStudents.get(i).setYearOfBird(tuoi);
                System.out.println("mời bạn sửa lại điẻm :");
                diem = scr.nextDouble();
                scr.nextLine();
                arrayListStudents.get(i).setGpa(diem);
                System.out.println("mời bạn nhập lại địa chỉ :");
                input = scr.nextLine();
                arrayListStudents.get(i).setAddress(input);
            }
        }
    }

    public void SuaGV() {
        String teacherID;
        do {
            System.out.print("mời bạn nhập vào mã giáo viên muốn sửa :");
            teacherID = scr.nextLine();
            if (CheckIDStudent(teacherID)) {
                System.out.println("mã GV không tồn tại ");
            }
        } while (CheckIDStudent(teacherID));
        for (int i = 0; i < arrayListTeachers.size(); i++) {
            if (teacherID.equals(arrayListTeachers.get(i).getTeacherID())) {
                String input = "";
                int tuoi;
                double hours;
                System.out.println("mời bạn sửa lại first name : ");
                input = scr.nextLine();
                arrayListTeachers.get(i).setFirstName(input);
                System.out.println("mời bạn sửa lại midle name : ");
                input = scr.nextLine();
                arrayListTeachers.get(i).setMidleName(input);
                System.out.println("mời bạn sửa lại last name : ");
                input = scr.nextLine();
                arrayListTeachers.get(i).setLastName(input);
                System.out.println("mời bạn sửa lại tuổi : ");
                tuoi = scr.nextInt();
                arrayListTeachers.get(i).setYearOfBird(tuoi);
                System.out.println("mời bạn sửa lại điẻm :");
                hours = scr.nextDouble();
                scr.nextLine();
                arrayListTeachers.get(i).setHours(hours);
                System.out.println("mời bạn nhập lại địa chỉ :");
                input = scr.nextLine();
                arrayListTeachers.get(i).setAddress(input);
            }
        }
    }

    public void InDSSV() {
        if (CheckListStudent()) {
            System.out.println("danh sách không có đối tượng");
        } else {
            int temp = 1;
            for (Student x : arrayListStudents) {
                System.out.println("sinh viên số : " + temp);
                x.OutputPerson();
                temp++;
            }
        }
    }

    public void InDSGV() {
        if (CheckListTeacher()) {
            System.out.println("danh sách không có đối tượng");
        } else {
            int temp = 1;
            for (Teacher x : arrayListTeachers) {
                System.out.println("giáo viên số : " + temp);
                x.OutputPerson();
                temp++;
            }
        }
    }

    public void TimSV() {
        String studentID;
        do {
            System.out.print("mời bạn nhập vào mã giáo viên muốn sửa :");
            studentID = scr.nextLine();
            if (CheckIDStudent(studentID)) {
                System.out.println("mã GV không tồn tại ");
            }
        } while (CheckIDStudent(studentID));
        for (int i = 0; i < arrayListStudents.size(); i++) {
            if (studentID.equals(arrayListStudents.get(i).getStudentID())) {
                System.out.println("\nđây là thông tin sinh viên cần tìm với mã :" + studentID);
                arrayListStudents.get(i).OutputPerson();
            }
        }
    }

    public void ExcellenceStudent() {
        int temp = 0;
        for (Student x : arrayListStudents) {
            if (temp == 5) {
                break;
            }
            if (x.ValuatePerson().equals("xuất sắc")) {
                x.OutputPerson();
                System.out.println("chúc mừng bạn là sinh viên " + x.ValuatePerson());
                temp++;
            }
        }
    }

    public void HocBongStudent() {
        for (Student x : arrayListStudents) {
            if (x.ValuatePerson().equals("xuất sắc")) {
                x.OutputPerson();
                System.out.println("chúc mừng bạn là sinh viên " + x.ValuatePerson() + "đã đạt học bổng");

            }
        }
    }

    public void HocLaiStudent() {
        for (Student x : arrayListStudents) {
            if (x.ValuatePerson().equals("học lại")) {
                x.OutputPerson();
                System.out.println(" bạn là sinh viên " + x.ValuatePerson() + ".xin chia buồn cùng bạn");
            }
        }
    }

    public void Teacher300Hours() {
        for (Teacher y : arrayListTeachers) {
            if (y.ValuatePerson().equals("có giờ giảng dạy lớn hơn 300")) {
                y.OutputPerson();
            }
        }
    }

    public void SapXapSV() {
        Collections.sort(arrayListStudents);
    }

    public void SapXapGV() {
        Collections.sort(arrayListTeachers);
    }
}
