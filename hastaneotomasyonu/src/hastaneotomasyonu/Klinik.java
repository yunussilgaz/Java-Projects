package hastaneotomasyonu;

public class Klinik {
    public String hastaIsim;
    public int hastaYas;
    private String hastaTC;
    
    public void setHastaTC(String hastaTC) throws GecersizTCIstisnasi{
        if(hastaTC.length()!=11){
            throw new GecersizTCIstisnasi("Gecersiz TC Numarasi");
        }
        this.hastaTC = hastaTC;
    }
    public String getHastaTC(){
        return this.hastaTC;
}
}
