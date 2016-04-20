/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akatkar.lessons.lesson10;

import java.io.Serializable;

/**
 *
 * @author akatkar
 */
public class CountryInfo implements Serializable{
    private String name;
    private long population;

    public CountryInfo(String name, long population) {
        this.name = name;
        this.population = population;
    }

    @Override
    public String toString() {
        return "CountryInfo{" + "name=" + name + ", population=" + population + '}';
    }    
}
