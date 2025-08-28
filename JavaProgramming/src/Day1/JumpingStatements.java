package Day1;

public class JumpingStatements {

	public static void main(String[] args) {
		int i;
		for(i=1;i<=10;i++)
		{
		if(i>=9)
		{
			break;
		}
		System.out.println(i);
		}
		
//***********************************************************************************************************		
		 for(int a=1;a<=10;a++)
		{
			if(a==2 || a==4)    //i==2 && i==4   combines the values 2, 4 and gets the result
			{
				continue;
			}
		System.out.println(a);
		}
	}
}


