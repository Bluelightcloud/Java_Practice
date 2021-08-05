package readwritethread2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteThread2 implements Runnable{
	String num;
	String work;
	String time;
	
	public ReadWriteThread2(String num, String work, String time){
		this.num = num;
		this.work = work;
		this.time = time;
	}
	
	@Override
	public void run() {
		try {
			File rfile = new File("D:/a1.txt");
			File wfile = new File("D:/report_" + num + ".txt");
			BufferedReader br = new BufferedReader(new FileReader(rfile));
			BufferedWriter bw = new BufferedWriter(new FileWriter(wfile));
			String text;
			
			while((text = br.readLine()) != null) {
				if(text.indexOf("本日の作業内容") > -1) {
					bw.write(text);
					bw.write("\r\n");
					bw.write("\t" + work);
					bw.write("\r\n");
				}else if((text.indexOf("作業時間")) > -1){
					bw.write(text);
					bw.write("\r\n");
					bw.write("\t" + time);
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