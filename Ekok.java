 /* Girilen iki sayının en küçük ortak katını (ekok) bulan algoritma */

import java.util.Scanner;

public class Ekok {
    

    public static void main(String[] args)  {
        
        Scanner scanner = new Scanner(System.in);
    
     // İlk sayıyı kullanıcıdan alıyoruz
        System.out.println("Enter the first number: ");
        int a = scanner.nextInt();
        
     // İkinci sayıyı kullanıcıdan alıyoruz
        System.out.println("Enter the second number: ");
        int b = scanner.nextInt();
        
     // Başlangıç değeri olarak, a ve b'den büyük olan sayıyı alıyoruz
        int max = Math.max(a, b);

     // Sonsuz döngü başlatıyoruz. EKOK bulunana kadar döngü devam edecek
        while (true) {
            
        // Eğer max hem a'ya hem de b'ye tam bölünüyorsa, max EKOK'tur.
            if (max % a == 0 && max % b == 0) {
                System.out.println("EKOK:  " + max);// EKOK'u yazdırıyoruz.
               
                break; // Döngüyü sonlandırıyoruz.
            }
            max++; // max değerini 1 arttırarak kontrol etmeye devam ediyoruz.
            
        }
        
    }
}
