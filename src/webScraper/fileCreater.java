package webScraper;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class fileCreater{
    
    public static void main(String[] args) throws Exception{
            
        File file = new File("C:/Data/file1.txt");
        
        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);
        
        if (!file.exists()){
            file.createNewFile();
            
        }
    }
    
}