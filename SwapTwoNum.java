class SwapVariable {

 public static void main(String[] args) 
{

  int x = 10;
  int y = 20;

  //add both the numbers
  x = x + y;
  y = x - y;
  x = x - y;

  System.out.println("Value of x is :" + x);
  System.out.println("Value of y is :" + y);
 }
}

