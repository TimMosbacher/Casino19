/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.casino;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author natalie1703
 */
public class AnleitungController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handlebuttonÜbersichtsseite(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        Stage s = (Stage) ((Node) (event.getSource())).getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/Startseite.fxml"));
        s.setTitle("My New Stage Title");
        s.setScene(new Scene(root));
        s.show();

    }
    
}
