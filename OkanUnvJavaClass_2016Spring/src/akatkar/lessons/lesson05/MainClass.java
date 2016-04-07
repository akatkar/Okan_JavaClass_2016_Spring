/*
 * Okan Üniversitesi
 * Meslek Yüksekokulu
 * Mobil Teknolojileri
 * Java Programlama Dersleri
 * 2015 - 2016 SPRING
 */
package akatkar.lessons.lesson05;

/**
 *
 * @author akatkar
 */
public class MainClass {
    public static void main(String[] args) {
        
        for(String ar:args){
            System.out.println(ar);
        }
        
        Card card = new Card(Suit.SINEK,Rank.UC);
        System.out.println(card);
        
        String s = "abcdeeefghttalljk";
        
        String s2 = s.substring(s.length()-3);
        System.out.println(s2);
        if(s.isEmpty()){
            System.out.println("Bu string boş");
        }
        String[] strArray = {
            "ankara",
            "diyarbakır",
            "sivas",
            "adana"
        };
        
        for(int i=0;i<strArray.length;i++){
            if(strArray[i].startsWith("ank")){
                System.out.println(strArray[i]);
            }
        }
        
        for(String sss:strArray){
            if(sss.endsWith("kır")){
                System.out.println(sss);
            }
        }
        
       
    }
    
    static int aaa=0;
    public static void callMe(){
        callMe();
    }
}
