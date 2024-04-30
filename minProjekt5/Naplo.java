package minProjekt5;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Naplo {
    private final ArrayList<Hallgato> hallgatok;

    public Naplo(String csvFile) {
        this.hallgatok = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String vezeteknev = data[0].trim();
                String keresztnev = data[1].trim();
                Hallgato hallgato = new Hallgato(vezeteknev, keresztnev);
                hallgatok.add(hallgato);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void ujJegy(int ID, Jegy jegy) {
        for (Hallgato hallgato : hallgatok) {
            if (hallgato.getID() == ID) {
                hallgato.ujBejegyzes(jegy);
                break;
            }
        }
    }

    public void listazHallgatoiAdatok() {
        for (Hallgato hallgato : hallgatok) {
            System.out.println("Név: " + hallgato.getVezeteknev() + " " + hallgato.getKeresztnev());
            ArrayList<String> tantargyak = hallgato.getTantargyak();
            for (String tantargy : tantargyak) {
                Double atlag = hallgato.tantargyAtlag(tantargy);
                System.out.println(tantargy + ": " + String.format("%.2f", atlag));
            }
            System.out.println();
        }
    }
}