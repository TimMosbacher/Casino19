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
public enum Wert {
    ASS(1,"Ass"),ZWEI(2,"Zwei"),DREI(3,"Drei"),VIER(4,"Vier"),FÜNF(5,"Fünf"),SECHS(6,"Sechs"),
    SIEBEN(7,"Sieben"),ACHT(8,"Acht"),NEUN(9,"Neun"),ZEHN(10,"Zehn"),BUBE(10,"Bube"),
    DAME(10,"Dame"),KÖNIG(10,"König");
    
    private final int kartenWert;
    private final String kartenAnz;
   
    private Wert(int kartenWert, String kartenAnz){
        this.kartenWert = kartenWert;
        this.kartenAnz = kartenAnz;
    }
    
    public int getWert(){
        return kartenWert;
    }
    
    public String druckWert(){
        return kartenAnz;
    }
}
