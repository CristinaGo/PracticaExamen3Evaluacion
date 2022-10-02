package xml.ej4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Ciudad m = new Ciudad("Europa", "Madrid", "España", null);
        Ciudad w = new Ciudad("América", "Washington", "EEUU", null);
        Ciudad s = new Ciudad("Oceanía", "Sidney", "Australia", null);

        ArrayList<Ciudad> ciudades = new ArrayList<>();
        ciudades.add(m);
        ciudades.add(w);
        ciudades.add(s);

        Ciudad ci = new Ciudad(null, null, null, ciudades);

        Conversor c = new Conversor(ci, "ciudades");
        c.generarXML();

        Conversor c2 = new Conversor("fichero2");
        c2.crearCiudad();

    }
}
