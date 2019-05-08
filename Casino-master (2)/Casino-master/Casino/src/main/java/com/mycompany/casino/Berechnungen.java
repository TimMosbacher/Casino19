/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.casino;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author natalie1703
 */
public class Berechnungen {

    private HashMap<String, Integer> gelegt = new HashMap<>();

    public void addGelegt(ArrayList<String> b, int a, int c) {
        for (int i = 0; i < b.size(); i++) {
            if (gelegt.containsKey(b.get(i))) {
                int h = gelegt.get(b.get(i));
                switch (c) {
                    case 1:

                        h += a * 36;
                        
                        break;
                    case 2:

                        h += a * 18;
                        
                        break;
                    case 3:
                        h += a * 12;
                       
                        break;
                    case 4:
                        h += a * 9;
                        
                        break;
                    case 5:
                        h += a * 7;
                        
                        break;
                    case 6:
                        h += a * 3;
                        
                        break;
                    case 7:
                       h += a * 2;
                                              
                       break;
                    default:
                        throw new AssertionError();
                }

                gelegt.remove(b.get(i));
                gelegt.put(b.get(i), h);

            } else {
                int h = 0;
                switch (c) {

                    case 1:

                        h += a * 36;
                        
                        break;
                    case 2:

                        h += a * 18;
                        
                        break;
                    case 3:
                        h += a * 12;
                                              
                        break;
                    case 4:
                         h += a * 9;
                        
                        break;
                    case 5:
                        h += a * 7;
                        
                        break;
                    case 6:
                        h += a * 3;
                        
                        break;
                    case 7:
                        h += a * 2;
                       
                        break;
                    default:
                        throw new AssertionError();
                }
                gelegt.put(b.get(i), h);
            }
        }

    }
    
    public int winNumber(String i){
        int d = 0;
        if(gelegt.get(i) == null){
            
        }else {
             d += gelegt.get(i);
        }
       
        return d;
    }

    public void removeGelegt() {
        gelegt.clear();
    }
}
