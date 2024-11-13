
/* Üçgenin Alanı - Heron Formülü: Klavyeden tüm kenar uzunlukları girilen üçgenin
alanını hesaplayan program */

import java.util.Scanner;

public class UcgenAlaniHeronFormulu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Kullanıcıdan üç kenar uzunluğunu al
        System.out.print("Birinci kenar uzunluğunu giriniz: ");
        double a = scanner.nextDouble();
        
        System.out.print("İkinci kenar uzunluğunu giriniz: ");
        double b = scanner.nextDouble();
        
        System.out.print("Üçüncü kenar uzunluğunu giriniz: ");
        double c = scanner.nextDouble();
        
        // Yarı çevreyi hesapla
        double s = (a + b + c) / 2;
        
        // Alanı Heron formülü ile hesapla
        double alan = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        
        // Sonucu yazdır
        System.out.println("Üçgenin alanı: " + alan);
        
        scanner.close();
    }
}
