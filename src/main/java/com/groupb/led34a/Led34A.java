/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.groupb.led34a;

import com.groupb.led34a.dao.AuthDAO;
import com.groupb.led34a.model.RegisterModel;
import com.groupb.led34a.view.LoginScreen;
//import com.groupb.led34a.view.LoginScreen;
import com.groupb.led34a.view.RegisterScreen;

/**
 *
 * @author digitech
 */
public class Led34A {

    public static void main(String[] args) {
        System.out.println("Hello World!");
//        RegisterScreen rs = new RegisterScreen();
//        rs.setVisible(true);
        LoginScreen ls = new LoginScreen();
        ls.setVisible(true);
        
    }
}
