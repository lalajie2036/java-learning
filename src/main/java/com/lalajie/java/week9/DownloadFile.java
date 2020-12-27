//package com.lalajie.java.week9;
//
//import com.sun.corba.se.spi.orbutil.fsm.Input;
//
//import javax.print.DocFlavor;
//import java.io.*;
//import java.net.URLConnection;
//
///**
// * @ClassName DownloadFile
// * @Description TODO
// * @Author Mister-Lu
// * @Date 2020/11/30
// **/
//public class DownloadFile {
//    public static void main(String[] args) {
//        try {
//            download("https//img3.mukewang.com/5fbdc05bd000149871798717920764.jpg",
//                    "my.jpg","D:\\java");
//        }catch (IOException e) {
//            System.err.println("文件下载出现异常");
//        }
//    }
//
//    private static void download(String urlString, String fileName, String savePath) throws IOException{
//        //构造url
//        URL url = new DocFlavor.URL(urlString);
//        //打开连接
//        URLConnection conn = url.openConnection();
//        //设置请求超时
//        conn.setConnectTIMEOUT(5000);
//        //构建输入流
//        InputStream is = conn.getInputStream();
//        //定义数据缓冲
//        byte[] bytes = new byte[1024];
//        //读取数据长度
//        int len;
//        //创建文件对象
//        File file = new File(savePath);
//        if (!file.exists()){
//            file.mkdirs();
//        }
//        //构建输出文件输出流
//        File file1;
//        OutputStream os = new FileOutputStream(file.getPath() + file.getseparator + fileName);
//        //开始读取，每次读取缓冲区大小的字节数
//        while ((len = is.read(bytes)) != -1) {
//            os.write(bytes,0,len);
//        }
//        //关闭连接
//        os.close();
//        is.close();
//    }
//}
