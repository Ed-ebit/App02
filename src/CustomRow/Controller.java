package CustomRow;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    static class ColourRectCell extends ListCell<Person>{

    }

    @FXML
    private ListView<?> lsvPersons;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
