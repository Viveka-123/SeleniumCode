package Arrayss;

import java.util.Arrays;
import java.util.Scanner;

public class SingleDimensionalArray {

	public static void main(String[] args)
	{
					//Approach-1
					//int a[]=new int[5];
				/*	int a[]= {100,200,300,400,500,00};
					System.out.println(Arrays.toString(a));
					System.out.println(a.length);
					
//**************************************************************************************************************
				 //Approach-2
					int a[]=new int[5];
					a[0]=100;
					a[1]=20;
					a[2]=30;
					a[3]=40;
					a[4]=50;
					//System.out.println(a[3]);               40
					//System.out.println(a.length);           5
					
//***********************************************************************************************************
					
					//Read all data
					//for(int i=0;i<a.length;i++)
						//for(int i=0;i<=a.length-1;i++)	
							//for(int i=0;i<5;i++)
								for(int i=0;i<=4;i++) 
					{
						System.out.println(a[i]);
					}

//***********************************************************************************************************
					String X[]= {"apple","Ball","Cat"};
					for(String i:X)
					{
						System.out.println(i);
					}

//***********************************************************************************************************
					int x[]= {1,2,3,4,5};
					for(int i:x)
					{
						System.out.println(i);
					}
					

//***********************************************************************************************************
					String[] cars = {"polvo", "BMW", "Ford", "Mazda"};
					cars[0] = "volva";
					System.out.println(cars[0]);
	
						String carss[] = {"Volvo", "BMW", "Ford"};
						for (int i = 0; i <=carss.length-1; i++) 
						{
						  System.out.println(cars[i]);
							}*/
//***************************************************************************************************************
					int a[]=new int[5];
					Scanner sc=new Scanner(System.in);
					for(int i=0;i<a.length;i++)
					{
						System.out.println("Index "+i+":");
						a[i]=sc.nextInt();
					}
					System.out.println("Array Elements"+Arrays.toString(a));
					Arrays.sort(a);
					System.out.println("After Sorting"+Arrays.toString(a));
			
	}
}
	

