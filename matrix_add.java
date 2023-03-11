import java.util.Scanner;
class matrixadd{

		public static void main(String args[])
{
		int i,j;
		Scanner ps=new Scanner(System.in);
		System.out.println("Enter num of rows");
		int rows=ps.nextInt();
		System.out.println("Enter num of columns");
		int cols=ps.nextInt();

		int arr[][]=new int[rows][cols];
		int brr[][]=new int[rows][cols];
		int res[][]=new int[rows][cols];
		System.out.println("Enter first array values");

		for(i=0;i<rows;i++)
		{
			for(j=0;j<cols;j++)
				{
				arr[i][j]=ps.nextInt();
			}
		}
	System.out.println("Enter second array values");

		for(i=0;i<rows;i++)
		{
			for(j=0;j<cols;j++)
				{
				brr[i][j]=ps.nextInt();
			}
		}
	
		for(i=0;i<rows;i++)
	{

		for(j=0;j<cols;j++)
		{
			res[i][j]=arr[i][j]+brr[i][j];

		}

		}
		System.out.println("Addition is : ");
for(i=0;i<rows;i++)
	{

		for(j=0;j<cols;j++)
		{
			System.out.print(res[i][j]+"   ");

		}
			System.out.println();

		}

}
}