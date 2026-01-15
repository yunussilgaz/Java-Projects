package hastaneotomasyonu;

public class CerrahiBirim extends Klinik implements kayit{
    String birimAdi;

    @Override
    public boolean raporVer(String hastaTC, String birimAd, int hastaYas) {
        if(hastaYas>=65 && birimAd.equalsIgnoreCase("Genel Cerrahi")){
            return true;
        }
        return false;
    }

    @Override
    public void raporSorgula(Object hasta) {
        if(raporVer(getHastaTC(),birimAdi,hastaYas)){
            System.out.println(getHastaTC()+" TC kimlik numarali hastanin "+birimAdi);
        }
        else{
            System.out.println(getHastaTC()+" TC kimlik numarali hastanin raporu bulunamadi");
    }
   }
    
}
