
/* Klavyeden girilen N sayısının faktöriyelinin hesaplanması */

import java.util.Scanner;


public class FaktoriyelHesapla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int N = scanner.nextInt();

        // Faktöriyel hesaplama
        long faktoriyel = 1;
        for (int i = 1; i <= N; i++) {
            faktoriyel *= i;
        }

        System.out.println(N + " sayısının faktöriyeli: " + faktoriyel);

        scanner.close();
    }
}