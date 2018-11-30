package classDemo;

public class FirstClassDemo {

	int x = 100;
	int y = 90;

	public void sum() {
		int x = 100;
		int y = 82;
		int sum = x + y;
		System.out.println("The sum is " + sum);
	}

	public static void main(String[] args) {
		FirstClassDemo c1 = new FirstClassDemo();
		c1.sum();
		System.out.println("X value is " + c1.x);
		System.out.println("Y value is " + c1.y);
		Secondclassdemo c2 = new Secondclassdemo();
		c2.sum1();
		c2.sub1();
		Secondclassdemo.new1();

	}

}
