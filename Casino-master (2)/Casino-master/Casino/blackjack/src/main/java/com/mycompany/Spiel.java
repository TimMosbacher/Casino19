/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.blackjack;

import java.util.Observable;

/**
 *
 * @author Butzi
 */
public class Spiel extends Observable {

    private int geld = 10000;
    private double gesetztesGeld;
    private double versicherung;
    public boolean doubleGedrückt = false;
    public boolean doubleGehtnicht1 = false;
    public boolean doubleGehtnicht2 = false;

    public void setGeld(int geld) {
        this.geld = geld;
    }

    public void setGesetztesGeld(int gesetztesGeld) {
        this.gesetztesGeld = gesetztesGeld;
    }

    public int getGeld() {
        return geld;
    }

    public int getVersicherung() {
        return (int) versicherung;
    }

    public int getGesetztesGeld() {
        return (int) gesetztesGeld;
    }

    public boolean setzen(double ein) {
        gesetztesGeld = ein;
        if (gesetztesGeld <= geld && gesetztesGeld>=1) {
            geld = (int) (geld - gesetztesGeld);
            setChanged();
            notifyObservers();
            return false;
        } else {
            return true;
        }
    }

    public void verloren() {
        gesetztesGeld = 0;
        setChanged();
        notifyObservers();
    }

    public void dealerKartenZiehen(Hand hand, Deck d) {
        int i = 1;
        while (hand.getGesamt() <= 16) {
            d.dealen(hand, i);
            hand.drehKarte();
            System.out.println(hand.getGesamt());
        }
    }

    public void gewinnen() {
        gesetztesGeld = gesetztesGeld * 2;
        geld = (int) (geld + gesetztesGeld);
        gesetztesGeld = 0;
        setChanged();
        notifyObservers();
    }

    public void unentschieden() {
        geld = (int) (geld + gesetztesGeld);
        gesetztesGeld = 0;
        setChanged();
        notifyObservers();
    }

    public void black() {
        gesetztesGeld = gesetztesGeld * 3.5;
        geld = (int) (gesetztesGeld + geld);
        gesetztesGeld = 0;
        setChanged();
        notifyObservers();
    }

    public boolean versichernA(double ein) {
        boolean anz = true;

        versicherung = ein;
        if (versicherung <= gesetztesGeld / 2 && versicherung<geld && versicherung>=1) {
            geld = (int) (geld - versicherung);
            anz = true;
            setChanged();
            notifyObservers();
        } else {
            anz = false;
        }
        return anz;
    }

    public void versicherungAuszahl() {
        geld = (int) (geld + versicherung * 2);
        versicherung = 0;
        setChanged();
        notifyObservers();
    }

    public void doppeln(Hand l) {
        if (l.getGesamt() == 9 || l.getGesamt() == 10 || l.getGesamt() == 11) {
            if (gesetztesGeld * 2 <= geld) {
                geld = (int) (geld - gesetztesGeld);
                gesetztesGeld = gesetztesGeld * 2;
                doubleGedrückt = true;
                setChanged();
                notifyObservers();
            } else {
                doubleGehtnicht2 = true;
            }
        } else {
            doubleGehtnicht1 = true;
        }
    }
}
