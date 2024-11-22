/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hp.bookstore.util.config;

import jakarta.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;
//framwork cung cap giai phap viet web moi nhat
/**
 *
 * @author ADMIN
 */
//xai web app localhost:6969/bookstore
//xai web api localhost:6969/bookstore/api
@ApplicationPath("api")
public class BookApplication extends ResourceConfig{
    //day la ham main cua api 
    //luc deploy app nay len TOMCAT se quet qa 1 lượt các class ở package
    //thấy class nào bà con với resource config thì nó sẽ hiểu rằng
    //ai mà gọi url có xẹt api thì class này sẽ phụ trách 
    //mapping giữa URL/ api với class này(web.xml làm nhiệm vụ tương đương)
    //class này đứng đón URL/api chứ thực sự nó ko xử lí data từ DB và JSON
    //nó là đầu mối để kính chuyển các REQUEST sau/api
    //đến các class tương ứng để xử lí tài nguyên tương ứng được liệt kê
    //trong URL sau/api
    //ví dụ /api/books muốn get các cuốn sacsh trong db
    //có quá trời cái cần lấy
    //mỗi cái 1 class
    
    public BookApplication(){
        packages("com.hp.bookstore.util.resource"); //hàm thừa kế từ class cha ResourceConfig
        //tên các package cách nhau bới dấu phẩy, để phục vụ request có url.../api...
        //đang xài pakage cha vì 2 thằng con sẽ tự động bị ép theo
    }
}
