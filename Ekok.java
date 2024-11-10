import java.util.Scanner;

public class Ekok {
    
    /* Girilen iki sayının en küçük ortak katını (ekok) bulan algoritma */

    public static void main(String[] args)  {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the first number: ");
        
        int a = scanner.nextInt();
       
        System.out.println("Enter the second number: ");
       
        int b = scanner.nextInt();
        
        int max = Math.max(a, b);

        while (true) {
            if (max % a == 0 && max % b == 0) {
                System.out.println("EKOK:  " + max);
                break;
            }
            max++;
            
        }
        
    }
}
