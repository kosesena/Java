/*
SORU-Kullanıcı tarafından tam sayı değerleri girilen 20 elemanlı bir dizideki en küçük elemanı ve o elemana ait indisi bulup konsolda gösteren Java programını
yazınız.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Bu satır,kullanıcıdan veri almayı sağlayan bir Scanner nesnesi oluşturur.System.in ifadesi,klavyeden giriş yapılacağını belirtir.
        int[] numbers = new int[20];  // Burada,20 elemanlı bir tam sayı(int)dizisi tanımlanır.Bu diziye kullanıcı tarafından girilecek sayılar kaydedilecektir.

        System.out.println("Lütfen 20 tam sayı giriniz:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print((i + 1) + ". sayı: "); // Her iterasyonda,kullanıcıdan bir sayı girmesi istenir.(i+1) ifadesi,kullanıcının kaçıncı sayıyı girdiğini anlaması için yazdırılır.
            numbers[i] = scanner.nextInt(); // Kullanıcının girdiği sayı,dizinin i indeksine kaydedilir.scanner.nextInt() ifadesi,kullanıcının klavyeden girdiği tam sayıyı okur.
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

