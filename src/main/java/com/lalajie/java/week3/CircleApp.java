package com.lalajie.java.week3;

/**
 * @ClassName CircleApp
 * @Description TODO
 * @Author Mister-Lu
 * @Date 2020/10/19
 **/
public class CircleApp {
    public static void main(String[] args) {
//        Point point = new Point();
//        Circle circle = new Circle();
        Point point = new Point(10,20);
        Circle circle = new Circle(10,20,5);
        point.print();
        circle.print();
    }
}
