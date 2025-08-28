package StringExamples;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) 
	{
		//taking Input from Console-to reverse string using CharAt(),Length() Methods.
	/*	Scanner sc=new Scanner(System.in);	
		System.out.println("String:-");
		String num=sc.next();
		String rev="";
		for(int i=num.length()-1;i>=0;i--)
		{
			rev=rev+num.charAt(i);
		}
		System.out.println(rev);	 
	
//***********************************************************************************************************//***********************************************************************************************************		
		//taking Input directly-to reverse string using CharAt(),Length() Methods.
		String s="SELENIUM";
		String rev="";
		System.out.println("Before Reverse string:-"+s);
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("Reverse string:-"+rev);
		
//***********************************************************************************************************//***********************************************************************************************************		
		//Without any Methods-Using arrays reversing the String.
		String s="ELON MASK";
		char a[]=s.toCharArray();
		String rev="";
		System.out.println("Before Reverse string:-"+s);
		for(int i=a.length-1;i>=0;i--)
		{
			rev=rev+a[i];
		}
		System.out.println("Reverse string:-"+rev);			*/
	
//***********************************************************************************************************//***********************************************************************************************************		
		//Using StringBuffer, StringBuilder Classes
		StringBuffer s=new StringBuffer("SELENIUM");
		StringBuilder o=new StringBuilder("Welcome");
		System.out.println(s.reverse());
		System.out.println(o.reverse());
	}
}
