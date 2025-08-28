package Arrayss;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int p[]= {75,53,133,24,15};
		System.out.println("Before sorting"+Arrays.toString(p));
		Arrays.sort(p);										//sorting
		System.out.println("After sorting"+Arrays.toString(p));
		System.out.println();
		for(int i=p.length-1;i>=0;i--)
		{
			System.out.println("Reverse elements "+p[i]);		//reverse
		}
//***********************************************************************************************************		
		String o[]= {"oo","ii","pp"};
		System.out.println("Before sorting"+Arrays.toString(o));
		Arrays.sort(o);										//sorting
		System.out.println("After sorting"+Arrays.toString(o));
		System.out.println();
		for(int i=o.length-1;i>=0;i--)
		{
			System.out.println("Reverse elements "+o[i]);		//reverse
		}
	}

}
