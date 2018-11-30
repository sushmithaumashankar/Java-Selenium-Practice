package condition_practice;

public class IfelseDemo {

	public static void main(String[] args) {
		int a = 100;
		if (a <= 100) {
			System.out.println("a is greater than " + a);
		} else {
			System.out.println("a is lesser than " + a);
		}

		String browser = "chrome";
		if (browser.equalsIgnoreCase("CHROME")) {
			System.out.println("true");
		} else {
			System.out.println("False");
		}
	}
}
