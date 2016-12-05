/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tutorials;
public class InstanceVariables {

    public static void main(String[] args) {
        
        Person p =new Person();
        p.display(5);
    }
    
}

class Person
{
    
    String firstName;
    String lastName;
    boolean test;
    
    
    public void display(int p)
    {
        int no = 0;
        System.out.println(no);
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(test);
        
        
    }
    
    public void test()
    {
        System.out.println(firstName);
    }
}