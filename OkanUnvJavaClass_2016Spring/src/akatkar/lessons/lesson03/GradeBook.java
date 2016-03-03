/*
 * Okan Üniversitesi
 * Meslek Yüksekokulu
 * Mobil Teknolojileri
 * Java Programlama Dersleri
 * 2015 - 2016 SPRING
 */
package akatkar.lessons.lesson03;

/**
 *
 * @author akatkar
 */
public class GradeBook {
    public void displayMessage(String a){
        System.out.println("Hello from Gradebook" + a);
    }
    
    public void displayMessage(String b,String c){
        System.out.println("sdaskas");
    }
            
    public static void main(String[] args) {
        GradeBook gb = new GradeBook();
        gb.displayMessage("Gizem","ali");
        
        Student s1 = new Student("Ali "); 
        Student s2 = new Student("Ali "); 
            
        if(s1 == s2){
            System.out.println("aynı objeyi gösteriyor");
        }else{
            System.out.println("aynı objeyi göstermiyor");
        }
    
        if(s1.equals(s2)){
            System.out.println("objleer aynı");
        }
    }
}
