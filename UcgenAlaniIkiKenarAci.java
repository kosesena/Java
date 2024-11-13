
/* Üçgenin Alanı-2:Klavyeden iki kenarı ve derece cinsinden aradaki açısı girilen
üçgenin alanını hesaplayan program */

import java.util.Scanner;

public class UcgenAlaniIkiKenarAci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Kullanıcıdan kenar uzunluklarını ve açı değerini al
        System.out.print("Birinci kenar uzunluğunu giriniz: ");
        double kenar1 = scanner.nextDouble();
        
        System.out.print("İkinci kenar uzunluğunu giriniz: ");
        double kenar2 = scanner.nextDouble();
        
        System.out.print("Aralarındaki açıyı derece cinsinden giriniz: ");
        double aci = scanner.nextDouble();
        
        // Açıyı radyan cinsine çevir
        double radyan = Math.toRadians(aci);
        
        // Alanı hesapla
        double alan = 0.5 * kenar1 * kenar2 * Math.sin(radyan);
        
        // Sonucu yazdır
        System.out.println("Üçgenin alanı: " + alan);
        
        scanner.close();
    }
}
