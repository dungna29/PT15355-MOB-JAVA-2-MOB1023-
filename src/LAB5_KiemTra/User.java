/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB5_KiemTra;

/**
 *
 * @author LegendNguyen
 */
public class User {
   private String userID;
   private User pass;

    public User() {
    }

    public User(String userID, User pass) {
        this.userID = userID;
        this.pass = pass;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public User getPass() {
        return pass;
    }

    public void setPass(User pass) {
        this.pass = pass;
    }
    
}
