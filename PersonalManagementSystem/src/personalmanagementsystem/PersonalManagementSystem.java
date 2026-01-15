package personalmanagementsystem;

import java.util.Scanner;

public class PersonalManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Personel Yonetim Sistemine Hosgeldiniz");
        System.out.println("1-) Tam Zamanli Calisan");
        System.out.println("2-) Saatlik Calisan");
        System.out.print("Lutfen calisan turunu seciniz: ");
        int secim = sc.nextInt();

        if (secim == 1) {
            System.out.println("Tam zamanli calisan secildi");
            System.out.print("Maas miktarini girin: ");
            double maas = sc.nextDouble();

            FullTimeEmployee e1 = new FullTimeEmployee(maas);
            e1.calisanTurunuYazdir();
            System.out.println("Hesaplanan maas = " + e1.maasHesapla());

            System.out.print("Prim var mi? (1-Evet, 2-Hayir): ");
            int primVarmi = sc.nextInt();

            if (primVarmi == 1) {
                e1.primHesapla();
            }

            e1.maasYazdir();
        } 
        else if (secim == 2) {
            System.out.println("Saatlik calisan secildi");
            System.out.print("Saatlik ucreti girin: ");
            double saat_ucret = sc.nextDouble();
            System.out.print("Kac saat calisildi: ");
            int saat = sc.nextInt();

            PartTimeEmployee e2 = new PartTimeEmployee(saat_ucret, saat);

            e2.calisanTurunuYazdir();
            System.out.println("Hesaplanan maas = " + e2.maasHesapla());

            System.out.print("Prim var mi? (1-Evet, 2-Hayir): ");
            int primVarMi = sc.nextInt();
            if (primVarMi == 1) {
                e2.primHesapla();
            }

            e2.maasYazdir();
        } 
        else {
            System.out.println("Gecersiz secim yaptiniz!");
        }

        sc.close();
    }
}
