package com.mycompany.casino;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
public class StarterController implements Initializable {

    @FXML
    private ImageView information;
    @FXML
    private Label jet;
    @FXML
    private Label titel;
    @FXML
    private ListView<String> listview;
    @FXML
    private Label tischauswahl;
    @FXML
    private Label jet1;
    @FXML
    private AnchorPane AnchorPane;
    @FXML
    private ListView<String> listview1;
    @FXML
    private Button startBtn;
    @FXML
    private Label chosenLabel;
    
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        //Initialisierung beider ListViews
        ObservableList<String> itemsTisch;
        itemsTisch = FXCollections.observableArrayList (
        "Einsatz: 10 / Gewinn: bis zu 50", "Einsatz: 20 / Gewinn: bis zu 100", "Einsatz: 50 / Gewinn: bis zu 250", "Einsatz: 100 / Gewinn: bis zu 500");
        ObservableList<String> itemGegner;
        itemGegner = FXCollections.observableArrayList (
        "1", "2", "3", "4", "5");
        //Fragezeichen Bild gesettet
        information.setImage( new Image("/Pictures/Blue_question_mark_icon.svg.png"));
        //Füllen beider ListViews
        listview.setItems(itemsTisch);
        listview1.setItems(itemGegner);
        
    }    

    @FXML
    private void information(MouseEvent event) throws IOException {
        Stage stage = new Stage();
        System.out.println(" FLO ESCH GAYYYY");
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/Information.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    private void start(ActionEvent event) throws IOException {
        try{
        String tables = listview.getSelectionModel().getSelectedItem();
        String enemies = listview1.getSelectionModel().getSelectedItem(); 
        System.out.println(tables+ " + " +enemies);
        Stage stage = new Stage();
        FXMLLoader loader =  new FXMLLoader(getClass().getResource("/fxml/Bingo.fxml"));
        Parent root = (Parent) loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
         scene.getStylesheets().add("/styles/bingo.css");
        stage.setResizable(false);
        stage.show();
        Stage stage1 = (Stage) startBtn.getScene().getWindow();
        // do what you have to do
        stage1.close();
        BingoController bc = loader.getController();
        bc.settable(tables);
        bc.setenemies(enemies);
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
    }
    
}
