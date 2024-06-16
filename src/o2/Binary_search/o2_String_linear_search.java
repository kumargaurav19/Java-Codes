package o2.Binary_search;

import java.util.Arrays;

public class o2_String_linear_search {
    public static void main(String[] args) {
        String str = "Gaurav Singh";
        char target = 'n';
        System.out.println(Arrays.toString(str.toCharArray()));
        System.out.println("Is target character present in string : " + linearSearch(str, target));
    }


    // Linear search in string
    static boolean linearSearch(String str, char target) {
        // If string is empty
        if(str.isEmpty())                       // if(str.length()==0)
            return false;

        // Traverse through the string
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i)==target)
                return true;
        }

        // Enhanced for loop
        /*
        for(char ch : str.toCharArray()) {
            if(ch==target)
                return true;
        }
        */

        // If target is not found
        return false;
    }
}
