package minProjekt4;

public class TakarekSzamla extends RegularisSzamla {
    private double kamatRata; // Annual interest rate in percentage

    public TakarekSzamla(String tulajdonos, double kezdoEgyenleg, double kamatRata) {
        super(tulajdonos, kezdoEgyenleg);
        this.kamatRata = kamatRata;
    }

    // Call this method at the end of each month
    public void hozzaadKamat() {
        double haviKamatRate = kamatRata / 12 / 100; // Convert annual rate to a monthly decimal rate
        double interest = getEgyenleg() * haviKamatRate;
        betesz(interest);
        System.out.println("Kamat hozzáadva: " + interest + ", új egyenleg: " + getEgyenleg());
    }

    @Override
    public String toString() {
        return super.toString() + " Kamatráta: " + kamatRata + "%";
    }
}

