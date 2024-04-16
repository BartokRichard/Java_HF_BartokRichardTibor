package minProjekt4;

public class BankSzamlaTeszt {
    public static void main(String[] args) {
        RegularisSzamla szamla1 = new RegularisSzamla("Kovács János", 50000);
        TakarekSzamla szamla2 = new TakarekSzamla("Nagy Erzsébet", 100000, 1.5);

        szamla1.betesz(15000);
        szamla2.betesz(20000);

        System.out.println(szamla1.kivesz(10000) ? "Sikeres pénzkivétel" : "Sikertelen pénzkivétel");
        System.out.println(szamla2.kivesz(120000) ? "Sikeres pénzkivétel" : "Sikertelen pénzkivétel");

        szamla2.hozzaadKamat();
        System.out.println("Kamat utáni egyenleg (szamla2): " + szamla2.getEgyenleg());

        FolyoSzamla folyoSzamla = new FolyoSzamla("Tóth Béla", 75000);
        folyoSzamla.betesz(5000); 
        folyoSzamla.kivesz(8000); 
        folyoSzamla.kivesz(3000); 

        System.out.println("szamla1 equals szamla2: " + szamla1.equals(szamla2));
        System.out.println("szamla1 equals szamla1: " + szamla1.equals(new RegularisSzamla("Kovács János", 65000)));

        System.out.println("Kovács János betéti tranzakciói:");
        for (Tranzakcio tranzakcio : szamla1.getTranzakciok()) {
            if (tranzakcio.getTranzTipus() == TranzakcioTipus.DEPOSIT) {
                System.out.println(tranzakcio);
            }
        }
        TakarekSzamla takarekSzamla = new TakarekSzamla("Kovács Béla", 100000, 1.2);

        takarekSzamla.betesz(5000);
        System.out.println("5000 egység befizetése után az egyenleg: " + takarekSzamla.getEgyenleg());

        takarekSzamla.kivesz(2000);
        System.out.println("2000 egység kivétele után az egyenleg: " + takarekSzamla.getEgyenleg());

        System.out.println("\nHavi kamatszámítás indul:");
        for (int honap = 1; honap <= 12; honap++) {
            takarekSzamla.hozzaadKamat();
            System.out.println(honap + ". hónap után az egyenleg: " + takarekSzamla.getEgyenleg());
        }

        System.out.println("\nVégső egyenleg 12 hónap kamatszámítás után: " + takarekSzamla.getEgyenleg());
    }
}
