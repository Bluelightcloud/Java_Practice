package readwritethread2;

import readwritefile.ReadWriteFile;

public class ReadWriteThread2 implements Runnable{
	String rf;
	String wf;
	
	public ReadWriteThread2(String rf, String wf){
		this.rf = rf;
		this.wf = wf;
	}
	
	@Override
	public void run() {
		System.out.println("書き込み開始");
		ReadWriteFile.readWriteFile(rf, wf);
	}
}