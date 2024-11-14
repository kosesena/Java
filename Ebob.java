  
    
  /*  Girilen iki sayının en büyük ortak bölenini(ebob) bulan algoritma
     
    EBOB:İki sayının en büyük ortak böleni, her iki sayıyı da tam bölen en büyük sayıdır.
    
    ALGORİTMA:
    1.Başla
    2.Kullanıcıdan iki sayı al (a,b)
    3.Küçük olan sayıyı min olarak belirle
    4.minden 1'e kadar bir döngü oluştur:
     Eğer a % min == 0 ve b % min == 0 ise, min EBOB'tur.
    5.EBOB'u yazdır.
    6.Bitir.                                                            */

     
public class App {
  
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
       
        // İlk sayıyı kullanıcıdan alıyoruz
        System.out.print("İlk sayıyı girin: ");
        int a = scanner.nextInt();

       // İkinci sayıyı kullanıcıdan alıyoruz
        System.out.print("İkinci sayıyı girin: ");
        int b = scanner.nextInt();
       
       // Girilen sayılardan küçük olanını buluyoruz
        int min = Math.min(a, b);
        int ebob = 1;// EBOB'u saklamak için bir değişken

      //min değerden başlayarak 1'e kadar geri sayıyoruz
        for (int i = min; i >= 1; i--) {
            
          // Hem a hem de b, i'ye tam bölünüyorsa
          if (a % i == 0 && b % i == 0) {
                ebob = i; // EBOB'u i olarak belirliyoruz
                break; // Döngüyü sonlandırıyoruz çünkü EBOB'u bulduk
            }
        }
         // Sonucu ekrana yazdırıyoruz
          System.out.println("EBOB: " + ebob);
    }

}
