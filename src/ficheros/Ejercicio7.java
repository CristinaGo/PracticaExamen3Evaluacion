package ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        String ruta = "src\\ficheros\\cadenas.txt";
        String [] cadenas = null;

        try {
            String contenido = new String(Files.readAllBytes(Paths.get(ruta)));
            cadenas = contenido.split("\\*");
        } catch (IOException e) {
            e.printStackTrace();
        }
        Arrays.stream(cadenas).forEach(n -> System.out.println(n + " "));

    }
}
