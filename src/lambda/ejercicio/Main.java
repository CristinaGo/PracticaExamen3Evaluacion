package lambda.ejercicio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Zacarías", "Zapatero", 33));
        personas.add(new Persona("Yeison", "Ybarra", 25));
        personas.add(new Persona("María", "Avia", 28));
        personas.add(new Persona("Genara", "Daroca", 44));
        personas.add(new Persona("Ana María", "Flores", 15));

        Iterator<Persona> it = personas.iterator();
        while (it.hasNext()){
            Persona p = it.next();
            System.out.println(p);
        }
        System.out.println("\nOrdenar por nombre");
        personas.stream()
                .sorted((p1,p2)-> p1.getNombre().compareTo(p2.getNombre()))
                .forEach(persona -> System.out.println(persona));
        System.out.println("\nOrdenar por apellido");
        personas.stream()
                .sorted((p1,p2)-> p1.getApellido().compareTo(p2.getApellido()))
                .forEach(persona -> System.out.println(persona));
        System.out.println("\nOrdenar por edad");
        personas.stream()
                .sorted((p1,p2)-> p1.getEdad() - p2.getEdad())
                .forEach(persona -> System.out.println(persona));
    }
}
