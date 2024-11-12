
/* 1-99 arasındaki tek ve çift sayıların toplamları ile çarpımlarını ayrı ayrı hesaplayan program */

public class TekCiftSayiIslemleri {
    public static void main(String[] args) {
        int tekToplam = 0;
        int tekCarpim = 1;
        int ciftToplam = 0;
        int ciftCarpim = 1;

        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0) {
                // Çift sayı ise
                ciftToplam += i;
                ciftCarpim *= i;
            } else {
                // Tek sayı ise
                tekToplam += i;
                tekCarpim *= i;
            }
        }

        System.out.println("Tek sayıların toplamı: " + tekToplam);
        System.out.println("Tek sayıların çarpımı: " + tekCarpim);
        System.out.println("Çift sayıların toplamı: " + ciftToplam);
        System.out.println("Çift sayıların çarpımı: " + ciftCarpim);
    }
}