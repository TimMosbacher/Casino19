/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.casino;

import java.util.Random;
import javafx.animation.Timeline;

/**
 *
 * @author motim
 */
public class Roll {
     private boolean gewonnen;
     private int guthabenint, pot;
     private Timeline timeline;
     

    public Roll(boolean gewonnen, int guthabenint, int pot) {
        this.gewonnen = gewonnen;
        this.guthabenint = guthabenint;
        this.pot = pot;
    }

    public boolean isGewonnen() {
        return gewonnen;
    }

    public void setGewonnen(boolean gewonnen) {
        this.gewonnen = gewonnen;
    }

    public int getGuthabenint() {
        return guthabenint;
    }

    public void setGuthabenint(int guthabenint) {
        this.guthabenint = guthabenint;
    }

    public int getPot() {
        return pot;
    }

    public void setPot(int pot) {
        this.pot = pot;
    }
     
    
    public void start(){
       
        
        if (gewonnen == false) {
            guthabenint -= 2;
          
            Random rand = new Random();
            int n1 = rand.nextInt(3);
            int n2 = rand.nextInt(3);
            int n3 = rand.nextInt(3);
            
          

//            if (SuperCherryController.lab_1.getText().equals(SuperCherryController.lab_2.getText()) && SuperCherryController.lab_2.getText().equals(SuperCherryController.lab_3.getText())) {
               
                gewonnen = true;
                pot += 4;
              

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
             
                pot = 0;
        
                
            }
    }
    
    
}

