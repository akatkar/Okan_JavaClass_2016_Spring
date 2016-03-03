/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akatkar.homeworks.homework03;

import java.util.Objects;

/**
 *
 * @author akatkar
 */
public class Student {
    
    private String name;
    private String surname;
    private String school;
    private String branch;
    
    public Student(String name, String surname){
        this.name = name;
        this.surname = surname;        
    }
    
    public void displayStudent(){
        System.out.println(name+ " " + surname);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.surname, other.surname)) {
            return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Student st1 = new Student("Ali", "Katkar");
        Student st2 = new Student("Semih", "Kalem");
        
        st1.displayStudent();
        st2.displayStudent();
        
        if(st1.equals(st2)){
            System.out.println("aynı kişi");
        }
        st1.name = "dmqeşldmqşl";
        st1.displayStudent();        
    }
    
}
