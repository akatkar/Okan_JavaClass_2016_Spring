/*
 * Okan Üniversitesi
 * Meslek Yüksekokulu
 * Mobil Teknolojileri
 * Java Programlama Dersleri
 * 2015 - 2016 SPRING
 */
package akatkar.lessons.lesson04;

/**
 *
 * @author akatkar
 */
public class MainClass {
    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            new Box(7*i,3*i);
        }
        System.out.println("Kutu sayısı:"+Box.num_of_box);
        
        Box b = new Box(2,4);
        double h = b.getHeight();
        Box.display();
    }
}
