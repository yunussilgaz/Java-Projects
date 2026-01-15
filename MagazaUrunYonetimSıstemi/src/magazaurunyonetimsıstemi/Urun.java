package magazaurunyonetimsıstemi;

abstract class Urun implements ISatis {

    String urunAdi;
    double hamFiyat;
    private int stokAdedi;
    
    public Urun(String urunAdi, double hamFiyat){
        this.hamFiyat = hamFiyat;
        this.urunAdi = urunAdi;   
    }
    public void setStok(int miktar) throws HataliStokIstisnasi{
        if(miktar<0){
            throw new HataliStokIstisnasi("Stok degeri negatif olamaz");
        }
        this.stokAdedi = stokAdedi;
    } 
    public int getStok(){
        return stokAdedi;
    }      
}

