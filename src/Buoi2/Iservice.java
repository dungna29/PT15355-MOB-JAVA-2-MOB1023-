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

    boolean addTeacher(String _FirstName, String _MidleName, String _LastName, int _YearOfBird, String _Address, String School, String TeacherID, double hours);

    boolean editTeacher(String TeacherID);

    boolean deleteTeacher(String TeacherID);

    ArrayList<Teacher> getListTeacher();

}
