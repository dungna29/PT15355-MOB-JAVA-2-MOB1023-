/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi1_OOP;

import java.util.List;

/**
 *
 * @author Nguyen Anh Dung
 */
public class Service implements IService,IService2,Iservice3{

    public Service() {
    }

    @Override
    public void hamThem(String name, String Tuoi, String Sdt, String Msv) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void hamSua(String Msv) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    @Override
    public List<SinhVien> getDanhSachSinhVien() {
      return null;
    }

    @Override
    public void hamXoa(String Msv) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
