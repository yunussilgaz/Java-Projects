package personalmanagementsystem;

import java.util.Scanner;


public class PartTimeEmployee implements employee {
    private double saatlik_ucret;
    private double prim;
    private int calisma_saati;

    public PartTimeEmployee(double saatlik_maas,double saat){
        this.calisma_saati = calisma_saati;
        this.prim = 0;
        this.saatlik_ucret = saatlik_ucret;
    }
    
    @Override
    public double maasHesapla() {
        return saatlik_ucret * calisma_saati;
    }

    @Override
    public double primHesapla() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Fazla mesai yapilan saati girin");
        int fazla_saat = sc.nextInt();
        System.out.println("Saatlik ucreti girin");
        double ucret = sc.nextDouble();
        prim = ucret * fazla_saat;
        return 0;
    }

    @Override
    public void maasYazdir() {
       double toplam_maas = prim + maasHesapla();
       System.out.println("Toplam maas = "+toplam_maas);
    }

    @Override
    public void calisanTurunuYazdir() {
        System.out.println("Part time calisandir");
    }
    
}