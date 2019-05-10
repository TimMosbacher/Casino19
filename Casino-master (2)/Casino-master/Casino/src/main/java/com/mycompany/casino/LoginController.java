package com.mycompany.casino;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author motim
 */
public class LoginController implements Initializable {

    private int submitbut;
    Datenbank db;

    @FXML
    private TextField username_text;
    @FXML
    private TextField password_text;
    @FXML
    private Button submit;
    @FXML
    private Button register;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        db = new Datenbank();
      try{
          db.loadUsers();
      } catch (IOException e){
          // todo Nachricht anzeigen
      }



    }

    @FXML
    public void Submit(ActionEvent e){

       String user = username_text.getText();
       String password = password_text.getText();

       Optional<Benutzer> userResult = db.authenticate(user, password);
       if (userResult.isPresent())
       {
         
      
        try {
          
          FXMLLoader loader = new FXMLLoader();
          Parent root = loader.load(getClass().getResource("/fxml/CasinoStarter.fxml"));
          Node node = (Node) e.getSource();
          Stage s = (Stage) node.getScene().getWindow();
          s.setScene(new Scene (root));
    
        } catch (IOException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
           }
       
       else{
           System.out.println("User not found!");
       }

    }

    @FXML
    private void register(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader();
          Parent root;
        try {
            root = loader.load(getClass().getResource("/fxml/Registration.fxml"));
            Node node = (Node) event.getSource();
          Stage s = (Stage) node.getScene().getWindow();
          s.setScene(new Scene (root));
        } catch (IOException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
          
    }

    }







