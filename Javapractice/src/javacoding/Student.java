package javacoding;

public class Student {

	int n;
	String s;
	
	public void name()
	{
		System.out.println("Mukesh");
	}

	public static void main(String[] args) {
		
		Student sr=new Student();
		sr.n=9;
		sr.s="name";
		System.out.println("number :"+sr.n);
		System.out.println("number :"+sr.s);
		
	}

}
