package readfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile
{
	public static void readFile(String f){
		try {
			File file = new File(f);
			BufferedReader br = new BufferedReader(new FileReader(file));
			String text;
			while((text = br.readLine()) != null) {
				System.out.println(text);
			}
			br.close();
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
}
