package FileIO;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;
import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

class Person  implements Serializable{
    String vname;
    Integer alter;
    String stadt;
    Person( String n, Integer a, String s){

    }
}

public class SerialisierungVonObjekten {

    public static void main(String[] args) throws InterruptedException {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Rudi", 33, "EF"));
        people.add(new Person("Susi", 19, "L"));
        people.add(new Person("Anna Bolika", 99, "B"));

        try(ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(new File("person.data"))
        )){
            oos.writeObject(people);
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("Wieder deserialisieren");
        Thread.sleep(2000);
        System.out.println("Jetzt");
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream((new File("person.data"))))){
            List<Person> pp = new ArrayList<>();
            pp=(List<Person>) ois.readObject();
            pp.forEach(System.out::println);

        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }


}
