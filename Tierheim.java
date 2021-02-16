import java.util.ArrayList;
import java.util.List;

public class Tierheim {

    public static void main(String[] args) {

        int anzahlLeckerli = 30;


        // Hunde erstellen & benennen
        Dog romeo = new Dog("Romeo");
        Dog julia = new Dog("Julia");
        Dog bello = new Dog("Bello");

        // Hunde der Liste dogs hinzufügen
        List<Dog> dogs = new ArrayList<>();
        dogs.add(romeo);
        dogs.add(julia);
        dogs.add(bello);

        // mit allen Hunden spazieren gehen:
        Tierheim.spazieren(dogs);
        // verteilen der Leckerli
        Tierheim.verteilen(anzahlLeckerli);

        // zurück im Tierheim wird geschaut, ob alle Hunde da sind
        System.out.println();
        System.out.println("Zählung der Hunde durch die Chefin bei der Rückkehr!");
        for(int i = 0; i < dogs.size(); ++i){
            System.out.printf("Dieser Hund ist wieder da: %s\n", dogs.get(i).getName());
        }
        System.out.printf("Ich habe nur mehr %d Leckerli.\n",anzahlLeckerli/2);
        System.out.println("----------------------------------------------");

        // nur mit einem Hunde spazieren gehen
        Tierheim.spazieren(romeo);
        System.out.printf("Ich bringe %s zurück!\n", romeo.getName());


    }

    static void spazieren(List<Dog> dogs){
        List<Dog> copy = new ArrayList<>();
        copy.addAll(dogs);
        // Ausgabe vom spazieren gehen ...
        // romeo nicht ausgeben!!!!!!
        for(int i = 0; i < copy.size(); ++i){
            // romeo finden und aus der Liste entfernen
            if(copy.get(i).getName().equals("Romeo")){
        // copy.get(i).setName("Depp");
        // copy.remove(i);
                break;
            }
        }
        for(int i = 0; i < copy.size(); ++i){
            System.out.printf("Ich gehe heute mit %s spazieren!\n", copy.get(i).getName());
        }
    }

    static void spazieren(Dog dog){
        System.out.printf("Ich gehe heute mit %s spazieren!\n", dog.getName());
        // Mir gefällt der Name Romeo nicht. Ich schreibe aufs Halsband ... Wuffi
        dog.setName("Wuffi");
        System.out.println("Ich nenne Romeo jetzt WUffi!");
    }

    static int verteilen(int anzahlLeckerli){
        // verteilen von 50 % aller Leckerlis
        System.out.printf("Ich habe insgesamt %d Leckerli. Ich verteile die Hälfte.\n", anzahlLeckerli);
        int neueLeckerli = anzahlLeckerli / 2;
        System.out.printf("Ich habe nur mehr %d Leckerli.\n", neueLeckerli);
        return neueLeckerli;
    }

}
