
/* Klavyeden girilen 5 adet sayının ortalamasını bulan program */

import java.util.Scanner;

public class OrtalamaHesaplama {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int toplam = 0;

        for (int i = 1; i <= 5; i++) { // for döngüsü,i değişkenini 1'den başlatarak 5'e kadar(dahil) iterasyon yapar.Yani,döngü 5 kez çalışacaktır.
            
            System.out.print(i + ". sayıyı girin: "); // i değişkeni,kaçıncı sayının girildiğini belirtmek için kullanılır.
            
            int sayi = scanner.nextInt(); // Kullanıcıdan bir tamsayı alır ve sayi değişkenine atar.
            
            toplam += sayi; // Alınan sayi değeri toplam değişkenine eklenir.Bu işlem her iterasyonda tekrar edilerek kullanıcıdan alınan tüm sayıların toplamı hesaplanır.
        }

        double ortalama = toplam / 5.0;// 5.0 ifadesi double veri tipi olduğu için,sonuç double olarak hesaplanır.Bu,tam sayı bölmesinin neden olabileceği veri kaybını önler ve kesirli sonuçların doğru şekilde hesaplanmasını sağlar.
        
        System.out.println("Ortalama: " + ortalama);

        scanner.close();
    }
}
