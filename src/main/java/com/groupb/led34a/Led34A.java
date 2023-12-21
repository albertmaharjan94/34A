/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.groupb.led34a;

import com.groupb.led34a.dao.AuthDAO;
import com.groupb.led34a.model.RegisterModel;

/**
 *
 * @author digitech
 */
public class Led34A {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        AuthDAO auth = new AuthDAO();
        String username = "testusername";
        String email = "testemailjava@gmail.com";
        String password = "java123";
        RegisterModel rm = new RegisterModel(email, password, username);
        
        boolean check = auth.register(rm);
        if(check == true){
            System.out.println("Insert Success");
        }else{
            System.out.println("Insert Failure");
        }
        
        
    }
}
