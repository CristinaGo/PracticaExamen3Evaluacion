package colecciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ejercicio2Set {
    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            lista.add((int) (Math.random() * (10 - 1 + 1) + 1));
        }
        System.out.println(lista);

        Set<Integer> listaSinRepeticiones = new HashSet<>();
        listaSinRepeticiones.addAll(lista);
        System.out.println(listaSinRepeticiones);
    }
}
