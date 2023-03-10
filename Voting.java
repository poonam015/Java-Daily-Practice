import java.util.Scanner;
class Voting
{
	public static void main(String args[])
	{	
		Scanner ps=new Scanner(System.in);
		String username; int age;
		System.out.println("***************Online Voting System***************");
		System.out.println("Enter Full Name : ");
		username=ps.nextLine();
		System.out.println("Enter Age : ");
		age=ps.nextInt();
		try
		{	
			if(checkAge(age))
			{
				System.out.println("Eligible to vote");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally{
			System.out.println("Thank For Your Time");
		}
	}
	public static boolean checkAge(int age) throws ArithmeticException
	{
		if(age>18)
		{
			return true;
		}
		else
		{
			throw new ArithmeticException("Error: User age is not enough to vote");
		}
	}
}