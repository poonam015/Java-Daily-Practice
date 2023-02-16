import java.util.Scanner;
class Poonam
{
   public static void main(String[] args)
   {
      int Ps, i, a;
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter the Size of Array: ");
      Ps = sc.nextInt();
      int[] arr = new int[Ps];
      System.out.print("Enter " +Ps+ " Numbers: ");
      for(i=0; i<Ps; i++)
         arr[i] = sc.nextInt();
      
      a = arr[0];
      for(i=1; i<Ps; i++)
      {
         if(a>arr[i])
            a = arr[i];
      }
      
      System.out.println("Smallest Number In Array = " +a);
   }
}