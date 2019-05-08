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
public class Karte {

    private Wert wert;
    private Farbe farbe;
    public boolean istAufgedeckt;

    public Karte(Wert wert, Farbe farbe) {
        this.farbe = farbe;
        this.wert = wert;
        istAufgedeckt = true;

    }

    public String getFarbe() {
        return farbe.druckFarbe();
    }

    public int getWert() {
        return wert.getWert();
    }

    public String druckWert() {
        return wert.druckWert();
    }

    public void drehKarte() {
        istAufgedeckt ^= true;
    }

    public String toString() {
        String str = "";
        if (istAufgedeckt) {
            str += farbe.druckFarbe() + wert.druckWert();
        } else {
            str = "Karte falschrum";
        }
        return str;
    }

}
