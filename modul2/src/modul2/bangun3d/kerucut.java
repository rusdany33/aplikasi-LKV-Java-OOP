package modul2.bangun3d;
import java.util.Scanner;
import modul2.LKbangun3D;

public class kerucut extends LKbangun3D{
    private double jarijari;
    private double tinggi;
    Scanner input = new Scanner(System.in);
    @Override
    public void infoBangun() {
        hitungVolume();
        System.out.println("--------------------------------------------\n" + 
        "Hasil Bangun Balok");
        System.out.println("volume kerucut " + getVolume());
        super.infoBangun();
    }
    @Override
    public void hitungVolume() {
        System.out.println("masukkan jari-jari :");
        setJarijari(input.nextDouble());
        System.out.println("masukkan tinggi :");
        setTinggi(input.nextDouble());
        double volum = (1.0/3.0) * (Math.PI *getJarijari()*getJarijari())* getTinggi();
        volum = (1.0/3.0) * (Math.PI *jarijari*jarijari)* tinggi;
        setVolume(volum);
        super.hitungVolume();
    }

    public double getJarijari() {
        return jarijari;
    }
    public void setJarijari(double jarijari) {
        this.jarijari = jarijari;
    }
    public double getTinggi() {
        return tinggi;
    }
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

}
