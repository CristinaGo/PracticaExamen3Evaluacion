package ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce texto");
        String texto = sc.nextLine();
        String ruta = "src\\ficheros\\Restaurantes.csv";

        File f = new File(ruta);
        int numLinea = 0;
        String linea = "";
        boolean encontrado = false;
        try {
            Scanner lector = new Scanner(f);
            while (lector.hasNextLine()){
                linea = lector.nextLine();
                numLinea++;
                if (linea.toLowerCase().contains(texto.toLowerCase())){
                    System.out.println(numLinea + " " + linea + "\n");
                    encontrado = true;
                }

            }
            if(!encontrado){
                System.out.println("El fichero no contiene el texto");
            }
            lector.close();
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
        }

    }
}
