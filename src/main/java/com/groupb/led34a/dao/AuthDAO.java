/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.groupb.led34a.dao;

import com.groupb.led34a.database.MySqlConnection;
import com.groupb.led34a.model.RegisterModel;
import java.sql.Connection;
import java.sql.PreparedStatement;

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
}
