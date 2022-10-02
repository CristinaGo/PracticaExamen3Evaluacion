package colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> positivos = new ArrayList<>();
        List<Integer> negativos = new ArrayList<>();
        int num;
        int sumN = 0;
        int sumP = 0;
        do {
            System.out.println("intoduce un número entero");
            num = sc.nextInt();
            if (num > 0){
                positivos.add(num);
                sumP += num;
            } else if (num < 0){
                negativos.add(num);
                sumN += num;
            }
        }while (num != 0);

        System.out.println("Positivos");
        System.out.println(positivos);
        System.out.println("Negativos");
        System.out.println(negativos);
        System.out.println("Suma positivos " + sumP);
        System.out.println("Suma negativos " + sumN);

        Iterator<Integer> itp = positivos.iterator();
        Iterator<Integer> itN = negativos.iterator();
        while (itp.hasNext()){
            Integer n = itp.next();
            if (n > 10) {
                itp.remove();
            }
        }
        while (itN.hasNext()){
            Integer p = itN.next();
            if (p < -10) {
                itN.remove();
            }
        }
        System.out.println(positivos);
        System.out.println(negativos);

    }
}
