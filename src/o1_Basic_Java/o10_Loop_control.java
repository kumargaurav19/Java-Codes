package o1_Basic_Java;

public class o10_Loop_control {
    public static void main(String[] args) {
        // While loop
        System.out.println("First five integers : ");
        int i= 1;
        while(i<=5) {
            System.out.println(i);
            i++;
        }



        // do-while loop
        System.out.println("First five alphabets : ");
        char c= 'a';
        do {
            System.out.println(c);
            c++;
        }
        while(c<='e');



        // for loop
        System.out.println("Table of 3 :");
        for(int a=3; a<=30; a+=3)
            System.out.println(a);


        // break statement - similar to c/c++
        System.out.println("Break statement in loops");
        for(int a=1; a<=5; a++)
        {
            if(a==4)
                break;
            System.out.println(a);
        }



        // Continue statement - similar to c/c++
        System.out.println("Continue statement in loops");
        for(int a=1; a<=5; a++)
        {
            if(a==4)
                continue;
            System.out.println(a);
        }
    }
}


/*
    Facts other than c/c++:
        - while(1) will show error [int cannot be converted to boolean]
        - use while(true) instead.
*/
