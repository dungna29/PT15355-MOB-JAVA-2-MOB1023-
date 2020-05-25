/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Asm;

/**
 *
 * @author ACER
 */
public class Student extends Person implements Comparable<Student> {

    private String StudentID;
    private double gpa;

    public Student() {
    }

    public Student(String StudentID, double gpa, String FirstName, String MidleName, String LastName, int YearOfBird, String Address) {
        super(FirstName, MidleName, LastName, YearOfBird, Address);
        this.StudentID = StudentID;
        this.gpa = gpa;
    }

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String StudentID) {
        this.StudentID = StudentID;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    String ValuatePerson() {
        if (gpa >= 8 && gpa <= 10) {
            return "xuất sắc";
        } else if (gpa >= 6 && gpa < 8) {
            return "giỏi";
        } else if (gpa >= 5 && gpa < 6) {
            return "khá";
        } else {
            return "học lại";
        }
    }

    @Override
    void OutputPerson() {
        System.out.printf("tên SV :  %s %s %s năm sinh SV: %d mã SV : %s GPA : %f \n địa chỉ : %s\n", getFirstName(), getMidleName(), getLastName(), getYearOfBird(), getStudentID(), getGpa(), getAddress());
        System.out.println("-------------------------------------");
    }

    @Override
    void InputPerson() {
    }

    @Override
    public int compareTo(Student o) {
        return this.StudentID.compareTo(o.getStudentID());
    }

}
