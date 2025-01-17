/* Kullanıcı tarafından tam sayı değerleri girilen 20 elemanlı bir diziyi küçükten büyüğe sıralayıp konsolda gösteren Java programını yazınız.*/
    

import java.util.Arrays; // Diziler üzerinde işlemler yapmak için kullanabileceğimiz Arrays sınıfını içe aktarır.
import java.util.Scanner; // Kullanıcıdan veri almak için kullanılan Scanner sınıfını içe aktarır.

public class Dizi3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[20];

        // Kullanıcıdan giriş alma
        System.out.println("Lütfen 20 tam sayı giriniz:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print((i + 1) + ". sayı: "); // Kullanıcının kaçıncı sayıyı girdiğini belirtmek için bir mesaj yazdırır.
            numbers[i] = scanner.nextInt(); // Kullanıcının girdiği tam sayı scanner.nextInt() ile okunur ve dizinin i indeksine atanır.
        }

        // Diziyi küçükten büyüğe sıralama
        Arrays.sort(numbers);

        // Sıralanmış diziyi ekrana yazdırma
        System.out.println("Dizi küçükten büyüğe sıralandı:");
        for (int num : numbers) { // Bu bir for-each döngüsüdür. * num:Dizideki her bir elemanı temsil eder * numbers:Üzerinde döngü çalıştırılan dizidir.Bu döngü,dizideki tüm elemanları sırasıyla işler.
            System.out.print(num + " ");
        }
    }
}
