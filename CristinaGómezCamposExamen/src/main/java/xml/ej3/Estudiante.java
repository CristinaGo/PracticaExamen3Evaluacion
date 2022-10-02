package xml.ej3;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
@XmlType(propOrder = {"DNI","nombre", "apellidos", "curso", "ciclo", "modulos"})
public class Estudiante {
    private String nombre;
    private String apellidos;
    private String DNI;
    private String ciclo;
    private int  curso;
    private List<String> modulos = new ArrayList<>();

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellidos, String DNI, String ciclo, int curso, List<String> modulos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.ciclo = ciclo;
        this.curso = curso;
        this.modulos = modulos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }
    @XmlElementWrapper(name = "módulos")
    @XmlElement(name = "módulo")
    public List<String> getModulos() {
        return modulos;
    }

    public void setModulos(List<String> modulos) {
        this.modulos = modulos;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", DNI='" + DNI + '\'' +
                ", ciclo='" + ciclo + '\'' +
                ", curso='" + curso + '\'' +
                ", modulos=" + modulos +
                '}';
    }

    public void mostrarEstudiante() {
        System.out.println(toString());
    }
}
