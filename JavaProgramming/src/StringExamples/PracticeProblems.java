package StringExamples;

import java.util.Scanner;

public class PracticeProblems {

	public static void main(String[] args) 
	{
		//PALIDROME program
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("Enter string:-");
		String s=sc.next();
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);		
		if(s.equals(rev))
		{
			System.out.println("IS Palidrome");
		}
		else
		{
			System.out.println("Not Palidrome");
		}
		
		//Replace of junk Special Characters in String
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter the String:---");
		String s1=sc.next();
		String s2=s1.replaceAll("[^a-zA-Z0-9 ]", "");
		System.out.println(s2);		
		*/
		//Remove of White Spaces in String
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter the String:---");
		String s3=sc.nextLine();
		String s4=s3.replace(" ", "");
		System.out.println(s4);   
		
	}

}
