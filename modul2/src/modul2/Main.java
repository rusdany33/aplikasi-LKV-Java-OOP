package modul2;
import modul2.bangun2d.*;
import modul2.bangun3d.*;
import java.util.Scanner;

public class Main {
    public static void hitung2D(){

        Scanner input = new Scanner(System.in);
            segitiga tigasegi = new segitiga();
            persegipanjang sinjang = new persegipanjang();
            belahketupat bepat = new belahketupat();
            persegi segi = new persegi();
            lingkaran ling = new lingkaran();
            jajargenjang jargen = new jajargenjang();
        
            System.out.println("pilih bangun 2 Dimensi");
            System.out.println("1.segitiga");
            System.out.println("2.persegi panjang");
            System.out.println("3.belah ketupat");
            System.out.println("4.persegi");
            System.out.println("5.lingkaran");
            System.out.println("6.jajar genjang");
            System.out.println("pilihan anda :");
            int pilihan2d = input.nextInt();
            switch(pilihan2d){
                case 1 :
                tigasegi.infoBangun();
                break;
                case 2:
                sinjang.infoBangun();
                break;
                case 3:
                bepat.infoBangun();
                break;
                case 4:
                segi.infoBangun();
                break;
                case 5:
                ling.infoBangun();
                break;
                case 6:
                jargen.infoBangun();
                break;
            }
            input.close();
    }
    public static void hitung3D(){
        Scanner input = new Scanner(System.in); 
            balok kotak = new balok();
            kubus bus = new kubus();
            bola bal = new bola();
            kerucut cut = new kerucut();
            tabung bung = new tabung();
            System.out.println("Pilih bangun 3 dimensi:");
            System.out.println("1. Balok");
            System.out.println("2. kubus");
            System.out.println("3. bola");
            System.out.println("4. kerucut");
            System.out.println("5. tabung");
            System.out.print("Pilihan anda : ");
            int pilihan3d = input.nextInt();
                    switch(pilihan3d){
                        case 1: 
                        kotak.infoBangun();
                        break;
                        case 2:
                        bus.infoBangun();
                        case 3:
                        bal.infoBangun();
                        case 4:
                        cut.infoBangun();
                        case 5:
                        bung.infoBangun();
                    }
                    input.close();
        }
    
    public static void main(String[] args) {
        int menu = 0;
        Scanner pilihMenu = new Scanner(System.in);
            System.out.println("selamat di modul kontol :");
            do{
                System.out.println("list menu :");
                System.out.println("1. menghitung LK bangun2D\n" + 
                                   "2. menghitung Lk bangun3D");
                                   System.out.print("silahkan pilih :");
                menu = pilihMenu.nextInt();
                switch (menu){
                    case 1:
                   hitung2D();
                   break;
                    case 2:
                    hitung3D();
                    break;
                }
            }while (menu < 0);
            pilihMenu.close();
        }
   }
