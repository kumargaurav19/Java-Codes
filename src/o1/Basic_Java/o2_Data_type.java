package o1.Basic_Java;

public class o2_Data_type {
    public static void main(String[] args) {

        byte b= 1;
        short s= 12;
        int i= 123;
        long l= 1234;               // l or L

        float f= 0.23f;             // f or F
        double d= 0.234567d;        // d or D (But decimal is double by default, so not compulsory)

        char c= 'A';
        boolean bl= true;

        String str= "Harry";        // String class is also defined in java.lang, as other data types
    }
}




/*
    n-bits variable range:  -2^(n-1) to 2^(n-1)-1
        Ex:   byte :: 1 byte = 8 bits
              2^8 values
              -(2^7)  to (2^7)-1
              -128 to 127


    Primitive Data types:
        byte    -   1 byte  -   Default value 0
        short   -   2 byte  -   Default value 0
        int     -   4 byte  -   Default value 0
        long    -   8 byte  -   Default value 0

        float   -   4 byte  -   Default value 0.0f      -   (range not defined, tricky)
        double  -   8 byte  -   Default value 0.0d      -   (range not defined, tricky) Default datatype for decimals

        char    -   2 byte (bcz it supports unicode)    -   Default value \U0000 (only positive range: 0 to (2^16)-1)
        boolean -   size depends on JVM                 -   Default value is false

        ASCII code is a subset of Unicode.

    Anatomy of a Java Program:              [Only "Main Method Class" is not optional, it is essential]
        * Documentation section
        * Package statements
        * Import statements
        * Interface statements
        * Class definitions
        * Main method class {
                Main method definition
          }
 */
