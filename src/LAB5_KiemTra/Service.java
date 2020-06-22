/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB5_KiemTra;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LegendNguyen
 */
public class Service {

    List<UserPOLY> lstUser = new ArrayList<UserPOLY>();//Bắt buộc phải có biến toàn cục List   
    static File file = new File("dataUser.txt");

    public Service() {

    }

    boolean themTaiKhoan(UserPOLY user) throws FileNotFoundException, IOException {
        checkFile();
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        //Thực hiện hành động ghi dữ liệu ra file
        //oos.writeObject(user);//Nếu làm như này thì các bạn chỉ lưu được 1 đối tượng
        lstUser.add(user);//Thực hiện thêm đối tượng mới thêm vào danh sách List toàn cục ở trên
        //Dùng vòng lặp foreach để ghi nhiều đối tượng vào file
        for (UserPOLY x : lstUser) {
            oos.writeObject(x);//Ghi 1 đối tượng vào file
        }

        //Chú ý nhớ Close các FileOutputStream và ObjectOutputStream
        oos.close();
        fos.close();
        return true;
    }

    public List<UserPOLY> getListUser() throws IOException, ClassNotFoundException {
        checkFile();      
        if (file.length() == 0) {
            return lstUser;
        }
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        lstUser.clear();
        UserPOLY user;
        while (fis.available() > 0) {
            user = new UserPOLY();
            //Thực hiện đọc từng đối tượng trong file và thêm vào List toàn cục ở trên            
            user = (UserPOLY) ois.readObject();
            lstUser.add(user);

        }
        ois.close();
        fis.close();
        return lstUser;
    }

    void checkFile() throws IOException {
        if (!file.exists()) {
            file.createNewFile();
        }
    }

}
