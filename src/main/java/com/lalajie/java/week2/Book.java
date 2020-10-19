package com.lalajie.java.week2;
import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @ClassName Book
 * @Description TODO
 * @Author Mister-Lu
 * @Date 2020/10/12
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private String name;
    private Integer price;
    private Date publishDate;

//    public static void main(String[] args) {
//        Book book = new Book("java",122,new Date());
//        System.out.println(book.toString());
//    }
}
