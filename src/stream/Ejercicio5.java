package stream;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio5 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 40; i++) {
            lista.add((int)(Math.random() * (20 + 20 +1) -20));
        }
        System.out.println("Original");
        lista.stream().forEach(n -> System.out.print(n + " "));

        System.out.println("\nLista positivos");
        lista.stream().filter(n -> n >= 0).forEach(n -> System.out.print(n + " "));
        long p = lista.stream().filter(n -> n >= 0).count();
        System.out.println("\n" + p);

        System.out.println("\nLista negativos");
        lista.stream().filter(n -> n < 0).forEach(n -> System.out.print(n + " "));
        long N = lista.stream().filter(n -> n < 0).count();
        System.out.println("\n" + N);

        System.out.println("\n Lista -10 10");
        lista.stream().filter(n -> n <= 10 && n >= -10).forEach(n -> System.out.print(n + " "));
    }
}
