package magazaurunyonetimsıstemi;

import java.util.Scanner;

public class MagazaUrunYonetimSıstemi {

    public static void main(String[] args) {
        System.out.println("Magaza Yonetim Sistemine Hosgeldiniz");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Urun Turu Seciniz : (1-Elektronik , 2-Gida)");
        int secim  = sc.nextInt();
        
        sc.nextLine();
        
        System.out.print("Ürün Adı: ");
        String ad = sc.nextLine();

        System.out.print("Ham Fiyat: ");
        double fiyat = sc.nextDouble();

        System.out.print("Stok Adedi: ");
        int stok = sc.nextInt();
        
        Urun urun = null;
        
        if(secim == 1){
            urun = new Elektronik(ad, fiyat);
        }
        else{
            urun = new Gida(ad,fiyat);
        }
        try {
    urun.setStok(stok);
    System.out.println("\n--- Ürün Kaydı Başarılı ---");
    urun.urunDetaylari(); 

}
        catch (HataliStokIstisnasi e) {  
    System.out.println("\nHATA: " + e.getMessage()); 
}
            
    }   
    
}
