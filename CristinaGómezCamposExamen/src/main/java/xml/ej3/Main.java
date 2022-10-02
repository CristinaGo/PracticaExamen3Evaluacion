package xml.ej3;

import xml.ej2.Persona;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> m = new ArrayList<>();
        m.add("Programación");
        m.add("Bases de datos");
        m.add("lenguaje de marcas");

        Estudiante e = new Estudiante("Carlos","Nieto","6666666B","Daw",1, m);

        String ruta = "CristinaGómezCamposExamen\\src\\main\\java\\xml\\ej3\\fichero.xml";

        try {
            JAXBContext contexto = JAXBContext.newInstance(Estudiante.class);
            Marshaller ma = contexto.createMarshaller();
            ma.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            File f = new File(ruta);
            ma.marshal(e,f);

            Unmarshaller um = contexto.createUnmarshaller();
            Estudiante e2 = (Estudiante) um.unmarshal(new File("CristinaGómezCamposExamen\\src\\main\\java\\xml\\ej3\\fichero2.xml"));

            e2.mostrarEstudiante();

        } catch (JAXBException ex) {
            ex.printStackTrace();
        }
    }
}
