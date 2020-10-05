package com.lalajie.java.week1;

import java.util.Random;

/**
 * @ClassName ArrayTest
 * @Description TODO
 * @Author Mister-Lu
 * @Date 2020/10/5
 **/
public class ArrayTest {
    static int MAX = 5;
    public static void main(String[] args) {
        int[] a = new int[MAX];
        Random random = new Random();
        for (int i = 0; i < MAX; i++) {
            a[i] = random.nextInt(100);
            System.out.print(a[i] + " ");
        }
    }
}
