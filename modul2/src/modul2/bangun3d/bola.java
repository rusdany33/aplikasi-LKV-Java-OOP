package modul2.bangun3d;
import java.util.Scanner;
import modul2.LKbangun3D;

public class bola extends LKbangun3D{
    private double jarijari;
    Scanner input = new Scanner(System.in);

   
    @Override
    public void infoBangun() {
        System.out.println("--------------------------------------------\n" + 
        "Hasil Bangun Balok");
        System.out.println("volume bola :" + getJarijari());
        super.infoBangun();
    }
    @Override
    public void hitungVolume() {
        System.out.println("masukkan jari-jari");
        setJarijari(input.nextDouble());
        double phi = getJarijari();
        phi = 4 * Math.PI * jarijari * jarijari * jarijari; 
        setJarijari(phi);
        super.hitungVolume();
    }

    public double getJarijari() {
        return jarijari;
    }
    public void setJarijari(double jarijari) {
        this.jarijari = jarijari;
    }
}
