/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.casino;

import java.util.ArrayList;

/**
 *
 * @author motim
 */
public class Login {

    private ArrayList<Login> login = new ArrayList<Login>();
    
    public Login(ArrayList<Login> login) {
      this.login = login;
        System.out.println(login);
        
    }

    public ArrayList<Login> getLogin() {
        return login;
    }
    
    
   
}
