/*Kullanıcı tarafından tam sayı değerleri girilen 20 elemanlı bir dizinin toplamını ve ortalamasını hesaplayıp konsolda gösteren Java programını yazınız.*/
    
    
import java.util.Scanner;
public class Main {
    public static void main(String[]args) {
        Scanner giris = new Scanner(System.in);
       
        //20 elemanlı bir dizi oluşturuyoruz.
        int[] numbers = new int[20];
        
        //Dizinin toplamını tutacak olan değişkeni oluşturuyoruz.
        int sum = 0;

        System.out.println("Lütfen 20 tam sayı giriniz: ");

        //Kullanıcıdan 20 sayıyı al ve diziye ata.
        for(int i=0; i<20; i++) {
            
            System.out.print((i+1) + ". sayıyı giriniz: " );
            
            numbers[i] = giris.nextInt();
            
            sum += numbers[i]; //Giriş yapılan sayıyı toplamaya ekle.
        }

        //Ortalama hesaplanır.
        double average = (double)sum / 20;
        
        //Sonuçlar ekrana yazdırılır.
        System.out.println("Dizinin Toplamı: " + sum);
        System.out.println("Dizinin Ortalaması: " + average);
        
        //Scanner'ı kapat.
        giris.close();


    }
}
