package exceptions;

public class BasicException {

	public static void main(String[] args) {
		
		try {
			int c=10/0;
			System.out.println("The result is "+c);
		} catch (ArithmeticException e) {
			System.out.println("Something went wrong "+e.getMessage());
		}catch (Exception e) {
		System.out.println("jkwfw "+e.getMessage());
		}
		finally {
			System.out.println("End");
		}
		
	}

}
