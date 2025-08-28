package Arrayss;

public class MultiDimensionalArray 
{

	private static final String True = null;

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*int a[][]=new int[2][3];
		a[0][0]=1;
		a[0][1]=2;
		a[1][0]=3;
		a[1][1]=4;
		System.out.println(a[1][1]);
		System.out.println(a.length);       //rows
		System.out.println(a[0].length);	//Columns */
		
//***********************************************************************************************************
		//Read multiple values
		int a[][]= {
						{20,30},
						{29,10},
						{12,65}
						};
//***********************************************************************************************************		
		//Normal for loop
		
	/*	for(int r=0;r<=2;r++)
		{
			for(int c=0;c<=1;c++)
			{
				System.out.print(a[r][c]+"  ");
			}
			System.out.println();
		}
//***********************************************************************************************************	
		for(int r=0;r<a.length;r++)
		{
			for(int c=0;c<a[r].length;c++)
			{
				System.out.print(a[r][c]+"  ");
			}
			System.out.println();
		}
		*/
//***********************************************************************************************************
		//Enhanced For loop
		
		for(int arr[]:a)
		{
			for(int x:arr)
			{
				System.out.print(x+"   ");
			}
			System.out.println();
		}
		/*
//***********************************************************************************************************//***********************************************************************************************************		
		Object a[]= {'A',"welcome",100,10.3,false};      //Arrays accessing heterogeneous data only possible through Object class
		{
			for(Object x:a)
			{
				System.out.println(x);
			}
		}	
		*/
	}

}
