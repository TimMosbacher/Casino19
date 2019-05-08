package com.mycompany.casino;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Florian
 */
public class InformationController implements Initializable {

    @FXML
    private AnchorPane Window;
    @FXML
    private Label rules;
    @FXML
    private Label tite2;
    @FXML
    private Label HTP;
    @FXML
    private Label titel;
    @FXML
    private Label WindowTitel;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        String rule;
        rule = "- Die Teilnehmer kaufen Lose oder auch Teilnahmecoupons, \n"
                + "  die mit einer Anzahl von Zahlen bedruckt sind. \n" +
                "- Ein Conférencier zieht per Zufall aus einer Trommel \n"
                + "  Kugeln mit aufgedruckten Zahlen. \n" +
                "- Er ruft diese Zahlen aus, woraufhin die Teilnehmer sie auf ihren Spielkarten \n"
                + "  mit einem Farbstempel oder einem Stein markieren\n" +
                "  sofern sie die ausgerufenen Zahlen auf ihrem Teilnahmecoupon haben. \n" +
                "- Sobald der erste Teilnehmer auf seinem Los alle 5 Zahlen einer waagerechten \n"
                + "  oder senkrechten Reihe oder Diagonale markieren konnte, \n"
                + "  ruft er laut und vernehmlich „Bingo!“.\n" +
                "- Nach der Überprüfung seines Spielscheins ist er der Gewinner, \n"
                + "  erhält einen Sach- oder Geldpreis, und die Spielrunde ist abgeschlossen.";
        rules.setText(rule);
        
        String htp;
        htp = "- Wählen Sie ihre Anzahl Gegner\n" +
            "- Wählen Sie ein Tisch\n" +
            "- Drücken Sie auf Start\n" +
            "- Viel Glück !";
       HTP.setText(htp);
        
        
    }    
    
}
