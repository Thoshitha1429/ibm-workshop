package ibm.com.exceptions;

public class Application {
	

public static void main(String[] args) {

System.out.println("Start");

try {

  System.out.println(Integer.parseInt(args[0])/Integer.parseInt(args[1]));

} catch (ArrayIndexOutOfBoundsException ex) {

System.out.println("Run the program 2 numbers");

catch (ArithmeticException ex)

System.out.println("You cannot divide by zero");

catch (NumberFormatException ex) {

System.out.println("Please provide valid numbers");

System.out.println("End");
}
}