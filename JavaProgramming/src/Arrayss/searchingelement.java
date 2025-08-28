package Arrayss;

public class searchingelement
{
	public static void main(String args[]) 
	{
		/*int a[]= {11,22,33,44,55};
		int search_element=05;
		boolean status=false;
		/*for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]==search_element)
			{
				System.out.println("element found");
				status=true;
				break;
			}
		}
		
		for(int i:a)
		{
			if(i==search_element)
			{
				System.out.println("found");
				status=true;
				break;
			}
		}
			if(status==false)
			{
			System.out.println("element not found");
			}
			*/
			
//**********************************************************************************************************************
		/*String a[]= {"om","jam","jap","kam","kal"};
		String search_element="kal";
		boolean status=false;
		for(String x:a)
		{
			if(search_element==x) 
			{
				System.out.println("element found");
				status=true;
				break;
			}
		}
		if(status==false)
		{
			System.out.println("element not found");
		}
		*/
//******************************************************************************************************************
	/*	int a[]= {1,1,22,33,44,1,1,1,2,23};
		int search_element=1;
		int count=0;
		for(int x:a)
		{
			if(x==search_element)
			{
				count++;
			}
		}
		System.out.println("the number reputation "+count); */
//******************************************************************************************************************
		int x[][]= {
				{3,1,1},
				{2,3,2},
				{3,3,3}
		};
		int search_element=3;
		boolean status=false;
		int count=0;
	/*	for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(x[i][j]==search_element) 
				{
				System.out.println("element found");
				status=true;
				break;
				}
			}
		}
			if(status==false)
			{
				System.out.println("element not found");
			}	
			
//******************************************************************************************************************		
			for(int value[]:x)
			{
				for(int p:value)
				{
					if(p==search_element)
						{
							System.out.println("element found");
							status=true;
							break;
						}					
				}
			}
			if(status==false)
			{
				System.out.println("element not found");
				status=false;
			}	*/
//******************************************************************************************************************
		for(int value[]:x)
		{
			for(int p:value)
			{
				if(search_element==p) 
				{
					count++;
				}
			}
		}
		System.out.println("number of reputation "+count);
	}

}
