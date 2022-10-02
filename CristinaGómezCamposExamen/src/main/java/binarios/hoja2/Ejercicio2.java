package binarios.hoja2;

import java.io.*;
import java.util.Arrays;

public class Ejercicio2 {
    public static void main(String[] args) {
        Integer[] a1 = crearArrayEnteros(10);
        Integer[] a2 = crearArrayEnteros(7);

        String r1 = crearFicheroBinario("f1",a1);
        String r2 = crearFicheroBinario("f2",a2);

        Integer[] arrayFusionado = fusionar(r1,r2);

        imprimeArray(arrayFusionado);
    }


    public static Integer[] crearArrayEnteros(int tamaño) {
        Integer[] numeros = new Integer[tamaño];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100);
        }
        return numeros;

    }

    public static Integer[] fusionar(String fichero1, String fichero2) {

        Integer[] contenido1 = null;
        Integer[] contenido2 = null;

        try (ObjectInputStream in1 = new ObjectInputStream(new FileInputStream(fichero1));
             ObjectInputStream in2 = new ObjectInputStream(new FileInputStream(fichero2)); ) {
            contenido1 = (Integer[]) in1.readObject();
            contenido2 = (Integer[]) in2.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Integer[] total = new Integer[contenido1.length + contenido2.length];

        for (int i = 0; i < contenido1.length; i++) {
            total[i] = contenido1[i];
        }

        for (int i = 0 ; i < contenido2.length; i++) {
            total[contenido1.length + i] = contenido2[i];
        }

        Arrays.sort(total);
        return total;
    }

    public static String crearFicheroBinario(String nombre, Integer[] array) {

        String ruta = "CristinaGómezCamposExamen\\src\\main\\java\\binarios\\hoja2\\" + nombre + ".dat";

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ruta))) {
            out.writeObject(array);
        } catch (FileNotFoundException e) {
            System.out.println("No existe el fichero o la ruta es incorrecta.");
            //e.printStackTrace();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return ruta;
    }

    public static void imprimeArray(Integer[] array) {
        System.out.println(Arrays.toString(array));
    }
}
