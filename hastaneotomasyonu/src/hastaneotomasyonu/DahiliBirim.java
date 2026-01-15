package hastaneotomasyonu;

public class DahiliBirim extends Klinik implements kayit{
    public String birimAdi;

    @Override
    public boolean raporVer(String hastaTC, String birimAd, int hastaYas) {
        if(hastaYas >= 65 && birimAd.equalsIgnoreCase("kardiyoloji")){
            return true;
        }
        return false;
    }

    @Override
    public void raporSorgula(Object hasta) {
        if(raporVer(getHastaTC(),birimAdi,hastaYas)){
            System.out.println(getHastaTC()+" TC numarali hastanin "+ birimAdi);
        }
        else{
            System.out.println(getHastaTC()+" TC numarali hastanin raporu bulunamadi");
        }   
    }
}
