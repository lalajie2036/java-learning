package com.lalajie.java.week1;

import sun.applet.Main;

/**
 * @ClassName Factorial
 * @Description
 * @Author Mister-Lu
 * @Date 2020/10/5
 **/
public class Factorial {
    public static void main(String[] args) {
        int count = 1;
        int num = 5;
        for (int i = 1; i <= num; i++) {
            count *= i;
        }
        System.out.println("5的阶乘是 " + count);
    }
}
