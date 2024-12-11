/*
SORU-Kullanıcı tarafından tam sayı değerleri girilen 20 elemanlı bir dizideki en küçük elemanı ve o elemana ait indisi bulup konsolda gösteren Java programını
yazınız.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[20];

        System.out.println("Lütfen 20 tam sayı giriniz:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print((i + 1) + ". sayı: ");
            numbers[i] = scanner.nextInt();
        }

        int minValue = numbers[0];
        int minIndex = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
                minIndex = i;
            }
        }

        System.out.println("En küçük eleman: " + minValue);
        System.out.println("En küçük elemanın indeksi: " + minIndex);
    }
}

