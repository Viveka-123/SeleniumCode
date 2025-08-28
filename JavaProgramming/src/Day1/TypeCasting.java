package Day1;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			 int i=2;
			double j=i;
			System.out.println(j);
			System.out.println(i);
			
			
		double a=9.34567;
		int b=(int) a;
		System.out.println(a);
		System.out.println(b);
			
			
		int x=23,y=45;
		float z1=(float) x*y/100;
		System.out.println(z1);

	
	     String S = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	     System.out.println("The length: " + S.length());
	     
	     String txt = "Hello World";
	     System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
	     System.out.println(txt.toLowerCase());
	     
	     String o = "10";
	     String p = "20";
	     String k = o + p; 
	     System.out.println(k);
	     
	     System.out.println(Math.random());  
	}

}
