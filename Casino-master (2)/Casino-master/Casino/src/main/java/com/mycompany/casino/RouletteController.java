/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.casino;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author natalie1703
 */
public class RouletteController implements Initializable {

    @FXML
    private Button button19;
    @FXML
    private Button button25;
    @FXML
    private Button button34;
    @FXML
    private Button button9;
    @FXML
    private Button button3;
    @FXML
    private Button button1;
    @FXML
    private Button button7;
    @FXML
    private Button button16;
    @FXML
    private Button button18;
    @FXML
    private Button button14;
    @FXML
    private Button button12;
    @FXML
    private Button button21;
    @FXML
    private Button button23;
    @FXML
    private Button button27;
    @FXML
    private Button button30;
    @FXML
    private Button button36;
    @FXML
    private Button button32;
    @FXML
    private Button button2;
    @FXML
    private Button button6;
    @FXML
    private Button button10;
    @FXML
    private Button button4;
    @FXML
    private Button button8;
    @FXML
    private Button button11;
    @FXML
    private Button button15;
    @FXML
    private Button button31;
    @FXML
    private Button button22;
    @FXML
    private Button button28;
    @FXML
    private Button button29;
    @FXML
    private Button button26;
    @FXML
    private Button button33;
    @FXML
    private Button button24;
    @FXML
    private Button button20;
    @FXML
    private Button button17;
    @FXML
    private Button button13;
    @FXML
    private Button button35;
    @FXML
    private Button button5;
    @FXML
    private Button button1to18;
    @FXML
    private Button buttoneven;
    @FXML
    private Button buttonred;
    @FXML
    private Button buttonblack;
    @FXML
    private Button buttonodd;
    @FXML
    private Button button19to36;
    @FXML
    private Button button1st12;
    @FXML
    private Button button2nd12;
    @FXML
    private Button button3rd12;
    @FXML
    private Button button00;
    @FXML
    private Button button0;
    @FXML
    private Pane pane1;
    @FXML
    private Pane pane2;
    @FXML
    private Pane pane3;
    @FXML
    private Pane pane4;
    @FXML
    private Pane pane6;
    @FXML
    private Pane pane9;
    @FXML
    private Pane pane17;
    @FXML
    private Pane pane13;
    @FXML
    private Pane pane14;
    @FXML
    private Pane pane16;
    @FXML
    private Pane pane10;
    @FXML
    private ImageView jeton5;
    @FXML
    private ImageView jeton10;
    @FXML
    private ImageView jeton50;
    @FXML
    private ImageView jeton100;

    ArrayList<Integer> feld = new ArrayList<>();
    ArrayList<Integer> jetton = new ArrayList<>();
    ArrayList<Integer> pane = new ArrayList<>();
    ArrayList<Integer> jetton2 = new ArrayList<>();
    @FXML
    private ListView<String> listview1;
    private final ArrayList<String> listlistview = new ArrayList<>();

    @FXML
    private Button buttonrueckgaenig;
    @FXML
    private Pane pane2124;
    @FXML
    private Pane pane2730;
    @FXML
    private Pane pane3033;
    @FXML
    private Pane pane3336;
    @FXML
    private Pane pane1245;
    @FXML
    private Pane pane2536;
    @FXML
    private Pane pane5689;
    @FXML
    private Pane pane4578;
    @FXML
    private Pane pane781011;
    @FXML
    private Pane pane891112;
    @FXML
    private Pane pane10111314;
    @FXML
    private Pane pane11141215;
    @FXML
    private Pane pane13141617;
    @FXML
    private Pane pane14151718;
    @FXML
    private Pane pane16171920;
    @FXML
    private Pane pane17182021;
    @FXML
    private Pane pane19202223;
    @FXML
    private Pane pane23242627;
    @FXML
    private Pane pane1316;
    @FXML
    private Pane pane1629;
    @FXML
    private Pane pane20212324;
    @FXML
    private Pane pane22232526;
    @FXML
    private Pane pane25262829;
    @FXML
    private Pane panel26272930;
    @FXML
    private Pane panel28293132;
    @FXML
    private Pane panel29303233;
    @FXML
    private Pane panel31323435;
    @FXML
    private Pane pane32333536;
    @FXML
    private Button button2to12;
    @FXML
    private Button button2to13;
    @FXML
    private Button button2to11;
    @FXML
    private ImageView imageviewgif;
    @FXML
    private Button buttongif;

    private boolean spinning = false;

