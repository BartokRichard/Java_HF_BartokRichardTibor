package minProjekt4;

import java.util.ArrayList;


import java.util.List;

class RegularisSzamla implements BankSzamla {
    public double egyenleg;
    private String tulajdonos;
    private String szamlaSzam;
    private static int szamlaSzamlalo = 0;
    private List<Tranzakcio> tranzakciok = new ArrayList<>();

    public RegularisSzamla(String tulajdonos, double kezdoEgyenleg) {
        this.tulajdonos = tulajdonos;
        this.egyenleg = kezdoEgyenleg;
        this.szamlaSzam = ujSzamlaSzam();
    }

    private static synchronized String ujSzamlaSzam() {
        return String.format("REG-%03d", ++szamlaSzamlalo);
    }

    public List<Tranzakcio> getTranzakciok() {
        return tranzakciok;
    }

    @Override
    public void betesz(double osszeg) {
        if (osszeg > 0) {
            egyenleg += osszeg;
            tranzakciok.add(new Tranzakcio(TranzakcioTipus.DEPOSIT, osszeg));
        } else {
            System.out.println("A betesz összegnek pozitívnak kell lennie.");
        }
    }

    @Override
    public boolean kivesz(double osszeg) {
        if (egyenleg >= osszeg && osszeg > 0) {
            egyenleg -= osszeg;
            tranzakciok.add(new Tranzakcio(TranzakcioTipus.WITHDRAW, osszeg));
            return true;
        } else {
            System.out.println("Nincs elegendő fedezet.");
            return false;
        }
    }

    @Override
    public double getEgyenleg() {
        return egyenleg;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Szamla Szam: ").append(szamlaSzam)
          .append("\nTulajdonos: ").append(tulajdonos)
          .append("\nEgyenleg: ").append(String.format("%.2f", egyenleg))
          .append("\nTranzakciók:\n");
        for (Tranzakcio t : tranzakciok) {
            sb.append(t.toString()).append("\n");
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof RegularisSzamla)) return false;
        RegularisSzamla that = (RegularisSzamla) obj;
        return this.tulajdonos.equals(that.tulajdonos) && this.szamlaSzam.equals(that.szamlaSzam);
    }
}
