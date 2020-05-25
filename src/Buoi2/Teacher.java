/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi2;

/**
 *
 * @author LegendNguyen
 */
public class Teacher extends Person {

    private String TeacherID;
    private double hours;

    public Teacher() {
    }

    public Teacher(String TeacherID, double hours, String _FirstName, String _MidleName, String _LastName, int _YearOfBird, String _Address, String School) {
        super(_FirstName, _MidleName, _LastName, _YearOfBird, _Address, School);
        this.TeacherID = TeacherID;
        this.hours = hours;
    }

    public String getTeacherID() {
        return TeacherID;
    }

    public void setTeacherID(String TeacherID) {
        this.TeacherID = TeacherID;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }
    
    

    @Override
    String ValuatePerson() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void OutputPerson() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
