package ibm.com.junit;

public class Calculator {
 
	public int sum(int iNum1,int iNum2) {
		return iNum1+iNum2;
		
	}
	public int divide(int iNum1,int iNum2) {
		return iNum1/iNum2;
}
	public void getConnection(){
		try {
			Thread.sleep(101);
		}catch (InterruptedException e) {
			//TODO auto.generated catch block
			e.printStackTrace();
		}
		System.out.println("Connected..");
	}
	
}