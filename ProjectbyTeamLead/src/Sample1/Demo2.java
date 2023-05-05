package Sample1;

//@Author- HiteshQAEngineer
public class Demo2 
{
	public static void main(String[] args)
	{
		int marks = 23;
		String UN = "HiteshDesale";
		String PWD = "Test@1234";
		
		if(marks <= 25)
		{
			System.out.println("Student is pass");
			if (UN == "HiteshDesale")
			{
				System.out.println("UN is correct, ask him to enter pwd");
			}
			else
			{
				System.out.println("PWD is correct");
				System.out.println("Login successfully");
			}
		}
		else
		{
			System.out.println("Student is fail");
		}
		
		
		
		
		
		
		
	}

}
