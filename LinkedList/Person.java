/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author bbbvv
 */
public class Person {
    String name;
    int age;

    public Person() {
    }

    public Person(String xName, int xAge) {
        name = xName;
        age = xAge;
    }

    @Override
    public String toString() {
        return "[" + name + "," + age + "]";
    }
    
    
}
