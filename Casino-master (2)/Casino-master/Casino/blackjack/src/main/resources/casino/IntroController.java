/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casino;

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
    private Label konto;
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

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void pressStart(ActionEvent event) {
    }

    @FXML
    private void pressAnleitung(ActionEvent event) {
    }

    @FXML
    private void pressbeenden(ActionEvent event) {
    }
    
}
