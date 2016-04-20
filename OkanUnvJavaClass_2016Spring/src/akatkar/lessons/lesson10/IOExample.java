/*
 * Okan Üniversitesi
 * Meslek Yüksekokulu
 * Mobil Teknolojileri
 * Java Programlama Dersleri
 * 2015 - 2016 SPRING
 */
package akatkar.lessons.lesson10;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author akatkar
 */
public class IOExample {

    public File fileCreate(String name) throws IOException  {
        // File nesnesi yarat ve "file1.txt" dosyasını göster
        File file = new File(name);
        // Dosya yoksa yarat
        if (file.exists() == false) {
            file.createNewFile();
        }
//        if(true)
//            throw new IOException();
        return file;
    }

    public void fileWrite(File file, String[] data) throws IOException {
        // Dosyaya yazmak için FileWriter nesnesi yarat
        FileWriter fr = new FileWriter(file);
        //Extra buuffer
        BufferedWriter bf = new BufferedWriter(fr);
        // Dosyaya satır satır yazabilmek için PrintWriter nesnesi yarat
        PrintWriter pw = new PrintWriter(bf);

        // Döngü içinde verileri dosyaya yaz
        for (String s : data) {
            pw.println(s);
        }
        pw.close();
    }

    public void fileWrite(File file, List<String> data) throws IOException {
        // Dosyaya yazmak için FileWriter nesnesi yarat
        FileWriter fr = new FileWriter(file);
        //Extra buuffer
        BufferedWriter bf = new BufferedWriter(fr);
        // Dosyaya satır satır yazabilmek için PrintWriter nesnesi yarat
        PrintWriter pw = new PrintWriter(bf);

        // Döngü içinde verileri dosyaya yaz
        for (String s : data) {
            pw.println(s);
        }
        pw.close();
    }

    public void fileWriteTest() {

        String[] bookStore = {"Book1", "Book2", "Book3"};

        try {

            File file = fileCreate("file1.txt");

            fileWrite(file, bookStore);

        } catch (IOException ex) {
            System.out.println("Yazma işlemi başarısız oldu");
        }
    }

    public List<String> fileReadTest() {
        
        try {
            File file = fileCreate("file1.txt");
            
            FileReader fr = new FileReader(file);
            // Veriyi tampon bellek üzerinden işleyebilmek için
            // BufferReader nesnesi yarat
            BufferedReader bf = new BufferedReader(fr);
            BufferedReader bf2 = new BufferedReader(bf);
            
            List<String> resultList = new ArrayList<>();
            String s;
            // Döngü içersinde veriyi oku ve ekrana bas
            while ((s = bf2.readLine()) != null) {
                resultList.add(s);
            }
            
            return resultList;
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return Collections.EMPTY_LIST;
    }

    public static void main(String[] args) throws IOException {

        IOExample fileDemo = new IOExample();
 //       fileDemo.fileWriteTest();
        List<String> content = fileDemo.fileReadTest();
        System.out.println(content);
        for(String s:content){
            System.out.println(s);
        }
   
        //content.remove(content.size()-1);
        content.remove(1);
        content.add(1, "Boookkk Sedat");
        File file = fileDemo.fileCreate("file1.txt");
        fileDemo.fileWrite(file, content);
        for(String s:content){
            System.out.println(s);
        }
//        String[] bookStore = {"Book1", "Book2", "Book3"};
//
//        // File nesnesi yarat ve "file1.txt" dosyasını göster
//        File file = new File("file1.txt");
//        // Dosya yoksa yarat
//        file.createNewFile();
//        // Dosyaya yazmak için FileWriter nesnesi yarat
//        FileWriter fr = new FileWriter(file);
//        // Dosyaya satır satır yazabilmek için PrintWriter nesnesi yarat
//        PrintWriter pw = new PrintWriter(fr);
//
//        // Döngü içinde verileri dosyaya yaz
//        for (String s : bookStore) {
//            pw.println(s);
//        }
//        pw.close();
//        String s = "";
//        try {
//            // File nesnesi yarat ve "file1.txt" dosyasını göster
//            File file = new File("file1.txt");
//            // file nesnesinden veri okumak için FileReader nesnesi yarat
//            FileReader fr = new FileReader(file);
//            // Veriyi tampon bellek üzerinden işleyebilmek için
//            // BufferReader nesnesi yarat
//            BufferedReader bf = new BufferedReader(fr);
//
//            // Döngü içersinde veriyi oku ve ekrana bas
//            while ((s = bf.readLine()) != null) {
//                System.out.println(s);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }
}
