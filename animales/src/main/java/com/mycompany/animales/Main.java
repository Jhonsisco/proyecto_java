package animales;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animales = new ArrayList<>();
        
        animales.add(new Perro("Rex", 5));
        animales.add(new Gato("Whiskers", 3));
        animales.add(new Pajaro("Piolín", 2));

        System.out.println("Sonidos de los animales:");
        for (Animal a : animales) {
            a.hacerSonido();
        }
    }
}
