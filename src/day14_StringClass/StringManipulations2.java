package day14_StringClass;

public class StringManipulations2 {

    public static void main(String[] args) {
        // isEmpty() : identifies
        String str = " ";
        boolean bool1 = str.isEmpty();  // false
        System.out.println(bool1);

        String username = "";
        if(username.isEmpty()){
            System.out.println("Please provide the user name first");
        }

        //  equal(str): checks if two string' visible texts are equal or not
        //  ==

        String s1 = "Cat";      // String literal
        String s2 = new String("Cat");

        System.out.println(s1 == s2);       // false, different memory locations, different objects

        System.out.println(s1.equals(s2));  // true .. Always USE EQUALS Method

        String z1 = "Tiger";
        String z2 = new String("Tiger");
        String z3 = "Tiger";

        // ==
        System.out.println(z1 == z2);   // false
        System.out.println(z2 == z3);   // false
        System.out.println(z1 == z3);   // true

        // equals();
        System.out.println(z1.equals(z2));  // true
        System.out.println(z2.equals(z3));  // true
        System.out.println(z1.equals(z3));  // true


    }
}
