package com.lalajie.java.week10;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName CarouselFrame
 * @Description TODO
 * @Author Mister-Lu
 * @Date 2020/12/7
 **/
public class CarouselFrame extends JFrame {
    private JLabel bglabel;

    public void setBglabel(JLabel bglabel) {
        this.bglabel = bglabel;
    }
    public CarouselFrame(){
        init();
        setTitle("line frame");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setResizable(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    private void init() {
        bglabel = new JLabel();
        CarouselThread ct = new CarouselThread();
        ct.setBgLabel(bglabel);
        new Thread(ct).start();
        this.getContentPane().add(bglabel, BorderLayout.CENTER);

        //时间线程和标签
        JLabel timeLabel = new JLabel();
        timeLabel.setFont(new Font("微软雅黑",Font.BOLD,24));
        this.getContentPane().add(timeLabel, BorderLayout.SOUTH);
        TimeThread tt = new TimeThread();
        tt.setTimeLabel(timeLabel);
        new Thread(tt).start();

        //文本内容显示
        JLabel textLabel = new JLabel();
        textLabel.setFont(new Font("微软雅黑", Font.BOLD, 22));
        this.getContentPane().add(textLabel, BorderLayout.NORTH);
        TextThread td = new TextThread();
        td.setTextLabel(textLabel);
        new Thread(td).start();
    }

    public static void main(String[] args) {
                new CarouselFrame();
    }
}
