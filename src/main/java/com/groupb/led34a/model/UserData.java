/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.groupb.led34a.model;

/**
 *
 * @author digitech
 */
public class UserData {
    private String username;
    private String email;
    private String password;
    public UserData(String username, String email, String password){
        this.email = email;
        this.username = username;
        this.password = password;
    }    
    public String getUsername(){
        return this.username;
    }
    public String getPassword(){
        return this.password;
    }
    public String getEmail(){
        return this.email;
    }
}
