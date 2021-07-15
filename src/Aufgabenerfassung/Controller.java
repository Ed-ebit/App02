package Aufgabenerfassung;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    private final String[] prio = {"sehr wichtig", "wichtig", "geht so"};
    private final ObservableList<String> entries = FXCollections.observableArrayList(prio);


    @FXML
    private GridPane checkBox;

    @FXML
    private TextField ausfuehrenderFeld;

    @FXML
    private TextField aufgabenFeld;

    @FXML
    private ComboBox<String> comboBox;

    @FXML
    private ToggleGroup tggTarget;

    @FXML
    private Button btnSpeichern;

    @FXML
    private TextField ausgabeFeld;

    @FXML
    private RadioButton btnMutter;

    @FXML
    private RadioButton btnVater;

    @FXML
    private RadioButton btnTochter;

    @FXML
    private RadioButton btnSohn;

    @FXML
    private CheckBox checkbox;

    @FXML
    void checkboxClicked(ActionEvent event) {

    }

    @FXML
    void checkboxcClicked(MouseEvent event) {

    }

    @FXML
    void clickbtnMutter(ActionEvent event) {

    }

    @FXML
    void clickbtnSohn(ActionEvent event) {

    }

    @FXML
    void clickbtnTochter(ActionEvent event) {

    }

    @FXML
    void clickbtnVater(ActionEvent event) {

    }

    @FXML
    void onspeichern(ActionEvent event) {
        StringBuilder sb =new StringBuilder ("Aufgabe").append("\n============");
        sb.append(aufgabenFeld.getText()).append("\n");
        sb.append(comboBox.getSelectionModel().getSelectedItem()).append("\"");
       // sb.append(checkboxClicked.isSelected()) ) "Alle anzeigen" : "keine anzeigen");
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        comboBox.setItems(entries);

        comboBox.getSelectionModel().selectLast();
        var toggleTarget = tggTarget.getToggles();

    }
}
