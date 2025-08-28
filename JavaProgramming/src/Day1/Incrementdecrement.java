package Day1;

public class Incrementdecrement {

	public static void main(String[] args) {
		//Increment Decrement Operators(++ --)
		
				int a=10;
				a++;
				++a;
				a--;
				--a;
				System.out.println(a);
				
				//a++ = a+1
				//++a = a+1
				//a-- = a-1
				//--a = a-1
		//Case-1
		int x=10;
		x=x+1;
		x=x-1;
		System.out.println(x);
		
		//Case-2 Increments
		int b=10,res;
		res=b++;
		res=++b;
		System.out.println(res);
		System.out.println(b);
		
		//Case-3 Decrements
		int c=10,s;
		res=a--;
		s=--c;
		System.out.println(s);
		System.out.println(c);
	}

}
