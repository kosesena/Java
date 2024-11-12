
/* Girilen birbirinden farklı üç sayıyı küçükten büyüğe doğru sıralayan program */

import java.util.Scanner;

public class SayiSirala {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        int sayi1 = scanner.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = scanner.nextInt();

        System.out.print("Üçüncü sayıyı giriniz: ");
        int sayi3 = scanner.nextInt();

        int enKucuk, orta, enBuyuk;

        // Sayıları karşılaştırarak sıralama
        if (sayi1 < sayi2 && sayi1 < sayi3) {
            enKucuk = sayi1;
            if (sayi2 < sayi3) {
                orta = sayi2;
                enBuyuk = sayi3;
            } else {
                orta = sayi3;
                enBuyuk = sayi2;
            }
        } else if (sayi2 < sayi1 && sayi2 < sayi3) {
            enKucuk = sayi2;
            if (sayi1 < sayi3) {
                orta = sayi1;
                enBuyuk = sayi3;
            } else {
                orta = sayi3;
                enBuyuk = sayi1;
            }
        } else {
            enKucuk = sayi3;
            if (sayi1 < sayi2) {
                orta = sayi1;
                enBuyuk = sayi2;
            } else {
                orta = sayi2;
                enBuyuk = sayi1;
            }
        }

        System.out.println("Sayıların küçükten büyüğe sıralaması: " + enKucuk + ", " + orta + ", " + enBuyuk);

        scanner.close();
    }
}