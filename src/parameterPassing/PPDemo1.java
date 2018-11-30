package parameterPassing;

public class PPDemo1 {

	public static void main(String[] args) {
		PPDemo2 obj1 = new PPDemo2();
		int sum = obj1.add(10, 20);
		System.out.println("The addidtion is " + sum);

		double sub = obj1.sub(78.32, 12.3);
		System.out.println("The sub is " + sub);

		String name = obj1.concatenate("sushmitha", "umashankar");
		System.out.println("The name is " + name);

	}
}
