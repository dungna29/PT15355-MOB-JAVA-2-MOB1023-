/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi8_Enum;

/**
 *
 * @author Nguyen Anh Dung
 */
//Khai báo bên ngoài 1 lớp thì sẽ không được khai báo access modifier
 enum NgayTrongTuan1 {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    }
public class S1_Enum {
//   enum NgayTrongTuan1 {
//        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
//    }
    
    public static void main(String[] args) {
        //enum là một từ khóa trong Java, là một kiểu dữ liệu đặc biệt được sử dụng để đại diện cho hằng số cố định.
        //Một enum có thể chứa các trường, phương thức và constructor.
        //Bởi vì các giá trị của Enum là các hằng số, nên tên của các trường kiểu enum thường là các chữ cái hoa.
        //Trong ngôn ngữ lập trình Java, bạn xác định một kiểu enum bằng cách sử dụng từ khóa enum. 
        //Enum có thể implement một Interface
        NgayTrongTuan ngayTrongTuan = NgayTrongTuan.FRIDAY;
        System.out.println(ngayTrongTuan);
        for (NgayTrongTuan1 x : NgayTrongTuan1.values()) {
            System.out.println(x);
        }
        
        
         NgayTrongTuan1 today = NgayTrongTuan1.SUNDAY;
 
        // Sử dụng equal() method
        if (today.equals(NgayTrongTuan1.SUNDAY)) {
            System.out.println("Hôm nay là ngày nghỉ  cuối tuần");
        } else {
            System.out.println("Hôm nay là ngày đi giảng dậy");
        }
 
        // Sử dụng == toán tử
        if (today == NgayTrongTuan1.SUNDAY) {
            System.out.println("Hôm nay là ngày nghỉ  cuối tuần");
        } else {
            System.out.println("Hôm nay là ngày đi giảng dậy");
        }
        
        
    }   

   
}
