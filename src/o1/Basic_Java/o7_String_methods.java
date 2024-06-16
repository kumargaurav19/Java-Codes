package o1.Basic_Java;

public class o7_String_methods {
    public static void main(String[] args) {
        // String Methods :
        String name= "My name is HARRY.";
        System.out.println("\n\t String : " + name);


        // 1.  str.length()					- Returns length of string
        System.out.println("\n 1. str.length() ===================================================================== ");
        System.out.println("\t\t Length of string: " + name.length());




        // 2.  str.toLowerCase()			- Returns string with all characters as lowercase
        System.out.println("\n 2. str.toLowerCase() ================================================================ ");
        System.out.println("\t\t Lower case: " + name.toLowerCase());




        // 3.  str.toUpperCase()			- Returns string with all characters as uppercase
        System.out.println("\n 3. str.toUpperCase() ================================================================ ");
        System.out.println("\t\t Upper case: " + name.toUpperCase());




        // 4.  str.trim()					- Returns string after removing all leading/trailing spaces
        System.out.println("\n 4. str.trim() ======================================================================= ");
        name= "     Harry     ";

        System.out.println("\t\t Non-trimmed String : " + name);
        System.out.println("\t\t Trimmed String: " + name.trim());




        // 5.  str.substring(start)			- Returns substring from start(inclusive) to end
        System.out.println("\n 5. str.substring(start) ============================================================= ");
        name= "Harry";
        System.out.println("\t String : " + name);

        System.out.println("\t\t Substring with start index 2: " + name.substring(2));




        // 6.  str.substring(start, end)	- Returns substring from start(inclusive) to end(exclusive)
        System.out.println("\n 6. str.substring(start, end) ======================================================== ");
        System.out.println("\t String : " + name);

        System.out.println("\t\t Substring with start index 1 & end index 4: " + name.substring(1,4));




        // 7.  str.replace(old, new)		- Returns new string with "all occurrences" of old character replaced with new character
        System.out.println("\n 7. str.replace(old, new) ============================================================ ");
        name= "Harry__Harry";
        System.out.println("\t String : " + name);

        System.out.println("\t\t 'r' replaced with 'p'   : " + name.replace('r','p'));						// 1 to 1      [Single quotes only in 1-1 case]
        System.out.println("\t\t 'y' replaced with 'io'  : " + name.replace("y", "io"));					// 1 to multi
        System.out.println("\t\t 'rry' replaced with 't' : " + name.replace("rry", "t"));					// multi to 1
        System.out.println("\t\t 'rr' replaced with 'ol' : " + name.replace("rr", "ol"));					// multi to multi - Same no. of characters
        System.out.println("\t\t 'rr' replaced with 'oll : " + name.replace("rr", "oll"));					// multi to multi - Different no. of characters




        // 8.  str.startsWith(string)	- Returns true if string starts with the specified string
        System.out.println("\n 8. str.startsWith(string) =========================================================== ");
        name= "Harry";
        System.out.println("\t String : " + name);

        System.out.println("\t\t Starts with \"Ha\" : " + name.startsWith("Ha"));
        System.out.println("\t\t Starts with \"R\"  : " + name.startsWith("R"));




        // 9.  str.endsWith(string)		- Returns true if string ends with the specified string
        System.out.println("\n 9. str.endsWith(string) ============================================================= ");
        System.out.println("\t String : " + name);

        System.out.println("\t\t Ends with \"rry\"  : " + name.endsWith("rry"));
        System.out.println("\t\t Ends with \"p\"    : " + name.endsWith("p"));




        // 10. str.charAt(index)		- Returns character at specified index
        System.out.println("\n 10. str.charAt(index) =============================================================== ");
        System.out.println("\t String : " + name);

        System.out.println("\t\t Character at index 1 : " + name.charAt(1));




        // 11. str.indexOf(string)		- Returns first occurrence index of specified string,  -1 otherwise
        System.out.println("\n 11. str.indexOf(string) ============================================================= ");
        name= "Harry__Harry";
        System.out.println("\t String : " + name);

        System.out.println("\t\t Index of 'r'   : "   + name.indexOf('r'));								// char- present
        System.out.println("\t\t Index of \"ry\"  : " + name.indexOf("ry"));							// str- present
        System.out.println("\t\t Index of 'p'   : "   + name.indexOf('p'));								// char- absent
        System.out.println("\t\t Index of \"ppy\" : " + name.indexOf("ppy"));							// str- absent




        // 12. str.indexOf(string, index)	- Returns first occurrence index of specified string starting from specified index(inclusive),  -1 otherwise
        System.out.println("\n 12. str.indexOf(string, index) ====================================================== ");
        System.out.println("\t String : " + name);

        System.out.println("\t\t Index of 'r' from index 2   : "   + name.indexOf('r', 2));
        System.out.println("\t\t Index of \"rry\" from index 3 : " + name.indexOf("rry", 3));




        // 13. str.lastIndexOf(string)		- Returns last occurrence index of specified string,  -1 otherwise
        System.out.println("\n 13. str.lastIndexOf(string) ========================================================= ");
        System.out.println("\t String : " + name);

        System.out.println("\t\t Last Index of 'r'     : "   + name.lastIndexOf('r'));				// char- present
        System.out.println("\t\t Last index of \"rry\"   : " + name.lastIndexOf("rry"));			// str- present
        System.out.println("\t\t Last index of 'p'     : "   + name.lastIndexOf('p'));				// char- absent
        System.out.println("\t\t Last index of \"ppy\"   : " + name.lastIndexOf("ppy"));			// str- absent




        // 14. str.lastIndexOf(string, index)	- Returns last occurrence index of specified string before specified index(inclusive),	-1 otherwise
        System.out.println("\n 14. str.lastIndexOf(string, index) ================================================== ");
        System.out.println("\t String : " + name);

        System.out.println("\t\t Last index of 'r' before index 2   : "   + name.lastIndexOf('r', 2));
        System.out.println("\t\t Last index of \"rry\" before index 3 : " + name.lastIndexOf("rry", 3));




        // 15. str.equals(string)		- Returns true if given string matches the specified string
        System.out.println("\n 15. str.equals(string) ============================================================== ");
        name= "Harry";
        System.out.println("\t String : " + name);

        System.out.println("\t\t Is the string \"Harry\" ? : " + name.equals("Harry"));




        // 16. str.equalsIgnoreCase(string)		- Returns true if given string matches the specified string, irrespective of the case of characters
        System.out.println("\n 16. str.equalsIgnoreCase(string) ==================================================== ");
        System.out.println("\t String : " + name);

        System.out.println("\t\t Is the string \"harry\" ? : " + name.equalsIgnoreCase("harry"));
        System.out.println("\t\t Is the string \"HARRY\" ? : " + name.equalsIgnoreCase("HARRY"));
        System.out.println("\t\t Is the string \"HaRrY\" ? : " + name.equalsIgnoreCase("HaRrY"));
    }
}
