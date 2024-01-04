package com.groupb.led34a.model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author digitech
 */
public class LoginResponse {
    private String email;
    private String password;
    private String username;
    public LoginResponse(String email, String password, String username){
        this.email = email;
        this.password = password;
        this.username = username;
    }
    
    public String getEmail(){
        return this.email;
    }
    public String getPassword(){
        return this.password;
    } 
    
    public String getUsername(){
        return this.username;
    }    
}
