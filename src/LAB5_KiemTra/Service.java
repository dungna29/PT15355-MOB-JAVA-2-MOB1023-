/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB5_KiemTra;

import Buoi6_FileReader_FileWriter.Teacher;
import Buoi6_FileReader_FileWriter.s5_DocVaGhiDoiTuong;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LegendNguyen
 */
public class Service {

    List<User> lstUser = new ArrayList<>();
    File file = new File("dataObject.txt");

    public Service() {
    }

    boolean themTaiKhoan(User user) throws IOException {
        if (user == null) {
            return false;
        }
        CheckFile();
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(user);
        oos.close();
        fos.close();
        return true;
    }

    public List<User> getListTeacher() throws IOException, ClassNotFoundException {
        CheckFile();
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        while (fis.available() > 0) {
            User user = (User) ois.readObject();
            lstUser.add(user);

        }
        ois.close();
        fis.close();
        return lstUser;
    }

    void CheckFile() throws IOException {
        if (!file.exists()) {
            file.createNewFile();
        }
    }
}
