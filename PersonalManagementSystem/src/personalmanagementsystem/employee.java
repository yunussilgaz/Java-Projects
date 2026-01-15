package personalmanagementsystem;

public interface employee {
    
    double maasHesapla();
    double primHesapla();
    void maasYazdir();
    
    default void calisanTurunuYazdir(){
        System.out.println("Bu bir calisandir");
    }
    
    
}
