package o1.Basic_Java;

import java.util.Scanner;

/*
    - We can also make methods in a different class.
    - And then call the method by making object of that class.
*/

class Operations {
    // Addition method
    int add(int x, int y) {
        return (x+y);
    }

    // Multiplication method
    int multiply(int x, int y) {
        return (x*y);
    }
}


public class o15_Methods_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();

        Operations obj = new Operations();

        // Method 1- Addition
        int sum = obj.add(a, b);
        System.out.println("The sum of two numbers is : " + sum);

        // Method 2- Multiplication
        int product = obj.multiply(a, b);
        System.out.println("The product of two numbers is : " + product);
    }
}
