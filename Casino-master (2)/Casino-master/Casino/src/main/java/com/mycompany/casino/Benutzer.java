/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.casino;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author motim
 */
public class Benutzer {
    private String name,passwort;
    private int id;
   
    public Benutzer(String name, String passwort) {
        this(name, passwort, -1);
    }
    
    public Benutzer(String name, String passwort, int id) {
        this.name = name;
        this.passwort = passwort;
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswort() {
        return passwort;
    }

    public void setPasswort(String passwort) {
        this.passwort = passwort;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   public String toString(){
       return "Benutzername: " + name + " Passwort: " + passwort + " Id: " + id;
   } 

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + Objects.hashCode(this.name);
        hash = 73 * hash + Objects.hashCode(this.passwort);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Benutzer other = (Benutzer) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
   
   
 
}
