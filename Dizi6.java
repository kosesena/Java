/*
Aşağıdaki kodun çıktısı nedir?

public class Test {
public static void main(String[] args) {
         int[] liste = {1, 2, 3, 4, 5, 6};
       for (int i = 1; i < liste.length; i++)
         liste[i] = liste[i - 1];
       for (int i = 0; i < liste.length; i++)
         System.out.print(liste[i] + " ");
   }
}
*/

İlk for döngüsünde, i=1'den başlayarak diziyi dolaşır ve her elemanı bir önceki eleman ile eşitler.
i=1 liste[1] = liste[0]
Dizi:{1,1,3,4,5,6}

i=2 liste[2] = liste[1]
Dizi:{1,1,1,4,5,6}

i=3 liste[3] = liste[2]
Dizi:{1,1,1,1,5,6}

i=4 liste[4] = liste[3]
Dizi:{1,1,1,1,1,6}

i=5 liste[5] = liste[4]
Dizi:{1,1,1,1,1,1}
Sonuçta tüm elemanlar 1'e eşitlenmiştir.

İkinci for döngüsünde ise dizinin tüm elemanları yazdırılır
1 1 1 1 1 1
