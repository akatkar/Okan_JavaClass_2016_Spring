/*
 * Okan Üniversitesi
 * Meslek Yüksekokulu
 * Mobil Teknolojileri
 * Java Programlama Dersleri
 * 2015 - 2016 SPRING
 */
package akatkar.lessons.lesson01;

import java.util.Date;

/**
 *
 * @author akatkar
 */
public class HelloWorld {
    
    static Date d1;
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            System.out.println("Hello World");
        }
        
        d1 = new Date();
        System.out.println("Bugün "+ d1);
        
        for(int i=1;i<10;i++){
            for(int j=1;j<10;j++){
                System.out.println(i+" * "+j+"="+i*j);
            }
            System.out.println("");
        }
        
    }
}
