package Comparator;

import java.util.Arrays;
import java.util.Comparator;

public class DemoApp {
    public static void main(String[] args) {

        // eine Namensliste nach der Länge der Namen sortieren
        String[] names = {"Susi Sorglos", "Alf", "fritze", "Fritze"};
        Arrays.sort(names);
        for (var n : names) {
            System.out.println(n);
        }
        Comparator<String> compbyNameLength = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }

        };
        Arrays.sort(names, (str1,str2)->{return Integer.compare(str1.length(),str2.length());});
        for (var n:names) {
            System.out.println(n);
        }
    }
}
