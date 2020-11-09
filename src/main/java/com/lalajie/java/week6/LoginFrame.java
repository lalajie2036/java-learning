package com.lalajie.java.week6;

import javax.swing.*;

/**
 * @ClassName LoginFrame
 * @Description TODO
 * @Author Mister-Lu
 * @Date 2020/11/9
 **/
public class LoginFrame {
    private JPanel mainPanel;
    private JPanel centerPanel;
    private JPanel tpoPanel;
    private JPanel leftPanel;
    private JPanel rightPanel;
    private JPanel bottomPanel;
    private JPanel loginPanel;
    private JPanel loginPanel2;
    private JTextPane loginLabel;
    private JTextField accountField;
    private JPasswordField passwordField;
    private JButton 登录Button;
    private JLabel tipLabel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("LoginFrame");
        frame.setContentPane(new LoginFrame().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
    }
}
