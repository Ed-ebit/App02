package Anmeldung;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class Controller {

    @FXML
    private AnchorPane root;
    private Button btn;
    private PasswordField pwd;
    private TextField name;
    private TextField ausgabe;

    @FXML
    void btnpress(ActionEvent event) {

        String word = pwd.getText();

        String pass = "super";

        if (word.equals(pass)){
            ausgabe.setText ("Anmeldung erfolgreich");
            root.setStyle("-fx-background-color: green");
        }
        else {
            ausgabe.setText ("Anmeldung nicht erfolgreich");
            root.setStyle("-fx-background-color: red");
        }

    }
}
