/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hp.bookstore.util.resource.v2;

import com.hp.bookstore.util.dto.Book;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.*;

/**
 *
 * @author ADMIN
 */
@Path("v2/books")
public class BookResource {

    //API kiểu get chỉ trả về data qua url gõ trực tiếp trên trình duyệt
    //hay url đưa trong code
    //trả về: tất cả sách 
    //trả về 1 cuốn sách bất kì, nếu đưa vào mã số cuốn sách 
    //các cuốn sách có thể lấy từ db lên lát hooiff làm ở V3
    //hard-code data trước
    private List<Book> list = new ArrayList<>();

    public BookResource() {
        list.add(new Book("1", "Toi thay hoa vang tren co xanh", "Nguyen Nhat Anh", 1, 2022));
        list.add(new Book("2", "Tren duong bang", "Tony buoi sang", 1, 2022));
        list.add(new Book("3", "Doi ngan dung ngu dai", "", 1, 2022));
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> getAll() {
        return list;
    }

    //đưa tham số trên url để map vào biến trong hàm 
    @GET
    //..api/v2/books/isbn
    //path param tham số đưa trực tiếp vào đường dẫn api
    //theo kiểu số nhà 
    @Path("{isbn}") // url nhận mã sách là các giá trị thay đổi đường dãn sẽ mềm mại
    @Produces(MediaType.APPLICATION_JSON)
    public Book getOne(@PathParam("isbn") String isbn) {
        for (Book x : list) {
            if (x.getIsbn().equalsIgnoreCase(isbn)) {
                return x;
            }
        }
        return null;
    }
}
