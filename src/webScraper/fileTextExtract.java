
package webScraper;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;



public class fileTextExtract {
    public static void main(String[] args) throws FileNotFoundException, IOException
{

    for (int i = 419; i <420; i++) {
    
    InputStream ips = new FileInputStream("C:/Data/file" + i + ".txt"); 
    InputStreamReader ipsr = new InputStreamReader(ips); 
    BufferedReader br1 = new BufferedReader(ipsr); 

    String ligne = br1.readLine();
    
    
    String start = "<title>";
    String end = "</title>";
    
    
    
    String id = ligne.substring(ligne.indexOf(start), ligne.indexOf(end));
   
    String title = id.substring((7));
    System.out.println(title);
    //System.out.println(i);
   
        String buttStart = "buttress";
        int buttEnd = 300;
        
        String buttress = ligne.substring(ligne.indexOf(buttStart), ligne.indexOf(buttStart) + buttEnd);
        System.out.println(buttress);
   
    }   
}
    
}
