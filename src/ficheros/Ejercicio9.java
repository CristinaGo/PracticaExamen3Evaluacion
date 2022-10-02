package ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        String ruta = "src\\ficheros\\Restaurantes.csv";

        File f = new File(ruta);
        int mayor = 0, menor = 10000;
        String lineaMayor = null, lineaMenor = null;

        try {
            Scanner lector = new Scanner(f);
            while (lector.hasNextLine()){
                String linea = lector.nextLine();
                if (linea.length() > mayor){
                    mayor = linea.length();
                    lineaMayor = linea;
                }else if (linea.length() < menor){
                    menor = linea.length();
                    lineaMenor = linea;
                }

            }
            lector.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Linea mayor " + lineaMayor + " Tamaño " + mayor);
        System.out.println("Linea menor " + lineaMenor + " Tamaño " + menor);
    }
}
