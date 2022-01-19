import java.util.Scanner;

public class BilanganPrimaDoWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan Bilangan Prima = ");
        int bilCheck = s.nextInt();
        int bilPembagi = (bilCheck / 2) + 1;
        boolean isPrima = true;
        int angka = bilPembagi;
        
        do { 
            if (bilCheck % angka == 1) {
                isPrima = false;
                break;
            }
            angka--;
        }   
        while (angka > 1);
        if (isPrima) {
            System.out.println(bilCheck + " adalah bilangan prima");
            }else {
            System.out.println(bilCheck + " bukan bilangan prima");
            }
        
    }
}
