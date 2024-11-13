
/*  Üçgenin Alanı-1 : Klavyeden bir kenar uzunluğu ve o kenara ait yüksekliği girilen
                üçgenin alanını hesaplayan program   */

import java.util.Scanner;

public class UcgenAlaniTabanYukseklik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Kullanıcıdan taban ve yükseklik değerlerini al
        System.out.print("Üçgenin taban uzunluğunu giriniz: ");
        double taban = scanner.nextDouble();
        
        System.out.print("Üçgenin yüksekliğini giriniz: ");
        double yukseklik = scanner.nextDouble();
        
        // Alanı hesapla
        double alan = (taban * yukseklik) / 2;
        
        // Sonucu yazdır
        System.out.println("Üçgenin alanı: " + alan);
        
        scanner.close();
    }
}
