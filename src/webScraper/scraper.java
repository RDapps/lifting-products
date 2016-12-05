package webScraper;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class scraper{

    public static void main(String[] args) throws Exception{
    
        URL climbing = new URL("http://www.ukclimbing.com/logbook/crag.php?id=419#maps");
        BufferedReader in = new BufferedReader(
        new InputStreamReader(climbing.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            inputLine = inputLine;
            
            }           

}