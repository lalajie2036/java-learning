package com.lalajie.java.week2;

import java.util.Date;

/**
 * @ClassName TestGroup
 * @Description TODO
 * @Author Mister-Lu
 * @Date 2020/10/12
 **/
public class TestGroup {
    public static void main(String[] args) {
        Book book1 = new Book("Java基础",99,new Date());
        Book book2 = new Book("JavaScript",120,new Date());
        Book book3 = new Book("Java从入门到精通",220,new Date());
        Book book4 = new Book("Java大神进阶",88,new Date());
        Book book5 = new Book("Java宝典",66,new Date());

        Phone phone1 = new Phone("iphone",9999);
        Phone phone2 = new Phone("huawei",8888);
        Phone phone3 = new Phone("MI10",7777);

        Student student1 = new Student("001", "张三", "男", phone1, new Book[]{book1, book2});
        Student student2 = new Student("002", "李四", "女", phone2, new Book[]{book1, book2,book3,book4,book5});
        Student student3 = new Student("003","汪汪","男",phone3,new Book[]{book2});

        Group group1 = new Group("第一组",new Student[]{student1,student2});
        Group group2 = new Group("第二组",new Student[]{student2});
        Group group3 = new Group("第三组",new Student[]{student1,student2,student3});

        System.out.println(student1);
        System.out.println(group1);

        Student[] students = group1.getStudents();
        for (Student student : students) {
            System.out.println(student.getStudentName());
        }
    }
}
