package Lotto;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LottoRechner {
    static void LRechner(){

        int [] lotto = new int [6];

        Random rnd = new Random();
//        for (int i=0; i<=5; i++) {
//            do{
//
//            }
//            while (ist vorhanden);
//            lotto [i] = rnd.nextInt (49) + 1;
//        }
        Arrays.sort(lotto);

        Set<Integer> lottoGenial = new HashSet<>();

        while (lottoGenial.size() < 6) {

            lottoGenial.add(rnd.nextInt(49)+1);

        }

        for (int z : lottoGenial) {
            System.out.print(z+"\t");
        }
    }
}
