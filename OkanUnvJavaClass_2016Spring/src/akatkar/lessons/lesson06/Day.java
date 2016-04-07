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
public enum Day {
    MONDAY(false),TUESDAY(false),WEDNESDAY(false),THURSDAY(false),FRIDAY(false),SATURDAY(true),SUNDAY(true);
    
    boolean isHoliday;
            
    private Day(boolean isHoliday){
        this.isHoliday = isHoliday;
    }
}
