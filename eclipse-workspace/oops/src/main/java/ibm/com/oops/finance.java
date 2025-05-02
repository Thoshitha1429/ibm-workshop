package ibm.com.oops;

public class finance {

public static void main(String args[]) {
	HR hr=new HR();
	Finance finance args=new Finance();
	Employee employee = hr.recruit("i");
	if (employee != null) {
		finance.processSalary(employee);
	}
	employee = hr.recruit("p");
	if employee !=null){
		finance.processSalary(employee);
		
	}
}
        

