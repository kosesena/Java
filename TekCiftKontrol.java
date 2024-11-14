/* Klavyeden girilen pozitif bir tamsayının tek mi çift mi olduğunu tespit eden program */

import java.util.Scanner;

public class TekCiftKontrol {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir pozitif tamsayı giriniz: ");
        int sayi = scanner.nextInt();

        if (sayi % 2 == 0) {
            System.out.println("Girdiğiniz sayı çifttir.");
        } else {
            System.out.println("Girdiğiniz sayı tektir.");
        }

        scanner.close();
    }
}
