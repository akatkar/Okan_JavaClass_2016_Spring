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
public class ArrayExample {
    public static void main(String[] args) {
        
        int[][] array = {
            {1,2,3,4,5},
            {1,2,3,4,5,6},
            {1,2,3,4,5,6,7}
        };
        
        for(int[] ia:array ){
            for(int j:ia){
                System.out.print(j);
            }
            System.out.println("");
        }
        
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]);
            }
            System.out.println("");
        }
        
        int[] ia = {0,1,2,3,45,6};
        for(int abx:ia){
            System.out.print(abx);
        }
        System.out.println("");
        
    }
    
    
}
