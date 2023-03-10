// Java program to Calling a Static Method
 
// Class 1
// Poonam class
class Poonam {
 
    // Static method
    public static int sum(int a, int b)
    {
        // Simply returning the sum
        return a + b;
    }
}
 
// Class 2
// Shinde class
class Shinde {
 
    // Main driver method
    public static void main(String[] args)
    {
        // to be summed up
        int X = 30, Y = 50;
 
        // Calling the static method of above class
        int Z = Poonam.sum(X, Y);
 
        // Print and display the sum
        System.out.print("The sum is = " + Z);
    }
}