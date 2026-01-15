package personalmanagementsystem;

import java.util.Scanner;

public class FullTimeEmployee implements employee {
    private double aylik_maas;
    private double prim;
    
    public FullTimeEmployee(double aylik_maas){
        this.aylik_maas = aylik_maas;
        this.prim = 0;
    }

    @Override
    public double maasHesapla() {
        return aylik_maas;
    }

    @Override
    public double primHesapla() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mesai gununu giriniz:");
        int mesaiGun = sc.nextInt();
        System.out.println("Gunluk mesai ucretini girin:");
        int mesaiUcret = sc.nextInt();   
        prim = mesaiGun*mesaiUcret;
        return prim;
    }

    @Override
    public void maasYazdir() {
        double toplam_maas = aylik_maas+prim;
        System.out.println("Toplam maas = "+toplam_maas);
    }

    @Override
    public void calisanTurunuYazdir() {
        System.out.println("Bu bir tam zamanli calisandir");
    }
  
}