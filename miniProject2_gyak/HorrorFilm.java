package miniProject2_gyak;

public class HorrorFilm extends Film implements IKorhataros {
    private int korh;

    public HorrorFilm(String cim, double ar, int korh) {
        super(cim, ar);
        this.korh = korh;
    }

    public int Korhatar() {
        return korh;
    }

    public int Buntetes(int eletkor) {
        if (eletkor - korh < 0) {
            return Math.abs(eletkor - korh) * (int) getAr();
        } else {
            return 0;
        }
    }


    @Override
    public String toString() {
        return super.toString() + ", Korhatar: " + korh;
    }
}
