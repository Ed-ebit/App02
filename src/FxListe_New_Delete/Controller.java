package FxListe_New_Delete;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionModel;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

import static javafx.beans.binding.Bindings.isNull;

public class Controller implements Initializable {
    final String[] names= {"Rudi", "Susi", "Peter", "Gabriele"};
    private final ObservableList<String> entries = FXCollections.observableArrayList(names);
    private SelectionModel<String> selected;

    @FXML
    private Button btnAdd;

    @FXML
    private Button btnDelete;

    @FXML
    private TextField nameField;

    @FXML
    private ListView<String> nameList;

    @FXML
    void pressAdd(ActionEvent event) {
        if(nameField.getText().isEmpty())return;

        entries.add(nameField.getText());
        nameField.clear();

    }

    @FXML
    void pressDelete(ActionEvent event) {
       // var selItem2 = nameList.getSelectionModel().getSelectedIndex(); //führt zu
       // entries.remove(nameList.getSelectionModel().getSelectedIndex()); //führt zu
        entries.remove(selected.getSelectedIndex());

        selected.clearAndSelect(-1); // verhindert, dass automatisch nächster Name für Löschung selektiert ist



    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        selected = nameList.getSelectionModel();

        btnAdd.disableProperty().bind(nameField.textProperty().isEmpty());
        btnDelete.disableProperty().bind(isNull(selected.selectedItemProperty()));

       // final ObservableList<String> entries = FXCollections.observableArrayList(names);
        nameList.setItems(entries);
       // btnDelete.disableProperty().bind(selected.selectedItemProperty().isNull());
        btnDelete.disableProperty().bind(isNull(selected.selectedItemProperty()));

    }
}

