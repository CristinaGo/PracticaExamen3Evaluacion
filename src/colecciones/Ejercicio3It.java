package colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ejercicio3It {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            lista.add((int) (Math.random() * (10 - 1 + 1) + 1));
        }

        Iterator<Integer> it = lista.iterator();
        while (it.hasNext()){
            Integer n = it.next();
            System.out.print(n + " ");
        }
        it = lista.iterator();
        while(it.hasNext()){
            Integer n = it.next();
            if (n == 5){
                it.remove();
            }
        }
        System.out.println("\nLista sin 5");
        it = lista.iterator();
        while(it.hasNext()) {
            Integer n = it.next();
            System.out.print(n + " ");
        }
    }
}
