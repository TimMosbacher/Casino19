/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.blackjack;
import java.util.Random;
/**
 *
 * @author Butzi
 */
public class Deck extends Hand{
    
    public void auffüllen(){
        for(Wert wert: Wert.values() ){
            for(Farbe farbe : Farbe.values()){
                Karte karte = new Karte(wert, farbe);
                karte.drehKarte();
                this.erhalten(karte);
            }
        }
    }
    
    Random r = new Random();
    
    public void mischen(){
        for (int i = karten.size() - 1; i >0; i--) {
            int mk = r.nextInt(i);
            Karte zkarte = karten.get(mk);
            Karte lkarte = karten.get(i);
            karten.set(i,zkarte);
            karten.set(mk, lkarte);
        }
    }
   
    public void dealen(Hand hand,int proHand){
        for (int i = 0; i < proHand; i++) {
            this.gebe(karten.get(0), hand);
        }
    }
    public void drehKarte(Karte k){
        k.drehKarte();
    }
}
