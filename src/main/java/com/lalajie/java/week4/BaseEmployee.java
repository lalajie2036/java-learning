package com.lalajie.java.week4;

/**
 * @ClassName BaseEmployee
 * @Description TODO
 * @Author Mister-Lu
 * @Date 2020/10/26
 **/
public abstract class BaseEmployee {
    public void print(){
        System.out.println("This is an abstract class.");
    }

    /**
     * 发工资
     * @param id 员工工资
     * @return int
     */
    public abstract int getSalary();

}
