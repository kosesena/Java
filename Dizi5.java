/*
Aşağıdaki kodun çıktısı nedir?
int x = 30;
int[] sayilar = new int[x];
x = 60;
System.out.println("x: " + x);
System.out.println("sayilarin boyutu: " + sayilar.length);
*/

int x = 30;
x adında bir tamsayı değişkeni tanımlanır ve başlangıç değeri 30 olarak atanır.

int[] sayilar = new int[x];
sayilar adında bir tam sayı dizisi oluşturulur.Dizinin boyutu,değişken x'in o andaki değeri olan 30 olarak belirlenir.
Not: Dizi oluşturulduktan sonra,boyutu sabittir ve daha sonra değiştirilemez.

x=60;
x değişkeninin değeri 60 olarak güncellenir.Ancak bu,daha önce tanımlanmış olan dizinin boyutunu etkilemez.Çünkü sayilar dizisi
oluşturulduğunda x'in değeri kullanılmıştır ve artık x ile bağlantısı kalmamıştır.

Dolayısıyla çıktı:
x: 60
sayilarin boyutu: 30
  
