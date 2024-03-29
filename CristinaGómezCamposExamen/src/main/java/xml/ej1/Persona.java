package xml.ej1;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;


@XmlRootElement
public class Persona {
    private int edad;
    private String nombre;
    List<String> hobbies = new ArrayList<>();
    List<Persona> hijos = new ArrayList<>();

    public Persona() {
    }

    public Persona(int edad, String nombre, List<String> hobbies, List<Persona> hijos) {
        this.edad = edad;
        this.nombre = nombre;
        this.hobbies = hobbies;
        this.hijos = hijos;
    }
    @XmlAttribute(name = "edad", required = true)
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    @XmlAttribute(name = "nombre", required = true)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @XmlElementWrapper(name = "hobbies")
    @XmlElement(name = "elemento")
    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }
    @XmlElementWrapper(name = "hijos")
    @XmlElement(name = "persona")
    public List<Persona> getHijos() {
        return hijos;
    }

    public void setHijos(List<Persona> hijos) {
        this.hijos = hijos;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", hobbies=" + hobbies +
                ", hijos=" + hijos +
                '}';
    }
}
