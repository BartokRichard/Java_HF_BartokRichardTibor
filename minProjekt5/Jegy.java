package minProjekt5;

    // Keszitse el a Jegy osztalyt ugy, hogy ez egysegbe zarja a tanar nevet (String), illetve a hozza tartozo jegyet (int). A Jegy osztaly peldanyai nem valtoztathatjak meg az allapotuk (imnutable). Keszitsen egy ketparameteres konstruktort, getter metosusokkal illetve egy toString metodussal
public class Jegy {
    private final String tanarNev;
    private final int jegy;

    public Jegy(String tanarNev, int jegy) {
        this.tanarNev = tanarNev;
        this.jegy = jegy;
    }

    public String getTanarNev() {
        return tanarNev;
    }

    public int getJegy() {
        return jegy;
    }

    @Override
    public String toString() {
        return "Tanár neve: " + tanarNev + ", Jegy: " + jegy;
    }
}
