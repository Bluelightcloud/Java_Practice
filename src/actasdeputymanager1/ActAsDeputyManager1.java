package actasdeputymanager1;

interface Management{
	
	public void manage();
}

public class ActAsDeputyManager1{
	public void main(String args[]) {
		Management mng = () -> {
			System.out.println("a");
		};
		
		mng.manage();
	}
}