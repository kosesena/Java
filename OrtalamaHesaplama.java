
/* Klavyeden girilen 5 adet sayının ortalamasını bulan program */

import java.util.Scanner;

public class OrtalamaHesaplama {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int toplam = 0;

        for (int i = 1; i <= 5; i++) {
            
            System.out.print(i + ". sayıyı girin: ");
            
            int sayi = scanner.nextInt();
            
            toplam += sayi;
        }

        double ortalama = toplam / 5.0;
        
        System.out.println("Ortalama: " + ortalama);
    }
}