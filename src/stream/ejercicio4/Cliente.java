package stream.ejercicio4;

import java.time.LocalDate;

public class Cliente {
    String DNI;
    String nombre;
    LocalDate fecha;

    public Cliente(String DNI, String nombre, LocalDate fecha) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return DNI + " " + nombre + " " + fecha;
    }
}
