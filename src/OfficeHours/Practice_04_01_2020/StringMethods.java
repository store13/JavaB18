package OfficeHours.Practice_04_01_2020;

import java.sql.SQLOutput;

public class StringMethods {

    public static void main(String[] args) {

        // charAt(indexNumber) : returns the char at the given index, char primitive
        //             1234
        String str1 = "Java";
            //         0123
        char ch1 = str1.charAt(3); // a

        System.out.println(ch1);

        // char ch2 = str1.charAt(4);
        /*Out of range,
        Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 4
        */
        // System.out.println(ch2);

        System.out.println("===================================================================");

        // length(): return the total number of chars, int

        String str2 = "Cybertek School";

        int total = str2.length();
        System.out.println(total);

        int maxIndex = str2.length() - 1;       // last index number

        char ch3 = str2.charAt(maxIndex);

        System.out.println(ch3);

        System.out.println("===================================================================");

        // concat(str) : concatenation, returns NEW String

        String str3 = "Cybertek";

               str3 = str3.concat(" School");   // "Cybertek School"

        System.out.println(str3);

        String str4 = "Java";
               str4 = str4.concat("is fun");    // "Java is fun"

        System.out.println(str4);

        System.out.println("===================================================================");
        // toLowerCase() & toUpperCase() : change the case of the strings to upper or lower cases. returns new String

        String str5 = "CYBERTEK SCHOOL";
               str5 = str5.toLowerCase(); // "cybertek school"

        System.out.println(str5);

        String str6 = "muhtar";
               str6 = str6.toUpperCase(); // "MUHTAR"

        System.out.println(str6);

        System.out.println("===================================================================");

        // trim(): removes unused (white) spaces from the string

        String str7 = "    Cybertek";
        //System.out.println(str7.length());  // 12, count SPACES as well
               str7 = str7.trim();    // "Cybertek"

        System.out.println(str7);
        System.out.println(str7.length());

        String str8 = "      ";
               str8 = str8.trim();

        System.out.println(str8.length());  //0 , after the trim

        System.out.println("===================================================================");
        // substring (beginning index, ending index):
        // creates substring starting from beginning index till ending index(ending index is NOT Included)

        String sentence1 = "I like Java";
            //              012345678910
            // last index number = length - 1
        String word1 = sentence1.substring(7,sentence1.length() - 1 + 1);  // "Java"
        String word2 = sentence1.substring(2, sentence1.lastIndexOf(" ")); // my solution
        // String word2 = sentence1.substring(2, 6); // Muhtar's

                        // "likeJava"
        String word3 = sentence1.substring(2,6) + sentence1.substring(7, sentence1.length());

        System.out.println(sentence1);
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);

        // substring(beginning index): creates the sub string from the beginning index till the end of the string. returns new string
        String sentence2 = "I like to learn Java";
        //                 0123456789...

        String r1 = sentence2.substring(10);    // "learn Java"
        System.out.println(r1);

        String r2 = "Java"; // Java
        //           0123
        String r3 = r2.substring(0,2);  // Ja

        String r4 = r2.substring(2,3);  // v
               r4 = r4.toUpperCase();   // V

        String r5 = r2.substring(3);    // a

        String result = r3 + r4 + r5;   // Java

        System.out.println(result);

        System.out.println("===================================================================");

        // replace( old str, new str) : replaces all the matching ones, returns new String
        String str = "I like C#, C# is cool";
               str = str.replace("C#", "Java");    // "I like Java, Java is cool"
        System.out.println(str);

        // replaceFirst(old str, new str): replace the first matching one, returns new string

        String t1 = "Java is fun, Java is good";
        t1 = t1.replaceFirst(", Java", ", C#");
        System.out.println(t1);

        System.out.println("==============================================");
        // indexOf(str): returns the index of first matching character, as an int

        String y1 = "Today W is Wednesday";

        int a1 = y1.indexOf("W");           // first W' index num

        int a2 = y1.indexOf("Wednesday");   // second W' index num

        System.out.println(a1);
        System.out.println(a2);

        // lastIndexOf(str): returns the index of last matching character, as an int

        String y2 = "Cybertek School, School";
        int a3 = y2.lastIndexOf("S");   // last S' index number
        System.out.println(a3);















    }
}

