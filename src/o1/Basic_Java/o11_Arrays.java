package o1.Basic_Java;

public class o11_Arrays {
    public static void main(String[] args) {
        // Array is a collection of similar types of data, Default value is 0 for integer array
/*
    Three ways to initialize arrays:
    # Method 1:
            int[] arr;                              - Declaration
            arr= new int[5];                        - Memory allocation

    # Method 2:
            int[] arr= new int[5];                  - Declaration + Memory allocation

    # Method 3:
            int[] arr= {1, 2, 3, 4, 5};             - Declaration + Initialization
*/

        // Initializing array using method 2
        int[] arr= new int[5];

        arr[1]= 10;
        arr[2]= 20;
        arr[3]= 30;
        arr[4]= 40;



        // Array length
        System.out.print("Length of array : " + arr.length);



        // Printing array values
        // Method 1- For loop
        System.out.print("\n\nValues in array (Using for loop) : ");
        for(int i=0; i<5; i++)
            System.out.print(arr[i] + " ");

        // Method 2- For each loop
        System.out.print("\n\nValues in array (Using for each) : ");
        for(int val : arr)
            System.out.print(val + " ");




        // Arrays for various data types
        int[] id= {1, 2, 3, 4, 5};
        String[] name= {"Gaurav", "Vivek", "Rashmi", "Ajay", "Akriti"};
        char[] gender= {'M', 'M', 'F', 'M', 'F'};
        float[] marks= {97.5f, 84.2f, 93.7f, 79.3f, 92.2f};

        System.out.println("\n\nStudent details : ");
        for(int i=0; i<id.length; i++)
            System.out.println(id[i] + "\t" + name[i] +"\t" + gender[i] + "\t" + marks[i]);
    }
}
