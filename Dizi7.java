/*
Aşağıdaki matrisin en küçük elemanını ve o elemana ait indisleri bulup konsolda yazan Java programını yazınız?
100 20 300
44 55 666
7 80 9
10 11 12
*/

public class Main {
  public static void main(String[] args) {
  // Verilen matris
  int[][] matris = {
    {100,20,300},
    {44,55,666},
    {7,80,9},
    {10,11,12}
  };
  // En küçük eleman ve indekslerini tutacak değişkenler
  int minDeger = matris[0][0];
  int minSatir = 0;
  int minSutun = 0;

  // Matrisin elemanlarını kontrol et
  for(int i = 0; i < matris.length; i++) { //Satır
    for(int j = 0; j < matris[i].length; i++) { //Sütun
     if(matris[i][j] < minDeger) {
       minDeger = matris[i][j];
       minSatir = i;
       minSutun = j;
     }
    }
  }
  // Sonuçları yazdır
  System.out.println("En küçük eleman:" + minDeger);
  System.out.println("İndisleri: (" + minSatir + ", " + minSutun + ")");
  }
}
