package tasityonetimsistemi;

public interface Vehicle {
    
    double yakitHesapla();
    void aracBilgisi();
    void maliyetYazdir();
    
    default void aracTuru(){
        System.out.println("Arac turu secildi");
    }
}
