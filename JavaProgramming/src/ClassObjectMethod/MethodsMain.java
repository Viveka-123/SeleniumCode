package ClassObjectMethod;

public class MethodsMain {

	public static void main(String[] args) {
		
		Methods met=new Methods();
		met.m1();
		String s=met.m2();
		System.out.println(s);
		//System.out.println(met.m2());
		met.m4("Selenium",12);
		System.out.println(met.m5(12));
		
	}

}
