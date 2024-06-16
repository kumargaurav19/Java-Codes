package o1.Basic_Java;

import java.util.Scanner;

public class o3_Taking_user_input {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);         // System.in specifies reading from keyboard
        // Scanner-class  | sc-object
        // byte
        System.out.print("Enter a byte integer : ");
        byte b= sc.nextByte();
        System.out.println("You entered the byte integer as " + b);

        // short
        System.out.print("Enter a short integer : ");
        short s= sc.nextShort();
        System.out.println("You entered the short integer as " + s);

        // int
        System.out.print("Enter a int integer : ");
        int i= sc.nextInt();
        System.out.println("You entered the int integer as " + i);

        // long
        System.out.print("Enter a long integer : ");
        long l= sc.nextLong();
        System.out.println("You entered the long integer as " + l);



        // float
        System.out.print("Enter a float decimal : ");
        float f= sc.nextFloat();
        System.out.println("You entered the float decimal as " + f);

        // double
        System.out.print("Enter a double decimal : ");
        double d= sc.nextDouble();
        System.out.println("You entered the double decimal as " + d);



        // char
        System.out.print("Enter a character : ");
        char c= sc.next().charAt(0);
        System.out.println("You entered character as : " + c);

        /*
        // boolean
        System.out.print("Enter a byte integer : ");
        boolean bl= sc.nextByte();
        System.out.println("You entered byte integer as : " + b);
        */


        // String {Only one word}
        System.out.print("Enter a string : ");
        String s1= sc.next();
        System.out.println("You entered string as : " + s1);

        // String {Only one line}
        System.out.print("Enter a string : ");
        String s2= sc.nextLine();
        System.out.println("You entered string as : " + s2);
    }
}