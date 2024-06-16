package o1_Basic_Java;

import java.util.Scanner;

public class o13_Methods_1 {
/*
    Method - Function inside class


    Method syntax :
    Return_datatype   method_name(Parameters) {
        (Method body)
    }


    - Static method can only call static method.
      That's why "add" / "multiply" methods also need to be static, as main method is also static.

    - If you are calling any method directly from main function(without making an object),
      then the called methods must be static.

    - static method does not associate with the "object of class", but the class itself.
 */


    // Addition method
    static int add(int x, int y) { return (x+y); }


    // Multiplication method
    static int multiply(int x, int y) { return (x*y); }



    // Driver code
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        // Taking input
        System.out.print("Enter first number : ");
        int a= sc.nextInt();
        System.out.print("Enter second number : ");
        int b= sc.nextInt();

        // Method 1- Addition
        int sum= add(a,b);
        System.out.println("The sum of two numbers is : " + sum);

        // Method 2- Multiplication
        int product= multiply(a,b);
        System.out.println("The product of two numbers is : " + product);
    }
}
