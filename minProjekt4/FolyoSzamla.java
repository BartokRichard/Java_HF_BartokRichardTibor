package minProjekt4;

class FolyoSzamla extends RegularisSzamla {
    private int tranzakciokSzama;
    private static final int INGYENESTRANZSZAMA = 5;
    private static final double TRANZAKCIODIJ = 200;

    public FolyoSzamla(String tulajdonos, double kezdoEgyenleg) {
        super(tulajdonos, kezdoEgyenleg);
        this.tranzakciokSzama = 0;
    }

    @Override
    public void betesz(double osszeg) {
        super.betesz(osszeg);
        tranzakciokSzama++;
        levonKoltseg();
    }

    @Override
    public boolean kivesz(double osszeg) {
        boolean sikeres = super.kivesz(osszeg);
        if (sikeres) {
            tranzakciokSzama++;
            levonKoltseg();
        }
        return sikeres;
    }

    private void levonKoltseg() {
        if (tranzakciokSzama > INGYENESTRANZSZAMA) {
            double levonando = TRANZAKCIODIJ * (tranzakciokSzama - INGYENESTRANZSZAMA);
            if (getEgyenleg() >= levonando) {
                egyenleg -= levonando;
                tranzakciokSzama = 0;
            } else {
                System.out.println("Nem lehet levonni a költséget, nincs elegendő fedezet.");
            }
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        FolyoSzamla that = (FolyoSzamla) obj;
        return super.equals(that) && this.tranzakciokSzama == that.tranzakciokSzama;
    }
}
