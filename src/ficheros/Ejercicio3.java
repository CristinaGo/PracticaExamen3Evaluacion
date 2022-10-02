package ficheros;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio3 {
    public static void main(String[] args) {
        String ruta = "src\\ficheros\\nombres.csv";

        File f = new File(ruta);
        String linea = "Cristina|Gómez|Campos";

        try {
            FileWriter fw = new FileWriter(f, true);
            fw.write(linea);

            fw.close();
        } catch (IOException e) {
            System.out.println("Ha ocurrido error");
            //e.printStackTrace();
        }
    }
}
