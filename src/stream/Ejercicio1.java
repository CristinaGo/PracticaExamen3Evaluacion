package stream;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            lista.add((int)(Math.random() * (15 -1 +1) +1));
        }
        System.out.println("Lista original");
        lista.stream().forEach(n -> System.out.print(n + " "));

        System.out.println("\nLista ordenada");
        lista.stream().sorted((n1,n2) -> n1 - n2).forEach(n -> System.out.print(n + " "));

        System.out.println("\nLista ordenada sin repetir");
        lista.stream().distinct().sorted((n1,n2) -> n1 - n2).forEach(n -> System.out.print(n + " "));

        System.out.println("\nMayores o igual de 5");
        lista.stream().filter(n -> n >= 5).forEach(n -> System.out.print(n + " "));

        System.out.println("\nMayores o igual de 5 ordenados");
        lista.stream().filter(n -> n >= 5).sorted((n1,n2) -> n1 - n2).forEach(n -> System.out.print(n + " "));

        System.out.println("\nMayores o igual de 5 ordenados inversamente");
        lista.stream().filter(n -> n >= 5).sorted((n1,n2) -> n2 - n1).forEach(n -> System.out.print(n + " "));

        long suma = lista.stream().reduce(0,(acumulador,elemento)-> acumulador + elemento);
        System.out.println("\nSuma de todos los elemetos: " + suma);

        long suma1 = lista.stream().filter(n -> n >= 5).reduce(0,(acumulador, elemento)-> acumulador + elemento);
        System.out.println("Suma de todos los elemetos mayores o igual de 5: " + suma1);

        long suma2 = lista.stream().reduce(0,(acumulador,elemento)-> acumulador + elemento);
        long cantidad = lista.stream().count();
        double promedio = suma2/cantidad;
        System.out.println("Promedio " + promedio);

    }
}
