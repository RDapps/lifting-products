/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webScraper;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author richard.drury
 */
public class ChangeName {
    

    
    /*String["fctSaleMotor.txt","fctQuoteFailure.txt"] oldName;
    String["",""] newName;
    */
    
    public static void main(String[] args) throws IOException{

            for(int a=0 ; a < 2 ; a++){
        
            String[] oldName = {"fctClickMotor","fctQuoteFailure"};
            String[] newName = {"fctSaleMotorAA","fctQuoteFailureAA"};
        
            
            
    // File (or directory) with old name
            File file = new File("C:\\Data\\" + oldName[a] + ".txt");

            System.out.println("File to Rename = " + file);
            
// File (or directory) with new name
            File file2 = new File("C:\\Data\\Testing\\" + newName[a] + ".txt");
            
            if (file2.exists())
            throw new java.io.IOException("file already exists");

            if (file.exists()){
            file.renameTo(file2);
            System.out.println("Filename changed to - " + file2);
            }else
                System.out.println("The file you want to rename doesn't exist!!");
            }
    }
}
