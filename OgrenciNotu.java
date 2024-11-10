import java.util.Scanner;

/* 
   Öğrencinin numarasını, vize ve final notunu aldıktan sonra ortalamasını hesaplayıp numarasını ve not ortalamasını yazdıran program 

Algoritma:

1.Öğrenci numarasını, vize notunu ve final notunu al.
2.Ortalamayı hesapla: ortalama = (vize * 0.4) + (final * 0.6)
3.Öğrencinin numarası ve ortalamayı ekrana yazdır.

*/

public class OgrenciNotu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Öğrenci numarasını girin: ");
        int numara = scanner.nextInt();

        System.out.print("Vize notunu girin: ");
        double vize = scanner.nextDouble();

        System.out.print("Final notunu girin: ");
        double finalNotu = scanner.nextDouble();

        double ortalama = (vize * 0.4) + (finalNotu * 0.6);

        System.out.println("Öğrenci Numarası: " + numara);
        System.out.println("Ortalama: " + ortalama);
    }
}
