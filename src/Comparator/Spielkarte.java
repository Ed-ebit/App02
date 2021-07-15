package Comparator;

public class Spielkarte {

    Kartenfarbe farbe;
    Integer wert;

    public Spielkarte(Kartenfarbe farbe, Integer wert){
        this.farbe = farbe;
        this.wert = wert;
    }
    public Spielkarte(){
// Vergleiche: müssen immer -1, 0 und 1 zurückliefern
    }
}
