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
public class Box {

    public static int num_of_box = 0; 
    
    double height, width;

    // Yapıcılar
    public Box(double height, double width) {
		// Parametre değerleri ve veri üyelerinin ismi aynı.
        // Bu durumda üyeler için this anahtar kelimesini      		// kullanıyoruz.
        this.height = height;
        this.width = width;
        num_of_box ++;
    }

    public Box(double s) {
 		// Burada this anahtar kelimesini iki parametreli
        // yapıcıyı tek parametre ile yaratmak için   		    // kullanıyoruz. Böylece atamaları tekrar yazmak 
        // zorunda kalmıyoruz.
        this(s, s);
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Box other = (Box) obj;
        if (Double.doubleToLongBits(this.height) != Double.doubleToLongBits(other.height)) {
            return false;
        }
        if (Double.doubleToLongBits(this.width) != Double.doubleToLongBits(other.width)) {
            return false;
        }
        return true;
    }
    
    
    public static void main(String[] args) {
        
        Box box1 = new Box(5);
        Box box2 = new Box(2,4);
        
        if(box1 == box2){
            System.out.println("Aynı nesneyi gösteriyor");
        }else{
            System.out.println("farklı nesneler");
        }
        
        if(box1.equals(box2)){
            System.out.println("nesneler aynı");
        }
    }
    
    public static void display(){
        System.out.println("static method");
    }
}

