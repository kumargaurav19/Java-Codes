package o1_Basic_Java;

public class o16_Methods_4 {

    /*
        - In case of arrays, the reference is passed.
        - Same is the case for object passing to methods.
    */
    // This function cannot modify the integer value, as the integer is passed in the method argument by making a copy.
    static void change1(int num) {
        num+= 10;
    }

    // But this function successfully modifies the array values, as the array is passed in the argument by reference.
    static void change2(int[] array) {
        for(int i=0; i<array.length; i++)
            array[i]+= 10;
    }

    public static void main(String[] args) {
        // 1. Modifying integer
        int a= 45;
        change1(a);
        System.out.println("Integer value : " + a);

        // 2. Modifying array
        int[] arr= {1,2,3};
        /*
        - The above statement makes an array object with "arr" as reference.
        - "arr" reference just locates the address of array object.
        - So, instead of passing values by making copy (as with integer), this method passes by reference (address of the argument parameter).
        - Same is the case for object passing to methods.
        */
        change2(arr);
        System.out.println("Array values : " + arr[0] + " , " + arr[1] + " , " + arr[2]);
    }
}
