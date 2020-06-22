/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UtilitiesQL {

    boolean KiemTraKieuSo(String input) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    boolean KiemTraKieuSo1(String input) {
        int[] arrnumber = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] arr = input.split("\\s+");
        boolean temp = true;
        for (String x : arr) {
            for (int y : arrnumber) {
                if (Integer.parseInt(x) == y) {
                    temp = true;
                }
            }
        }
        return temp;
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
            String[] arr = temp.split("\\s");
            // Nguyen Anh           
            String fullname;
            List<String> lstFullName = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                lstFullName.add(String.valueOf(arr[0].charAt(0)).toUpperCase() + arr[0].substring(1));
                return null;
            }

        }
        return "không thể convert đươc chuỗi";
    }
    
    Scanner scanner = new Scanner(System.in);
    String NhapVao(){
        String temp = scanner.nextLine();
        return temp;        
    }

}
