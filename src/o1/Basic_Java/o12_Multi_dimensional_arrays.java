package o1.Basic_Java;

import java.util.Scanner;

public class o12_Multi_dimensional_arrays {
    // Multi-dimensional arrays
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);




        // 1d array
        int[] arr1d= new int[3];                            // Declaration


        for(int i=0; i<3; i++) {                            // Taking input
            System.out.print("Enter value " + (i+1) + " : ");
            int value= sc.nextInt();
            arr1d[i]= value;
        }


        System.out.println("1d array : ");                  // Display array elements
        for(int val : arr1d)
            System.out.print(val + " ");





        // 2d array
        int[][] arr2d= {{1,2,3},{4,5,6}};                   // Declaration- (2 rows, 3 columns)


        System.out.println("\n\n\n2d array table : ");        // Displaying array elements - Normal for loop
        for(int i=0; i<arr2d.length; i++) {
            for (int j=0; j<arr2d[0].length; j++)
                System.out.print(arr2d[i][j] + " ");
            System.out.println();
        }





        // 3d array
        int[][][] arr3d= new int[2][2][2];                  // Declaration- Total 8 elements : (2x2x2)


        // Upper face ====================
        arr3d[0][0][0]= 1;      // 1st row
        arr3d[0][0][1]= 2;

        arr3d[0][1][0]= 3;      // 2nd row
        arr3d[0][1][1]= 4;

        // Lower face ====================
        arr3d[1][0][0]= 5;      // 1st row
        arr3d[1][0][1]= 6;

        arr3d[1][1][0]= 7;      // 2nd row
        arr3d[1][1][1]= 8;


        System.out.println("\n\n3d array table : ");        // Displaying the elements - Enhanced for loop
        for (int[][] a2 : arr3d) {                          // The distinct elements of 3d array are basically 2d arrays
            for (int j=0; j<arr3d[0].length; j++) {
                for (int k=0; k<arr3d[0][0].length; k++)
                    System.out.print(a2[j][k] + " ");
                System.out.println();
            }
            System.out.println();
        }
    }
}
