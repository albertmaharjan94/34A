/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.groupb.led34a.model;

/**
 *
 * @author digitech
 */
public class LoginModel {
    private String email;
    private String password;
    public LoginModel(String email, String password){
        this.email = email;
        this.password = password;
    }
    
    public String getEmail(){
        return this.email;
    }
    public String getPassword(){
        return this.password;
    }      
}
