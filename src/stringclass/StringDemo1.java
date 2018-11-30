package stringclass;

public class StringDemo1 {

	public static void main(String[] args) {
		String name1 = "Welcome to the Selenium";
		String name2 = "welcome to the Selenium";
		boolean result1 = name1.startsWith("Welcome");
		boolean result2 = name2.endsWith("world");
		System.out.println("The status is " + result1);
		System.out.println("The status is " + result2);

		boolean res3 = name1.equals(name2);
		System.out.println("The result 3 is " + res3);
		boolean res4 = name1.equalsIgnoreCase("welcome to the Selenium");
		System.out.println("The result 4 is " + res4);
		boolean res5 = name1.contains("to");
		System.out.println("The result 5 is " + res5);
	}

}
