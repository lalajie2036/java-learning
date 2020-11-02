package com.lalajie.java.week3;

import java.util.zip.ZipEntry;

/**
 * @ClassName Cylinder
 * @Description TODO
 * @Author Mister-Lu
 * @Date 2020/10/28
 **/
public class Cylinder extends Circle{
    private int h;

    public Cylinder(int x,int y,int r,int h){
        super(x, y, r);
        this.h = h;
    }

//    @Override
//    public static void  print(){
//        super.print();
//        System.out.println("圆柱体的体积：" + super.getArea() * h);
//    }
}
