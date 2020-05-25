/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Asm;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ACER
 */
public class UtilitiesQL {

    boolean KiemTraKieuSo(String input) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    boolean KiemTraKieuChu(String input) {
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    //viết hoa tên riêng
    String StringCamelCase(String input) {
        if (input != null) {
            String temp = input.trim().toLowerCase();
            String[] arr = temp.split("\\s+");
            if (arr.length == 3) {
                String lastName = String.valueOf(arr[0].charAt(0)).toUpperCase() + arr[0].substring(1);
                String midleName = String.valueOf(arr[1].charAt(0)).toUpperCase() + arr[1].substring(1);
                String firstName = String.valueOf(arr[2].charAt(0)).toUpperCase() + arr[2].substring(1);
                return lastName + " " + midleName + " " + firstName;
            }
        }
        return "không thể convert đươc chuỗi";
    }

}
