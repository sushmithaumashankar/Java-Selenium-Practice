package stringclass;

public class StringDemo2 {

	public static void main(String[] args) {
		String fullname = "Welcome to the selenium";
		String[] tollname = fullname.split(" ");
		for (int i = 0; i < tollname.length; i++) {
			System.out.println("the value of " + i + " is " + tollname[i]);
			if (tollname[i].contains("to")) {
				System.out.println("result found");
				break;
			}
		}

	}

}
