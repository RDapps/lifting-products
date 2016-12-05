package Java21;

import java.io.File;

public class FileExists{
    public static void main(String Args[]) {
        
        /*
        String testFileName = "Quote_";
        String testFileLoc = "C:/data01/";
        int fileNum = 71;
        int fileVers = 0;
        String ext = ".csv";
        
        
        File f = new File(testFileLoc + testFileName + fileNum + "_" + fileVers + ext);
        
        if(f.exists() && !f.isDirectory()) {
        System.out.println("yes");
        System.out.println(f);
        
        fileVers = fileVers + 1;
                
        System.out.println("vers added " + f);    
        
        } else
        {
            
        System.out.println("no " + f);    
            System.out.println("no");
        }
        */
        
        /*File f = new File("/data01/Talend/MSM/Inbound/IQ/Motor/Load/" + context.FileName + "_" + context.i + ".csv");*/
        
File f = new File("/data01/Talend/MSM/Inbound/IQ/Motor/Load/.csv");
        
        if(f.exists() && !f.isDirectory()) 
        {
		System.out.println("yes");
        } else
        {
		System.out.println("no");
        }
        
    }
}
    