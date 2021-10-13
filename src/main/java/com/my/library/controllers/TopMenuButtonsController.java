package com.my.library.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;

public class TopMenuButtonsController {

    public static final String LIBRARY_FXML = "/fxml/Library.fxml";
    public static final String LIST_BOOKS_FXML = "/fxml/ListBooks.fxml";
    private MainController mainController;

    @FXML
    private ToggleGroup toggleButtons;


    @FXML
    public void openLibrary() {

        mainController.setCenter(LIBRARY_FXML);
    }

    @FXML
    public void openListbooks() {

        mainController.setCenter(LIST_BOOKS_FXML);
    }

    @FXML
    public void openStatistics() {
        mainController.setCenter("/fxml/Statistics.fxml");

    }

    @FXML
    public void addBook(){
        if (toggleButtons.getSelectedToggle()!=null){
            toggleButtons.getSelectedToggle().setSelected(false);
        }
        mainController.setCenter("/fxml/AddBook.fxml");
    }



    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }
}
