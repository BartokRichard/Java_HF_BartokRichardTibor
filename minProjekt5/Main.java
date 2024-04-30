package minProjekt5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Hallgato hallgato = new Hallgato("Nagy", "Elemer");
        // hallgato.ujBejegyzes(new Jegy("Matek", 10));
        // hallgato.ujBejegyzes(new Jegy("Matek", 8));
        // hallgato.ujBejegyzes(new Jegy("Roman", 7));
        // hallgato.ujBejegyzes(new Jegy("Roman", 8));
        // hallgato.ujBejegyzes(new Jegy("Magyar", 9));
        // hallgato.listazas();
        Naplo naplo = new Naplo( "C:\\JAVA\\minProjekt5\\hallgatok.csv");
       try (BufferedReader br = new BufferedReader(new FileReader("C:\\JAVA\\minProjekt5\\jegyek.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int ID = Integer.parseInt(data[0].trim());
                String tantargy = data[1].trim();
                int jegy = Integer.parseInt(data[2].trim());
                naplo.ujJegy(ID, new Jegy(tantargy, jegy));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        naplo.listazHallgatoiAdatok();
    }
}
