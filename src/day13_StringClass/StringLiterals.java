package day13_StringClass;

public class StringLiterals {

    public static void main(String[] args) {

        String str1 = "Cat";                        // String Pool
        String str2 = new String("Cat");    // Java Heap

        System.out.println(str1 + " : " + str2);
        System.out.println(str1 == str2);           // Two DIFFERENT Object, False

        String str3 = "Cat";                        // String pool

        System.out.println(str1 == str3);           // TRUE

        String str4 = new String("Cat");
        System.out.println(str2 == str4);           // 2 independent object

        String s1 = "Java";         // String Pool, immutable we cannot modify it.
        s1 = "JavaScript";          // new object will be created in memory
        System.out.println(s1);     // JavaScript

        String s2 = "Java";         // no new object will be created in the memory
        System.out.println(s1 == s2);       // false
        //                 "JavaScript" == "Java"





    }
}
