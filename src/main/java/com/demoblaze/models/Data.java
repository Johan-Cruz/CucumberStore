package com.demoblaze.models;

public class Data {

    private String userName;
    private String password;



    public Data(String name, String userPassword){
        this.userName = name;
        this.password = userPassword;

    }

    public String getUserName(){
        return userName;
    }
    public String getPassword(){
        return password;
    }

}
