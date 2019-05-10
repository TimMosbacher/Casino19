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
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Florian
 */
public class CasinoStarterController implements Initializable {

    @FXML
    private Button bingo;
    @FXML
    private Button blackjack;
    @FXML
    private Button slotMach;
    @FXML
    private Button roulette;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void bingo(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader loader =  new FXMLLoader(getClass().getResource("/fxml/Starter.fxml"));
        Parent root = (Parent) loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
         scene.getStylesheets().add("/styles/bingo.css");
        stage.setResizable(false);
        stage.show();
        Stage stage1 = (Stage) bingo.getScene().getWindow();
        // do what you have to do
        stage1.close();
    }

    @FXML
    private void blackjack(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader loader =  new FXMLLoader(getClass().getResource("/fxml/Intro.fxml"));
        Parent root = (Parent) loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
         scene.getStylesheets().add("/styles/bingo.css");
        stage.setResizable(false);
        stage.show();
        Stage stage1 = (Stage) blackjack.getScene().getWindow();
        // do what you have to do
        stage1.close();
    }

    @FXML
    private void slotMachine(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader loader =  new FXMLLoader(getClass().getResource("/fxml/SuperCherry.fxml"));
        Parent root = (Parent) loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
         
        stage.setResizable(false);
        stage.show();
        Stage stage1 = (Stage) slotMach.getScene().getWindow();
        // do what you have to do
        stage1.close();
    }

    @FXML
    private void roulette(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader loader =  new FXMLLoader(getClass().getResource("/fxml/Startseite.fxml"));
        Parent root = (Parent) loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
         scene.getStylesheets().add("/styles/Roulettstyle.css");
        stage.setResizable(false);
        stage.show();
        Stage stage1 = (Stage) roulette.getScene().getWindow();
        // do what you have to do
        stage1.close();
    }
    
}
