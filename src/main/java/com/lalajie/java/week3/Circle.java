package com.lalajie.java.week3;

/**
 * @ClassName Circle
 * @Description TODO
 * @Author Mister-Lu
 * @Date 2020/10/19
 **/
public class Circle extends Point{
    private int r;
    public Circle(){
        System.out.println("圆被初始化了");
    }

    public Circle(int x, int y, int r) {
        super(x, y);
//        super.print();
        this.r = r;
    }
    @Override
    public void print(){
        super.print();
        System.out.println("圆的面积： "+ Math.PI*r*r);
    }
}
