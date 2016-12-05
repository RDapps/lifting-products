package webStuff;

import java.net.*;
import java.io.*;

//need to look at the 2 elements of this - file save and the reader for the first 2 classes.

public class d{

    public static void main(String[] args) throws Exception {
    
            File file = new File("C:/Data/file1.txt");
        
        if (!file.exists()){
            file.createNewFile();
            
        }
        

    FileWriter fw = new FileWriter(file.getAbsoluteFile());
    BufferedWriter bw = new BufferedWriter(fw);

        URL climbing = new URL("http://www.ukclimbing.com/logbook/crag.php?id=419#maps");
        BufferedReader in = new BufferedReader(
        new InputStreamReader(climbing.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            //System.out.println(inputLine);

            
    bw.write(inputLine);    
        in.close();
        bw.close();

    }
}
