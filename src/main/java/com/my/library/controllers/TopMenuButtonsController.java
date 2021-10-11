package com.my.library.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;

public class TopMenuButtonsController {

    private MainController mainController;

    @FXML
    private ToggleGroup toggleButtons;


    @FXML
    public void openLibrary() {

    }

    @FXML
    public void openListbooks() {

    }

    @FXML
    public void openStatistics() {

    }

    @FXML
    public void addBook(){
        if (toggleButtons.getSelectedToggle()!=null){
            toggleButtons.getSelectedToggle().setSelected(false);
        }
    }



    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }
}
