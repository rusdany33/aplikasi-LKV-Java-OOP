package modul2.bangun2d;
import java.util.Scanner;
import modul2.LKbangun2D;

public class lingkaran extends LKbangun2D{
    private double jarijari;
    Scanner input = new Scanner(System.in);
     @Override
    public void infoBangun() {
         hitungKeliling();
         hitungLuas();
         System.out.println("hasil dari keliling lingkaran :"+getKeliling());
         System.out.println("hasil dari luas :"+getLuas());
         super.infoBangun();
     }
     @Override
     protected void hitungKeliling() {
         double Keliling;
         System.out.println("masukkan jari jari");
         setJarijari(input.nextDouble());
         Keliling = 2* Math.PI * jarijari;
         setKeliling(Keliling);
         System.out.println("keliling lingkaran:" + getKeliling());

         super.hitungKeliling();
     }
     @Override
     protected void hitungLuas() {
         double Luas;
         System.out.println("masukkan jari-jari ");
         setJarijari(input.nextDouble());
         Luas = 2* Math.PI * Math.pow(jarijari, 2);
         setLuas(Luas);
         System.out.println("luas lingkaran:" +getLuas());
         super.hitungLuas();
     }

    public double getJarijari() {
        return jarijari;
    }

    public void setJarijari(double jarijari) {
        this.jarijari = jarijari;
    }

}
