package com.lalajie.java.week9;

import org.omg.CORBA.Current;

import java.io.File;
import java.sql.Time;
import java.time.LocalDate;

/**
 * @ClassName FileTest
 * @Description TODO
 * @Author Mister-Lu
 * @Date 2020/11/30
 **/
public class FileTest {
    public static void main(String[] args) {
//        File file = new File("D:" + File.separator + "1.txt");
//        System.out.println(file.getAbsolutePath());
//        System.out.println(file.getName());

        //1.课堂练习1-1：创建目录，用当前时间日期命名,然后删除这个目录
        LocalDate today = LocalDate.now();
        String dirName = today.getYear() + "-" + today.getMonthValue() + "-" + today.getDayOfMonth();
        File dir = new File("D:/" + dirName);
        if (!dir.exists()) {
            boolean flag = dir.mkdirs();
            System.out.println(flag);
        }
        //课堂练习1-2：删除刚才创建的目录，注意判断是否存在
        if (dir.exists()) {
            boolean a = dir.delete();
            System.out.println(a + "已删除");
        }
        //课堂练习1-3：递归创建目录，顶级目录名，Java，一级目录名：面向对象、异常、集合、io、多线程，io下目录：字节流、字符流
        String[] list1 = {"面向对象", "异常","集合","io","多线程"};
        String[] list2 = {"字符流","字节流"};
        File dir1 = new File("D:\\Java");
        if (!dir1.exists()) {
            boolean flag = dir.mkdirs();
            System.out.println();
        }
        for (String s : list1) {
            File file = new File("D:\\Java" + File.separator + s);
            if (!file.exists()){
                boolean flag = file.mkdirs();
                System.out.println();
            }
            if(s.equals("io")) {
                for(String j : list2) {
                    File file2 = new File("G:\\java\\io\\" + j);
                    if (!file2.exists()) {
                        boolean e = file2.mkdirs();
                        System.out.println(e);
                    }
                }
            }
        }

    }

}
