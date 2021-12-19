class Employeewageattendanceuc1 
{
	public static void main(String[] args) 
	{
	  int EMP = 1;
	  double empcheck = Math.floor(Math.random() * 10) % 2;
	  if (empcheck == EMP)
	  {
		  System.out.println("employee is present");
	  }
	  else {
		  System.out.println("employee is absent");
	  }
	}
}
