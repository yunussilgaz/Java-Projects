package magazaurunyonetimsıstemi;

public class Elektronik extends Urun implements ISatis{

    public Elektronik(String urunAdi, double hamFiyat) {
        super(urunAdi, hamFiyat);
    }
   

    @Override
    public double satisFiyatiHesapla() {
        return (hamFiyat*120)/100;
    }

    @Override
    public void urunDetaylari() {
        System.out.println("Urun adi = "+urunAdi);
        
        System.out.println("Stok adedi = "+getStok());
        
        System.out.println("Satis Fiyati = "+satisFiyatiHesapla());
        
        
    }
    
    
    
}
