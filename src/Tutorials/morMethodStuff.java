package Tutorials;

class morMethodStuff{
public static void main(String[] args){ //this is the main method.

    int i=6, j=5, result;
    result = max(i,j);
    System.out.println(result);
}
    
    public static int max(int a, int b){
        int max;
        if(a>b)
            max = a;
        else
            max = b;
        return max; //return send the result back tyo the main method.
        
    }

}