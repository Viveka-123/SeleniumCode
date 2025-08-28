package StringBuffer.StringBuilder;

import java.util.Arrays;

public class MutableImmutable 
{
	public static void main(String args[])
	{
		//String-Immutable(we cannot change)
		String a=new String("SELENIUM");
		a.concat("tutorial");
		System.out.println(a);
		
		//StringBuffer-mutable(we can change)
		StringBuffer b=new StringBuffer("Welcome to SELENIUM");
		b.append(" tutorial");
		System.out.println(b);
		
		//StringBuilder-mutable(we can change)
		StringBuilder c=new StringBuilder("Welcome to JAVA");
		c.append("  tutorial");
		System.out.println(c);
	}
}
