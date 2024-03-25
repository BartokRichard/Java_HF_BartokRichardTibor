package miniProjekt3;

import java.util.ArrayList;
import java.util.Collections;

import miniProject2_gyak.IKorhataros;

public class Teszter {
    public static void main(String[] args) {
        
        ArrayList<Film> filmlista = new ArrayList<>();
        
        filmlista.add(new Film("Star Wars", 15.00));
        filmlista.add(new Film("Pulp Fiction", 12.00));
        filmlista.add(new Film("Inception", 20.00));
        filmlista.add(new HorrorFilm("The Shining", 12.99, 18));
        filmlista.add(new HorrorFilm("The Exorcist", 14.99, 16));
        filmlista.add(new HorrorFilm("Psycho", 11.99, 18));
        
        System.out.println(filmlista);

        System.out.println("Filmek:");
        for (Film film : filmlista) {
            System.out.println(film);
        }

        Collections.sort(filmlista, (f1, f2) -> Double.compare(f1.getAr(), f2.getAr()));

        System.out.println("\nRendezett filmek:");
        for (Film film : filmlista) {
            System.out.println(film);
        }

        ArrayList<IKorhataros> korhatarosFilmek = new ArrayList<>();
        for (Film film : filmlista) {
            if (film instanceof HorrorFilm) {
                korhatarosFilmek.add((HorrorFilm) film);
            }
        }

        System.out.println("\nKorhatáros filmek:");
        for (IKorhataros film : korhatarosFilmek) {
            System.out.println(film);
        }

        int kor = 11; 
        int osszBuntetes = 0;
        for (IKorhataros film : korhatarosFilmek) {
            osszBuntetes += film.Buntetes(kor);
        }

        System.out.println("\nAz összes korhatáros termék megvásárlása után fizetendő büntetés: " + osszBuntetes);

    }
}
