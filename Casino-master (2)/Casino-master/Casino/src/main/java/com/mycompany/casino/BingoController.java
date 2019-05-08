package com.mycompany.casino;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.PauseTransition;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.HPos;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author Florian
 */
public class BingoController implements Initializable {

    @FXML
    public Label zufallszahl;
    @FXML
    private Label Gegenspieler;
    @FXML
    private Label tischauswahl;
    @FXML
    private GridPane karte;
    @FXML
    private Button Zufallszahl;
    @FXML
    private Button Bingo;
    @FXML
    private AnchorPane anchorPane;
    @FXML
    private ImageView kartePng;

    GUILoader gl = new GUILoader();
    String verloren = "VerlorenScreen";
    String gewonnen = "gewonnenScreen";
    public String butnText;
    int row = 0;
    int col = 0;
    int numberToDelete = 0;
    private Random rand = new Random();
    ArrayList<String> list = new ArrayList<>();
    Gegenspieler gegenspieler = new Gegenspieler();
    ArrayList<Integer> bingoNumbers = new ArrayList<>();
    Integer[] xKor = new Integer[25];
    Integer[] yKor = new Integer[25];
    Integer[] buttonzahlen = new Integer[25];
    boolean gegnerBingo = false;
    @FXML
    private HBox hBox;
    @FXML
    private ScrollPane pane;
    boolean isCreated = false;
    ArrayList<Integer> numbers = new ArrayList<>();
    CheckBingo cb = new CheckBingo();
    boolean bingoPlayer = false;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        gegenspieler.erstellungKarte();
    }

    public void settable(String table) {
        tischauswahl.setText(table);
    }

    public void setenemies(String enemies) {
        Gegenspieler.setText(enemies);
    }

    private final int labelPosition = 0;
    Integer[][] buttonZahlenMitCor = new Integer[5][5];

    @FXML
    private void Zufallszahl(ActionEvent event) {
        //Erstellung aller benötigten Attribute und Objekte
        karte.setGridLinesVisible(true);

        int storage = 0;
        //Zwei weitere For Schleifen welche insgesamt die Aufgabe haben eine Zufallszahl des Arrays auszugeben
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int randNum = rand.nextInt(75) + 1;
                while (numbers.contains(randNum)) {
                    randNum = rand.nextInt(numbers.size());
                }
                buttonZahlenMitCor[i][j] = randNum;
                numbers.add(randNum);
                String strRandNum = Integer.toString(randNum);
                final Button button = new Button();
                button.setText(strRandNum);
                button.setMaxSize(karte.getMaxWidth(), karte.getMaxHeight());
                karte.add(button, i, j);
                GridPane.setHalignment(button, HPos.CENTER);
                button.addEventHandler(MouseEvent.MOUSE_CLICKED,
                        new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent e) {
                        button.setStyle("-fx-background-color: #CCFF99;");
                        row = GridPane.getRowIndex(button);
                        col = GridPane.getColumnIndex(button);
                        Button ret = (Button) getKorBut(row, col);
                        butnText = ret.getText();
                    }
                });
            }
        }
        cb.erstellungKarte(buttonZahlenMitCor);
        numbers.clear();

        for (int i = 0; i < 75; i++) {
            PauseTransition transition = new PauseTransition(Duration.seconds(i * 30));
            transition.setOnFinished((e) -> {
                //Eine erste For-Schleife, diese füllt den Array mit den Zahlen 1-75
                int randNum = rand.nextInt(75) + 1;
                while (numbers.contains(randNum)) {
                    randNum = rand.nextInt(75) + 1;
                }
                numbers.add(randNum);
                gegenspieler.ueberpruefungNumAKor(Integer.toString(randNum));
                gegnerBingo = gegenspieler.ueberpruefungKor();
                cb.ueberpruefungNumAKor(Integer.toString(randNum));

                if (gegnerBingo == true && isCreated == false) {
                    Stage stage1 = (Stage) Zufallszahl.getScene().getWindow();
                    // do what you have to do
                    stage1.close();
                    try {
                        gl.loadGui(verloren);
                        isCreated = true;

                    } catch (IOException ex) {
                        Logger.getLogger(BingoController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                zufallszahl.setText(String.valueOf(randNum));
                String RandNumb = String.valueOf(randNum);

                Label Randlabel = new Label(RandNumb);
                Randlabel.setMinWidth(hBox.prefWidth(Randlabel.getHeight()));
                hBox.getChildren().add(Randlabel);
                pane.setHvalue(1);
                list.add(Randlabel.getText());
            });
            transition.play();
        }
    }

    //Event welches ausgeführt wird sobald Bingo ged¨ückt wurde
    @FXML
    private void Bingo(ActionEvent event) {
        bingoPlayer = cb.ueberpruefungKor();

        if (bingoPlayer == true && isCreated == false) {
            Stage stage1 = (Stage) Bingo.getScene().getWindow();
            // do what you have to do
            stage1.close();
            try {
                gl.loadGui(gewonnen);
                isCreated = true;

            } catch (IOException ex) {
                Logger.getLogger(BingoController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public Node getKorBut(int row, int col) {
        ObservableList<Node> chld = karte.getChildren();
        if (numberToDelete == 0) {
            chld.remove(0);
        }
        numberToDelete++;
        for (Node node : chld) {
            if (chld.contains(new Group())) {
                System.out.println("Something went wrong try again later!");
            } else {
                if (GridPane.getRowIndex(node) == row && GridPane.getColumnIndex(node) == col) {
                    return node;
                }
            }

        }

        return null;

    }

}
