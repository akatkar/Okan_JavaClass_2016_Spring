/*
 * Okan Üniversitesi
 * Meslek Yüksekokulu
 * Mobil Teknolojileri
 * Java Programlama Dersleri
 * 2015 - 2016 SPRING
 */
package akatkar.lessons.lesson04.packageA;

/**
 *
 * @author akatkar
 */
public class ClassC {
    private int private_int;
    protected int protected_int;
    int default_int;
    public int public_int;
    
    public class InnerClass{
        
        public void method(){
            
            ClassC c = new ClassC();
            c.default_int = 0;
            c.private_int = 0;
            c.protected_int = 0;
            c.public_int = 0;
        }        
    }
    
    public static void main(String[] args) {
        ClassC c = new ClassC();
        ClassC.InnerClass ic = c.new InnerClass();
        ic.method();
    }
}
