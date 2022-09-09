package com.example.paints;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;


public class HelloController{

    @FXML
    private MenuItem O;

    @FXML
    private MenuItem S;

    @FXML
    private ImageView butterfly;

    @FXML
    public void OpeningImage(ActionEvent event) { butterfly.setVisible(true);}
    @FXML
    void save(ActionEvent event) {
        Image ibs = butterfly.getImage();
        File file = new File("C:\\Users\\nicol\\Pictures\\images\\IMG_6170r.JPG");
        System.out.println("Saved?");
    }
    @FXML
    private MenuItem SA;

    @FXML
    void SavingNewClick(ActionEvent event) {
        Stage stage = new Stage();
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Save");
        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("All Files", "*.*"));
        File file = fileChooser.showSaveDialog(stage);

        try{
            PrintStream print = new PrintStream(file);

        }catch(FileNotFoundException e){
            e.printStackTrace();
        }

            }
        }





