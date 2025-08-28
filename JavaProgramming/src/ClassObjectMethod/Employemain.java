package ClassObjectMethod;

public class Employemain 
{
	public static void main(String args[])
	{
		EmployeeClass emp1=new EmployeeClass();
		
		//Objects
		emp1.eid=101;
		emp1.ename="Shiva";
		emp1.job="Accountant";
		emp1.sal=10134;
		emp1.display();
		
		EmployeeClass emp2=new EmployeeClass();
		emp2.eid=102;
		emp2.ename="Ram";
		emp2.job="Sales";
		emp2.sal=10904;
		emp2.display();
}
}
