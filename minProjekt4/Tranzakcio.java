package minProjekt4;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Tranzakcio {
    private LocalDateTime idopont;
    private TranzakcioTipus tranzTipus;
    private double osszeg;

    public Tranzakcio(TranzakcioTipus tranzTipus, double osszeg) {
        this.idopont = LocalDateTime.now();
        this.tranzTipus = tranzTipus;
        this.osszeg = osszeg;
    }

    public TranzakcioTipus getTranzTipus() {
        return tranzTipus;
    }
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return String.format("%s - %s: %.2f", idopont.format(formatter), tranzTipus, osszeg);
    }
}

enum TranzakcioTipus {
    DEPOSIT, WITHDRAW
}