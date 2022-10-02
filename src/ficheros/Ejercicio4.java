package ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        String ruta = "src\\ficheros\\Restaurantes.csv";
        File origen = new File(ruta);
        String ruta2 = "src\\ficheros\\Restaurantes2.csv";
        File destino = new File(ruta2);

        try {
            String linea;
            Scanner lector = new Scanner(origen);
            FileWriter fw = new FileWriter(destino, true);
            while (lector.hasNextLine()){
                linea = lector.nextLine();
                String[] campos = linea.split(",");
                if (!campos[4].startsWith("6")){
                    fw.write(linea + "\n");
                }
            }

            lector.close();
            fw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
