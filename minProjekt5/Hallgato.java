package minProjekt5;

import java.util.ArrayList;

public class Hallgato {
    private static int nextID = 0;
    private final int ID;
    private final String vezeteknev;
    private final String keresztnev;
    private final ArrayList<Jegy> jegyek;

    public Hallgato(String vezeteknev, String keresztnev) {
        this.ID = nextID++;
        this.vezeteknev = vezeteknev;
        this.keresztnev = keresztnev;
        this.jegyek = new ArrayList<>();
    }

    public int getID() {
        return ID;
    }

    public String getVezeteknev() {
        return vezeteknev;
    }

    public String getKeresztnev() {
        return keresztnev;
    }

    public void ujBejegyzes(Jegy jegy) {
        jegyek.add(jegy);
    }

    public Double tantargyAtlag(String tantargy) {
        int sum = 0;
        int count = 0;
        for (Jegy jegy : jegyek) {
            if (jegy.getTanarNev().equals(tantargy)) {
                sum += jegy.getJegy();
                count++;
            }
        }
        if (count == 0) {
            return 0.0;
        }
        return (double) sum / count;
    }

    public ArrayList<String> getTantargyak() {
        ArrayList<String> tantargyak = new ArrayList<>();
        for (Jegy jegy : jegyek) {
            String tanarNev = jegy.getTanarNev();
            if (!tantargyak.contains(tanarNev)) {
                tantargyak.add(tanarNev);
            }
        }
        return tantargyak;
    }

    public void listazas() {
        System.out.println("Név: " + vezeteknev + " " + keresztnev);
        ArrayList<String> tantargyak = getTantargyak();
        for (String tantargy : tantargyak) {
            Double atlag = tantargyAtlag(tantargy);
            System.out.println(tantargy + ": " + String.format("%.2f", atlag));
        }
    }
}

