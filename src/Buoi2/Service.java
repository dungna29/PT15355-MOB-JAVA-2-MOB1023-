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

    ArrayList<Teacher> arrListTeacher = new ArrayList<>();

    public Service() {

    }

    @Override
    public boolean addTeacher(String _FirstName, String _MidleName, String _LastName, int _YearOfBird, String _Address, String School, String TeacherID, double hours) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        //Lấy danh sách ảo
        Teacher tc1 = new Teacher("dungna29", 500, "Nguyen", "Anh", "Dung", 1989, "số 3 ngõ 125", "FPT POLY");
        Teacher tc2 = new Teacher("longnt25", 500, "Nguyen", "Thanh", "Long", 1989, "số 3 ngõ 125", "FPT POLY");
        Teacher tc3 = new Teacher("hoangnt99", 500, "Nguyen", "Dinh", "Hoang", 1989, "số 3 ngõ 125", "FPT POLY");
        Teacher tc4 = new Teacher("hungnq22", 500, "Nguyen", "Quang", "Hung", 1989, "số 3 ngõ 125", "FPT POLY");
        Teacher tc5 = new Teacher("hoang21", 500, "Nguyen", "Long", "Hoang", 1989, "số 3 ngõ 125", "FPT POLY");
        Teacher tc6 = new Teacher("linh32", 500, "Nguyen", "Quang", "Linh", 1989, "số 3 ngõ 125", "FPT POLY");
        arrListTeacher.add(tc1);
        arrListTeacher.add(tc2);
        arrListTeacher.add(tc3);
        arrListTeacher.add(tc4);
        arrListTeacher.add(tc5);
        arrListTeacher.add(tc6);
        return arrListTeacher;
    }

    @Override
    public boolean findTeacher(String TeacherID) {
        int temp = getIndexTeacher(TeacherID, arrListTeacher);
        arrListTeacher.get(temp).OutputPerson();
        return true;

    }

}
