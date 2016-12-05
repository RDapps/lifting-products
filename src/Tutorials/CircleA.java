package Tutorials;
public class CircleA {
    

public static void main(String[] args){

    
    Circle c = new Circle(); // step 3 - create a circle. 
    c.radius = 3.5; // step 4 - assigned values to radius and area
    c.area = 3.14*c.radius*c.radius; // step 3 the calculation and output
    System.out.println(c.area);
    
    
//c = custom defined data type circle. 
//new = create memory for the object
//Circle() = give defaule calued for all the properties of c

    }

}

class Circlea // step 1 - define what was a circle

{

    double radius; //step 2 create the elements to the circle.
    double area;
    
}



/*
double radius;
Circle c = new Circle(); //make the circle,c name of variable. 'new Circle()' -
                         //is used to create the memory for storing the value of the radius.*/
