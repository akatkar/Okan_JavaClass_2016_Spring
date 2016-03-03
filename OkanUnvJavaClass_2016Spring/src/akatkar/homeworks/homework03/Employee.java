/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akatkar.homeworks.homework03;

/**
 *
 * @author akatkar
 */
public class Employee {

    private static final double BASE_SALARY = 15000.0;

    private String name;
    private double salary;

    public Employee(String n, double s) {
        name = n;
        salary = s;
    }

    public Employee(String n) {
        name = n;
        salary = BASE_SALARY;
    }

    public static void main(String[] args) {

        Employee emp = new Employee("Ali");
        Employee emp2 = new Employee("Veli",8750.00);
    }
}
