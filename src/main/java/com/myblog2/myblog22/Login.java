package com.myblog2.myblog22;

public class Login {

    private String userName;
    private  String password;

    public Login(String userName,String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }


}
