package o2.Binary_search;

public class o3_2d_array_linear_search {
    public static void main(String[] args) {
        int[][] arr2d= {{1,2,3},{4,5,6},{7,8,9}};
        int target= 5;
        int[][] key= linearSearch(arr2d, target);
        System.out.println("Target is present at index : [" + key[0] + " , " + key[1] + "]");

        System.out.println("Maximum element in the 2d array : " + maximum(arr2d));
    }


    static int[][] linearSearch(int[][] arr, int target) {
        // Traverse through the array
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[0].length; j++) {
                if(arr[i][j]==target)
                    return new int[][]{{i,j}};
            }
        }

        // If target is not found
        return new int[][]{{-1,-1}};
    }


    static int maximum(int[][] arr2d) {
        int max= Integer.MIN_VALUE;

        // Traverse through the array
        for(int[] arr1d : arr2d) {
            for(int elements : arr1d) {
                if(elements>max)
                    max=elements;
            }
        }

        return max;
    }
}
