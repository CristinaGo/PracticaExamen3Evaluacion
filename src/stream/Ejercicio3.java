package stream;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        String cadenaanimales = "Abadejo, Abejaruco, Abeja, Abejorro, Águila, Alacrán, Antílope, Babuino, Bacalao, Ballena, Barracuda, Bisonte, Búho, Caballo, Cebra, Chimpancé, Ciervo, Conejo, Cotorra, Coyote, Delfín, Dromedario, Elefante, Erizo, Foca, Gacela, Golondrina, Guepardo, Halcón, Hiena, Hormiga, Hurón, Iguana, Jabalí, Jirafa, Kiwi, Koala, Lagarto, Lince, Lobo, Mapache, Medusa, Mosca, Murciélago, Nutria, Ñu, Oso, Oveja, Paloma, Pantera, Perezoso, Reno, Ruiseñor, Salamandra, Sapo, Serpiente, Tiburón, Tigre, Tortuga, Urraca, Vaca, Yak, Zorro";

        String [] animales = cadenaanimales.split(", ");

        Arrays.stream(animales).forEach(animal -> System.out.print(animal + " "));
        Scanner sc = new Scanner(System.in);
        System.out.println("\nIntroduce letra");
        String l = sc.next();
        Arrays.stream(animales).filter(animal -> animal.startsWith(l)).forEach(animal -> System.out.print(animal + " "));
        String animalLargo = Arrays.stream(animales).max((a1,a2)-> a1.length() - a2.length()).get();
        System.out.println("\n" + animalLargo);
        String animalCorto = Arrays.stream(animales).min((a1,a2)-> a1.length() - a2.length()).get();
        System.out.println(animalCorto);
        long total = Arrays.stream(animales).count();
        System.out.println(total);
    }
}
