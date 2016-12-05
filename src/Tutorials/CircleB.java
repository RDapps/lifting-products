package Tutorials;
public class CircleB {
    

public static void main(String[] args){

    
    Circle c = new Circle(); //here we create a circle with the variable c.
    c.findArea(5.15); //the calculations are performed here
    
   
    }

}

class Circle //this represents the circle definition. The components are created below.

{
//1 - define variables. 
    double radius; 
    double area;
    public void findArea(double r) //create assistant who will complete the calculation.
    {
        radius = r;
        area = radius * radius * 3.14;
        //System.out.println(area);
        
    }
    
}



/*
double radius;
Circle c = new Circle(); //make the circle,c name of variable. 'new Circle()' -
                         //is used to create the memory for storing the value of the radius.*/
