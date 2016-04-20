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
import java.util.ArrayList;
import java.util.List;

/**
 * Advanced version
 *
 * @author akatkar
 */
public class ObjectStreamExample_V2 {

    /**
     * @param fileName
     * @param content
     * @throws java.io.IOException
     * fileName ile verilen dosyaya content olarak verilmiş listeyi 
     * serileştirme yoluyla yazar.
     */
    public void writeAsObject(String fileName, List<CountryInfo> content) throws IOException {
        FileOutputStream fileOut = new FileOutputStream(fileName);
        
        try (ObjectOutputStream outStream = new ObjectOutputStream(fileOut)) {
            for (Object o : content) {
                outStream.writeObject(o);
            }
        }
    }

    /**
     * 
     * @param fileName
     * @return Liste olarak dosya içeriği
     * @throws IOException 
     */
    public List<CountryInfo> readAsObject(String fileName) throws IOException {

        List<CountryInfo> resultList = new ArrayList<>();

        FileInputStream fileIn = new FileInputStream(fileName);
        try (ObjectInputStream inStream = new ObjectInputStream(fileIn)) {
            CountryInfo country;
            while (true) {
                try {
                    country = (CountryInfo) (inStream.readObject());
                    resultList.add(country);
                } catch (ClassNotFoundException e) {

                } catch (EOFException e) {
                    break;
                }
            }
        }
        return resultList;
    }
   
    public static void main(String[] args) throws IOException {
        
        // Test için örenk veri        
        CountryInfo country1 = new CountryInfo("Italy", 57679800L);
        CountryInfo country2 = new CountryInfo("Sweden", 8875100L);
        CountryInfo country3 = new CountryInfo("Turkey", 80000000L);

        // Dosyaya yazmak için içerik listesi yap
        List<CountryInfo> countryList = new ArrayList<>();
        countryList.add(country1);
        countryList.add(country2);
        countryList.add(country3);
        
        // Listeyi dosyaya yaz
        ObjectStreamExample_V2 os = new ObjectStreamExample_V2();
        os.writeAsObject("country2.bin", countryList);
        
        // Dosyayı oku ve readList olarak başka bir listeye koy
        List<CountryInfo> readList = os.readAsObject("country2.bin");
        
        // okunan dosyayı ekrana yaz
        for(CountryInfo c : readList){
            System.out.println(c);
        }
    }

}
