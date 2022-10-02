package stream.ejercicio4;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Cliente [] clientes = {
                new Cliente("11111111A", "Asdrubal", LocalDate.of(2004,12,15)),
                new Cliente("22222222B","Benito",LocalDate.of(2001,5,6)),
                new Cliente("33333333C", "Carlota", LocalDate.of(1988, 7, 9)),
                new Cliente("44444444D", "Demetria", LocalDate.of(2002, 10, 10)),
                new Cliente("55555555E", "Esperanza", LocalDate.of(1972, 2, 2))
        };

        Arrays.stream(clientes).sorted((c1,c2)-> c1.getFecha().getYear() - c2.getFecha().getYear()).forEach(cliente -> System.out.println(cliente));
    }
}
