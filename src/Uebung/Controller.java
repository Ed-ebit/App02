package Uebung;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private Button istGleich;

    @FXML
    private TextField zahl1;

    @FXML
    private TextField zahl2;

    @FXML
    private TextField ergebnis;

    @FXML
    void actionStart(ActionEvent event) {

        Double z1 = Double.parseDouble(zahl1.getText());
        Double z2 = Double.parseDouble(zahl2.getText());
        //ergebnis = z1+ z2;
        System.out.println(ergebnis);

    }

}


