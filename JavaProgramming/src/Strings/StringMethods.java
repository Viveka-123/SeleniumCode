package Strings;

import java.util.Arrays;

public class StringMethods 
{
	public static void main(String args[]) 
	{
		
	/*	//String Method-Length()-s.length(0)
		String s="Hello";
		System.out.println(s.length());
		System.out.println("Hello00".length());
//*********************************************************************************************************		
		//String Method-Concatinatio-s.concat()
		String s1="Hi";
		String s2="Viveka";
		String s3="Nanda";
		System.out.println(s1.concat(s2));
		System.out.println(s1+s2);
		System.out.println(s1+s2+s3);
		System.out.println(s1.concat(s2).concat(s3));
		System.out.println("Hi".concat("Viveka").concat("nanda").concat("ok"));
		
//*********************************************************************************************************			
		//String Method-s.trim()
		String x="   Nandana   ";
		System.out.println("Before trim:");	
		System.out.println(x);
		System.out.println("After trim:");
		System.out.println(x.trim());
		
//*********************************************************************************************************		
		//String Method-s.charAt()
		String z="nAnDaNa";
		System.out.println(z.charAt(6));
		System.out.println(z.charAt(0));
		
//*********************************************************************************************************		
		//String Method-s.contains()
		String g="Viveka Nandana";
		System.out.println(g.contains("ka"));
		System.out.println(g.contains("oa"));
		System.out.println(g.contains("NanViv")); 
		System.out.println(g.contains("Viveka "));   
		
//*********************************************************************************************************		
	   //String Method-s.equals(), s.equalsIgnoreCase()
		String p1="Nandana";
		String p2="nandana";
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2));
		System.out.println(p1.equalsIgnoreCase(p2));    ///Ignore Case sensitive
		
//*********************************************************************************************************		
		//String Method-s.replace()
		String r1="Welcome to java selenium python selenium c selenium C#"; 
		String r2="aabbbccaba";
		System.out.println(r1.replace('e','Y'));
		System.out.println(r1.replace("selenium","automation")); 
		System.out.println(r2.replace('a','S').replace('b','Q').replace('c','R'));
		System.out.println(r2.replace('b','Q'));
		System.out.println(r2.replace('c','R'));
		System.out.println(r2);
		
//*********************************************************************************************************		
		//String Method-s.substring()
		String o1="Selenium";
		System.out.println(o1.substring(0,3));
		System.out.println(o1.substring(0,7));   		
		
//*********************************************************************************************************	
		//String Method-s.toUpperCase(), s.toLowerCase()
		String o2="Selenium";
		System.out.println(o2.toUpperCase());
		System.out.println(o2.toLowerCase());  
				
//*********************************************************************************************************	
		//String Method-s.split()
				String o3="chitakulaviveka@gmail.com";
				String arr[]=o3.split("@");
				System.out.println(Arrays.toString(arr));
				System.out.println(arr[0]);
				System.out.println(arr[1]);  
				
				String o4="$$19,12,09";
				System.out.println(o4.replace("$$", " ").replace(",",""));  */
				
				String s="abc,gmail@com";
				String arr[]=s.split(",");
				System.out.println(Arrays.toString(arr));
				System.out.println(arr[0]);
				System.out.println(arr[1]);
				String arr1[]=arr[1].split("@");
				System.out.println(Arrays.toString(arr1));
				System.out.println(arr1[0]);
				System.out.println(arr1[1]);
	}

}