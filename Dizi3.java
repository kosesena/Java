/* Kullanıcı tarafından tam sayı değerleri girilen 20 elemanlı bir diziyi küçükten büyüğe sıralayıp konsolda gösteren Java programını yazınız.*/
    

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[20];

        // Kullanıcıdan giriş alma
        System.out.println("Lütfen 20 tam sayı giriniz:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print((i + 1) + ". sayı: ");
            numbers[i] = scanner.nextInt();
        }

        // Diziyi küçükten büyüğe sıralama
        Arrays.sort(numbers);

        // Sıralanmış diziyi ekrana yazdırma
        System.out.println("Dizi küçükten büyüğe sıralandı:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
