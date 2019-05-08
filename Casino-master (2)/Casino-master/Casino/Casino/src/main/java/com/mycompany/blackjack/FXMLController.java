package com.mycompany.blackjack;

import java.net.URL;
import java.util.Observable;
import java.util.Observer;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLController implements Initializable, Observer {
    
    private Label label;
    @FXML
    private Button verdoppeln;
    @FXML
    private TextField eingabeV;
    @FXML
    private Button versichern;
    @FXML
    private TextField EinsatzEingabe;
    @FXML
    private Button setzen;
    @FXML
    private Label jetanz;
    @FXML
    private Label einanz;
    @FXML
    private Button nocheine;
    @FXML
    private Label penis;
    @FXML
    private Label verloren;
    @FXML
    private Label error;
    @FXML
    private Label spast;
    @FXML
    private Button stand;
    @FXML
    private Button neuesSpiel;
    
    Deck d1 = new Deck();
    Hand spielerHand, dealer;
    Spiel gunter = new Spiel();
    @FXML
    private Label doubleError1;
    @FXML
    private Label doubleError2;
    @FXML
    private Label vErrorAnz;
    @FXML
    private Label vErrorGrund;
    @FXML
    private Label vAnz;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        gunter.addObserver(this);
        jetanz.setText("Anzahl Jettons: " + Integer.toString(gunter.getGeld()));
        
        nocheine.setDisable(true);
        stand.setDisable(true);
        verdoppeln.setDisable(true);
        versichern.setDisable(true);
        eingabeV.setDisable(true);
        neuesSpiel.setDisable(true);
        
        d1.auffüllen();        
        do {
            d1.mischen();
        } while (d1.karten.get(0).getWert() != 1 && d1.karten.get(1).getWert() != 1);      
    }
    
    @FXML
    private void setzenpress(ActionEvent event) {
        if (d1.karten.size() <= 4) {
            d1.auffüllen();
            d1.mischen();
        }
        try {
            double ein = Double.parseDouble(EinsatzEingabe.getText());
            if (gunter.setzen(ein) == true) {
                spast.setVisible(true);
            } else {
                spast.setVisible(false);
                //Hände erstellen
                spielerHand = new Hand();
                dealer = new Hand();

                //Spieler Hand füllen
                d1.dealen(spielerHand, 2);
                //Dealer Hand füllen
                d1.dealen(dealer, 2);
                //Zeig Spielers Hand
                spielerHand.drehKarten();
                
                penis.setText(spielerHand.zeigHand());

                //Dreh des Dealers erste Karte
                dealer.karten.get(0).drehKarte();
                verloren.setText(dealer.zeigHand());
                //Zeig Dealers Hand
                
                setzen.setDisable(true);
                EinsatzEingabe.setDisable(true);
                
                nocheine.setDisable(false);
                stand.setDisable(false);
                verdoppeln.setDisable(false);
                versichern.setDisable(false);
                eingabeV.setDisable(false);                
            }
            error.setVisible(false);
        } catch (Exception e) {
            error.setVisible(true);
        }
    }
    
    @FXML
    private void pressnocheine(ActionEvent event) {
        
        if (d1.karten.size() <= 1) {
            d1.auffüllen();
            d1.mischen();
            System.out.println("Penis!!!!!!!!!!!");
        }
        if (gunter.doubleGedrückt == true) {
            nocheine.setDisable(true);
            versichern.setDisable(true);
        }
        
        d1.dealen(spielerHand, 1);
        spielerHand.drehKarte();
        penis.setText(spielerHand.zeigHand());
        spielerHand.verloren();
        
        verdoppeln.setDisable(true);
        versichern.setDisable(true);
        eingabeV.setDisable(true);
        if (spielerHand.lost == true) {
            dealer.drehKarte();
            gunter.dealerKartenZiehen(dealer, d1);
            verloren.setText(dealer.zeigHand());
            if (dealer.getGesamt() >= 21) {
                gunter.unentschieden();
            } else {
                gunter.verloren();
            }
            
            nocheine.setDisable(true);
            stand.setDisable(true);
            
            setzen.setDisable(false);
            EinsatzEingabe.setDisable(false);
            neuesSpiel.setDisable(false);
        }
        doubleError1.setVisible(false);
        doubleError2.setVisible(false);
        gunter.doubleGedrückt = false;
        vErrorGrund.setVisible(false);
        vErrorAnz.setVisible(false);
    }
    
    @Override
    public void update(Observable o, Object arg) {
        Spiel gamer = (Spiel) o;
        jetanz.setText("Anzahl Jettons: " + Integer.toString(gamer.getGeld()));
        einanz.setText("Grösse Einsatz: " + Double.toString(gamer.getGesetztesGeld()));
        vAnz.setText("Grösse Versicherung: " + Double.toString(gamer.getVersicherung()));
    }
    
    @FXML
    private void standpress(ActionEvent event) {
        dealer.drehKarte();
        gunter.dealerKartenZiehen(dealer, d1);
        verloren.setText(dealer.zeigHand());
        spielerHand.spielErgebnis(spielerHand, dealer, gunter);
        System.out.println(spielerHand.getGesamt());

//        if (spielerHand.lost) {
//            gunter.verloren();
//            System.out.println("Du hast verloren!!");
//        }
        verdoppeln.setDisable(true);
        versichern.setDisable(true);
        eingabeV.setDisable(true);
        nocheine.setDisable(true);
        stand.setDisable(true);
        
        setzen.setDisable(false);
        EinsatzEingabe.setDisable(false);
        neuesSpiel.setDisable(false);
        doubleError1.setVisible(false);
        doubleError2.setVisible(false);
        vErrorGrund.setVisible(false);
        vErrorAnz.setVisible(false);
    }
    
    @FXML
    private void verdoppelnpress(ActionEvent event) {
        gunter.doppeln(spielerHand);
        verdoppeln.setDisable(true);
        
        if (gunter.doubleGehtnicht2 == true) {
            doubleError2.setVisible(true);
        } else if (gunter.doubleGehtnicht1 == true) {
            doubleError1.setVisible(true);
        }
    }

    @FXML
    private void versichernpress(ActionEvent event) {
        
        try {
            double ein = Double.parseDouble(eingabeV.getText());
            if (dealer.versichernGrund() == false) {
                vErrorGrund.setVisible(true);
                versichern.setDisable(true);
                eingabeV.setDisable(true);
            } else {
                if (gunter.versichernA(ein) == false) {
                    vErrorAnz.setVisible(true);
                } else {
                    vErrorAnz.setVisible(false);
                    versichern.setDisable(true);
                    eingabeV.setDisable(true);
                }
            }
            error.setVisible(false);
        } catch (Exception e) {
            error.setVisible(true);
        }
        doubleError1.setVisible(false);
        doubleError2.setVisible(false);
    }

    @FXML
    private void neuesSpielpress(ActionEvent event) {
        neuesSpiel.setDisable(true);
        d1.auffüllen();        
        d1.mischen();
        doubleError1.setVisible(false);
        doubleError2.setVisible(false);
    }
    
}
