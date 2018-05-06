package praktek0002;
public class Kain {
    double panjang;
    double lebar;
    
       public Kain() {
        panjang=5;
        lebar=2;
    }
    
    void cetakinfo() {
        System.out.println("====================");
        System.out.println("Panjang : "+panjang);
        System.out.println("Lebar :"+lebar);
        System.out.println("====================");
    }
     double hitungUkuran(){
        double ukuran;
        ukuran=panjang*lebar;
        return ukuran;
     }      
         void cetakUkuran(){
         System.out.println("Luasnya adalah: "+hitungUkuran());
    }
}
    
  
}
        
    
   
