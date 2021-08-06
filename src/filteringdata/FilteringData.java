package filteringdata;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FilteringData{
	public static void filteringData() {
		try {
			File file = new File("C:/Users/浜松　翔大/Desktop/java_advanced_file/Javaベーシック/問題16等で使用/EmployeeList.dat");
			BufferedReader br = new BufferedReader(new FileReader(file));
			List<String> list = new ArrayList<>();
			String s;
			while((s = br.readLine()) != null) {
				list.add(s);
			}
			list.forEach(a -> {
				if(a.indexOf("開発") == -1)return;
				System.out.println(a);});
			
			br.close();
		}catch(FileNotFoundException e) {
			System.err.println(e);
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}