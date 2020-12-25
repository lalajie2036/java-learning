package com.lalajie.java.week10;

import com.sun.org.apache.xml.internal.utils.URI;

import javax.net.ssl.HttpsURLConnection;
import javax.swing.*;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;

/**
 * @ClassName CarouseThread
 * @Description TODO
 * @Author Mister-Lu
 * @Date 2020/12/7
 **/
public class CarouselThread implements Runnable {
    private String[] imgs = {
                    "https://yaochen666.oss-cn-shanghai.aliyuncs.com/picture/01jixie.png",
                    "https://yaochen666.oss-cn-shanghai.aliyuncs.com/picture/02dianqi.png",
                    "https://yaochen666.oss-cn-shanghai.aliyuncs.com/picture/03hangkong.png",
                    "https://yaochen666.oss-cn-shanghai.aliyuncs.com/picture/04jiaotong.png",
                    "https://yaochen666.oss-cn-shanghai.aliyuncs.com/picture/05jisuanji.png",
                    "https://yaochen666.oss-cn-shanghai.aliyuncs.com/picture/06yishu.png",
    };

    //创建显示图片的组件
    private JLabel bgLabel;

    public void setBgLabel(JLabel bgLabel) {
        this.bgLabel = bgLabel;
    }

    @Override
    public void run() {
        int index = 0;
        int len = imgs.length;

        while (true) {
            try {
                URL url = new URL(imgs[index]);
                //创建了连接
                HttpURLConnection conn = (HttpsURLConnection)url.openConnection();
                conn.setRequestMethod("GET");
                conn.setConnectTimeout(10000);
                //得到连接目标的输入流
                InputStream is = conn.getInputStream();
                //字节缓冲输出流
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                //缓冲区
                byte[] buffer = new byte[1024];
                int lenth = 0;
                //通过缓冲区读取文件
                while ((lenth = is.read(buffer)) != -1) {
                    baos.write(buffer, 0, lenth);
                }
                byte[] bytes = baos.toByteArray();
                //将字节数组通过字节输入流读入
                is.read(bytes);
                //通过bytes构建图标icon
                Icon icon = new ImageIcon(bytes);
                //将icon设置为背景标签的图标
                this.bgLabel.setIcon(icon);
                Thread.sleep(2000);
                is.close();

            } catch (Exception e) {
                e.printStackTrace();
            }

            index++;
            //处理数组最后一个元素
            if (index == len) {
                index = 0;
            }
        }


    }
}
