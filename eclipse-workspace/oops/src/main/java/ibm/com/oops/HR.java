package ibm.com.oops;

public class HR {
	public Employee recruit(String empType) {
		if empType.equalsIgnoreCase("I")){
			Intern intern = new Intern() ;
			return intern;
		}else if empType.equalsIgnoreCase("p")){
			return new Permanent();
		}
		return null;
	}

}
