/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akatkar.homeworks.homework02;

/**
 *
 * @author akatkar
 */
public class LoopNumbers {
    // n sayısı 2 nin kuvveti ise true döner. Aksi takdirde false
    // Örnek:16 (2'nin 4.kuveti) için true döner.
    static boolean isPower2(int n) {
        return (n & n - 1) == 0;
    }
    
    static void powerList(){
        for(int i=1;i<100;i++){
            if(isPower2(i)){
                System.out.println(i+" 2'nin tam kuvvetidir");
            }
        }
    }
    
    static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        
        for(int i=2;i<n;i++){
            if((n%i) == 0){
                return false;
            }
        }
        return true;            
    }
    
    static void primeList(){
        for(int i=1;i<100;i++){
            if(isPrime(i)){
                System.out.println(i+ " asal sayıdır.");
            }
        }
    }
    
    public static void main(String[] args) {
        powerList();
        primeList();
    }
}
