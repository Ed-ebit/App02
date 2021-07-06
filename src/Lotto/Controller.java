package Lotto;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.ObservableListBase;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;

import javax.swing.*;
import java.util.*;

public class Controller {

    @FXML
    private Button btnZiehung1;

    @FXML
    private Button BtnZiehung2;

    @FXML
    private ListView<Integer> lstZahlen;

    @FXML
    private TextArea derText;


    @FXML
    void onLottoStart(ActionEvent event) {

        ObservableList<Integer> olsLotto = FXCollections.observableArrayList(LRechner());
        lstZahlen.setItems(olsLotto);
        }

    @FXML
    void onLottoStart2(ActionEvent event) {
        //       derText.setText(Arrays.toString(LRechner()));
/*        String ausgabe = "";
        for (Integer e : LRechner()) {
            ausgabe = ausgabe + e + " ";
        }
        derText.setText(ausgabe);*/
    }




    @FXML
    private TextArea DerText;

    private Integer [] LRechner(){

        Random rnd = new Random();


        Set<Integer> lottoGenial = new HashSet<>();

        while (lottoGenial.size() < 6) {

            lottoGenial.add(rnd.nextInt(49)+1);

        }
        Integer [] lottogenialArr = lottoGenial.toArray (new Integer [] {});
        Arrays.sort(lottogenialArr);
        return lottogenialArr;

//        for (int z : lottoGenial) {
//            System.out.print(z+"\t");
        }
       }





