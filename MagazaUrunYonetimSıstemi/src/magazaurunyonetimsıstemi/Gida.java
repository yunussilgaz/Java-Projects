package magazaurunyonetimsıstemi;

public class Gida extends Urun implements ISatis{

    public Gida(String urunAdi, double hamFiyat) {
        super(urunAdi, hamFiyat);
    }

    @Override
    public double satisFiyatiHesapla() {
        return (hamFiyat*101)/100;

    }

    @Override
    public void urunDetaylari() {
        System.out.println("Urun adi = "+urunAdi);
        
        System.out.println("Stok adedi = "+getStok());
        
        System.out.println("Satis Fiyati = "+satisFiyatiHesapla());
        
    } 
}
