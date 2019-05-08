/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

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
         konto.setText("Kontostand: "+"");
    }    
   
    @FXML
    private void pressStart(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        Parent root = loader.load(getClass().getResource("/fxml/Scene.fxml"));
        Node node = (Node) event.getSource();
        Stage s = (Stage) node.getScene().getWindow();
        s.setScene(new Scene(root));
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
