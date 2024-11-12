/* Girilen üç adet sayıdan en büyüğünü bulan program */

import java.util.Scanner;

public class EnBuyukSayiBul {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        int sayi1 = scanner.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = scanner.nextInt();

        System.out.print("Üçüncü sayıyı giriniz: ");
        int sayi3 = scanner.nextInt();

        // En büyük sayıyı bulma
        int enBuyuk = sayi1;

        if (sayi2 > enBuyuk) {
            enBuyuk = sayi2;
        }

        if (sayi3 > enBuyuk) {
            enBuyuk = sayi3;
        }

        System.out.println("Girilen sayılardan en büyüğü: " + enBuyuk);

        scanner.close();
    }
}