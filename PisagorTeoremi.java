
/* Pisagor Teoremi:Klavyeden dik kenarlarının uzunluğu verilen bir üçgende, hipotenüsün
uzunluğunu bulan programı satır kod ve akış diyagramı olarak ifade ediniz. */

import java.util.Scanner;

public class PisagorTeoremi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Kullanıcıdan dik kenar uzunluklarını al
        System.out.print("Birinci dik kenar uzunluğunu giriniz: ");
        double a = scanner.nextDouble();
        
        System.out.print("İkinci dik kenar uzunluğunu giriniz: ");
        double b = scanner.nextDouble();
        
        // Hipotenüsü hesapla
        double hipotenus = Math.sqrt((a * a) + (b * b));
        
        // Sonucu yazdır
        System.out.println("Hipotenüs uzunluğu: " + hipotenus);
        
        scanner.close();
    }
}