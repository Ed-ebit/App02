package CustomRow;

public class Person {

    String name;
    Integer alter;
   // public Person(String n, int a);
}

enum Alterbereiche{
    Junger(30), Mittlerer(40), Alter(60);

    private Integer grenze;

    Alterbereiche(Integer alter){
        grenze= alter;
    }
}
