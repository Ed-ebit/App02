package Aufgabenerfassung;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    private final String[] prio = {"sehr wichtig", "wichtig", "geht so"};
    private final ObservableList<String> entries = FXCollections.observableArrayList(prio);


    @FXML
    private TextField ausfuehrenderFeld;

    @FXML
    private TextField aufgabenFeld;

    @FXML
    private ComboBox<String> comboBox;

    @FXML
    private Button btnSpeichern;

    @FXML
    private TextField ausgabeFeld;

    @FXML
    void onspeichern(ActionEvent event) {
        StringBuilder sb =new StringBuilder ("Aufgabe").append("\n============");
        sb.append(aufgabenFeld.getText()).append("\n");
        sb.append(comboBox.getSelectionModel().getSelectedItem()).append("\"");
        ausgabeFeld.setText(sb.toString());
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        comboBox.setItems(entries);

        comboBox.getSelectionModel().selectLast();

    }
}
