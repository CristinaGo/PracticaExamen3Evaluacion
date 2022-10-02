package binarios.hoja1.Ejercicio6;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Registro implements Serializable {

    int temperatura;
    LocalDateTime fechaYHora;

    public Registro(int temperatura) {
        this.temperatura = temperatura;
        this.fechaYHora = LocalDateTime.now();
    }

    @Override
    public String toString() {

        DateTimeFormatter formato = DateTimeFormatter
                .ofPattern("dd-MM-yyyy HH:mm");


        return "Registro{" +
                "temperatura=" + temperatura +
                ", fechaYHora=" + fechaYHora.format(formato) +
                '}';
    }
}
