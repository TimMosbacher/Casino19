package com.mycompany.casino;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author motim
 */
public class SuperCherryController implements Initializable {

    public int stop = 0;
    public boolean gewonnen = false;
    public int guthabenint = 10000;
    public int pot = 0;
    public Timeline timeline = new Timeline();
    public Timeline timelinegamble = new Timeline();
    private  boolean gamblewin = false;
    private int mal2;
    private int betint= 1;
    @FXML
    private  Label lab_1;
    @FXML
    private  Label lab_2;
    @FXML
    private  Label lab_3;
    @FXML
    private Label gewin_lab;
    @FXML
    private Button roll;
    @FXML
    private Button mystery;
    @FXML
    private Button bet;
    @FXML
    private Button gamble;
    @FXML
    private Label licht5x;
    @FXML
    private Label lcht2x;
    @FXML
    private Label licht3x;
    @FXML
    private Label lichtbonus;
    @FXML
    private Label lab_31;
    @FXML
    public  Label guthaben;
    @FXML
    private  Label potlab;
    @FXML
    private Pane BetPane;
    @FXML
    private Label BetLab;
    @FXML
    private Pane GamblePane0;
    @FXML
    private Label gambleLab0;
    @FXML
    private Pane gamble2xpane;
    @FXML
    private Label gamble2xlab;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        guthaben.setText(Integer.toString(guthabenint));
        potlab.setText(Integer.toString(pot));
        gewin_lab.setText("");
        BetLab.setText("");
        GamblePane0.setVisible(false);
        gamble2xpane.setVisible(false);
      
        lichtbonus.setStyle("-fx-background-color: white;");
        licht3x.setStyle("-fx-background-color: white;");
        licht5x.setStyle("-fx-background-color: white;");
        lcht2x.setStyle("-fx-background-color: white;");
       
             BetLab.setText(Integer.toString(betint));
   
