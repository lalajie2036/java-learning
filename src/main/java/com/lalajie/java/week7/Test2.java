package com.lalajie.java.week7;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @ClassName Test2
 * @Description TODO
 * @Author Mister-Lu
 * @Date 2020/11/16
 **/
public class Test2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>(8);

        map.put("Tom", "CoreJava");
        map.put("John", "Oracle");
        map.put("Susan", "Oracle");
        map.put("Jerry", "JDBC");
        map.put("Jim", "Unix");
        map.put("Kevin", "JSP");
        map.put("Lucy", "JSP");

        map.put("Allen", "JDBC");
        Set<Entry<String, String>> entrySet = map.entrySet();
        for (Entry<String, String> entry : entrySet) {
            String key = entry.getKey();
            if ("Lucy".equals(key)) {
                entry.setValue("JDBC");
            }
        }

        for (Entry<String, String> entry : entrySet) {
            System.out.println("老师：" + entry.getKey() + "  课程：" + entry.getValue());
        }

        for (Entry<String, String> entry : entrySet) {
            if ("JDBC".equals(entry.getValue())) {
                System.out.println(entry.getKey());
                System.out.println();
            }
        }
    }
    }