/*
 * Okan Üniversitesi
 * Meslek Yüksekokulu
 * Mobil Teknolojileri
 * Java Programlama Dersleri
 * 2015 - 2016 SPRING
 */
package akatkar.lessons.lesson02;

/**
 *
 * @author akatkar
 */
public class ProgramControlStatements {

    // n! hesabı. n sayısının faktöriyelini bulur
    static int factorial(int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result = result * i;
        }

        return result;
    }

    // n sayısının küpünü (n*n*n) döndürür
    static int cubeX(int n) {
        int result = n * n * n;
        return result;
    }

    // x sayısının n. kuvvetini hesaplar
    static long powerN(int x, int n) {
        long result = x;
        for (int i = 1; i < n; i++) {
            result *= x;
        }
        return result;
    }


    // switch için örnek metod
    static void switchExample(int i) {
        switch (i) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("1000");
                break;
        }
    }

    // int değişkenine 1 atayarak 32 defa sağa kaydırıyoruz
    // her bir adımda oluşan sayı ekrana basılıyor
    // sağa 1 kaydırmak 2 ile çarpmak ile aynı sonucu üretiyor
    static void bitwise() {
        int j = 1;
        for (int i = 0; i < 32; i++) {
            j = j << 1;
            System.out.println(j);
        }

    }

    // n sayısı 2 nin kuvveti ise true döner. Aksi takdirde false
    // Örnek:16 (2'nin 4.kuveti) için true döner.
    static boolean isPower2(int n) {
        return (n & n - 1) == 0;
    }

    public static void main(String[] args) {

        // factorial metodu ile 9! hesaplanıyor
        int fact = factorial(9);
        System.out.println("9!=" + fact);

        // 1'den 10!a kadar sayıların factoriyellerini hesaplıyoruz
        for (int i = 1; i < 10; i++) {
            int a = factorial(i);
            System.out.println(i + "!=" + a);
        }

        // cubeX metodunu çağırarak 5'in 3.kuvvetini hesaplıyoruz
        int x = cubeX(5);
        System.out.println(x);

        // powerN metodu ile 321 sayısının 4.kuvvetini hesaplıyoruz
        // powerN ile herhangi bir sayının herhangi bir kuvveti hesaplanabiliyor
        long n = powerN(321, 4);
        System.out.println(n);

        // switch örneği için switchExample metodu çağırılıyor
        switchExample(2);

        // bitwise örneği için bitwise metodu çağırılıyor
        bitwise();

        // isPower2 metodu bir sayının 2 nin kuvveti olup olmadığını buluyor
        // 1'den 18'e kadar olan sayılardan 2 nin kuvveti olanları buluyoruz
        for (int i = 1; i < 18; i++) {
            if (isPower2(i)) {
                System.out.println(i + " 2. kuvveti");
            }
        }
    }
}
