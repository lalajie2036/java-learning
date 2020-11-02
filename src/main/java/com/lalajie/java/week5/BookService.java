package com.lalajie.java.week5;

/**
 * @ClassName BookService
 * @Description TODO
 * @Author Mister-Lu
 * @Date 2020/11/2
 **/
public interface BookService {
    boolean checkPush(Book book) throws ISBNException,BookNameException,PriceException;
}
