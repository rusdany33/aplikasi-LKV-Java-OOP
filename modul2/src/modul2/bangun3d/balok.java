package modul2.bangun3d;

import modul2.LKbangun3D;
import java.util.Scanner;

public class balok extends LKbangun3D {
    private double panjang;
    private double lebar;
    private double tinggi;
    Scanner input = new Scanner(System.in);

    @Override
    public void infoBangun() {
        hitungVolume();
        System.out.println("--------------------------------------------\n" + 
        "Hasil Bangun Balok");
        System.out.println("panjang :" +getPanjang()+"lebar :"+getLebar()+"tinggi :"+getTinggi());
        System.out.println("volume dari balok tersebut :" +getVolume());
        super.infoBangun();  
    }
    @Override
    public void hitungVolume() {
        System.out.print("panjang :");
        setPanjang(input.nextDouble());
        System.out.print("lebar :");
        setLebar(input.nextDouble());
        System.out.print("tinggi :" );
        setTinggi(input.nextDouble());
        super.infoBangun();
        double volum = getPanjang()*getLebar()*getTinggi();
        volum = panjang*lebar*tinggi;
        setVolume(volum);
    }
    public double getPanjang() {
        return panjang;
    }
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }
    public double getLebar() {
        return lebar;
    }
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    public double getTinggi() {
        return tinggi;
    }
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

}
