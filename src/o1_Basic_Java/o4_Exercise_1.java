package o1_Basic_Java;

import java.util.Scanner;

public class o4_Exercise_1 {

    // Q1. Write a program to add three decimal numbers (Up to 5 digits after decimal)
    public static void add_Three_Numbers() {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter first number : ");
        float num1= sc.nextFloat();

        System.out.print("Enter second number : ");
        float num2= sc.nextFloat();

        System.out.print("Enter third number : ");
        float num3= sc.nextFloat();

        float sum= num1 + num2 + num3;
        System.out.printf("The sum is : %.5f \n", sum);
    }


    // Q2. Add two integers with a check that only integers input should be added.
    // hasNext() is quite useful for checking validity of input
    public static void add_Only_Integers() {
        Scanner sc= new Scanner(System.in);

        int num1=0 , num2=0;

        System.out.println("Enter first number : ");
        if(sc.hasNextInt())
            num1= sc.nextInt();
        else
            System.out.println("Invalid input");

        System.out.println("Enter second number : ");
        if(sc.hasNextInt())
            num2= sc.nextInt();
        else
            System.out.println("Invalid input");

        int sum= num1+num2;
        System.out.println("The sum is : " + sum);
    }


    // Q3. Write a program to calculate CGPA (out of 10), if three subject marks (out of 100) are taken as input.
    public static void CGPA_Calculator() {
        Scanner sc= new Scanner(System.in);

        System.out.print("Marks in subject 1 : ");
        int s1= sc.nextInt();

        System.out.print("Marks in subject 2 : ");
        int s2= sc.nextInt();

        System.out.print("Marks in subject 3 : ");
        int s3= sc.nextInt();

        float cgpa= (float)(s1+s2+s3)/30;                           // Typecasting method #1
        // float cgpa= (s1+s2+s3)*1.0f/30;                          // Typecasting method #2
        System.out.println("CGPA (out of 10) : " + cgpa);
    }



    // Q4. Write a program to detect whether a number entered by the user is integer or not.
    public static void detect_Integer() {
        Scanner sc= new Scanner(System.in);

        System.out.println(sc.hasNextInt() ? "Yes, it is an integer." : "No, it is not an integer.");
        // sc.hasNextInt() ? System.out.println("Yes") : System.out.println("No");              # Invalid command


        System.out.println(sc.hasNextInt() ? "YES" : "NO");                 // sc is storing the scanned value
        int a= sc.nextInt();                                                // sc becomes empty, the value gets stored in a
        System.out.println(sc.hasNextInt() ? "yes" : "no");                 // This command runs when we enter another value in sc
    }



    // Driver Function
    public static void main(String[] args) {
        // Task 1
        System.out.println("Add Three Numbers -----------------");
        add_Three_Numbers();

        // Task 2
        System.out.println("Add only Integers -----------------");
        add_Only_Integers();

        // Task 3
        System.out.println("CGPA Calculator -------------------");
        CGPA_Calculator();

        // Task 4
        System.out.println("Detect Integer --------------------");
        detect_Integer();
    }
}
