package xml.ej2;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;


@XmlRootElement(name= "persona")
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @XmlElementWrapper(name = "hobbies")
    @XmlElement(name= "hobbie")
    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }
    @XmlElementWrapper(name = "sobrinos")
    @XmlElement(name= "sobrino")
    public List<Persona> getHijos() {
        return hijos;
    }

    public void setHijos(List<Persona> hijos) {
        this.hijos = hijos;
    }

    @Override
    public String toString() {
        return "Persona2{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", hobbies=" + hobbies +
                ", hijos=" + hijos +
                '}';
    }
}
