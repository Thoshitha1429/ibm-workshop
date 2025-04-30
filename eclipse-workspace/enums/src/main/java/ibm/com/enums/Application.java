package ibm.com.enums;
enum Apple{
	GoldenDel,
	RedDel,
	Gala
}

public class Application
{
	public static void main( String[] args )
	{
//		Apple apple  = Apple.RedDel;
//		System.out.println(apple);
		
//		apple  = Apple.Valueof("gala");
//		System.out.println(apple);
		
		Apple[] apples = Apple.values();
		
		for (apple apple : apples) {
			System.out.println(apple);
		}
		
		
	}
}