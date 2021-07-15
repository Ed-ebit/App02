package FxListe_Search;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionModel;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.function.Predicate;

import static javafx.beans.binding.Bindings.isNull;

public class Controller implements Initializable {
    final String[] names= {"Rudi", "Susi", "Peter", "Gabriele", "Ralf", "Gabba"};
    private final ObservableList<String> entries = FXCollections.observableArrayList(names);
    private FilteredList<String> filteredData;
    private SortedList<String> sortedList;


    @FXML
    private Button btnSearch;

    @FXML
    private TextField nameField;

    @FXML
    private ListView<String> nameList;

    @FXML
    void pressSearch(ActionEvent event) {


    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        nameList.setItems(entries);


        }



    }


