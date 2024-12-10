/* Tam sayılardan oluşan 20 elemanlı bir dizideki en küçük elemanı bulan ve konsolda gösteren Java programını yazınız. */

import java.util.Random;

public class Main {

    public static void main(String[] args) {
           
            // 20 elemanlı tam sayılardan oluşan bir dizi oluşturma
            int[] numbers = new int[20];
            Random random = new Random();
    
            // Diziyi rastgele sayılarla doldurma
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = random.nextInt(100) - 50; // -50 ile 49 arasında sayılar
            }
    
            // Diziyi konsolda gösterme
            System.out.print("Dizi elemanları: ");
            for (int num : numbers) {
                System.out.print(num + " ");
            }
            System.out.println();
    
            // En küçük elemanı bulma
            int min = numbers[0];
            for (int num : numbers) {
                if (num < min) {
                    min = num;
                }
            }
    
            // En küçük elemanı konsolda gösterme
            System.out.println("Dizideki en küçük eleman: " + min);
        }
    }

