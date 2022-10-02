package colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();
        int num;
        do {
            System.out.println("Intoduce un número positivo");
            num = sc.nextInt();
            if (num > 0) {
                lista.add(num);
            }
        }while (num > 0);

        System.out.println("Lista original");
        System.out.println(lista);

        Iterator<Integer> it = lista.iterator();
        while (it.hasNext()){
            Integer n = it.next();
            if (n % 2 == 0){
                Integer s = 100 * lista.indexOf(n);
                System.out.print(s + " ");
            }
        }
    }
}
