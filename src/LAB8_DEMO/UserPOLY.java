/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB8_DEMO;


import LAB6_Va_FINAL_ASS.*;
import java.io.Serializable;

/**
 *
 * @author LegendNguyen
 */
public class UserPOLY implements Serializable{
   private String userID;
   private String pass;

    public UserPOLY() {
    }

    public UserPOLY(String userID, String pass) {
        this.userID = userID;
        this.pass = pass;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
}
