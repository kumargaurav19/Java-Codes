package o1.Basic_Java;

import java.util.Scanner;


public class o8_Exercise_2 {

    // Problem 1 : Write a program to convert a string to lowercase.
    public static void to_lower_case() {
        Scanner sc= new Scanner(System.in);
        System.out.println("\n\nTask 1 :  ========================================================================== ");
        System.out.println("Enter the string you want to convert to lowercase : ");
        String str= sc.nextLine();

        str= str.toLowerCase();
        System.out.println("Lower case string : " + str);
    }


    // Problem 2 : Write a program to replace spaces with underscores.
    public static void replace() {
        Scanner sc= new Scanner(System.in);
        System.out.println("\n\nTask 2 :  ========================================================================== ");
        System.out.println("Enter the string in which you want to replace space with underscores : ");
        String str= sc.nextLine();

        str= str.replace(' ', '_');
        System.out.println("Replaced string : " + str);
    }


    // Problem 3 : Write a program to fill in a letter template which looks like below:
    //							Letter Template = "Dear <name>, Thanks a lot."
    // 				Replace <name> with a string (some name).
    public static void letter_template(String letter) {
        Scanner sc= new Scanner(System.in);
        System.out.println("\n\nTask 3 :  ========================================================================== ");
        System.out.println("Enter letter recipient's name : ");
        String name= sc.nextLine();

        letter= letter.replace("<name>", name);											// ##  New way in string methods
        System.out.println("Result string : " + letter);
    }


    // Problem 4 : Write a program to detect double and triple spaces in a string
    public static void multiple_space_detect() {
        Scanner sc= new Scanner(System.in);
        System.out.println("\n\n Task 4 : ========================================================================== ");
        System.out.println("Enter string in which you want to detect double or triple spaces : ");
        String str= sc.nextLine();

        int d= str.indexOf("  ");
        int t= str.indexOf("   ");

        if(d==-1 && t==-1)
            System.out.println("No double and triple spaces present.");
        else if (t==-1)
            System.out.println("Only double space present.");
        else if (d==-1)
            System.out.println("only triple space present.");
        else
            System.out.println("Both double and triple spaces present.");
    }




    // Driver code
    public static void main(String[] args) {
        to_lower_case();			// Task 1
        replace();					// Task 2

        String letter= "Dear <name>, Thanks a lot.";
        letter_template(letter);		// Task 3

        multiple_space_detect();		// Task 4
    }
}
