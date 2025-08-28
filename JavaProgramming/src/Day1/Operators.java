package Day1;

public class Operators {

	public static void main(String[] args) {
		
		//Arithmetic Operators(+,-,*,/,%)
		
		/*int x=10,y=20;
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
		y=5;
		System.out.println("the add of x nd y is " +(x+y));
		System.out.println("the sub of x nd y is " +(x-y));
		System.out.println("the mul of x nd y is " +(x*y));
		System.out.println("the div of x nd y is " +(x/y));
		System.out.println("the mod of x nd y is " +(x%y));
		
		
		int z=x+y;
		System.out.println(z);*/
		
//***********************************************************************************************************		
		//Relational Operators(<,<=,>,>=,=!,==)
	
		int r=10,t=20;
		t=5;
		System.out.println(r<t);
		System.out.println(r<=t);
		System.out.println(r>t);
		System.out.println(r>=t);
		System.out.println(r==t);
		System.out.println(r!=t);
		
		boolean q=r<t;
		System.out.println(q);
		
//***********************************************************************************************************		
		/*//Logical Operators(&&,||,!)
		
		int o=10,b3=20,c=4,d=1;
		System.out.println((o>b3)&&(c==d));
		
		boolean b1=true;
		boolean b2=false;
		System.out.println(b1&&b2);
		System.out.println(b1||b2);
		System.out.println(!b2);
		
//***********************************************************************************************************		
		//Assignment Operators(+=,-=,*=,/=,%=)
		
		int a=-150;
		a+=10;
		a=a+10;
		System.out.println(a);
		System.out.println(a+=10);
		System.out.println(a=a+10);
		
		int b=50;
		b-=10;
		b=b-10;
		System.out.println(b);
		System.out.println(b-=10);
		System.out.println(b=b-10);
		
		int c1=20;
		c1*=10;
		c1=c1*10;
		System.out.println(c1);
		System.out.println(c1*=10);
		System.out.println(c1=c1*10);
		
		int d1=-10;
		d1/=10;
		d1=d1/10;
		System.out.println(d1);
		System.out.println(d1/=10);
		System.out.println(d1=d1/10);
		
		int e=25;
		e%=10;
		e=e%10;
		System.out.println(e);
		System.out.println(e%=10);
		System.out.println(e=e%10);
		
//***********************************************************************************************************		
		//Ternary Operators(+=,-=,*=,/=,%=)
		
		int x1=10,y1=20,c11;
		c11=(x1>y1)?x1:y1;
		System.out.println(c11);
		
		int zz=(1==1)?10:20;
		System.out.println(zz);
		
		int age=25;
		String res=(age>=18)?"Eligible":"not Eligible";	
		System.out.println(res);
		
		int weather=40;
		//String Season=(weather=50)?"Summer":"Winter"; //(@throws error cannot convert from int to boolean because = is assignment)
		String Season=(weather==40)?"Summer":"Winter";  //== is relational which is boolean,so accepts
		System.out.println(Season);
		*/
		int n1=10,n2=6;
		int b=(n1>n2)?n2:n1;
		System.out.println(b);
	}

}
