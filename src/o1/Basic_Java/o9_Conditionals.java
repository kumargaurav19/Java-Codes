package o1.Basic_Java;

import java.util.Scanner;

public class o9_Conditionals {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);



        // If---else-if---else ladder
        System.out.print("Enter your age : ");
        int age= sc.nextInt();

        if(age>60) {
            System.out.println("Hi, You are a senior citizen.");                // For multiple commands, you need to use parentheses.
            System.out.println("You should not visit clubs.");
        }
        else if(age>20)
            System.out.println("Enjoy in the club freely.");                    // For single command, parentheses is not compulsory.
        else {
            System.out.println("You are too young.");
            System.out.println("Let me ask your parents first.");
        }



        // Switch case statements
        System.out.print("Enter a number from 1 to 3 : ");
        int choice= sc.nextInt();

        switch (choice) {
            case 1 :
                System.out.println("You have chosen 1.");
                break;
            case 2 :
                System.out.println("You have chosen 2.");
                break;
            case 3 :
                System.out.println("You have chosen 3.");
                System.out.println("It is also my lucky number.");          // No need for curly braces
                break;
            default :
                System.out.println("Sorry, Your choice is not in range.");

        }
        // In switch-case the program runs all statements after matching variable statements too.
        // So break is necessary to run only matching variable statements.
        // The matching variable datatype can be (int, char, string).


        System.out.print("Enter your name : ");
        String name= sc.next();

        switch (name) {
            case "Gaurav" -> {
                System.out.println("Hi Gaurav.");               // It implements curly braces itself, as it needs braces.
                System.out.println("I know you.");
            }
            case "Shubham" -> System.out.println("Hi Shubham.");
            default -> System.out.println("I don't know you.");
        }
        // You can also use intellij hints to convert (switch) to (enhanced switch) as above.
        // Break statement is not required in enhanced switch. It is smart itself.
        // It doesn't need break statements too.
    }
}

// Last "else" is optional. Rest part can also exist without last "else".

