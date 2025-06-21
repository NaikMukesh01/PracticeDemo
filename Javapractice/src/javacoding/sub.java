package javacoding;

public class sub {

	public int add(int n, int d) {
		int s;
		s = n + d;
		System.out.println("addition :" + s);
		return s;
	}

	public int add1(int n, int d) {
		int s;
		s = n + d;
		System.out.println("addition 2:" + s);
		return s;
	}

	public int sub1(int n, int d) {
		int sb;
		sb = n - d;
		System.out.println("substraction :" + sb);
		return sb;
	}

	public int mul(int n, int d) {
		int ml;
		ml = n * d;
		System.out.println("multiplication :" + ml);
		return ml;
	}
	public void div(int n, int d) {
		int ml;
		ml = n / d;
		System.out.println("div :" + ml);
	
	}

	public static void main(String[] args) {
		sub obj = new sub();

		int result1 = obj.add(10, 2); // 12
		int result2 = obj.add1(result1, 2); // 14
		int result3 = obj.sub1(result2, 2); // 12
		int result4 = obj.mul(result3, 2); // 24
		obj.div(result4, 2); // 12
	}
}
