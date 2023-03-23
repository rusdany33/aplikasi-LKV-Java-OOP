package modul2.bangun2d;

import java.util.Scanner;
import modul2.LKbangun2D;

public class persegi extends LKbangun2D {
    private double sisi;
    Scanner input = new Scanner(System.in);

    @Override
    public void infoBangun() {
       hitungKeliling();
       hitungLuas();
       System.out.println("hasil dari keliling persegi :"+getKeliling());
       System.out.println("hasil dari luas persegi"+getLuas());
        super.infoBangun();
    }

    @Override
    protected void hitungKeliling() {
        double Keliling;
        System.out.println("masukkan sisi :");
        setSisi(input.nextDouble());
        Keliling = 4 * sisi;
        setSisi(Keliling);
        System.out.println("keliling persegi :" + getKeliling());
        super.hitungKeliling();
    }

    @Override
    protected void hitungLuas() {
        double Luas;
        System.out.println("masukkan sisi :");
        setSisi(input.nextDouble());
        Luas = sisi * sisi;
        setLuas(Luas);
        System.out.println("luas persegi :" + getLuas());
        super.hitungLuas();
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

}
