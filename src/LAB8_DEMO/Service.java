/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB8_DEMO;

import LAB6_Va_FINAL_ASS.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LegendNguyen
 */
public class Service {

    List<UserPOLY> lstUser = new ArrayList<UserPOLY>();
    static File file = new File("dataUserPolyLAB8.txt");

    public Service() {
    }

    boolean themTaiKhoan(UserPOLY userPOLY) throws IOException {    
        lstUser.add(userPOLY);
        ghiFile();
        return true;
    }

    boolean suaTaiKhoan(UserPOLY userPOLY) throws IOException {
        int temp = getIndexUser(userPOLY.getUserID());        
        //Sửa đối tượng theo index        
        lstUser.set(temp, userPOLY);
       
        ghiFile();
        return true;
    }

    boolean xoaTaiKhoan(int index) throws IOException {
        lstUser.remove(index);
         ghiFile();
        return true;
    }    

    void ghiFile() throws IOException {
        checkFile();
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        //Dùng vòng lặp để ghi nhiều đối tượng vào file
        for (UserPOLY x : lstUser) {
            oos.writeObject(x);
        }
        oos.close();
        fos.close();
    }

    //Lấy danh sách từ file và trả ra 1 List danh sách USER
    List<UserPOLY> getListUserPOLYs() throws IOException, ClassNotFoundException {
        checkFile();
        //Kiểm tra file có dữ liệu hay không
        if (file.length() == 0) {
            return lstUser;
        }
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        lstUser.clear();
        while (fis.available() > 0) {
            UserPOLY userPOLY = new UserPOLY();
            userPOLY = (UserPOLY) ois.readObject();//Đọc 1 đối tượng lên
            lstUser.add(userPOLY);
        }
        ois.close();
        fis.close();
        return lstUser;
    }

    //Kiểm tra sự tồn tại của file đã có hay chưa nếu chưa có thì sẽ tạo file mới
    void checkFile() throws IOException {
        if (!file.exists()) {
            file.createNewFile();
        }
    }

    //Hàm này giúp tìm ra vị trí index của đối tượng trong LIST
    int getIndexUser(String user) {
        for (int i = 0; i < lstUser.size(); i++) {
            if (lstUser.get(i).getUserID().equalsIgnoreCase(user)) {
               return i;
            }
        }
        return -1;//Khong tim thay
    }

    //Hàm này dùng để kiểm tra danh sách rỗng
    boolean kiemTraDanhSach() {
        return lstUser.isEmpty();
    }
}
