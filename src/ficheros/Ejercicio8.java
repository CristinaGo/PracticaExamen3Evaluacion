package ficheros;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ruta = "src\\ficheros\\datos.txt";
        File f = new File(ruta);
        String palabra;
        do {
            System.out.println("Introduce por teclado");
            palabra = sc.nextLine();
            try {
                FileWriter fw = new FileWriter(f, true);
                fw.write(palabra + "\n");
                fw.close();
            } catch (IOException e) {
                //e.printStackTrace();
            }
        }while(!palabra.equalsIgnoreCase("FIN"));




    }
}
