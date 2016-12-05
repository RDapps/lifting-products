/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tutorials;


public class SquareArea {

    public static void main(String[] args) {
        
    Square s = new Square();            
    s.findArea(5,10);
    System.out.println(s.Length);
    System.out.println(s.width);
}
}

class Square 
{
    
    int Length;
    int width;
    int Area;
    public void findArea(int A, int B) 
    {
        Length = 5;
        width = 10;
        Area = (Length * 2) * (width * 2);
        System.out.println(Area);
    
    }
    
}
