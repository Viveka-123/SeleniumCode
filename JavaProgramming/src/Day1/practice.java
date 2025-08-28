package Day1;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.println(10+2);
		System.out.println("Code"+"Chef");  //Concatenate
		System.out.println("10"+"chef");    //Concatenate
		System.out.println(8 + "\n" + 13 + " " + 21 + "\n");  //\n=New line /t=Horizontal space\
		System.out.println("Hello " + "World" + 5 + " endl" + 2); 
		System.out.println("I"+"\n"+"love"+"\n"+"CodeChef");
		
		    System.out.println("1-"+ 1*1);
	        System.out.println("2-"+ 2*2);
	        System.out.println("3-"+ 3*3);
	        System.out.println("4-"+ 4*4);
	        System.out.println("5-"+ 5*5);
	        
	        double temperature=25.5,kelvin;
	        kelvin=temperature+273;
	        System.out.println("Celsius- "+ temperature);
	        System.out.println("Kelvin- "+ kelvin);
		
	        System.out.println(Math.max(5,4));
	        System.out.println(Math.min(5,4));
	        System.out.println(Math.sqrt(16));
	        System.out.println(Math.abs(-5));
	        System.out.println(Math.random()*101);
	        
	        int r = (int)(Math.random() * 10);
	        System.out.println(r);
//***********************************************************************************************************	        
	        int a[]= {10,20,30,40,50},Sum=0;
	        {
	        	for(int i=0;i<a.length;i++) 
	        	{
	        		Sum=Sum+a[i] ;
	        	}
	        	System.out.println(Sum);    
	        }
//***********************************************************************************************************        
	        int a[]= {1,2,3,4,5};
	        int i = 0;
	        for(i=0;i<=a.length-1;i++)
	        {
	        if(a[i]%2==0)
	        {
	        	System.out.println("Even - "+a[i]);	        	
	        }
	        else
	        {
	        	System.out.println("Odd - "+ a[i]);
	        }*/
//***********************************************************************************************************		
		int a[]= {1,2,3,4,5};
		int i=0,fact=1;
		for(i=0;i<=a.length-1;i++)
		{
			fact=fact*a[i];
		}
		System.out.println(fact);
}

}
