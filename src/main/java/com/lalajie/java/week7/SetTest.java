package com.lalajie.java.week7;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @ClassName SetTest
 * @Description TODO
 * @Author Mister-Lu
 * @Date 2020/11/16
 **/
public class SetTest {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("c");
        set.add("a");
        set.add("b");
        //System.out.println(set);
        //使用for循环遍历
        System.out.println("使用for循环遍历");
        Object[] array = set.toArray();
        for (Object o : array) {
            System.out.println(o.toString());
        }
        //使用iterator遍历
        System.out.println("使用iterator遍历");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        //使用lambda遍历
        System.out.println("使用lambda遍历");
        set.forEach(s -> System.out.println(s));

        //使用方法引用遍历
        System.out.println("使用方法引用遍历");
        set.forEach(System.out::println);
    }
}
