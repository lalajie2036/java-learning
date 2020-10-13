package com.lalajie.java.week1;
import java.util.Arrays;
import java.util.Random;

/**
 * @ClassName ArrayTest
 * @Description TODO
 * @Author Mister-Lu
 * @Date 2020/10/5
 **/
public class ArrayTest {
    static int MAX = 5;
    static int sum = 0;
    public static void main(String[] args) {
        int[] a = new int[MAX];
        Random random = new Random();
        for (int i = 0; i < MAX; i++) {
            a[i] = random.nextInt(100);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.print("排序：");

         //对上面数排序
        Arrays.sort(a);
        for (int k : a) {
            System.out.print(k + " ");
        }

         //求出数组和
        int j;
        for (j = 0;j<a.length;j++){
            sum = sum + a[j];
        }
        System.out.println();
        System.out.println("数组的和为： " + sum);

         //求出最大值和最小值
        int min=a[0];
        int max=a[0];
        for (int i = 1; i <a.length ; i++) {
            if (a[i]>max){
                max=a[i];
            }
            if (a[i]<min){
                min=a[i];
            }
        }
        System.out.println();
        System.out.print("数组的最大值为:"+max);
        System.out.print("\n数组的最小值为:"+min);
    }
}
