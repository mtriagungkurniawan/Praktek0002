package praktek0002;

public class KainAksi {
   public static void main(String[] args){    
     Kain r1 = new Kain();
     r1.panjang = 5;
     r1.lebar   = 4;
   
     r1.cetakinfo();
     System.out.println("Luas kain = "+r1.hitungUkuran());
     r1.cetakUkuran();
   
     Kain r2 = new Kain();
     r2.cetakinfo();
     
     Kain r3 = new Kain(60,20);
     r3.cetakinfo();
   
     }
}