        // TODO
    }
    
 



    @FXML
    private void rolling (ActionEvent event) {
        gewonnen = false;
       if(guthabenint - betint >= 0){
      
        if (gewonnen == false) {
       
               lichtbonus.setStyle("-fx-background-color: white;");
                                licht3x.setStyle("-fx-background-color: white;");
                                lcht2x.setStyle("-fx-background-color: white;");
                                licht5x.setStyle("-fx-background-color: white;");
            guthabenint -= betint;
           
           guthaben.setText("");
           guthaben.setText(Integer.toString(guthabenint));
            Random rand = new Random();
            int n1 = rand.nextInt(3);
            int n2 = rand.nextInt(3);
            int n3 = rand.nextInt(3);
            
            lab_1.setText("");
            lab_1.setText(Integer.toString(n1));

            lab_2.setText("");
            lab_2.setText(Integer.toString(n2));

            lab_3.setText("");
            lab_3.setText(Integer.toString(n3));

            if (lab_1.getText().equals(lab_2.getText()) && lab_2.getText().equals(lab_3.getText())) {
               
                gewonnen = true;
         
               potlab.setText(Integer.toString(pot));
                guthaben.setText("");
                guthaben.setText(Integer.toString(guthabenint));
               pot = betint *2;

            } else {
                         
                gewonnen = false;
                if (timeline != null){
                this.timeline.stop();
                }
                this.timeline = null;
                System.out.println(guthabenint);
                System.out.println(pot);
                System.out.println(guthabenint + pot);
                guthabenint += pot;
                guthaben.setText("");
                guthaben.setText(Integer.toString(guthabenint));
                pot = 0;
        
                
            }
             ueberpruefen();
    }
    
    

       } 
           

      
    }

    private void ueberpruefen() {
       
        
        lichtmystery();
         gambleanim();
        
    }

    private void lichtmystery() {

        if (gewonnen == true) {
            
            lichtbonus.setStyle("-fx-background-color: white;");
            timeline = new Timeline(
                    new KeyFrame(
                            Duration.millis(20), new EventHandler<ActionEvent>() {
                        int step = 0;

                        @Override
                        public void handle(ActionEvent event) {
                            potlab.setText(Integer.toString(pot));
                            if (step % 6 == 0) {
                                lichtbonus.setStyle("-fx-background-color: blue;");
                                licht3x.setStyle("-fx-background-color: white;");
                                lcht2x.setStyle("-fx-background-color: white;");
                                licht5x.setStyle("-fx-background-color: white;");
                            } else if (step % 5 == 0) {
                                lichtbonus.setStyle("-fx-background-color: white;");
                                licht3x.setStyle("-fx-background-color: white;");
                                lcht2x.setStyle("-fx-background-color: white;");
                                licht5x.setStyle("-fx-background-color: blue;");

                            }
                             else if (step % 4 == 0) {
                                lichtbonus.setStyle("-fx-background-color: blue;");
                                licht3x.setStyle("-fx-background-color: white;");
                                lcht2x.setStyle("-fx-background-color: white;");
                                licht5x.setStyle("-fx-background-color: white;");
                            } 
                            else if (step % 3 == 0) {
                                lichtbonus.setStyle("-fx-background-color: white;");
                                lcht2x.setStyle("-fx-background-color: white;");
                                licht5x.setStyle("-fx-background-color: white;");
                                licht3x.setStyle("-fx-background-color: blue;");
                            } 
                             else if (step % 2 == 0) {
                                lichtbonus.setStyle("-fx-background-color: blue;");
                                licht3x.setStyle("-fx-background-color: white;");
                                lcht2x.setStyle("-fx-background-color: white;");
                                licht5x.setStyle("-fx-background-color: white;");
                            } 
                            else {
                                lichtbonus.setStyle("-fx-background-color: white;");
                                licht3x.setStyle("-fx-background-color: white;");
                                licht5x.setStyle("-fx-background-color: white;");
                                lcht2x.setStyle("-fx-background-color: blue;");
                            }

                            step++;
                        }
                    })
            );
            timeline.setCycleCount(Animation.INDEFINITE);
            timeline.play();

        } else if (timeline != null) {
            this.timeline.stop();
            this.timeline = null;
        }

    }
    
    private void gambleanim(){
        if(gewonnen == true){
            mal2 = pot*2; 
            gamble2xlab.setText(Integer.toString(mal2));
           
            timelinegamble = new Timeline(
                    new KeyFrame(
                            Duration.millis(2000), new EventHandler<ActionEvent>() {
                        int step = 0;

                        @Override
                        public void handle(ActionEvent event) {
                            potlab.setText(Integer.toString(pot));
                     
                              if (step % 2 == 0) {
                                gamble2xpane.setVisible(true);
                                GamblePane0.setVisible(false);
                                gamblewin = true;
                            } 
                            else {
                            GamblePane0.setVisible(true);
                             gamble2xpane.setVisible(false);
                             gamblewin = false;
                            }

                            step++;
                        }
                    })
            );
            timelinegamble.setCycleCount(Animation.INDEFINITE);
            timelinegamble.play();

        } else if (timelinegamble != null) {
            this.timelinegamble.stop();
            this.timelinegamble = null;
        }
            
        
    
    
}
    
    
    

    @FXML
    private void mystery(ActionEvent e) {
       
        if (gewonnen == true) {
           
           
                
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(SuperCherryController.class.getName()).log(Level.SEVERE, null, ex);
                }
               

                if ("-fx-background-color: blue;".equals(licht3x.getStyle())) {
                    pot *= 3;

                }

                if ("-fx-background-color: blue;".equals(licht5x.getStyle())) {
                    pot *= 5;

                }

                if ("-fx-background-color: blue;".equals(lcht2x.getStyle())) {
                    pot *= 2;

                }

                if ("-fx-background-color: blue;".equals(lichtbonus.getStyle())) {
                    pot = 1;
                    potlab.setText("");
                    potlab.setText(Integer.toString(pot));
                    gewin_lab.setText("");
                    gewonnen = false;
                    lichtmystery();

                }

             
            }

    }

    @FXML
    private void gamblepress(ActionEvent event) {
        if(gewonnen == true){
         
             try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(SuperCherryController.class.getName()).log(Level.SEVERE, null, ex);
                }
                if(gamblewin == true){
                  
                    int restgewin = pot%betint;
                    System.out.println(restgewin + " Restgewinn");
                    pot /= betint;
                    pot += mal2;
                     mal2 = pot*2;
                    gambleanim();
                    
                }else{
                    pot = 0;
                    gewonnen = false;
                      this.timelinegamble.stop();
                         lichtmystery();
                }
             
            
        }
        
        
    }
    
    @FXML
    private void betpress(ActionEvent event){
         
         if(betint <5){
             betint++;
             BetLab.setText(Integer.toString(betint));
             
         }else{
             betint = 1;
              BetLab.setText(Integer.toString(betint));
         }
        
    }
    
}
