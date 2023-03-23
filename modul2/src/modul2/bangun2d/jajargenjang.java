package modul2.bangun2d;

import java.util.Scanner;
import modul2.LKbangun2D;

public class jajargenjang extends LKbangun2D {
    private double alas;
    private double tinggi;
    private double miring;
    Scanner input = new Scanner(System.in);

    @Override
    public void infoBangun() {
        hitungKeliling();
        hitungLuas();
        System.out.println("hasil dari keliling jajar genjang :"+getKeliling());
        System.out.println("hasil dari luas jajar genjang :" +getLuas());
        super.infoBangun();
    }

    @Override
    protected void hitungKeliling() {
        double Keliling;
        System.out.println("masukkan alas :");
        setAlas(input.nextDouble());
        System.out.println("masukkan miring :");
        setMiring(input.nextDouble());
        Keliling = 2 * (alas + miring);
        setKeliling(Keliling);
        System.out.println("keliling :" + getKeliling());
        super.hitungKeliling();
    }

    @Override
    protected void hitungLuas() {
        double luas;
        System.out.println("masukkan alas :");
        setAlas(input.nextDouble());
        System.out.println("masukkan tinggi :");
        setTinggi(input.nextDouble());
        luas = alas * tinggi;
        setLuas(luas);
        System.out.println("luas :"+ getLuas());
        super.hitungLuas();
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

    public double getMiring() {
        return miring;
    }

    public void setMiring(double miring) {
        this.miring = miring;
    }
}
