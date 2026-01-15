package tasityonetimsistemi;

import java.util.Scanner;

public class Tasityonetimsistemi {

    public static void main(String[] args) {
        System.out.println("Tasit Yonetimi Sistemine Hosgeldiniz");
        System.out.println("Arac Turunu Seciniz:");
        System.out.println("1-)Araba\n2-)Kamyon");
        Scanner sc = new Scanner(System.in);
        int secim = sc.nextInt();
        
        if(secim == 1){
            System.out.println("Araba secenegi secildi");
            System.out.println("Yapilan km degerini giriniz");
            double km = sc.nextDouble();
            System.out.println("Benzinin litre fiyatini giriniz:");
            double litreFiyat = sc.nextDouble();
            Car c1 = new Car(km,litreFiyat);    
            c1.maliyetYazdir();    
        }
        if(secim == 2){
            System.out.println("Kamyon secenegi secildi");
            System.out.println("Yapilan km degerini giriniz");
            double km = sc.nextDouble();
            System.out.println("Benzinin litre fiyatini giriniz:");
            double litreFiyat = sc.nextDouble();
            Truck t1 = new Truck(km,litreFiyat);   
            t1.maliyetYazdir();    
        
        }
        else{
            System.out.println("Gecersiz secim yapildi");
        }
    }
    
}
