package com.lalajie.java.week7;

import cn.hutool.core.collection.SpliteratorUtil;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @ClassName MapTest
 * @Description TODO
 * @Author Mister-Lu
 * @Date 2020/11/16
 **/
public class MapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>(8);
        map.put("中国", "北京");
        map.put("美国", "纽约");
        map.put("英国", "伦敦");
        //for循环遍历
        for (String key : map.keySet()) {
            String cap = (String) map.get(key);
            System.out.println(key + "的首都为" + cap);
        }

        System.out.println("iterator遍历");
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey() + "的首都为" + entry.getValue());
        }

        System.out.println("通过遍历Map的entrySet，遍历Key和Value，推荐使用！");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "的首都为" + entry.getValue());
        }

        System.out.println("lambda表达式遍历，强力推荐！！");
        map.forEach((key, value) -> System.out.println("key:" + key + ",value:" + value));
    }
}
