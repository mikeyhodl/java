import java.net.*;
import java.io.*;

public class ReadURL {
   public static void main(String[] args) throws Exception {
	   URL osu = new URL("http://www.osu.edu/");
	BufferedReader in = new BufferedReader( 
				new InputStreamReader(osu.openStream()));
	String inputLine;
	while ((inputLine = in.readLine()) != null)
	    System.out.println(inputLine);
	in.close();
    }
}