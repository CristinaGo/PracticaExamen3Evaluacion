package stream.ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Personaje> personajes = new ArrayList<>();
        personajes.add(new Personaje("Gandalf",Integer.MAX_VALUE,Arma.BASTON,false));
        personajes.add(new Personaje("Aragorn",88,Arma.ESPADA,true));
        personajes.add(new Personaje("Gimli",140,Arma.HACHA,false));
        personajes.add(new Personaje("Legolas",2931,Arma.ARCO,false));
        personajes.add(new Personaje("Boromir",41,Arma.ESPADA,true));
        personajes.add(new Personaje("Frodo",51,Arma.ANILLO,false));
        personajes.add(new Personaje("Sam",33,Arma.ESPADA,false));

        Iterator<Personaje> it = personajes.iterator();
        while (it.hasNext()){
            Personaje n = it.next();
            System.out.println(n);
        }

        System.out.println("\nPersonajes jovenes sin espada");
        personajes.stream().filter(personaje -> personaje.getEdad() < 90 && personaje.getArma() != Arma.ESPADA).forEach(personaje -> System.out.println(personaje));

        System.out.println("\nPersonaje sin espada");
        personajes.stream().filter(personaje -> personaje.getArma() != Arma.ESPADA).forEach(personaje -> System.out.println(personaje));

        System.out.println("\nPersonaje spor orden alfabetico");
        personajes.stream().sorted((p1,p2)-> p1.getNombre().compareTo(p2.getNombre())).forEach(personaje -> System.out.println(personaje));

        System.out.println("\nPersonajes humanos");
        personajes.stream().filter(personaje -> personaje.isHumano()).forEach((personaje -> System.out.println(personaje)));

        System.out.println("\nPersonaje más viejo");
        Personaje mayor = personajes.stream().max((p1,p2)-> p1.getEdad() - p2.getEdad()).get();
        System.out.println(mayor);
    }
}
