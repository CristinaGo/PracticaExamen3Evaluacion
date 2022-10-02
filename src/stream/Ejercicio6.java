package stream;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio6 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            lista.add((int)(Math.random() * (1000 +1)));
        }
        int mayor = lista.stream().max((n1,n2)-> n1-n2).get();
        System.out.println(mayor);
        int menor = lista.stream().min((n1,n2)-> n1-n2).get();
        System.out.println(menor);
        long suma = lista.stream().reduce(0,(a,b)-> a + b);
        long denominador = lista.stream().count();
        System.out.println(suma/denominador);
    }

}
