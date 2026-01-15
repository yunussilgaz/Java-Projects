package tasityonetimsistemi;

import java.util.Scanner;

public class Car implements Vehicle{
    private double km;
    private double litreFiyat;
    
    public Car(double km , double litreFiyat){
        this.km = km;
        this.litreFiyat = litreFiyat;
    }
    @Override
    public double yakitHesapla() {
        return (km/15)*litreFiyat;
    }
 

    @Override
    public void aracBilgisi() {
        System.out.println("Bu bir otomobildir");
    }

    @Override
    public void maliyetYazdir() {
        System.out.println("Arabayla yakit maliyeti = "+yakitHesapla()+"Tl");
        
    }

    @Override
    public void aracTuru() {
        System.out.println("Araba secildi");
        
    }
    
    
}
