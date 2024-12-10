/* SORU-Tam sayılardan oluşan 20 elemanlı bir dizideki en küçük elemanı bulan ve konsolda gösteren Java programını yazınız. */

import java.util.Random;  // Random sınıfını programda kullanmamızı sağlar.Bu sınıf,rastgele sayılar oluşturmak için kullanılır

public class Dizi1 {     // Programın başlangıç sınıfını tanımlar.Java'da her program bir sınıf içerisinde yer alır.

    public static void main(String[] args) {       // Programın çalışmaya başladığı ana metottur.main metodu olmadan Java programı çalışamaz.
    /*  public: Metodun her yerden erişilebilir olduğunu belirtir.
        static: Metodun,sınıfın bir örneği oluşturulmadan çalıştırılabileceğini belirtir.
        void: Metodun herhangi bir değer döndürmediğini belirtir.
        String[] args: Komut satırından parametre alabilen bir diziyi temsil eder(bu örnekte kullanılmıyor.) */
           
            // 20 elemanlı tam sayılardan oluşan bir dizi oluşturma
            int[] numbers = new int[20];
            Random random = new Random(); // Rastgele sayı oluşturmak için bir Random nesnesi oluşturur.
    
            // Diziyi rastgele sayılarla doldurma
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = random.nextInt(100) - 50; // Diziye -50 ile 49 arasında rastgele tam sayılar ekler.
                /*  random.nextInt(100): 0 ile 99 arasında rastgele bir sayı üretir.
                    Üretilen sayıya -50 eklenir,böylece sayı -50 ile 49 arasında olur. */
            }
    
            // Diziyi konsolda gösterme
            System.out.print("Dizi elemanları: ");
            for (int num : numbers) { // Java'da "foreach" döngüsü.Dizinin her bir elemanını num değişkenine atar.
                System.out.print(num + " "); // Her elemanı boşluk bırakarak yazar.
            }
            System.out.println(); // 
    
            // En küçük elemanı bulma
            int min = numbers[0]; // Dizinin ilk elemanını en küçük eleman(min) olarak kabul eder.
            for (int num : numbers) {
                if (num < min) {
                    min = num;
                }
            }
    
            // En küçük elemanı konsolda gösterme
            System.out.println("Dizideki en küçük eleman: " + min);
        }
    }

