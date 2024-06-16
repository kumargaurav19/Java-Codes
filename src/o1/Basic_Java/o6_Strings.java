package o1.Basic_Java;

import java.util.Scanner;

public class o6_Strings {
    public static void main(String[] args) {
        // Strings :  String is a class, but can also be used as a datatype  &&  Strings are immutable

        Scanner sc= new Scanner(System.in);

        // 1. Initializing a string :
        String str;
        str= "Harry";                                           // Method 1
        str= new String("Ram");                          // Method 2
        System.out.println("What's your name in one word?");
        str= sc.next();                                         // Method 3
        // System.out.println("What's your name in one line?");
        //    str= sc.nextLine();                                     // Method 4



        // 2. Printing method of strings :
        System.out.print("My name is " + str + "\n");                                                               // 1. Print without a new line
        System.out.println("My name is " + str + "\n");                                                             // 2. Print with a new line

        int a= 5;
        float b= 3.123456f;
        char c= 'A';
        System.out.printf("Integer: %d,  Float: %4.3f,  Character: %c,      String: %s \n", a, b, c, str);          // 3. Print with format specifiers - with no default new line
        System.out.format("Integer: %d,  Float: %4.3f,  Character: %c,      String: %s \n", a, b, c, str);          // 4. Same behaviour as 3rd method
    }
}

/*
        Escape Sequence Characters :

                \n  -   newline
                \t  -   tab space
                \b  -   backspace
                \r  -   carriage return
                \f  -   form-feed
                \'  -       '
                \"  -       "
                \\  -       \
 */
