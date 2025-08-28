package ClassObjectMethod;

public class Methods 
{
	//1) No params No return value
	void m1()
	{
		System.out.println("hello");
	}
	
	//2) No params With return value
		String m2()
		{
			return "Selenium Tutorial";
		}
	
	//3) Takes params With No return value
	 //  void m3(int a)
		//{
		//	System.out.println("Hi "+a);
		//}
	   
	   void m4(String name,int a)
		{
			System.out.println(name+" "+a);
		}
	 //4) Takes params With return value
	   int m5(int a)
		{
			return 12;
		}
	   
}
