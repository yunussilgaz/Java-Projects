package hastaneotomasyonu;

import java.util.Scanner;

public class Hastaneotomasyonu { 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Birim adini giriniz (Orn: kardiyoloji, genel cerrahi):");
        String birim = sc.nextLine(); 

        System.out.println("Hasta TC numarasini giriniz:");
        String hastaTC = sc.nextLine();
        
        System.out.println("Hasta adini giriniz:");
        String hastaAdi = sc.nextLine();
        
        System.out.println("Hasta yasini giriniz:");
        int hastaYas = sc.nextInt();
        
        Klinik hasta = null;
        kayit kayitIslemleri = null;

        if (birim.toLowerCase().contains("cerrahi")) {
            CerrahiBirim cerrahiHasta = new CerrahiBirim();
            cerrahiHasta.birimAdi = birim;
            cerrahiHasta.hastaIsim = hastaAdi;
            cerrahiHasta.hastaYas = hastaYas;  
            
            hasta = cerrahiHasta;
            kayitIslemleri = cerrahiHasta;
            
        } else {
            DahiliBirim dahiliHasta = new DahiliBirim();
            dahiliHasta.birimAdi = birim;
            dahiliHasta.hastaIsim = hastaAdi; 
            dahiliHasta.hastaYas = hastaYas;  
            
            hasta = dahiliHasta;
            kayitIslemleri = dahiliHasta;
        }

        try {
            hasta.setHastaTC(hastaTC); 
            
            kayitIslemleri.raporSorgula(hasta);

        } catch (GecersizTCIstisnasi e) {
            System.out.println(e.getMessage());
        }
    }
}