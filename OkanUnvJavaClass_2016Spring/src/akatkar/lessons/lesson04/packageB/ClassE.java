/*
 * Okan Üniversitesi
 * Meslek Yüksekokulu
 * Mobil Teknolojileri
 * Java Programlama Dersleri
 * 2015 - 2016 SPRING
 */
package akatkar.lessons.lesson04.packageB;

import akatkar.lessons.lesson04.packageA.ClassC;

/**
 *
 * @author akatkar
 */
public class ClassE extends ClassC{
    public static void main(String[] args) {
        ClassC c = new ClassC();
        c.public_int = 0;
        
        ClassE e = new ClassE();
        e.protected_int = 0;
        e.public_int = 0;
    }
}
