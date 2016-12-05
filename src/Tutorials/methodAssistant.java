
package Tutorials;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class methodAssistant {

        public static void main(String[]args) throws FileNotFoundException{

        int result = add(3,5);
        int more = 12;
        int newTotal = result + more;
        System.out.println("Result is : " + result);
        System.out.println("The new total is : " + newTotal);
            
            
            PrintWriter pw = new PrintWriter(new File("C:\\data\\csvFileTest.csv"));
        StringBuilder sb = new StringBuilder();

        sb.append("id");
        sb.append(',');
        sb.append("Name");
        sb.append('\n');
        
        for(int i = 1; i < 12; i++){
        
            sb.append(i + more);
            sb.append(',');
            sb.append(newTotal + i);
            sb.append('\n');

               System.out.println(i+more + "," + (newTotal + i));
        }
        pw.write(sb.toString());
        pw.close();
     
     
        System.out.println("done!");
        
        }

    static int add(int a, int b){
        
        int sum = a+b;
        
        //System.out.println(sum);
        return sum;
    }
    
}
