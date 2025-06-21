package javacoding;

public class Addsubmul {

 public int add(int n, int d)
 {
	 int s;
	 s= n+d;
	System.out.println("addition :"+s);
	return s;
 }
 
 public int sub(int n, int d)
 {
	 int sb;
	 sb= n-d;
	System.out.println("substraction :"+sb);
	return sb;
 }
 public int mul(int n, int d)
 {
	 int ml;
	 ml= n*d;
	System.out.println("multiplication :"+ml);
	return ml;
 }
 public static void main(String[] args) {
	
	 Addsubmul mult=new Addsubmul();
	 int addition=mult.add(12, 11);
	 int substraction=mult.sub(11, 5);
	 mult.mul(addition, substraction);
	 
}
 
}
