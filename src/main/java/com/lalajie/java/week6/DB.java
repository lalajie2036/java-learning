//package com.lalajie.java.week6;
//
//import java.sql.*;
//import java.util.Properties;
//
///**
// * @ClassName DB
// * @Description TODO
// * @Author Mister-Lu
// * @Date 2020/11/9
// **/
//public class DB {
//    static Connection con;
//    static String driver = "com.mysql.jdbc.Driver";
//    static String url = "jdbc:mysql://localhost:3306/chatroom?useUnicode=true&characterEncoding=utf-8";
//    static String user = "root";
//    static String password = "root";
//
//    Properties info;
//    private static Connection getCon(){
//        try {
//            Class.forName(driver);
//            con = DriverManager.getConnection(url, user, password);
//            if (!con.isClosed()) {
//                System.out.println("数据库连接成功");
//            }
//        }catch (SQLException | ClassNotFoundException e){
//            System.out.println("数据库链接失败");
//        }
//        return con;
//    }
//    public String selectAll(){
//        Connection conn = getCon();
//        String sql = "select * from user ";
//        PreparedStatement pstmt;
//        try {
//            pstmt = (PreparedStatement) conn.prepareStatement(sql);
//            ResultSet rs = pstmt.executeQuery(sql);
//            int col = rs.getMetaData().getColumnCount();
//            while (rs.next()) {
//                for (int i = 1; i <= col; i++) {
//                    System.out.println(rs.getString(i) + "\t");
//                    if ((i == 2) && (rs.getString(i).length() < 8)) {
//                        System.out.println("\t");
//                    }
//                }
//                System.out.println("");
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//    public User select(String account, String password) throws SQLException {
//        Connection conn = getCon();
//        String sql = "'select * from user where username = '" + account + "' AND password = '" + password + "';'";
//        User user = new User();
//        PreparedStatement statement = conn.prepareStatement(selectAll());
//        ResultSet resultSet = statement.executeQuery();
//        while (resultSet.next()) {
//            String name = resultSet.getString("username");
//            String pwd = resultSet.getString("password");
//            user = new User(name, pwd);
//        }
//        return user;
//    }
//
//}
