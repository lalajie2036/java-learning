package com.lalajie.java.week3;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Point
 * @Description TODO
 * @Author Mister-Lu
 * @Date 2020/10/19
 **/
@Data
@Builder
@AllArgsConstructor
public class Point{
    private Integer x;
    private Integer y;

    public Point(){
        System.out.println("点被初始化");
    }

    protected void print() {
        System.out.println("横坐标"+ x + "纵坐标" + y);
    }
}

