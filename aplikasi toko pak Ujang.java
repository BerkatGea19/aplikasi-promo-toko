import java.util.Scanner;

public class HitungPromoTokoRoti {
  public static void main(String[] args) {
      
      int umur;
      double diskon, berat, total, besarDiskon, bayar;
      
      Scanner sc = new Scanner(System.in);
      System.out.println("Aplikasi Hitung Promo Toko Pak Ujang");
      System.out.println("========================================================");
      
      
      System.out.print("Masukkan umur customer : ");
      umur = sc.nextInt();
      System.out.print("Masukkan berat badan customer : ");
      berat = sc.nextInt();
      System.out.print("Masukkan total belanja customer : ");
      total = sc.nextInt();
      
      if (umur > 50 && total > 50000) {
          diskon = berat / 2;
          besarDiskon = total * (diskon/100);
          System.out.println("Selamat anda mendapat potongan " + diskon + "% dari Rp " + total + " sebesar Rp " + besarDiskon );
          System.out.println("========================================================");

          bayar = total - besarDiskon;
          
          System.out.println("Umur : " + umur + " Tahun");
          System.out.println("Berat badan : " + berat + " Kg");
          System.out.println("Total belanja : Rp " + total );
          System.out.println("Potongan promo : Rp " + besarDiskon );
          System.out.println("Yang harus dibayarkan : Rp" + bayar);
      } else if (umur >= 26 && total > 50000) {
          diskon = berat / 5;
          besarDiskon = total * (diskon/100);
          System.out.println("Selamat anda mendapat potongan " + diskon + "% dari Rp " + total + " sebesar Rp " + besarDiskon);
          System.out.println("========================================================");

          bayar = total - besarDiskon;
          
          System.out.println("Umur : " + umur + " Tahun");
          System.out.println("Berat badan : " + berat + " Kg");
          System.out.println("Total belanja : Rp " + total );
          System.out.println("Potongan promo : Rp " + besarDiskon );
          System.out.println("Yang harus dibayarkan : Rp" + bayar);
      } else if (umur >= 17 && total > 50000) { 
          diskon = berat / 10;
          besarDiskon = total * (diskon/100);
          System.out.println("Selamat anda mendapat potongan " + diskon + "% dari Rp " + total + " sebesar Rp " + besarDiskon);
          System.out.println("========================================================");

          bayar = total - besarDiskon;
          
          
          System.out.println("Umur : " + umur + " Tahun");
          System.out.println("Berat badan : " + berat + " Kg");
          System.out.println("Total belanja : Rp " + total );
          System.out.println("Potongan promo : Rp " + besarDiskon );
          System.out.println("Yang harus dibayarkan : Rp" + bayar);
      } else {
          System.out.println("Anda tidak mendapat potongan harga");
          System.out.println("========================================================");



          System.out.println("Umur : " + umur + " Tahun");
          System.out.println("Berat badan : " + berat + " Kg");
          System.out.println("Total belanja : Rp " + total );
          System.out.println("Potongan promo : Rp 0" );
          System.out.println("Yang harus dibayarkan : Rp" + total);
      }
     
       System.out.println("========================================================");


  }  
}
