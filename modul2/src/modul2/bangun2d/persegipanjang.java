package modul2.bangun2d;

import modul2.LKbangun2D;
import java.util.Scanner;

public class persegipanjang extends LKbangun2D {
    private double panjang;
    private double lebar;
    Scanner input = new Scanner(System.in);
    @Override
    public void infoBangun() {
       hitungKeliling();
       hitungLuas();
       System.out.println("hasil dari luas persegi panjang :" + getLuas());
       System.out.println("hasil dari keliling persegi panjang :" + getKeliling());
        super.infoBangun();
    }
    @Override
    protected void hitungLuas() {
        System.out.println("masukkan panjang :");
        setPanjang(input.nextDouble());
        System.out.println("masukkan lebar :");
        setLebar(input.nextDouble());
        double Luas = getLebar()+getPanjang();
        Luas = panjang * lebar;
        setLuas(Luas);
        super.hitungLuas();
    }
    @Override
    protected void hitungKeliling() {
        System.out.println("masukkan panjang");
        setPanjang(input.nextDouble());
        System.out.println("masukkan lebar :");
        setLebar(input.nextDouble());
        double keliling = getPanjang()+getLebar();
        keliling = 2*(panjang * lebar);
        setKeliling(keliling);
        super.hitungKeliling();
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
    public Scanner getInput() {
        return input;
    }
    public void setInput(Scanner input) {
        this.input = input;
    }
    
    

}
