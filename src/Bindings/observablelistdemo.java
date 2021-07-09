package Bindings;

import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;

public class observablelistdemo {

    public static void main(String[] args) {

        final String [] standorte = {"EF", "L", "Ma", "J", "NDH"};
        final ObservableList<String> iad = FXCollections.observableArrayList(standorte);

        final ListChangeListener<String> standortwechsel = standort -> meldeWechsel(standort);
        iad.addListener(standortwechsel);
        aendereStandort(iad);
        FXCollections.rotate(iad, 2);
        FXCollections.shuffle(iad);

    }

    private static void aendereStandort(ObservableList<String> iad) {
        iad.add("B");
    }

    private static void meldeWechsel(ListChangeListener.Change<? extends String> standort) {
        System.out.println("IAD Standorte " +standort.getList());
    }


}
