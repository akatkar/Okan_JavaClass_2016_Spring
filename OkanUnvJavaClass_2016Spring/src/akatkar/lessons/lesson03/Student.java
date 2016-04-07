/*
 * Okan Üniversitesi
 * Meslek Yüksekokulu
 * Mobil Teknolojileri
 * Java Programlama Dersleri
 * 2015 - 2016 SPRING
 */
package akatkar.lessons.lesson03;

import java.util.Objects;

/**
 *
 * @author akatkar
 */
public class Student {
    String name;
    String no;
    
    Student(String name){
        this();
        this.name = name;
        System.out.println("parametreli yapıcı çalıştı");
    }
            
    
    Student(){
        System.out.println("Student varsayılan yapıcısı çağrıldı");
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.name);
        hash = 37 * hash + Objects.hashCode(this.no);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.no, other.no)) {
            return false;
        }
        return true;
    }
    

    public void displayStudent(){
        System.out.println("name:"+name + " no:"+no);
    }

    @Override
    public String toString() {
        return name ;
    }
    

    public static void main(String[] args) {
        Student s1 = new Student("Ali");
        s1.displayStudent();
        System.out.println(s1);
        
        String s = s1 + "xxx";
        System.out.println(s);
    }
}
