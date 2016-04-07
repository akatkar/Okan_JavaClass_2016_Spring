/*
 * Okan Üniversitesi
 * Meslek Yüksekokulu
 * Mobil Teknolojileri
 * Java Programlama Dersleri
 * 2015 - 2016 SPRING
 */
package akatkar.lessons.lesson06;

/**
 *
 * @author akatkar
 */
public class MainClass {
    
    public static void showDay(Day day){
        
        switch(day){
            case MONDAY: System.out.println("Pazartesi");break;
            case TUESDAY: System.out.println("SALI");break;
            case FRIDAY:System.out.println("CUMA");
        }
        if(day.isHoliday){
            System.out.println("tatil günü");
        }
    }
    
    public static void main(String[] args) {
        
//        System.out.println("parametre sayısı:"+args.length);
//        for(String s:args){
//            System.out.println(s);
//            try{
//                int i = Integer.parseInt(s);
//                System.out.println("sayı değeri:" + i);
//            }catch(NumberFormatException e){
//                System.out.println("Sayıya çevrilemedi:" + s);
//            }
//        }
//        
//        Day day = Day.FRIDAY;
//        String TheDay = "kladfwejkl";
//        showDay(day);
//        
//        Shape shape = new Shape(3);
//        
//        System.out.println(shape);
        RationalNumber r1 = new RationalNumber(1, 2);
        RationalNumber r2 = new RationalNumber(3, 5);
        
        System.out.println(r1);
        System.out.println(r2); 
        
        r1.divide(r2);
        System.out.println(r1);
        
    }
}
