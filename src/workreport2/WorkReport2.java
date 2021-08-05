package workreport2;
import readwritethread2.ReadWriteThread2;

public class WorkReport2{
	public static void main(String args[]) {
		Thread thread1 = new Thread(new ReadWriteThread2(args[0], args[1], args[2])) ;
		thread1.start();
	}
}