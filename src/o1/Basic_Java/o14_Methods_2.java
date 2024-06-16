package o1.Basic_Java;

import java.util.Scanner;
/*
    - A method can be called by:
        * creating an object of class in which the method exists
        * followed by the method call

    - Method does not need to be "static", as we are calling method by making object of the class
*/
public class o14_Methods_2 {
    // Addition method
    int add(int x, int y) {
        return (x+y);
    }


    // Multiplication method
    int multiply(int x, int y) {
        return (x*y);
    }



    // Driver code
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        // Taking input
        System.out.print("Enter first number : ");
        int a= sc.nextInt();
        System.out.print("Enter second number : ");
        int b= sc.nextInt();

        o14_Methods_2 obj= new o14_Methods_2();                         // Creating object "obj" of class "o14_Methods_2"

        // Method 1- Addition
        int sum= obj.add(a,b);                                          // Method 1- Addition
        System.out.println("The sum of two numbers is : " + sum);

        // Method 2- Multiplication
        int product= obj.multiply(a,b);                                 // Method 2- Multiplication
        System.out.println("The product of two numbers is : " + product);
    }
}
