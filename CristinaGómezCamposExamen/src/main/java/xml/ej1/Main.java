package xml.ej1;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> hobbies = new ArrayList<>();
        hobbies.add("Ajedrez");
        hobbies.add("Natación");

        List<Persona> hijos = new ArrayList<>();
        hijos.add(new Persona(5,"Mafalda",null,null));
        hijos.add(new Persona(3,"Guille",null,null));

        Persona p = new Persona(31,"Quino",hobbies,hijos);

        try {
            JAXBContext contexto = JAXBContext.newInstance(Persona.class);
            Marshaller m = contexto.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            String ruta = "CristinaGómezCamposExamen\\src\\main\\java\\xml\\ej1\\fichero.xml";
            File f = new File(ruta);
            m.marshal(p,f);

            String ruta1 = "CristinaGómezCamposExamen\\src\\main\\java\\xml\\ej1\\fichero2.xml";
            File f2 = new File(ruta1);
            Unmarshaller um = contexto.createUnmarshaller();
            Persona p2 = (Persona) um.unmarshal(f2);
            System.out.println(p2.toString());

        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }
}
