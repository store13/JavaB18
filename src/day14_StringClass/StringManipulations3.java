package day14_StringClass;

import java.sql.SQLOutput;

public class StringManipulations3 {

    public static void main(String[] args) {
        // equalsIgnoreCase(str) : checks if teo string' visible texts are equal or not
        //

        String str1 = "CYBERTEK";
        String str2 = "cybertek";

        System.out.println(str1.equals(str2));  // false
        System.out.println(str1.equalsIgnoreCase(str2)); // true

        // contains(str): checks if the str is contained in the string. returns boolean
        // if str is contained ==> True
        // otherwise           ==> False

        String s1 = "Cybertek School";
        boolean r1 = s1.contains("school"); // false , due to CASE SENSITIVE
        System.out.println(r1);

        // startsWith(str) : checks if the str starts with the given str. return


        String s3 = "United States";
        System.out.println(s3.startsWith("U"));     // true

        // endsWith()

        String s4 = "Cybertek School";
        System.out.println(s4.endsWith("l"));       // true
        System.out.println(s4.endsWith("School"));  // true
        System.out.println();




    }
}
