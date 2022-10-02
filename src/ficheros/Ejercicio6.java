package ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        String ruta = "src\\ficheros\\dataset_91007.txt";

        File f = new File(ruta);

        try {
            Scanner lector = new Scanner(f);
            int maximo = 0;
            while (lector.hasNextInt()){
                int num = lector.nextInt();
                if (num > maximo){
                    maximo = num;
                }
            }
            lector.close();
            System.out.println(maximo);

        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
            //e.printStackTrace();
        }


    }
}
