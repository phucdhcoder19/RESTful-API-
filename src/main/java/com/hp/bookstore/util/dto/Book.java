/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hp.bookstore.util.dto;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author ADMIN
 */
//Serializable là 1 interface đặc biệt
//ko cos hàm nào ta cần viết code cho nó, ko chừa hàm abstract
//dùng để đánh dấu 1 class có điều đặc biệt nào đó 
//dùng để báo hiệu cho máy ảo JVM biết là mày có lúc nào đó sẽ phải chẻ cái
//obj book này thành các luồng, các dãy  cãy dòng chảy Bit Byte để đổ xuống DB
//chỉ  convert cái info/filed thành luồng byte thôi, không covert code đem xuống
//SERIAL LÀ TỪNG DÃY TỪNG DÃY 
//INTERFACE: ĐƯỢC GỌI LÀ MARKER INTERFACE
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Book implements Serializable{
    private String isbn; //mã sách
    private String title;
    private String author;
    private int edition;
    private int publishedYear;

 
    
    
}
