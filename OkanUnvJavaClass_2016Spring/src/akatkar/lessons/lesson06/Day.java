/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
