/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akatkar.lessons.lesson09;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author akatkar
 */
public class ArrayListTest {
    public static void main(String[] args) {
        List myList = new ArrayList();
        myList.add("String ");
        myList.add(new Dog("kaniş"));
        myList.add(new Integer(10));
        
        for(Object o:myList){
            System.out.println(o);
        }
        
        List<String> myList2 = new ArrayList<String>();
        myList2.add("String");       
        myList2.add("ikinci string");
        
        for(String s : myList2){
            System.out.println(s);
        }
        
        List<Dog> dogList = new ArrayList<Dog>();
        dogList.add(new Dog("Kaniş"));
        dogList.add(new Dog("Çav çav"));
        
        for(Dog d:dogList){
            System.out.println(d);
        }
        
    }
}
