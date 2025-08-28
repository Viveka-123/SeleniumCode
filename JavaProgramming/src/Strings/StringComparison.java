package Strings;

import ClassObjectMethod.EmployeeClass;

public class StringComparison {
	public static void main(String args[]) 
	{
		String s1="SELENIUM";
		String s2="SELENIUM";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));   
		
		String s3=new String("SELENIUM");
		String s4=new String("SELENIUM");
		System.out.println(s3==s4);   			//compares the Objects
		System.out.println(s3.equals(s4));       //Compares the VAlues of the Object
		
		String s5="SELENIUM";
		String s6=new String("SELENIUM");
		System.out.println(s5==s6);
		System.out.println(s5.equals(s6));  
		
	/*	public static void main(String args[])
		{
			EmployeeClass emp1=new EmployeeClass();
			
			//Objects
			emp1.eid=101;
			emp1.ename="Shiva";
			emp1.job="Accountant";
			emp1.sal=10134;
			emp1.display();
			
			EmployeeClass emp2=new EmployeeClass();
			emp2.eid=102;
			emp2.ename="Ram";
			emp2.job="Sales";
			emp2.sal=10904;
			emp2.display(); */
		
		
	}

}
