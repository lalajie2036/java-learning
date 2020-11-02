package com.lalajie.java.week5;

import javax.swing.*;
import java.util.Scanner;
import java.util.zip.DeflaterOutputStream;

/**
 * @ClassName ExcetpionTest1
 * @Description TODO
 * @Author Mister-Lu
 * @Date 2020/11/2
 **/
public class ExcetpionTest1 {
    public static void main(String[] args) {
//        int result = 0;
//        //1.ArithmeticException 算数异常
//        try {
//            result = 3 / 0;
//        }catch (Exception e){
//            System.err.println("除数不能为0！");
//            //JOptionPane.showMessageDialog(null, "除数不能为0！");
//            System.err.println(e.getMessage());
//            //e.printStackTrace();
//        }
//
//        System.out.println(result);

//        int[] a = new int[]{1,2,3,4,5};
//        try {
//            System.out.println(a[5]);
//        }catch (ArrayIndexOutOfBoundsException e) {
//            System.err.println("数组索引越界！！");
//            System.err.println("异常的原因：" + e.getCause());
//            System.err.println("异常的详细信息：" + e.getMessage());
//            System.err.println("异常的对象e：" + e.toString());
//        }

        // 3.NumberFormatException 数字格式化异常
        System.out.println("请输入价格：");
        Scanner scanner = new Scanner(System.in);
        //从键盘读入一串字符串 "123"
        String priceStr = scanner.next();
        //将字符串转化为整型 123
        int price = Integer.parseInt(priceStr);
        System.out.println("price = " + price);

        // 4. NPE NullPointerException

    }
}
