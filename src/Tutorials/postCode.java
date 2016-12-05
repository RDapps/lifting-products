/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tutorials;

import java.util.Arrays;

public class postCode {

    public static void main(String[] args){
        
        
        /*
        String str = "CH1A 3PA";
        char myChar = str.charAt(3);
        //String myChar = Character.toString(str.charAt(3));
        System.out.println(myChar);
        //Doesnt work here - 
        if (Character.isAlphabetic(myChar))
        {
           System.out.println("Do nowt");
        } else
        
        {
        String stra = str.replaceAll("[0-9]+", "");

        str = str.replaceAll("[^-?0-9]+", "");
        
        if (str.length()==1)
        {
            str = stra + "0" + str; 
        }else 
        {
            str = stra + str;
        }
        System.out.println(str);
        
        }
    }
 */
        
        //Code generated according to input schema and output schema

String PC = "CH01 3PA";
System.out.println(PC.substring(0,3).replaceAll("[0-9]+", ""));

System.out.println(Character.TITLECASE_LETTER());

}
}
