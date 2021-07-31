package writefile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile
{
	public static void writeFile(String f){
		try {
			File file = new File(f);
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
				
			bw.write("\t\t 報告書");
			bw.write("\r\n");
			bw.write("本日の報告内容");
				
			bw.close();
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}