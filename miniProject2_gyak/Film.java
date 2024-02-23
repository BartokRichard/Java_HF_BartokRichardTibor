package miniProject2_gyak;

public class Film {
    private String cim;
    private double ar;
    private int[] velemenyek;

    public Film(String cim, double ar) {
        this.cim = cim;
        this.ar = ar;
        this.velemenyek = new int[20];
    }

    public String getCim() {
        return this.cim;
    }


    public double getAr() {
        return this.ar;
    }

    public void setAr(double ar) {
        this.ar = ar;
    }

    public int[] getVelemenyek() {
        return velemenyek;
    }

    public void velemenyezes(int velemeny){
        if (velemeny > 5) {
            System.out.println("A film legnagyobb értékelése 5 lehet!");
        } else {
            if (velemenyek.length < 20) {
                velemenyek[velemenyek.length] = velemeny;
            } else {
                System.out.println("A film már elére a maximális értékelések számát(20)!");
            }
        }
    }

    public double atlag() {
        if (velemenyek.length == 0) {
            System.out.println("Nincs velemeny!");
            return 0.0;
        }
        int osszeg = 0;
        for (int i = 0; i < velemenyek.length; i++){
            osszeg += velemenyek[i];
        }
        return (double)osszeg / velemenyek.length;
    }


    @Override
    public String toString() {
        return "Film cime :" + cim + "Film ara:" + ar;
    }
    

}