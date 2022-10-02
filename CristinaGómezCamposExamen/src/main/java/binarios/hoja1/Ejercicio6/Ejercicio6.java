package binarios.hoja1.Ejercicio6;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio6 {
    static Scanner sc = new Scanner(System.in);
    static String ruta = "CristinaGómezCamposExamen\\src\\main\\java\\binarios\\hoja1\\registro.dat";

    public static void main(String[] args) {
        // Menú
        int opción = 0;
        do {
            System.out.println("1. Escribir registro\n2. Leer fichero\n0. Salir");
            opción = sc.nextInt();
            switch (opción) {
                case 0:
                    break;
                case 1:
                    escribirRegistro();
                    break;
                case 2:
                    leerFichero(true);
                    break;
                default:
                    System.out.println("Opción incorrecta.");
            }
        }while (opción != 0);
    }

    private static void escribirRegistro() {

        comprobarFichero();

        System.out.println("Temperatura: ");
        Registro r = new Registro(sc.nextInt());
        List<Registro> lista = leerFichero(false);

        if (lista == null) {
            lista = new ArrayList<>();
        }

        lista.add(r);

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ruta))) {
            out.writeObject(lista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void comprobarFichero() {

        File f = new File(ruta);
        if (!f.exists()) {
            try {
                boolean creado = f.createNewFile();
                System.out.println("Se acaba de crear el fichero.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static ArrayList<Registro> leerFichero(boolean mostrarDatos) {

        comprobarFichero();

        ArrayList<Registro> fichero = null;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(ruta))) {

            fichero = (ArrayList<Registro>) in.readObject();

            if (mostrarDatos) {
                fichero.stream().forEach(System.out::println);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado o ruta incorrecta.");
            e.printStackTrace();
        } catch (EOFException eofException) {
            System.out.println("El fichero no contiene datos.");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return fichero;
    }
}
