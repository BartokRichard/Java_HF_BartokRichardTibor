package miniProjekt3;

public class Film {
    private String cim;
    private double ar;
    private int[] velemenyek;
    
    public Film(String cim, double ar) {
        this.cim = cim;
        this.ar = ar;
        this.velemenyek = new int[20];
    }

    public String getCim(){
        return cim; 
    }

    public double getAr(){
        return ar;
    }

    public void setAr(double ar){
        this.ar = ar;
    }

    public void Velemenyezes(int velemeny) {
        if (velemeny > 5 || velemeny < 1) {
            System.out.println("Hibás bemeneti adat!");
            return;
        }
        
        boolean hozzadva = false;
        for (int i = 0; i < velemenyek.length; i++) {
            if (velemenyek[i] == 0) {
                velemenyek[i] = velemeny;
                hozzadva = true;
                break;
            }
        }
        
        if (!hozzadva) {
            System.out.println("A maximum vélemények száma elérve!");
        }
    }
    

    public double Atlag() {
        int osszeg = 0;
        int db = 0;
        for (int i = 0; i < velemenyek.length; i++) {
            if (velemenyek[i] != 0) {
                osszeg += velemenyek[i];
                db++;
            } else {
                System.out.println("Nincs velemeny");
                break;
            }
        }
        return (double)osszeg / db;
    }
    @Override
    public String toString() {
        return "Film cime: " + cim + "Film ara: " + ar;
    }
 
}