package modul2.bangun3d;
import java.util.Scanner;
import modul2.LKbangun3D;

public class kubus extends LKbangun3D {
    private double rusuk;
    Scanner input = new Scanner(System.in);
    @Override
    public void infoBangun() {
        hitungVolume();
        System.out.println("--------------------------------------------\n" + 
        "Hasil Bangun Balok");
        System.out.println("volum dari kubus :" + getVolume());
        super.infoBangun();
    }
    @Override
    public void hitungVolume() {
        System.out.println("masukkan rusuk");
        setRusuk(input.nextDouble());
        double volum = getRusuk();
        volum = rusuk * rusuk * rusuk;
        setVolume(volum);
        super.hitungVolume();
    }

    public double getRusuk() {
        return rusuk;
    }
    public void setRusuk(double rusuk) {
        this.rusuk = rusuk;
    }
}
