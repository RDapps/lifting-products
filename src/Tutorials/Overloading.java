package Tutorials;

public class Overloading{
    
    public static void main(String[] args){
        Maths maths=new Maths(); //create object - specify class name Maths
        double no = maths.max(5.0,7); // the max of the 2 int in a variable no.
        System.out.println(no);
        
    }
    
}    
    class Maths
    {
 
        public int max(int x, int y)
        {
            int max = 0;
            if(x>y)
            {
                max = x;
            }
            else 
            {
            max = y;
            }
            System.out.println("Integer Called");
            return max;
        }
                public double max(double x, double y)
        {
            double max = 0;
            if(x>y)
            {
                max = x;
            }
            else 
            {
            max = y;
            }
            System.out.println("Double Called");
            return max;
        }
    }
