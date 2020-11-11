package com.lalajie.java.week6;

import java.sql.SQLException;

/**
 * @ClassName LoginService
 * @Description TODO
 * @Author Mister-Lu
 * @Date 2020/11/9
 **/
public class LoginService {
    String username = "admin";
    String pwd = "admin";

    public boolean login(String account, String password1) throws SQLException {
//            DB db = new DB();
//        User user = db.select(account, password1);
//        username = user.getUsername();
//        pwd = user.getPassword();
        if (account.equals(username) && password1.equals(pwd)) {
            return true;
        }else{
            return false;
        }

    }
}
