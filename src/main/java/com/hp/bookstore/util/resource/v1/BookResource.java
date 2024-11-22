/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hp.bookstore.util.resource.v1;

import com.hp.bookstore.util.dto.Book;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

/**
 *
 * @author ADMIN
 */
@Path("v1/books")
//ai đó mà gõ: localhost:6969/bookstore thì vào webapp
//ai đó mà gõ: localhost:6969/api/v1/books chắc chắn đến đc class này
//đén class bị bối rối
//CLASS CÓ NHIỀU HÀM, KO BIẾT LẤY HÀM NÀO
//ĐÔI KHI CẦN 1 TẦNG ÁNH XẠ NỮA 
//CÓ ÁNH XẠ CHO MỖI HÀM
public class BookResource {

    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Book getBook(){
        return new Book("8936107813361", "Clean Code", "Nguyễn Văn Trung", 1, 2023);
    }
}
