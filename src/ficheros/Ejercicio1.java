package ficheros;

import java.io.File;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        String ruta = "src\\ficheros\\datos";

        File f = new File(ruta);
        if (f.exists()){
            System.out.println("El fichero existe");
            if (f.isDirectory()){
                System.out.println("Es un directorio");
            }
            if (f.isFile()){
                System.out.println("Es un fichero");
                System.out.println(f.getName());
                System.out.println(f.length());
                System.out.println("Permisos");
                if (f.canWrite()){
                    System.out.println("escritura");
                }
                if (f.canRead()){
                    System.out.println("lectura");
                }
            }
        } else {
            System.out.println("El fichero no existe");
        }
    }
}
