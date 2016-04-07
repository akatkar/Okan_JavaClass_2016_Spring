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
public class Card {
    private Suit suit;
    private Rank rank;
    
    public Card(Suit suit, Rank rank){
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Card{" + "suit=" + suit + ", rank=" + rank + '}';
    }    
}
