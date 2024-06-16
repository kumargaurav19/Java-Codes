package o1.Basic_Java;

public class o5_Operators {
public static void main(String[] args) {
    // Arithmetic Operators
    System.out.println("Arithmetic Operators : ");
    int a=5, b=2;

    System.out.println("a+b: " + (a+b));        // Addition     - Need parentheses
    System.out.println("a-b: " + (a-b));        // Subtraction  - Need parentheses
    System.out.println("a*b: " + a*b);          // Multiplication
    System.out.println("a/b: " + a/b);          // Division
    System.out.println("a%b: " + a%b);          // Modulo- Remainder

    System.out.println();

    System.out.println("a++ : " + a++);         // Display   -> Increment
    System.out.println("++a : " + ++a);         // Increment -> Display

    System.out.println();

    System.out.println("a-- : " + a--);         // Display    -> Decrement
    System.out.println("--a : " + --a);         // Decrement  -> Display
    // Modulo '%' works on floats and doubles too
    // 4.8 % 1.1    -->     gives 0.4 (Decimal remainder)



    // Assignment Operators
    System.out.println("\n \nAssignment Operators : ");
    int num= 3;
    System.out.println("num= " + num);
    // (+= , -=, *=, /=) are also included


    // Relational Operators:    ==  !=  <   <=  =>  >
    System.out.println("\n \nRelational Operators : ");

    // Logical Operators:   && (AND)     || (OR)        ! (NOT)

    // Bitwise Operators:   &, |

    char c= 'B';
    System.out.println("Character before incrementing : " + c);
    c++;
    System.out.println("Character after incrementing : " + c);
}
}



/*
        Resulting Datatype after Arithmetic Operation:
                byte + short        -->      int
                short + int         -->      int
                long + float        -->      float
                int + float         -->      float
                char + int          -->      int
                char + short        -->      int
                long + double       -->      double
                float + double      -->      double
 */
