package Soru1;
import java.util.Scanner;
/* 
 * Bir sayının faktöriyelini bulan algoritma
 * Faktöriyel: Bir sayının faktöriyeli,1'den o sayıya kadar olan tüm pozitif tam sayıların çarpımıdır.
 * 
 * Örneğin, 5! = 5x4x3x2x1 = 120
 * 
 * ALGORİTMA:
 * 
 * 1.Başla
 * 2.Kullanıcıdan bir sayı al(n).
 * 3.Faktöriyel değişkenini 1 olarak başlat.
 * 4.Sayı 1'den büyükse, 1'den n'ye kadar döngü oluştur.
 * Her adımda faktöriyel değişkenini güncelle: faktöriyel=faktöriyel * i
 * 5.Faktöriyel değerini yazdır.
 * 6.Bitir.
 *
 */

public class Faktoriyel {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Bir sayı girin: ");
		
		int n = scanner.nextInt();
		
		int faktoriyel = 1;
		
		for(int i = 1; i <= n ; i++) {
			
			faktoriyel *= i;
		}
		
		System.out.println("Faktöriyel: " + faktoriyel);

	}

}
