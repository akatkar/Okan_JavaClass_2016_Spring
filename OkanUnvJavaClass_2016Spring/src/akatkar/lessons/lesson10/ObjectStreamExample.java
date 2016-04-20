/*
 * Okan Üniversitesi
 * Meslek Yüksekokulu
 * Mobil Teknolojileri
 * Java Programlama Dersleri
 * 2015 - 2016 SPRING
 */
package akatkar.lessons.lesson10;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author akatkar
 */
public class ObjectStreamExample {
    
    public static void writeObjectExample() throws IOException {
        FileOutputStream fileOut = new FileOutputStream("country.bin");
        ObjectOutputStream outStream = new ObjectOutputStream(fileOut);

        CountryInfo country1 = new CountryInfo("Italy", 57679800L);
        CountryInfo country2 = new CountryInfo("Sweden", 8875100L);
        CountryInfo country3 = new CountryInfo("Turkey", 80000000L);

        outStream.writeObject(country1);
        outStream.writeObject(country2);
        outStream.writeObject(country3);
        outStream.close();
    }

    public static void readObjectExample() throws IOException {
        FileInputStream fileIn = new FileInputStream("country.bin");
        ObjectInputStream inStream = new ObjectInputStream(fileIn);

        try {
            CountryInfo country;
            while (true) {
                try{
                    country = (CountryInfo) (inStream.readObject());
                }catch(EOFException e){
                    break;
                }
                System.out.println(country);
            }
        } catch (ClassNotFoundException e) {
        }
        inStream.close();
    }

    public static void main(String[] args) throws IOException {
            writeObjectExample();
            readObjectExample();
    }    
}
