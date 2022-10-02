package binarios.hoja2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {
        List<Integer> lista1 = crearListaEnteros(250);


        List<Integer> lista2 = crearListaEnteros(150);


        String rutaFicheroBase = crearFicheroBinario("ficheroBase", lista1);

        String rutaFicheroNuevo = crearFicheroBinario("ficheroNuevo", lista2);


        fusionar(rutaFicheroBase, rutaFicheroNuevo);

    }

    public static void fusionar(String ficheroBase, String ficheroNuevo) {
        List<Integer> contenidoFicheroBase = null;
        List<Integer> contenidoFicheroNuevo = null;
        try (ObjectInputStream in1 = new ObjectInputStream(new FileInputStream(ficheroBase));
             ObjectInputStream in2 = new ObjectInputStream(new FileInputStream(ficheroNuevo))) {
            contenidoFicheroBase = (List<Integer>) in1.readObject();
            contenidoFicheroNuevo = (List<Integer>) in2.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        contenidoFicheroBase.addAll(contenidoFicheroNuevo);

        contenidoFicheroBase.sort(((n1, n2) -> n1 - n2));

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ficheroBase))) {
            out.writeObject(contenidoFicheroBase); // guardamos en el fichero la lista que contiene lo de ambas listas
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static List<Integer> crearListaEnteros(int tamaño) {
        List<Integer> lista = new ArrayList<>(tamaño);

        for (int i = 0; i < tamaño; i++) {
            lista.add((int) (Math.random() * 100));
        }
        return lista;
    }

    public static String crearFicheroBinario(String nombre, List<Integer> lista) {
        String ruta = "CristinaGómezCamposExamen\\src\\main\\java\\binarios\\hoja2\\" + nombre + ".dat";

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ruta))) {
            out.writeObject(lista);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ruta;
    }

    public static void imprimeLista(List<Integer> lista) {

        //lista.stream().forEach(elemento -> System.out.print(elemento + " "));

        for (Integer elemento: lista) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}


