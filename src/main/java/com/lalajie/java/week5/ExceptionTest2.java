package com.lalajie.java.week5;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.io.*;
import java.nio.channels.SeekableByteChannel;
import java.nio.channels.SelectionKey;

/**
 * @ClassName ExceptionTest2
 * @Description TODO
 * @Author Mister-Lu
 * @Date 2020/11/2
 **/
public class ExceptionTest2 {
    public static void main(String[] args) throws IOException {
        //File file = new File("/D:/1.ioc");
        try {
            byte[] b = readFile("/D:/1.ioc");
            System.out.println(b.length);
        } catch (IOException e) {
            System.err.println("出现IO异常！！");
        } finally {
            System.out.println("无论有无异常都会执行的代码");
        }
        System.out.println("其他代码");


    }

    public static byte[] readFile(String path)throws IOException{
        File file = new File(path);
        byte[] b = new byte[(int) file.length()];
        InputStream is = new FileInputStream(file);
        int result = is.read();
        System.out.println(result);
        is.close();
        return b;
    }

}
