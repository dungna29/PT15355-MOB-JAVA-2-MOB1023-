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
@interface MyAnnotation {

    String value();

    String owner();
}

public class S3_Annotation {

    /*
    Annotations được giới thiệu trong phiên bản Java 5,
    tính năng này đã trở thành một tính năng hữu ích và được sử dụng rộng rãi.
    Tuy nhiên, có hạn chế là các annotation không thể khai báo nhiều hơn một lần cùng một vị trí. 
    Java 8 đã giới thiệu tính năng Repeating annotation,
    nó cho phép các annotation giống nhau có thể được khai báo nhiều lần cùng một vị trí.
     */
    public static void main(String[] args) {
        System.out.println("Test annotation !");
    }
}
