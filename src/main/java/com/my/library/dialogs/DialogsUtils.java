package com.my.library.dialogs;

import javafx.scene.control.Alert;

import java.util.ResourceBundle;

public class DialogsUtils {

    static ResourceBundle bundle = ResourceBundle.getBundle("bundles.messages");

    public static void dialogAboutApplication(){
        Alert informatinAlert = new Alert(Alert.AlertType.INFORMATION);
        informatinAlert.setTitle(bundle.getString("about.title"));
        informatinAlert.setHeaderText(bundle.getString("about.header"));
        informatinAlert.setContentText(bundle.getString("about.content"));
        informatinAlert.showAndWait();
    }

}
