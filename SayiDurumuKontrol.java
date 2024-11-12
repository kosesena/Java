
/* Klavyeden girilen bir tamsayının pozitif,negatif veya sıfır olduğunu tespit eden program */

import java.util.Scanner;

public class SayiDurumuKontrol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir tamsayı giriniz: ");
        int sayi = scanner.nextInt();

        if (sayi > 0) {
            System.out.println("Girdiğiniz sayı pozitiftir.");
        } else if (sayi < 0) {
            System.out.println("Girdiğiniz sayı negatiftir.");
        } else {
            System.out.println("Girdiğiniz sayı sıfırdır.");
        }

        scanner.close();
    }
}