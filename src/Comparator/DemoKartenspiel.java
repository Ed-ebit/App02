package Comparator;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DemoKartenspiel {
    public static void main(String[] args) {

        List<Spielkarte> meinBlatt = new ArrayList<>();
        meinBlatt.add(new Spielkarte());
        meinBlatt.get(0).farbe = Kartenfarbe.Karo;
        meinBlatt.get(0).wert = 10;
        meinBlatt.add(new Spielkarte(Kartenfarbe.Herz, 7));
        meinBlatt.add(new Spielkarte(Kartenfarbe.Pik, 8));

        Spielkarte karo10 = new Spielkarte(Kartenfarbe.Karo, 10);
        var karte1 = meinBlatt.get(0);
        var karte2 = karo10;

        // not work, as adresses verglichen werden
        // if(karte1 == karte2){
        //if(karte1.equals (karte2)){
        //equals hilft hier leider auch nicht, da die Objekte verglichen werden. bei eigen erstellten Klassen
        //müssen wir ein Override für die equals Methode schreiben, dere unseren Zwecken genügt Siehe unten
        //andere Möglichkeit: Hashcode überschreiben - statt hashwert wird farbe und wert zurückgeliefert
        System.out.println("Karte gefunden");
    }


/*    @Override
    public boolean equals(Object karte){
        if (this == karte) return true;
        if (karte == null || getClass() != karte.getClass()) return false;
        Spielkarte that = (Spielkarte) karte;
        return farbe == that.farbe && Objects.equals(wert, )*/

    }


