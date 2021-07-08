package Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class SliderController implements Initializable {
        //boolean

        @FXML
        private Slider sdwert1;

        @FXML
        private Label lblWert;

        @FXML
        private Slider sldSlider2;

        @FXML
        void btnpress(ActionEvent event) {

        }

        @FXML
        void onSliderWert(ActionEvent event) {
                Double sldVal = sdwert1.getValue();
                lblWert.setText(sldVal.toString());

                       /* if (isVerbunden) {
                                //Btnabfrage.setText("Ungebunden");
                                sldSilder2.valueProperty().unbindBidirectional(sdwert1.valueProperty());
                        } else {
                                Btnabfrage.setText("Verbunden");
                                if (Btnabfrage.getText().equals("Verbunden")) {
                                        sldSilder2.valueProperty().unbindBidirectional(sldwert.valueProperty());
                                        Btnabfrage.setText("Ungebunden");
                                } else {
                                        sldSilder2.valueProperty().bindBidirectional(sldwert.valueProperty());
                                        Btnabfrage.setText("Verbunden");
                                }
                        }
                                isVerbunden = !isVerbunden;
                                Btnabfrage.setText(String.format("%sbunden", isVerbunden ? "Ver" : "Unge"));*/




        }
        @FXML
        void onDraggedWert(MouseEvent event) {

                Double sldVal = sdwert1.getValue();
                lblWert.setText(sldVal.toString());

        }



        @Override
        public void initialize(URL url, ResourceBundle resourceBundle) {
                //isVerbunden = true;
                sldSlider2.valueProperty().bindBidirectional(sdwert1.valueProperty());


        }
}
