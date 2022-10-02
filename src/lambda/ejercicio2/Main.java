package lambda.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Paciente> pacientes = new ArrayList<>();
        pacientes.add(new Paciente("Felipe R.",54, new String[]{"nauseas" , " mareos"}));
        pacientes.add(new Paciente("Irene M", 32,new String[]{"tos","cansancio","mareos"}));
        pacientes.add(new Paciente("Carmen C",15, new String[]{"ansiedad"}));
        pacientes.add(new Paciente("Santiago A", 8, new String[]{"factura de cadera"}));
        pacientes.add(new Paciente("Isabel A",60,new String[]{"tos","amnesia", "fiebre","dolor"}));

        for (Paciente p: pacientes) {
            System.out.println(p);
        }
        System.out.println("ordenados por edad");
        pacientes.sort((n1,n2) -> n1.getEdad() - n2.getEdad());
        for (Paciente p: pacientes) {
            System.out.println(p);
        }

        System.out.println("ordenados por nombre");
        pacientes.sort((n1,n2) -> n1.getNombre().compareTo(n2.getNombre()));
        for (Paciente p: pacientes) {
            System.out.println(p);
        }

        System.out.println("ordenados por numero de sintomas");
        pacientes.sort((Paciente p1 , Paciente p2) -> p1.getSíntomas().length - p2.getSíntomas().length);
        for (Paciente p: pacientes) {
            System.out.println(p);
        }


    }

}
