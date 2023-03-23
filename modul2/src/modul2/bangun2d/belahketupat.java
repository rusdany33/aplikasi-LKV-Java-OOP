package modul2.bangun2d;

import java.util.Scanner;
import modul2.LKbangun2D;

public class belahketupat extends LKbangun2D {
    private double sisi;
    private double d1;
    private double d2;
    Scanner input = new Scanner(System.in);

    @Override
    public void infoBangun() {
        hitungKeliling();
        hitungLuas();
        System.out.println("hasil dari luas & keliling bangun belah ketupat :" + getLuas() + getKeliling());
        super.infoBangun();
    }

    @Override
    protected void hitungKeliling() {
        double keliling = getSisi();
        keliling = 4 * sisi;
        setKeliling(keliling);
        System.out.println("keliling bangun belah ketupat :" + getKeliling());
        super.hitungKeliling();
    }

    @Override
    protected void hitungLuas() {
        double Luas = getD1() * getD2();
        luas = 0.5 * d1 * d2;
        setLuas(Luas);
        System.out.println("luas bangun belah ketupat :" + getLuas());
        super.hitungLuas();
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getD1() {
        return d1;
    }

    public void setD1(double d1) {
        this.d1 = d1;
    }

    public double getD2() {
        return d2;
    }

    public void setD2(double d2) {
        this.d2 = d2;
    }

}
