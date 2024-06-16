package o2_Binary_search;

public class o1_Linear_search {
    public static void main(String[] args) {
        int[] arr = {11, 24, 63, 34, 15};
        int target = 34;
        int key = linearSearch1(arr, target);
        System.out.println("Target is present at index : " + key);

        key = linearSearch2(arr, target);
        System.out.println("Target is present at index : " + key);
    }


    // Linear Search : Return the index if the target is found, otherwise return -1
    static int linearSearch1(int[] arr,int target) {
        // If array is empty
        if(arr.length==0)
            return -1;

        // Traverse through the array
        for(int i=0; i<arr.length; i++) {
            if(arr[i]==target)
                return i;
        }

        // If target is not found
        return -1;
    }


    // Optimised Linear Search : Search from both ends
    static int linearSearch2(int[] arr,int target) {
        // If array is empty
        if(arr.length==0)
            return -1;

        // Traverse through the array
        for(int i=0; i<=arr.length/2; i++) {
            if(arr[i]==target)
                return i;
            if(arr[arr.length-i-1]==target)
                return arr.length-i-1;
        }

        // If target is not found
        return -1;
    }
}
