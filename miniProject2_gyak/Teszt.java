package miniProject2_gyak;
import java.util.*;

public class Teszt {
    public static void main(String[] args) {
        Film film1 = new Film("Star Wars", 15.00);
        Film film2 = new Film("Pulp Fiction", 12.00);
        Film film3 = new Film("Inception", 20.00);
        HorrorFilm hfilm1 = new HorrorFilm("The Shining", 24.55, 18);
        HorrorFilm hfilm2 = new HorrorFilm("The Conjuring", 24.55, 18);
        HorrorFilm hfilm3 = new HorrorFilm("IT", 24.55, 16);

        ArrayList<Film> filmlista = new ArrayList<>();
        filmlista.add(film1);
        filmlista.add(film2);
        filmlista.add(film3);
        filmlista.add (hfilm1);
        filmlista.add (hfilm2);
        filmlista.add (hfilm3);

        System.out.println(" A teljes film lista:");
        for (Film film : filmlista){
            System.out.println(film);
        }

        Collections.sort(filmlista, (f1, f2) -> Double.compare(f1.getAr(), f2.getAr()));
        
        System.out.println("\nRendezett lista:");
        for (Film film : filmlista) {
            System.out.println(film);
        }


        ArrayList<IKorhataros> korhatarosLista = new ArrayList<>();
        for (Film film : filmlista) {
            if (film instanceof HorrorFilm) {
                korhatarosLista.add((HorrorFilm) film);
            }
        }

        System.out.println("\nKorhataros film lista:");
        for (IKorhataros korhataros : korhatarosLista) {
            System.out.println(korhataros);
        }

        int totalBuntetes =  0;
        int eletkor = 17;
        for (IKorhataros korhataros : korhatarosLista) {
            totalBuntetes += korhataros.Buntetes(eletkor);
        }
        System.out.println("\nBuntetés: " + totalBuntetes); 

    }

   
}
