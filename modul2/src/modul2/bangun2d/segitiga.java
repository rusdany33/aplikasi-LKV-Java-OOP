package modul2.bangun2d;
import java.util.Scanner;
import modul2.LKbangun2D;

public class segitiga extends LKbangun2D {
    private double alas;
    private double tinggi;
Scanner input = new Scanner(System.in);
    @Override
    public void infoBangun() {
        hitungKeliling();
        hitungLuas();
        System.out.println("--------------------------------------------\n" + 
        "Hasil Bangun segitiga");
        System.out.println("hasil dari keliling segitiga" +getKeliling());
        System.out.println("hasil dari luas segitiga"+getLuas());
        super.infoBangun();
    }

    @Override
    public void hitungLuas() {
        System.out.println("masukkan tinggi :");
        setTinggi(input.nextDouble());
        System.out.println("masukkan Alas :");
        setAlas(input.nextDouble());
        double Luas = 0.5 * getAlas() * getTinggi();
        setLuas(Luas);
        System.out.println("Luas Segitiga :" +getLuas());
        super.hitungLuas();
    }

    @Override
    public void hitungKeliling() {
        System.out.println("masukkan Alas :");
        setAlas(input.nextDouble());
        double Keliling = 3 * getAlas();
        setKeliling(Keliling);
        System.out.println("keliling :" + getKeliling());
        super.hitungKeliling();
    }

    public double getAlas() {
        return alas;
    }
    public void setAlas(double alas) {
        this.alas = alas;
    }
    public double getTinggi() {
        return tinggi;
    }
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
}
