package miniProjekt3;

import miniProject2_gyak.IKorhataros;

public class HorrorFilm extends Film implements IKorhataros{

    private int korh;
    
    public HorrorFilm(String cim, double ar, int korh) {
        super(cim, ar);
        this.korh = korh;
    }

    @Override
    public int Korhatar() {
        return korh;
    }

    @Override
    public int Buntetes(int eletkor) {
        if (eletkor - korh < 0) {
            return Math.abs(eletkor - korh) * (int) getAr();
        } else {
            return 0;
        }
    }
    public String toString() {
        return super.toString() + ", Korhatar: " + korh;
    }

  
}
