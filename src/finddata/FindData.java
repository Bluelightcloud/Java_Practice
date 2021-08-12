package finddata;

import java.io.File;
import java.io.FilenameFilter;

public class FindData{
	public static void findData() {
		FilenameFilter filter = new FilenameFilter() {
			public boolean accept(File file, String str) {
				if(str.indexOf("txt") != -1) {
					return true;
				}
				else{
					return false;
				}
			}
		};
		
		File file = new File("C:/Users/hoge/Desktop");
		File[] filelist = file.listFiles(filter);
		
		
		Runnable run = () -> { 
			int i = 0;
			while(i<filelist.length) {
			System.out.println(filelist[i].getName());
			i += 1;
		}};
		run.run();
	}
	
}