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
public class Service implements Iservice{
    ArrayList<Teacher> arrListTeacher = new ArrayList<>();

    public Service() {
    }
    
    

    @Override
    public boolean addTeacher(String _FirstName, String _MidleName, String _LastName, int _YearOfBird, String _Address, String School, String TeacherID, double hours) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean editTeacher(String TeacherID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteTeacher(String TeacherID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Teacher> getListTeacher() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
