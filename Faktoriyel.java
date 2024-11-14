/*   Bir sayının faktöriyelini bulan algoritma
 
  Faktöriyel: Bir sayının faktöriyeli, 1'den o sayıya kadar olan tüm pozitif tam sayıların çarpımıdır.
  
  Örneğin, 5! = 5x4x3x2x1 = 120
  
  ALGORİTMA:
  
  1.Başla
  2.Kullanıcıdan bir sayı al(n).
  3.Faktöriyel değişkenini 1 olarak başlat.
  4.Sayı 1'den büyükse, 1'den n'ye kadar döngü oluştur.
  Her adımda faktöriyel değişkenini güncelle: faktöriyel=faktöriyel * i
  5.Faktöriyel değerini yazdır.
  6.Bitir.                                                                                     */
 
 
import java.util.Scanner; // Bu satır,Java'nın Scanner sınıfını içe aktarır.Scanner,kullanıcıdan veri almak için kullanılan bir sınıftır.

public class Faktoriyel {

	public static void main(String[] args) { // main metodu,Java programının başlangıç noktasıdır.Tüm işlemler bu metodun içinde gerçekleşir.
		
		Scanner scanner = new Scanner(System.in);// scanner nesnesi oluşturduk.Bu nesne,kullanıcıdan veri almak için kullanılır.
		
		System.out.print("Bir sayı girin: ");
		int n = scanner.nextInt();
		
		int faktoriyel = 1;
		
		for(int i = 1; i <= n ; i++) {
			
			faktoriyel *= i;
		}
		
		System.out.println("Faktöriyel: " + faktoriyel);
		
		scanner.close();

	}

}
