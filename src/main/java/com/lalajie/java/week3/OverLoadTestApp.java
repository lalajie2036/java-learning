package com.lalajie.java.week3;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * @ClassName OverLoadTestApp
 * @Description TODO
 * @Author Mister-Lu
 * @Date 2020/10/19
 **/
public class OverLoadTestApp {
    public synchronized static String format(Date date) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm.ss");
        df.setTimeZone(TimeZone.getTimeZone("Gmt+8"));
        return df.format(date.getTime());
    }

    public synchronized static String format(Data date, String regex) {
        SimpleDateFormat df = new SimpleDateFormat(regex);
        return df.format(date);
    }

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
    }
}
