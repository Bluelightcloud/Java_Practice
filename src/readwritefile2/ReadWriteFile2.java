package readwritefile2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteFile2
{
	public static void readWriteFile(String num, String work, String time) {
		try {
			File rfile = new File("D:/a1.txt");
			File wfile = new File("");
			BufferedReader br = new BufferedReader(new FileReader(rfile));
			BufferedWriter bw = new BufferedWriter(new FileWriter(wfile));
			String text;
			
			while((text = br.readLine()) != null) {
				if(text.indexOf("本日の作業内容") > -1) {
					bw.write(text);
					bw.write("\r\n");
					bw.write("\t明日どうするか考えた");
					bw.write("\r\n");
				}else if((text.indexOf("作業時間")) > -1){
					bw.write(text);
					bw.write("\r\n");
					bw.write("\t3時間");
					bw.write("\r\n");
				}else {
					bw.write(text);
					bw.write("\r\n");
				}
			}
			
			br.close();
			bw.close();
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}