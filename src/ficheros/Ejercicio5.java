package ficheros;

import java.io.File;

public class Ejercicio5 {
    public static void main(String[] args) {
        String ruta = "src\\ficheros\\Restaurantes2.csv";
        File f = new File(ruta);
        if (f.delete()){
            System.out.println("El fichero ha sido eliminado");
        }


    }
}
