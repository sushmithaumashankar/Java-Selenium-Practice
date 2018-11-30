package parameterPassing;

public class PPDemo2 {

	public int add(int a, int b) {
		int c = a + b;
		return c;
	}

	public String concatenate(String fn, String ln) {
		String result = fn + " " + ln;
		return result;
	}

	public double sub(double d, double e) {
		double f = d - e;
		return f;
	}
}
