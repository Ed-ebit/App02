package Lotto;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.ObservableListBase;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Controller {

    @FXML
    private Button btnStart;

    @FXML
    private ListView<Integer> lstZahlen;


    @FXML
    void onLottoStart(ActionEvent event) {
        LottoRechner
        int [] z = {4,7,13,23,46,49};
        List<Integer> lottoList = new ArrayList<Integer>();
        for (var e: z) {
            lottoList.add(e);
        }
        ObservableList<Integer> olsLotto = FXCollections.observableArrayList(lottoList);
        lstZahlen.setItems(olsLotto);
        }
       // JOptionPane.showMessageDialog(null,"HII");

    }



