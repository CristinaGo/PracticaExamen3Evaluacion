package binarios.hoja1;

import java.io.*;
import java.util.Scanner;

public class Ejercicio5 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("CristinaGómezCamposExamen\\src\\main\\java\\binarios\\hoja1\\hnumeros.dat"))) {
            int n = 0;
            do {
                n = sc.nextInt();
                if (n >= 0) {
                    out.writeInt(n);
                }
            } while (n != -1);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("CristinaGómezCamposExamen\\src\\main\\java\\binarios\\hoja1\\numeros.dat"));
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("CristinaGómezCamposExamen\\src\\main\\java\\binarios\\hoja1\\numerosCopia.dat"))) {
            int n = 0;
            while(true){
                n = in.readInt();
                System.out.println(n + " ");
                out.writeInt(n);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (EOFException e) {
            System.out.println("Final de fichero.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
