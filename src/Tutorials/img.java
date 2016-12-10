//http://javadevnotes.com/java-read-text-file-examples
package modelNumber;
//import java.io.IOException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * A simple example program that reads a text file line by line and display each line.
 */
public class img {
        public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("C:\\data\\names.csv"));
            String line;
            while ((line = br.readLine()) != null) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                
                sb.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        //rename file using second second delimiter
        String contents = sb.toString();
        String[] splitComma = contents.replaceAll("\n", ",").split(",");
          
        for (int a = 0 ; a < 601 ; a = a + 2){
            
        String evens=String.valueOf(splitComma[a]);
        String odds=String.valueOf(splitComma[a + 1]);
        
        System.out.println(a + " - " + evens);
        System.out.println(a + 1 + " - " + odds);
        
        File file = new File("C:/data/haacon/haacon/www.haacon.de/media/dxf/dxf/" + evens +".html");
        File file2 = new File("C:/data/haacon/haacon/www.haacon.de/media/dxf/dxf/" + odds + ".dxf");
        file.renameTo(file2);
        
        
        
        //List<String> elephantList = Arrays.asList(contents.split(","));
        
        //System.out.println(elephantList);
        //System.out.println(contents);
        }
    }
}