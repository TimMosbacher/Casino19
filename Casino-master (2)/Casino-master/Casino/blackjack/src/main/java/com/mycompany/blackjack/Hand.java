/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.blackjack;

import java.util.ArrayList;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author Butzi
 */
public class Hand {

    public ArrayList<Karte> karten;
    public boolean lost = false;

    public Hand() {
        karten = new ArrayList<Karte>();
    }

    public void ablegen() {
        karten.clear();
    }

    public void erhalten(Karte karte) {
        karten.add(karte);
    }

    public int getGesamt() {
        int gesamt = 0;
        boolean hatAss = false;
        for (int i = 0; i < karten.size(); i++) {
            gesamt += karten.get(i).getWert();
            if (karten.get(i).druckWert() == "Ass") {
                hatAss = true;
            }
            if (hatAss && gesamt <= 11) {
                gesamt += 10;
            }
        }
        if (hatAss && gesamt>=22) {
            gesamt-=10;
        }
        return gesamt;
    }
    public boolean versichernGrund(){
        boolean ersteAss = false;
        System.out.println(karten.get(0).istAufgedeckt);
        System.out.println(karten.get(0).druckWert());
        if (karten.get(0).druckWert() == "Ass") {
                ersteAss = true;
            }
        return ersteAss;   
    }
    public void drehKarte() {
        karten.get(karten.size() - 1).drehKarte();
    }

    public void drehKarten() {
        for (Karte k : karten) {
            k.drehKarte();
        }
    }

    public String zeigHand() {
        String a = "";
        boolean alleSichtbar = true;
        for (Karte k : karten) {
            a += k.toString() + "\n";
            if (!k.istAufgedeckt) {
                alleSichtbar = false;
            }
        }
        if (alleSichtbar) {
            a += "Gesamt Punkte = " + getGesamt() + "\n";
        }
        return a;
    }

    public boolean gebe(Karte karte, Hand andere) {
        if (!karten.contains(karte)) {
            return false;
        } else {
            karten.remove(karte);
            andere.erhalten(karte);
            return true;
        }
    }

    public void spielErgebnis(Hand S, Hand D,Spiel G){
        if (D.getGesamt() <= 21 && S.getGesamt() < D.getGesamt()||S.getGesamt()>21&&D.getGesamt()<=21) {
            G.verloren();
            G.versicherungAuszahl();
            System.out.println("Lose");
        }
        else if (S.getGesamt()<=21 && S.getGesamt()>D.getGesamt()||S.getGesamt()<=21 &&D.getGesamt()>21) {
            if (S.karten.size()==2&&S.getGesamt()==21) {
                G.black();
                System.out.println("BJ");
            }
            else {
                G.gewinnen();
                System.out.println("Win");
            }
        }
        else{
            if (S.getGesamt()==21 && D.getGesamt()==21&& S.karten.size()==2) {
                G.black();
                System.out.println("BJ2");
            }
            if (S.getGesamt()==21 && D.getGesamt()==21&& D.karten.size()==2) {
                G.verloren();
                G.versicherungAuszahl();
                System.out.println("Lose2");
            }
            else{
            G.unentschieden();
            G.versicherungAuszahl();
            System.out.println("Unentschieden");
            }
            S.ablegen();
            D.ablegen();
        }
    }
    public void verloren(){
        if (this.getGesamt() > 21) {
            ablegen();
            lost = true;
        }
    }
}

