package xml.ej2;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> h = new ArrayList<>();
        h.add("Leer");
        h.add("Calistenia");
        h.add("Hacer el vago");

        List<Persona> hi = new ArrayList<>();
        hi.add(new Persona(3, "Jaimito", null, null));
        hi.add(new Persona(3, "Jorgito", null, null));
        hi.add(new Persona(3, "Juanito", null, null));

        Persona p = new Persona(30, "Pato Donald", h, hi);

        try {
            JAXBContext contexto = JAXBContext.newInstance(Persona.class);
            Marshaller m = contexto.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            String ruta = "CristinaGómezCamposExamen\\src\\main\\java\\xml\\ej2\\fichero.xml";
            File f = new File(ruta);

            m.marshal(p,f);

            Unmarshaller um = contexto.createUnmarshaller();
            Persona p2 = (Persona) um.unmarshal(new File("CristinaGómezCamposExamen\\src\\main\\java\\xml\\ej2\\fichero2.xml"));
            System.out.println(p2.toString());
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
