/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.groupb.led34a.dao;

import com.groupb.led34a.model.LoginResponse;
import com.groupb.led34a.database.MySqlConnection;
import com.groupb.led34a.model.LoginModel;
import com.groupb.led34a.model.RegisterModel;
import com.groupb.led34a.model.UserData;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author digitech
 */
public class AuthDAO extends MySqlConnection {
    public boolean register(RegisterModel user){
        try{
            PreparedStatement ps =null;
            Connection conn = openConnection();
            
            String sql = "INSERT INTO users(username, email, password) VALUES(?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getPassword());
            
            int result = ps.executeUpdate();
            if(result == -1){
                return false;
            }else{
                return true;
            }
            
        }catch(Exception e){
            System.out.println(e);
            return false;
        }
    }
//     public LoginResponse login(LoginModel user){
//        try{
//            PreparedStatement ps =null;
//            Connection conn = openConnection();
//            
//            String sql = "SELECT * FROM users where email = ? and password = ?";
//            ps = conn.prepareStatement(sql);
//            ps.setString(1, user.getEmail());
//            ps.setString(2, user.getPassword());
//            
//            ResultSet result = ps.executeQuery();
//            if(result == null){
//                return null;
//            }else{
//                result.next();
//                LoginResponse lr = new LoginResponse(
//                        
//                result.getString("email"),
//                result.getString("password"),
//                result.getString("username")
//
//                );
//                return lr;
//            }
//            
//        }catch(Exception e){
//            System.out.println(e);
//            return null;
//        }
        
//    }
      public UserData login(LoginModel login){
          try{
              PreparedStatement ps = null;
              Connection conn = openConnection();
              String sql = "SELECT * FROM users WHERE email = ? and password = ?";
              ps = conn.prepareStatement(sql);
              ps.setString(1, login.getEmail());
              ps.setString(2, login.getPassword());
              
              ResultSet result = ps.executeQuery();
              if(result !=null && result.next() != false){
                   // get data here
                   String email = result.getString("email");
                   String password = result.getString("password");
                   String username = result.getString("username");
                   UserData user = new UserData(
                      username, email, password
                   );
                   return user;
              }else{
                  return null;
              }
          }catch(Exception exception){
              return null;
          }
      }
}
