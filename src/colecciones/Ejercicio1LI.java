package colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1LI {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;

        List<Integer> lista = new ArrayList<>();
        do {
            System.out.println("Introduce un número no negativo");
            num = sc.nextInt();
            if (num > 0){
                lista.add(num);
            }
        }while(num != -1);

        System.out.println("Lista");
        Iterator<Integer> it = lista.iterator();
        while (it.hasNext()){
            Integer n = it.next();
            System.out.print(n + " ");
        }
        it= lista.iterator();
        System.out.println("\nSolo pares");
        while (it.hasNext()){
            Integer n = it.next();
            if (n % 2 == 0) {
                System.out.print(n + " ");
            }
        }

        it = lista.iterator();
        System.out.println("\nSin multiplos de 3");
        while (it.hasNext()){
            Integer n = it.next();
            if (n % 3 == 0) {
                it.remove();
            }
        }
        System.out.println(lista);
    }
}
