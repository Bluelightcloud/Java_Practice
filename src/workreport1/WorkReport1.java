package workreport1;
import readwritethread1.ReadWriteThread1;

public class WorkReport1{
	public static void main(String args[]) {
		Thread thread1 = new Thread(new ReadWriteThread1("D:/a1.txt", "D:/a2.txt")) ;
		thread1.start();
	}
}