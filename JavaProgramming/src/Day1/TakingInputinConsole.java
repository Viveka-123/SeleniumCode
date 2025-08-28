package Day1;

import java.util.Scanner;

public class TakingInputinConsole {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		/*System.out.println("Enter the Number:");
		int num=sc.nextInt();
		System.out.println("Entered number is "+num);
		
		System.out.println("double:-");
		double n=sc.nextDouble();
		System.out.println("double number is "+n);
		
		System.out.println("String:-");
		String m=sc.next();
		System.out.println("String is "+m);   */
		
		System.out.println("Number 1:-");
		int n1=sc.nextInt();
		System.out.println("Number 2:-");
		int n2=sc.nextInt();
		System.out.println("Sum " +(n1+n2));
		System.out.println("Minus " +(n1-n2));
		System.out.println("Multi " +(n1*n2));
		System.out.println("Div " +(n1/n2));
	}

}
