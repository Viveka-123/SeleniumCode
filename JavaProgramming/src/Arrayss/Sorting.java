package Arrayss;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) 
	{
		    int y[]= {12,34,56,78,89,90,10};
			System.out.println("Before Sorting "+Arrays.toString(y));
			Arrays.sort(y);
			System.out.println("After Sorting "+Arrays.toString(y));
			System.out.println();
			
			String x[]= {"cat","dog","fish","book","pen"};
			System.out.println("Before Sorting "+Arrays.toString(x));
			Arrays.sort(x);
			System.out.println("After Sorting "+Arrays.toString(x));
			System.out.println();

			char z[]= {'c','a','F','P','O'};
			System.out.println("Before Sorting "+Arrays.toString(z));
			Arrays.sort(z);
			System.out.println("After Sorting "+Arrays.toString(z));
			
			int a[]= {50,20,40,10,100};
			System.out.println("Before Sorting"+Arrays.toString(a));
			Arrays.sort(a);
			System.out.println("After Sorting"+Arrays.toString(a));
	}

}
