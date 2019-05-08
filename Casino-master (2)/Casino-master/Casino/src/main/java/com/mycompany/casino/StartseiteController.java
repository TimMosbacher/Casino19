/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.casino;

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
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author natalie1703
 */
public class StartseiteController implements Initializable {

    @FXML
    private Button zurückStartseite;
    @FXML
    private Button ButtonAnleitung;
    @FXML
    private Button ButtonStart;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handlebuttonAnleitung(MouseEvent event) {
    }

    @FXML
    private void handlebuttonzurueck(ActionEvent event) {
    }

    @FXML
    private void handlebuttonAntleitung(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        Stage s = (Stage) ((Node) (event.getSource())).getScene().getWindow();
        Parent root = loader.load(getClass().getResource("/fxml/Anleitung.fxml"));
        s.setTitle("My New Stage Title");
        s.setScene(new Scene(root));
        s.show();

    }

    @FXML
    private void handlebuttonStart(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        Stage s = (Stage) ((Node) (event.getSource())).getScene().getWindow();
        Parent root = loader.load(getClass().getResource("/fxml/Roulette.fxml"));
        s.setTitle("My New Stage Title");
        s.setScene(new Scene(root));
        s.show();

    }
    
}
