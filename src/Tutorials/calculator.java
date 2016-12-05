package Tutorials;
public class calculator {
    
    //how to use a method.
    
    public static void main(String[] args) {

        int x = add(5,6);
        System.out.println(x);
        
        int y = difference(10,50);
        System.out.println(y);
        
    }
    
    public static int add(int a, int b) //void replaced with integer becasue the result is being sent back to main method as an int
    {
        
        int sum=a+b;
        return sum;
}
public static int difference(int a, int b) 
{
        int difference=a-b;
        return difference;
}

}