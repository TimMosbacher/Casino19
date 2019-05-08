/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.blackjack;

/**
 *
 * @author Butzi
 */
public enum Farbe{
    HERZ("♥"),
    KARO("♦"),
    PIK("♠"),
    KREUZ("♣");
    
    private final String farbeText;
    
    private Farbe(String farbeText){
        this.farbeText = farbeText;
    }
    public String druckFarbe(){
        return farbeText;
    }
}
