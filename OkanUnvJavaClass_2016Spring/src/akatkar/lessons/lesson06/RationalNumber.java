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
public class RationalNumber {
    
    private int pay;
    private int payda;

    public RationalNumber(int pay, int payda) {
        this.pay = pay;
        this.payda = payda;
        
        if(payda < 0 ){
            this.pay *= -1;
            this.payda *= -1;
        }
    }

    public void add(RationalNumber right){
        int ortakPayda = this.payda * right.payda;
        
        int pay1 = this.pay * right.payda;
        int pay2 = right.pay * this.payda;
        
        this.pay = pay1 + pay2;
        this.payda = ortakPayda;
    }
    
     public void subtract(RationalNumber right){
        int ortakPayda = this.payda * right.payda;
        
        int pay1 = this.pay * right.payda;
        int pay2 = right.pay * this.payda;
        
        this.pay = pay1 - pay2;
        this.payda = ortakPayda;
    }
    
     public void multiply(RationalNumber right){
         this.pay = this.pay * right.pay;
         this.payda = this.payda * right.payda;
     }
     
    public void divide(RationalNumber right){
         this.pay = this.pay * right.payda;
         this.payda = this.payda * right.pay;
     }
     
    @Override
    public String toString() {
        return pay + "/" + payda;
    }
    
    
    
}
