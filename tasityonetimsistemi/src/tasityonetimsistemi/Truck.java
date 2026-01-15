package tasityonetimsistemi;

public class Truck implements Vehicle {
    private double km;
    private double litreFiyat;
    
    public Truck(double km,double litreFiyat){
        this.km = km;
        this.litreFiyat = litreFiyat;
    }

    @Override
    public double yakitHesapla() {
        return (km/5)*litreFiyat;
    }

    @Override
    public void aracBilgisi() {
        System.out.println("Aracini Kamyon");
    }

    @Override
    public void maliyetYazdir() {
        System.out.println("Toplam maliyet = "+yakitHesapla()+"Tl");
        
    }

    @Override
    public void aracTuru() {
        System.out.println("Kamyon aracı secildi");
        
    }
    
}