    HashMap<Integer, ArrayList<String>> gelegt = new HashMap();
    HashMap<Integer, Integer> gelegtint = new HashMap();
    int hashcounter = 1;
    @FXML
    private Pane pane2831;
    @FXML
    private Pane pane3134;
    @FXML
    private Pane pane31323435;
    @FXML
    private Pane pane32353336;
    @FXML
    private Label ausgegebeneZahl;

    String[] number = new String[38];
    private int gesamtgelegt = 0;
    private int verloren = 0;
    private int gewonnen = 0;

    Berechnungen be = new Berechnungen();
    @FXML
    private Label GewinnVerlust;
    @FXML
    private Button abbrechen;
    @FXML
    private Button buttonNeuspielen;
    private void gewinnverlusst(){
        
                    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        setImage();

        for (int i = 0; i < 38; i++) {
            number[i] = "" + i;
        }
        number[37] = "00";
    }

    @FXML
    private void handlebutton19(ActionEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            feld.add(19);
            addListview(1);
        }
    }

    @FXML
    private void handlebutton25(ActionEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            feld.add(25);
            addListview(1);
        }
    }

    @FXML
    private void handlebutton34(ActionEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            feld.add(34);
            addListview(1);
        }
    }

    @FXML
    private void handlebutton9(ActionEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            feld.add(9);
            addListview(1);
        }
    }

    @FXML
    private void handlebutton3(ActionEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            feld.add(3);
            addListview(1);
        }
    }

    @FXML
    private void handlebutton1(ActionEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            feld.add(1);
            addListview(1);
        }
    }

    @FXML
    private void handlebutton7(ActionEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            feld.add(7);
            addListview(1);
        }
    }

    @FXML
    private void handlebutton16(ActionEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            feld.add(16);
            addListview(1);
        }
    }

    @FXML
    private void handlebutton18(ActionEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            feld.add(18);
            addListview(1);
        }
    }

    @FXML
    private void handlebutton14(ActionEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            feld.add(14);
            addListview(1);
        }
    }

    @FXML
    private void handlebutton12(ActionEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            feld.add(12);
            addListview(1);
        }
    }

    @FXML
    private void handlebutton21(ActionEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            feld.add(21);
            addListview(1);
        }
    }

    @FXML
    private void handlebutton23(ActionEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            feld.add(23);
            addListview(1);
        }
    }

    @FXML
    private void handlebutton27(ActionEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            feld.add(27);
            addListview(1);
        }
    }

    @FXML
    private void handlebutton30(ActionEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            feld.add(30);
            addListview(1);
        }
    }

    @FXML
    private void handlebutton36(ActionEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            feld.add(36);
            addListview(1);
        }
    }

    @FXML
    private void handlebutton32(ActionEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            feld.add(32);
            addListview(1);
        }
    }

    @FXML
    private void handlebutton2(ActionEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            feld.add(2);
            addListview(1);
        }
    }

    @FXML
    private void handlebutton6(ActionEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            feld.add(6);
            addListview(1);
        }
    }

    @FXML
    private void handlebutton10(ActionEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            feld.add(10);
            addListview(1);
        }
    }

    @FXML
    private void handlebutton4(ActionEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            feld.add(4);
            addListview(1);
        }
    }

    @FXML
    private void handlebutton8(ActionEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            feld.add(8);
            addListview(1);
        }
    }

    @FXML
    private void handlebutton11(ActionEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            feld.add(11);
            addListview(1);
        }
    }

    @FXML
    private void handlebutton15(ActionEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            feld.add(15);
            addListview(1);
        }
    }

    @FXML
    private void handlebutton31(ActionEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            feld.add(31);
            addListview(1);
        }
    }

    @FXML
    private void handlebutton22(ActionEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            feld.add(22);
            addListview(1);
        }
    }

    @FXML
    private void handlebutton28(ActionEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            feld.add(28);
            addListview(1);
        }
    }

    @FXML
    private void handlebutton29(ActionEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            feld.add(29);
            addListview(1);
        }
    }

    @FXML
    private void handlebutton26(ActionEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            feld.add(26);
            addListview(1);
        }
    }

    @FXML
    private void handlebutton33(ActionEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            feld.add(33);
            addListview(1);
        }
    }

    @FXML
    private void handlebutton24(ActionEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            feld.add(24);
            addListview(1);
        }
    }

    @FXML
    private void handlebutton20(ActionEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            feld.add(20);
            addListview(1);
        }
    }

    @FXML
    private void handlebutton17(ActionEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            feld.add(17);
            addListview(1);

        }
    }

    @FXML
    private void handlebutton13(ActionEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            feld.add(13);
            addListview(1);
        }
    }

    @FXML
    private void handlebutton35(ActionEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            feld.add(35);
            addListview(1);
        }
    }

    @FXML
    private void handlebutton5(ActionEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            feld.add(5);
            addListview(1);
        }
    }

    @FXML
    private void handleChip5(MouseEvent event) {
        if (spinning) {

        } else {
            if (jetton.size() == feld.size()) {
                jetton.add(5);
            } else {
                jetton.remove(jetton.size() - 1);
                jetton.add(5);
            }
        }

    }

    @FXML
    private void handleChip10(MouseEvent event) {
        if (spinning) {

        } else {
            if (jetton.size() == feld.size()) {
                jetton.add(10);
            } else {
                jetton.remove(jetton.size() - 1);
                jetton.add(10);
            }

        }

    }

    @FXML
    private void handleChip50(MouseEvent event) {
        if (spinning) {
        } else {
            if (jetton.size() == feld.size()) {
                jetton.add(50);
            } else {
                jetton.remove(jetton.size() - 1);
                jetton.add(50);
            }
        }

    }

    @FXML
    private void handleChip100(MouseEvent event) {
        if (spinning) {
        } else {
            if (jetton.size() == feld.size()) {
                jetton.add(100);
            } else {
                jetton.remove(jetton.size() - 1);
                jetton.add(100);
            }
        }
    }

    @FXML
    private void buttonrueckgaenig(ActionEvent event) {
        listlistview.remove(listlistview.size() - 1);

        listview1.getItems().clear();
        listview1.getItems().addAll(listlistview);
    }

    @FXML
    private void handel01(MouseEvent event) {
        if (jetton.size() == feld.size()) {

        } else {

            addListview(5);
        }
    }

    private void addListview(int zahlen) {

        ArrayList<String> Felder = new ArrayList<>();
        ArrayList<String> adding = new ArrayList<>();
        gesamtgelegt += jetton.get(jetton.size() - 1);
        switch (zahlen) {
            case 1:

                listlistview.add("Feld " + feld.get(feld.size() - 1) + " mit Wert " + jetton.get(jetton.size() - 1));
                Felder.add("" + feld.get(feld.size() - 1));

                adding.add("" + feld.get(feld.size() - 1));

                gelegt.put(hashcounter, adding);

                gelegtint.put(hashcounter, jetton.get(jetton.size() - 1));
                be.addGelegt(adding, jetton.get(jetton.size() - 1), 1);
                hashcounter++;
                break;
            case 2:

                jetton2.add(jetton.get(jetton.size() - 1));
                jetton.remove(jetton.size() - 1);
                listlistview.add("Feld 1  " + pane.get(pane.size() - 1) + ", Feld 2 " + pane.get(pane.size() - 2) + " mit Wert " + jetton2.get(jetton2.size() - 1));
                Felder.add("" + pane.get(pane.size() - 1));
                Felder.add("" + pane.get(pane.size() - 2));

                adding.add("" + pane.get(pane.size() - 1));
                adding.add("" + +pane.get(pane.size() - 2));
                gelegt.put(hashcounter, adding);

                gelegtint.put(hashcounter, jetton2.get(jetton2.size() - 1));
                be.addGelegt(adding, jetton2.get(jetton2.size() - 1), 2);
                hashcounter++;

                break;
            case 3:

                jetton2.add(jetton.get(jetton.size() - 1));
                jetton.remove(jetton.size() - 1);
                listlistview.add("Feld 1" + pane.get(pane.size() - 1) + " , Feld 2" + pane.get(pane.size() - 2) + ", Feld 3 " + pane.get(pane.size() - 3) + "mit Wert " + jetton2.get(jetton2.size() - 1));
                adding.add("" + pane.get(pane.size() - 1));
                adding.add("" + pane.get(pane.size() - 2));
                adding.add("" + pane.get(pane.size() - 3));
                gelegt.put(hashcounter, adding);

                gelegtint.put(hashcounter, jetton2.get(jetton2.size() - 1));
                be.addGelegt(adding, jetton2.get(jetton2.size() - 1), 3);
                hashcounter++;

                break;
            case 4:

                jetton2.add(jetton.get(jetton.size() - 1));
                jetton.remove(jetton.size() - 1);
                listlistview.add("Feld 1" + pane.get(pane.size() - 1) + " , Feld 2" + pane.get(pane.size() - 2) + ", Feld 3" + pane.get(pane.size() - 3) + ", Feld 4 " + pane.get(pane.size() - 4) + "mit Wert " + jetton2.get(jetton2.size() - 1));
                adding.add("" + pane.get(pane.size() - 1));
                adding.add("" + +pane.get(pane.size() - 2));
                adding.add("" + pane.get(pane.size() - 3));
                adding.add("" + pane.get(pane.size() - 4));
                gelegt.put(hashcounter, adding);

                gelegtint.put(hashcounter, jetton2.get(jetton2.size() - 1));
                be.addGelegt(adding, jetton2.get(jetton2.size() - 1), 4);
                hashcounter++;

                break;
            case 5:

                jetton2.add(jetton.get(jetton.size() - 1));
                jetton.remove(jetton.size() - 1);
                listlistview.add("Felder: 0, 00, 1, 2, 3 " + "mit wert " + jetton2.get(jetton2.size() - 1));
                adding.add("" + pane.get(pane.size() - 1));
                adding.add("" + pane.get(pane.size() - 2));
                adding.add("" + pane.get(pane.size() - 3));
                adding.add("" + pane.get(pane.size() - 4));
                adding.add("" + pane.get(pane.size() - 5));

                gelegt.put(hashcounter, adding);

                gelegtint.put(hashcounter, jetton2.get(jetton2.size() - 1));
                be.addGelegt(adding, jetton2.get(jetton2.size() - 1), 5);
                hashcounter++;

                break;

            case 6:

                jetton2.add(jetton.get(jetton.size() - 1));
                jetton.remove(jetton.size() - 1);
                listlistview.add("Reihe 1 " + "mit Wert " + jetton2.get(jetton2.size() - 1));
                for (int i = 1; i < 34; i += 3) {
                    adding.add("" + i);
                }
                gelegt.put(hashcounter, adding);

                gelegtint.put(hashcounter, jetton2.get(jetton2.size() - 1));
                be.addGelegt(adding, jetton2.get(jetton2.size() - 1), 6);
                hashcounter++;
                break;

            case 7:

                jetton2.add(jetton.get(jetton.size() - 1));
                jetton.remove(jetton.size() - 1);
                listlistview.add("Reihe 2 " + "mit Wert " + jetton2.get(jetton2.size() - 1));
                for (int i = 2; i < 35; i += 3) {
                    adding.add("" + i);
                }
                gelegt.put(hashcounter, adding);

                gelegtint.put(hashcounter, jetton2.get(jetton2.size() - 1));
                be.addGelegt(adding, jetton2.get(jetton2.size() - 1), 6);
                hashcounter++;
                break;
            case 8:

                jetton2.add(jetton.get(jetton.size() - 1));
                jetton.remove(jetton.size() - 1);
                listlistview.add("Reihe 3 " + "mit Wert " + jetton2.get(jetton2.size() - 1));
                for (int i = 3; i < 36; i += 3) {
                    adding.add("" + i);
                }
                gelegt.put(hashcounter, adding);

                gelegtint.put(hashcounter, jetton2.get(jetton2.size() - 1));
                be.addGelegt(adding, jetton2.get(jetton2.size() - 1), 6);
                hashcounter++;
                break;
            case 9:

                jetton2.add(jetton.get(jetton.size() - 1));
                jetton.remove(jetton.size() - 1);
                listlistview.add("Alle Schwarzen Felder " + "mit Wert " + jetton2.get(jetton2.size() - 1));
                adding.add("2");
                adding.add("4");
                adding.add("6");
                adding.add("8");
                adding.add("10");
                adding.add("11");
                adding.add("13");
                adding.add("15");
                adding.add("17");
                adding.add("20");
                adding.add("22");
                adding.add("24");
                adding.add("26");
                adding.add("28");
                adding.add("29");
                adding.add("31");
                adding.add("33");
                adding.add("35");
                gelegt.put(hashcounter, adding);

                gelegtint.put(hashcounter, jetton2.get(jetton2.size() - 1));
                be.addGelegt(adding, jetton2.get(jetton2.size() - 1), 7);
                hashcounter++;
                break;
            case 10:

                jetton2.add(jetton.get(jetton.size() - 1));
                jetton.remove(jetton.size() - 1);
                listlistview.add("Alle Roten Felder " + "mit Wert " + jetton2.get(jetton2.size() - 1));
                adding.add("1");
                adding.add("3");
                adding.add("5");
                adding.add("7");
                adding.add("9");
                adding.add("12");
                adding.add("14");
                adding.add("16");
                adding.add("18");
                adding.add("19");
                adding.add("21");
                adding.add("23");
                adding.add("25");
                adding.add("27");
                adding.add("30");
                adding.add("32");
                adding.add("24");
                adding.add("36");

                gelegt.put(hashcounter, adding);

                gelegtint.put(hashcounter, jetton2.get(jetton2.size() - 1));
                be.addGelegt(adding, jetton2.get(jetton2.size() - 1), 7);
                hashcounter++;
                break;
            case 11:
                for (int i = 19; i < 36; i++) {
                    adding.add("" + i);
                }
                be.addGelegt(Felder, jetton.get(jetton.size() - 1), 7);
                jetton2.add(jetton.get(jetton.size() - 1));
                jetton.remove(jetton.size() - 1);
                listlistview.add("Felder 19 bis 36 " + jetton2.get(jetton2.size() - 1));
                gelegt.put(hashcounter, adding);

                gelegtint.put(hashcounter, jetton2.get(jetton2.size() - 1));
                be.addGelegt(adding, jetton2.get(jetton2.size() - 1), 7);
                hashcounter++;
                break;

            case 12:
                for (int i = 1; i < 18; i++) {
                    adding.add("" + i);
                }
                be.addGelegt(Felder, jetton.get(jetton.size() - 1), 7);
                jetton2.add(jetton.get(jetton.size() - 1));
                jetton.remove(jetton.size() - 1);
                listlistview.add("Felder 1 bis 18 " + "mit Wert " + jetton2.get(jetton2.size() - 1));
                gelegt.put(hashcounter, adding);

                gelegtint.put(hashcounter, jetton2.get(jetton2.size() - 1));
                be.addGelegt(adding, jetton2.get(jetton2.size() - 1), 7);
                hashcounter++;
                break;
            case 13:

                jetton2.add(jetton.get(jetton.size() - 1));
                jetton.remove(jetton.size() - 1);
                listlistview.add("Alle geraden Zahlen " + "mit Wert " + jetton2.get(jetton2.size() - 1));
                adding.add("2");
                adding.add("4");
                adding.add("6");
                adding.add("8");
                adding.add("10");
                adding.add("12");
                adding.add("14");
                adding.add("16");
                adding.add("18");
                adding.add("20");
                adding.add("22");
                adding.add("24");
                adding.add("26");
                adding.add("28");
                adding.add("30");
                adding.add("32");
                adding.add("34");
                adding.add("36");

                gelegt.put(hashcounter, adding);

                gelegtint.put(hashcounter, jetton2.get(jetton2.size() - 1));
                be.addGelegt(adding, jetton2.get(jetton2.size() - 1), 7);
                hashcounter++;
                break;
            case 14:
                jetton2.add(jetton.get(jetton.size() - 1));
                jetton.remove(jetton.size() - 1);
                listlistview.add("Alle ungeraden Zahlen " + "mit Wert " + jetton2.get(jetton2.size() - 1));
                adding.add("1");
                adding.add("3");
                adding.add("5");
                adding.add("7");
                adding.add("9");
                adding.add("11");
                adding.add("13");
                adding.add("15");
                adding.add("17");
                adding.add("19");
                adding.add("21");
                adding.add("23");
                adding.add("25");
                adding.add("27");
                adding.add("29");
                adding.add("31");
                adding.add("33");
                adding.add("35");

                gelegt.put(hashcounter, adding);

                gelegtint.put(hashcounter, jetton2.get(jetton2.size() - 1));
                be.addGelegt(adding, jetton2.get(jetton2.size() - 1), 7);

                hashcounter++;
                break;
            case 15:
                for (int i = 1; i < 13; i++) {
                    adding.add("" + i);
                }

                jetton2.add(jetton.get(jetton.size() - 1));
                jetton.remove(jetton.size() - 1);
                listlistview.add("1st12 " + "mit Wert " + jetton2.get(jetton2.size() - 1));
                gelegt.put(hashcounter, adding);

                gelegtint.put(hashcounter, jetton2.get(jetton2.size() - 1));
                be.addGelegt(adding, jetton2.get(jetton2.size() - 1), 6);
                hashcounter++;
                break;
            case 16:
                for (int i = 12; i < 24; i++) {
                    adding.add("" + i);
                }

                jetton2.add(jetton.get(jetton.size() - 1));
                jetton.remove(jetton.size() - 1);
                listlistview.add("2nd 12 " + "mit Wert " + jetton2.get(jetton2.size() - 1));
                gelegt.put(hashcounter, adding);

                gelegtint.put(hashcounter, jetton2.get(jetton2.size() - 1));
                be.addGelegt(adding, jetton2.get(jetton2.size() - 1), 6);
                hashcounter++;
                break;
            case 17:
                for (int i = 24; i < 36; i++) {
                    adding.add("" + i);
                }

                jetton2.add(jetton.get(jetton.size() - 1));
                jetton.remove(jetton.size() - 1);
                listlistview.add("3rd12 " + "mit Wert " + jetton2.get(jetton2.size() - 1));
                gelegt.put(hashcounter, adding);

                gelegtint.put(hashcounter, jetton2.get(jetton2.size() - 1));
                be.addGelegt(adding, jetton2.get(jetton2.size() - 1), 6);
                hashcounter++;
                break;
            case 88:

                jetton2.add(jetton.get(jetton.size() - 1));
                jetton.remove(jetton.size() - 1);
                listlistview.add("00 " + "mit Wert " + jetton2.get(jetton2.size() - 1));
                adding.add("00");
                gelegt.put(hashcounter, adding);

                gelegtint.put(hashcounter, jetton2.get(jetton2.size() - 1));
                be.addGelegt(adding, jetton.get(jetton.size() - 1), 1);
                hashcounter++;
                break;
            default:
                throw new AssertionError();
        }

        listview1.getItems().clear();
        listview1.getItems().addAll(listlistview);
    }

    @FXML
    private void handel12(MouseEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            pane.add(1);
            pane.add(2);
            addListview(2);
        }

    }

    @FXML
    private void handel23(MouseEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            pane.add(2);
            pane.add(3);
            addListview(2);
        }

    }

    @FXML
    private void handel14(MouseEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            pane.add(1);
            pane.add(4);
            addListview(2);
        }
    }

    @FXML
    private void handel47(MouseEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            pane.add(4);
            pane.add(7);
            addListview(2);
        }

    }

    @FXML
    private void handel710(MouseEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            pane.add(7);
            pane.add(10);
            addListview(2);
        }

    }

    @FXML
    private void handel1013(MouseEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            pane.add(10);
            pane.add(13);
            addListview(2);
        }

    }

    @FXML
    private void handel1316(MouseEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            pane.add(13);
            pane.add(16);
            addListview(2);
        }

    }

    @FXML
    private void handel1619(MouseEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            pane.add(16);
            pane.add(19);
            addListview(2);
        }

    }

    @FXML
    private void handel1922(MouseEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            pane.add(19);
            pane.add(22);
            addListview(2);
        }

    }

    @FXML
    private void handel2225(MouseEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            pane.add(22);
            pane.add(25);
            addListview(2);
        }

    }

    @FXML
    private void handel2528(MouseEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            pane.add(25);
            pane.add(28);
            addListview(2);
        }

    }

    @FXML
    private void handel2831(MouseEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            pane.add(28);
            pane.add(31);
            addListview(2);
        }

    }

    @FXML
    private void handel3134(MouseEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            pane.add(31);
            pane.add(34);
            addListview(2);
        }

    }

    @FXML
    private void handel36(MouseEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            pane.add(3);
            pane.add(6);
            addListview(2);
        }

    }

    @FXML
    private void handel69(MouseEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            pane.add(6);
            pane.add(9);
            addListview(2);
        }

    }

    @FXML
    private void handel912(MouseEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            pane.add(9);
            pane.add(12);
            addListview(2);
        }

    }

    @FXML
    private void handel1215(MouseEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            pane.add(12);
            pane.add(15);
            addListview(2);
        }

    }

    @FXML
    private void handel1518(MouseEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            pane.add(15);
            pane.add(18);
            addListview(2);
        }

    }

    @FXML
    private void handel1821(MouseEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            pane.add(18);
            pane.add(21);
            addListview(2);
        }

    }

    @FXML
    private void handel2124(MouseEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            pane.add(21);
            pane.add(24);
            addListview(2);
        }

    }

    @FXML
    private void handel2427(MouseEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            pane.add(24);
            pane.add(27);
            addListview(2);
        }

    }

    @FXML
    private void handel2730(MouseEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            pane.add(27);
            pane.add(30);
            addListview(2);
        }

    }

    @FXML
    private void handel3033(MouseEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            pane.add(30);
            pane.add(33);
            addListview(2);
        }

    }

    @FXML
    private void handel3336(MouseEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            pane.add(33);
            pane.add(36);
            addListview(2);
        }

    }

    @FXML
    private void handel1245(MouseEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            pane.add(1);
            pane.add(2);
            pane.add(4);
            pane.add(5);

            addListview(4);
        }
    }

    @FXML
    private void handel2356(MouseEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            pane.add(2);
            pane.add(3);
            pane.add(5);
            pane.add(6);

            addListview(4);
        }
    }

    @FXML
    private void handel5689(MouseEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            pane.add(5);
            pane.add(6);
            pane.add(8);
            pane.add(9);

            addListview(4);
        }
    }

    @FXML
    private void handel4578(MouseEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            pane.add(4);
            pane.add(5);
            pane.add(7);
            pane.add(8);

            addListview(4);
        }
    }

    @FXML
    private void handel781011(MouseEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            pane.add(7);
            pane.add(8);
            pane.add(10);
            pane.add(11);

            addListview(4);
        }
    }

    @FXML
    private void handel891112(MouseEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            pane.add(8);
            pane.add(9);
            pane.add(11);
            pane.add(12);

            addListview(4);
        }
    }

    @FXML
    private void handel10111314(MouseEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            pane.add(10);
            pane.add(11);
            pane.add(13);
            pane.add(14);

            addListview(4);
        }
    }

    @FXML
    private void handel11141215(MouseEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            pane.add(11);
            pane.add(14);
            pane.add(12);
            pane.add(15);

            addListview(4);
        }
    }

    @FXML
    private void handel13141617(MouseEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            pane.add(13);
            pane.add(14);
            pane.add(16);
            pane.add(17);

            addListview(4);
        }
    }

    @FXML
    private void handel14151718(MouseEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            pane.add(14);
            pane.add(15);
            pane.add(17);
            pane.add(18);

            addListview(4);
        }
    }

    @FXML
    private void handel16171920(MouseEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            pane.add(16);
            pane.add(17);
            pane.add(19);
            pane.add(20);

            addListview(4);
        }
    }

    @FXML
    private void handel17182021(MouseEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            pane.add(17);
            pane.add(18);
            pane.add(20);
            pane.add(21);

            addListview(4);
        }
    }

    @FXML
    private void handel19202223(MouseEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            pane.add(19);
            pane.add(20);
            pane.add(22);
            pane.add(23);

            addListview(4);
        }
    }

    @FXML
    private void handel23242627(MouseEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            pane.add(23);
            pane.add(24);
            pane.add(26);
            pane.add(27);

            addListview(4);
        }
    }

    @FXML
    private void handel20212324(MouseEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            pane.add(20);
            pane.add(21);
            pane.add(23);
            pane.add(24);

            addListview(4);
        }
    }

    @FXML
    private void handel22232526(MouseEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            pane.add(22);
            pane.add(23);
            pane.add(25);
            pane.add(26);

            addListview(4);
        }
    }

    @FXML
    private void handel25262829(MouseEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            pane.add(25);
            pane.add(26);
            pane.add(28);
            pane.add(39);

            addListview(4);
        }
    }

    @FXML
    private void handel26272930(MouseEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            pane.add(26);
            pane.add(27);
            pane.add(29);
            pane.add(30);

            addListview(4);
        }
    }

    @FXML
    private void handel28293132(MouseEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            pane.add(28);
            pane.add(29);
            pane.add(31);
            pane.add(32);

            addListview(4);
        }
    }

    @FXML
    private void handel29303233(MouseEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            pane.add(29);
            pane.add(30);
            pane.add(32);
            pane.add(33);

            addListview(4);
        }
    }

    @FXML
    private void handel31323435(MouseEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            pane.add(31);
            pane.add(32);
            pane.add(34);
            pane.add(35);

            addListview(4);
        }
    }

    @FXML
    private void handel32333536(MouseEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            pane.add(32);
            pane.add(33);
            pane.add(35);
            pane.add(36);

            addListview(4);
        }
    }

    @FXML
    private void handelbutton2to13(ActionEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            pane.add(31);
            pane.add(32);
            pane.add(34);
            pane.add(35);

            addListview(8);
        }
    }

    @FXML
    private void handle2to11(ActionEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            pane.add(31);
            pane.add(32);
            pane.add(34);
            pane.add(35);

            addListview(6);
        }
    }

    @FXML
    private void handlebutton2to12(ActionEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            pane.add(31);
            pane.add(32);
            pane.add(34);
            pane.add(35);

            addListview(7);
        }
    }

    @FXML
    private void handlebutton00(ActionEvent event) {
        if (jetton.size() == feld.size()) {

        } else {

            addListview(88);
        }
    }

    @FXML
    private void handlebutton0(ActionEvent event) {
        if (jetton.size() == feld.size()) {

        } else {
            feld.add(0);
            addListview(1);
        }

    }

    @FXML
    private void handlebutton1st12(ActionEvent event) {
        if (jetton.size() == feld.size()) {

        } else {

            addListview(15);
        }
    }

    @FXML
    private void handlebutton2nd12(ActionEvent event) {
        if (jetton.size() == feld.size()) {

        } else {

            addListview(16);
        }
    }

    @FXML
    private void handlebutton3rd12(ActionEvent event) {
        if (jetton.size() == feld.size()) {

        } else {

            addListview(17);

        }
    }

    @FXML
    private void handlebutton1to18(MouseEvent event) {
        if (jetton.size() == feld.size()) {

        } else {

            addListview(12);
        }
    }

    @FXML
    private void handlebuttoneven(MouseEvent event) {
        if (jetton.size() == feld.size()) {

        } else {

            addListview(13);

        }
    }

    @FXML
    private void handlebuttonred(MouseEvent event) {
        if (jetton.size() == feld.size()) {

        } else {

            addListview(10);

        }
    }

    @FXML
    private void handlebuttonblack(MouseEvent event) {
        if (jetton.size() == feld.size()) {

        } else {

            addListview(9);

        }
    }

    @FXML
    private void handlebuttonodd(MouseEvent event) {
        if (jetton.size() == feld.size()) {

        } else {

            addListview(14);

        }
    }

    @FXML
    private void handlebutton19to36(MouseEvent event) {
        if (jetton.size() == feld.size()) {

        } else {

            addListview(11);

        }
    }

    public void setImage() {
        imageviewgif.setImage(new Image("/Bilder/radmitnullnull.png"));
    }

    @FXML
    private void buttonhandlestartgif(ActionEvent event) {
        if (spinning) {

        } else {

            buttongif.setDisable(true);
            RotateTransition rt = new RotateTransition(Duration.millis(3000), imageviewgif);
            rt.setByAngle(750);
            rt.setInterpolator(Interpolator.LINEAR);
            rt.play();
            spinning = true;

            rt.setOnFinished(ev -> {
                            buttonNeuspielen.setVisible(true);
                test();
                spinning = false;
            });
        }

    }

    private void test() {
        Random d = new Random();
        int i = d.nextInt(38);
        ausgegebeneZahl.setText(number[i]);

        verloren = gesamtgelegt;
        System.out.println(gesamtgelegt);
        System.out.println(verloren);
        gewonnen = be.winNumber(Integer.toString(i));
        System.out.println(gewonnen);
        if (verloren > gewonnen) {
            verloren -= gewonnen;
            GewinnVerlust.setText("Sie haben verloren:" + verloren);
            System.out.println("Sie haben verloren:" + verloren);
        } else {
            gewonnen -= verloren;
            GewinnVerlust.setText("Sie haben gewonnen: " + gewonnen);
            System.out.println("Sie haben gewonnen: " + gewonnen);
        }
        

    }

    @FXML
    private void handlebuttonabbrechen(MouseEvent event) {
        // get a handle to the stage
    Stage stage = (Stage) abbrechen.getScene().getWindow();
    // do what you have to do
    stage.close();
}
    private void replay(){
                be.removeGelegt();
                jetton.clear();
                jetton2.clear();
        gelegt.clear();
        gelegtint.clear();
        ArrayList<String> ad = new ArrayList<>();
        listview1.getItems().setAll(ad);
        GewinnVerlust.setText("");
             buttongif.setDisable(false);
             buttonNeuspielen.setVisible(false);
             feld.clear();
             pane.clear();
             listlistview.clear();
             hashcounter = 1;
             gesamtgelegt = 0;
             verloren = 0;
             gewonnen = 0;

             
             

    
    }

    @FXML
    private void neuSpielen(ActionEvent event) {
        
        replay();
    }

    @FXML
    private void zurückaufstart(ActionEvent event) throws IOException {
              FXMLLoader loader = new FXMLLoader();
        Stage s = (Stage) ((Node) (event.getSource())).getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/Startseite.fxml"));
        s.setTitle("My New Stage Title");
        s.setScene(new Scene(root));
        s.show();

    }
    }

