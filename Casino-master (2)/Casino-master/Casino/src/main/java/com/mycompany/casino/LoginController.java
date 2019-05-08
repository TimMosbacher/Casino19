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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

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
           System.out.println("Login successful, id=" + userResult.get().getId());
       }
       else{
           System.out.println("User not found!");
       }



    }






}
