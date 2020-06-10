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
public class Service implements Iservice {

    //Biến toán cục giáo viên trong Serivce
    ArrayList<Teacher> arrListTeacher = new ArrayList<>();

    public Service() {
        //Lấy danh sách ảo
        Teacher tc1 = new Teacher("dungna29", 100, "Nguyen", "Anh", "Dung", 1989, "số 3 ngõ 125", "FPT POLY");
        Teacher tc2 = new Teacher("longnt25", 222, "Nguyen", "Thanh", "Long", 2000, "số 3 ngõ 125", "FPT POLY");
        Teacher tc3 = new Teacher("hoangnt99", 123, "Nguyen", "Dinh", "Hoang", 2001, "số 3 ngõ 125", "FPT POLY");
        Teacher tc4 = new Teacher("hungnq22", 355, "Nguyen", "Quang", "Hung", 2002, "số 3 ngõ 125", "FPT POLY");
        Teacher tc5 = new Teacher("hoang21", 666, "Nguyen", "Long", "Hoang", 1995, "số 3 ngõ 125", "FPT POLY");
        Teacher tc6 = new Teacher("linh32", 777, "Nguyen", "Quang", "Linh", 1996, "số 3 ngõ 125", "FPT POLY");
        //Add danh sách lên biến toàn cục ở trong Service
        arrListTeacher.add(tc1);
        arrListTeacher.add(tc2);
        arrListTeacher.add(tc3);
        arrListTeacher.add(tc4);
        arrListTeacher.add(tc5);
        arrListTeacher.add(tc6);
    }

    @Override
    public boolean addTeacher(Teacher teacher) {
        if (teacher != null) {
            arrListTeacher.add(teacher);
            return true;
        }
        return false;

    }

    @Override
    public boolean editTeacher(String TeacherID) {

        int temp = getIndexTeacher(TeacherID, arrListTeacher);
        arrListTeacher.get(temp).setFirstName("Da Sua");
        return true;
    }

    @Override
    public boolean deleteTeacher(String TeacherID) {

        if (getIndexTeacher(TeacherID, arrListTeacher) == -1) {
            System.out.println("Không tìm thấy giáo viên đó");
            return false;
        } else {
            arrListTeacher.remove(getIndexTeacher(TeacherID, arrListTeacher));
            return true;
        }

    }

    public int getIndexTeacher(String TeacherID, ArrayList<Teacher> arrayList) {
        if (TeacherID == null && checkListNull()) {
            System.out.println("Danh sách rỗng");
            return -1;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getTeacherID().equalsIgnoreCase(TeacherID)) {
                return i;
            }
        }
        return -1;
    }

    // Kiểm tra danh sách xem có rỗng hay không
    // Nếu true thì là rỗng còn false thì là ngược lại
    public boolean checkListNull() {
        return arrListTeacher.isEmpty();
    }

    @Override
    public ArrayList<Teacher> getListTeacher() {
        return arrListTeacher;
    }

    @Override
    public boolean findTeacher(String TeacherID) {
        int temp = getIndexTeacher(TeacherID, arrListTeacher);
        arrListTeacher.get(temp).OutputPerson();
        return true;

    }

    @Override
    public void getListTeacherFake() {
        //Lấy danh sách ảo
        Teacher tc1 = new Teacher("dungna29", 100, "Nguyen", "Anh", "Dung", 1989, "số 3 ngõ 125", "FPT POLY");
        Teacher tc2 = new Teacher("longnt25", 222, "Nguyen", "Thanh", "Long", 2000, "số 3 ngõ 125", "FPT POLY");
        Teacher tc3 = new Teacher("hoangnt99", 123, "Nguyen", "Dinh", "Hoang", 2001, "số 3 ngõ 125", "FPT POLY");
        Teacher tc4 = new Teacher("hungnq22", 355, "Nguyen", "Quang", "Hung", 2002, "số 3 ngõ 125", "FPT POLY");
        Teacher tc5 = new Teacher("hoang21", 666, "Nguyen", "Long", "Hoang", 1995, "số 3 ngõ 125", "FPT POLY");
        Teacher tc6 = new Teacher("linh32", 777, "Nguyen", "Quang", "Linh", 1996, "số 3 ngõ 125", "FPT POLY");
        //Add danh sách lên biến toàn cục ở trong Service
        arrListTeacher.add(tc1);
        arrListTeacher.add(tc2);
        arrListTeacher.add(tc3);
        arrListTeacher.add(tc4);
        arrListTeacher.add(tc5);
        arrListTeacher.add(tc6);
    }

    @Override
    public int[] getLstNamSinh() {
        //1930
        //1997
        int startNamSinh = 1930;
        int[] namsinh = new int[68];
        for (int i = 0; i < 68; i++) {
            namsinh[i] = startNamSinh;
            startNamSinh++;
        }
        return namsinh;
    }

    @Override
    public String[] getLstTruong() {
        String[] arrTruong = {"FPT POLY", "FPT UNI", "FPT 9+"};
        return arrTruong;

    }

    @Override
    public boolean checkMaGiaoVienTonTai(String maGV) {
        for (Teacher x : arrListTeacher) {
            if (x.getTeacherID().equalsIgnoreCase(maGV)) {
                return true;
            }
        }
        return false;

    }

}
