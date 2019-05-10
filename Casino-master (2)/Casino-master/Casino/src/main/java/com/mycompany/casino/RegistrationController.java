/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.casino;

import java.io.IOException;
import java.net.URL;
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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author motim
 */
public class RegistrationController implements Initializable {
    private String usern;
    private String pass;

    @FXML
    private TextField usern_text;
    @FXML
    private PasswordField pass_text;
    private PasswordField passw_text;
    @FXML
    private Button submit_but;
    @FXML
    private TextField guthaben_field;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
      
    }    
    
    @FXML
    public void submit(ActionEvent e){
        if("".equals(usern_text.getText())&& "".equals(pass_text.getText())&& "".equals(passw_text.getText())){
            System.out.println("LOOL");
        }else{
        
       try{

           usern=usern_text.getText();
           
           pass = pass_text.getText();
           Datenbank db = new Datenbank();
           try{
               db.loadUsers();
           } catch (IOException ex){
               System.out.println("Database machine broke");
               return;
           }
           
           try{
               db.addUser(usern, pass, Integer.parseInt(guthaben_field.getText()));
           } catch (IOException ex){
               System.out.println("this name already exist");
               return;
           }
           FXMLLoader loader = new FXMLLoader();
           Stage s = (Stage) ((Node) (e.getSource())).getScene().getWindow();
           Parent root = loader.load(getClass().getResource("/fxml/Login.fxml"));
           s.setTitle("My New Stage Title");
           s.setScene(new Scene(root));
           s.show();
       } catch (IOException ex){
                Logger.getLogger(RegistrationController.class.getName()).log(Level.SEVERE, null, ex);
       }
        }
        
    }
    
}
