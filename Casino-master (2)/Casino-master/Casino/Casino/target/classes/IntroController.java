/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Butzi
 */
public class IntroController implements Initializable {

    @FXML
    private Button Spielstart;
    @FXML
    private Button anleitung;
    @FXML
    private Button beenden;
    @FXML
    private Label spielAnleitung;
    @FXML
    private Label spielAnleitung2;
    @FXML
    private Label konto;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        konto.setText("Anzahl Jettons: "+"");
    }    

    @FXML
    private void pressStart(ActionEvent event) {
        
    }

    @FXML
    private void pressAnleitung(ActionEvent event) {
        
        spielAnleitung.setVisible(!spielAnleitung.visibleProperty().get());
        spielAnleitung2.setVisible(!spielAnleitung2.visibleProperty().get());
        
    }

    @FXML
    private void pressbeenden(ActionEvent event) {
    }
    
}
