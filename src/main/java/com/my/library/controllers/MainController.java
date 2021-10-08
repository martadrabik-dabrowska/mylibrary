package com.my.library.controllers;

import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

public class MainController {

    @FXML
    private BorderPane borderPane;


    @FXML
    private TopMenuButtonsController topMenuButtonsController;



    @FXML
    private void initialize(){

        topMenuButtonsController.setMainController(this);
    }

}
