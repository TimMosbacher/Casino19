/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.casino;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Florian
 */
public class CheckBingo {
     Random rand = new Random();
    final ArrayList<Integer> numbers = new ArrayList<>();
    Integer[][] karte = new Integer[5][5];
    private ArrayList<Integer> rightNumbers;
    private ArrayList<Integer> BingoNumbers;
    int[][] position = new int[5][5];
    private ArrayList<Integer> Ykor;
    private ArrayList<Integer> Xkor;
    boolean bingo = false;
    Integer[] bingozahlen = bingozahlen = new Integer[25];

    public void erstellungKarte(Integer[][] test) {
        karte = test;
        for (int i = 0; i < this.bingozahlen.length; i++) {
            bingozahlen[i] = 0;
        }
    }

    public void ueberpruefungNumAKor(String test) {
        int zahlZufall = Integer.parseInt(test);
        Integer[] compareArray = new Integer[1];
        if (karte[0][0] == zahlZufall) {
            bingozahlen[0] = zahlZufall;
        }
        if (karte[0][1] == zahlZufall) {
            bingozahlen[1] = zahlZufall;
        }
        if (karte[0][2] == zahlZufall) {
            bingozahlen[2] = zahlZufall;
        }
        if (karte[0][3] == zahlZufall) {
            bingozahlen[3] = zahlZufall;
        }
        if (karte[0][4] == zahlZufall) {
            bingozahlen[4] = zahlZufall;
        }
        if (karte[1][0] == zahlZufall) {
            bingozahlen[5] = zahlZufall;
        }
        if (karte[1][1] == zahlZufall) {
            bingozahlen[6] = zahlZufall;
        }
        if (karte[1][2] == zahlZufall) {
            bingozahlen[7] = zahlZufall;
        }
        if (karte[1][3] == zahlZufall) {
            bingozahlen[8] = zahlZufall;
        }
        if (karte[1][4] == zahlZufall) {
            bingozahlen[9] = zahlZufall;
        }
        if (karte[2][0] == zahlZufall) {
            bingozahlen[10] = zahlZufall;
        }
        if (karte[2][1] == zahlZufall) {
            bingozahlen[11] = zahlZufall;
        }
        if (karte[2][2] == zahlZufall) {
            bingozahlen[12] = zahlZufall;
        }
        if (karte[2][3] == zahlZufall) {
            bingozahlen[13] = zahlZufall;
        }
        if (karte[2][4] == zahlZufall) {
            bingozahlen[14] = zahlZufall;
        }
        if (karte[3][0] == zahlZufall) {
            bingozahlen[15] = zahlZufall;
        }
        if (karte[3][1] == zahlZufall) {
            bingozahlen[16] = zahlZufall;
        }
        if (karte[3][2] == zahlZufall) {
            bingozahlen[17] = zahlZufall;
        }
        if (karte[3][3] == zahlZufall) {
            bingozahlen[18] = zahlZufall;
        }
        if (karte[3][4] == zahlZufall) {
            bingozahlen[19] = zahlZufall;
        }
        if (karte[4][0] == zahlZufall) {
            bingozahlen[20] = zahlZufall;
        }
        if (karte[4][1] == zahlZufall) {
            bingozahlen[21] = zahlZufall;
        }
        if (karte[4][2] == zahlZufall) {
            bingozahlen[22] = zahlZufall;
        }
        if (karte[4][3] == zahlZufall) {
            bingozahlen[23] = zahlZufall;
        }
        if (karte[4][4] == zahlZufall) {
            bingozahlen[24] = zahlZufall;
        }

    }

    public boolean ueberpruefungKor() {

        if (bingozahlen[0] != 0 && bingozahlen[1] != 0 && bingozahlen[2] != 0 && bingozahlen[3] != 0 && bingozahlen[4] != 0) {
            return bingo = true;
        } else if (bingozahlen[5] != 0 && bingozahlen[6] != 0 && bingozahlen[7] != 0 && bingozahlen[8] != 0 && bingozahlen[9] != 0) {
            return bingo = true;
        } else if (bingozahlen[10] != 0 && bingozahlen[11] != 0 && bingozahlen[12] != 0 && bingozahlen[13] != 0 && bingozahlen[14] != 0) {
            return bingo = true;
        } else if (bingozahlen[15] != 0 && bingozahlen[16] != 0 && bingozahlen[17] != 0 && bingozahlen[18] != 0 && bingozahlen[19] != 0) {
            return bingo = true;
        } else if (bingozahlen[20] != 0 && bingozahlen[21] != 0 && bingozahlen[22] != 0 && bingozahlen[23] != 0 && bingozahlen[24] != 0) {
           return bingo = true;
        } else if (bingozahlen[0] != 0 && bingozahlen[5] != 0 && bingozahlen[10] != 0 && bingozahlen[15] != 0 && bingozahlen[20] != 0) {
            return bingo = true;
        } else if (bingozahlen[1] != 0 && bingozahlen[6] != 0 && bingozahlen[11] != 0 && bingozahlen[16] != 0 && bingozahlen[21] != 0) {
            return bingo = true;
        } else if (bingozahlen[2] != 0 && bingozahlen[7] != 0 && bingozahlen[12] != 0 && bingozahlen[17] != 0 && bingozahlen[22] != 0) {
            return bingo = true;
        } else if (bingozahlen[3] != 0 && bingozahlen[8] != 0 && bingozahlen[13] != 0 && bingozahlen[18] != 0 && bingozahlen[23] != 0) {
            return bingo = true;
        } else if (bingozahlen[4] != 0 && bingozahlen[9] != 0 && bingozahlen[14] != 0 && bingozahlen[19] != 0 && bingozahlen[24] != 0) {
            return bingo = true;
        } else if (bingozahlen[1] != 0 && bingozahlen[6] != 0 && bingozahlen[12] != 0 && bingozahlen[18] != 0 && bingozahlen[24] != 0) {
            return bingo = true;
        } else if (bingozahlen[20] != 0 && bingozahlen[16] != 0 && bingozahlen[12] != 0 && bingozahlen[8] != 0 && bingozahlen[4] != 0) {
            return bingo = true;
        } else {
            return bingo = false;
        }

    }

    public boolean BingTrue() {
        bingo = true;
        return bingo;
    }
}
