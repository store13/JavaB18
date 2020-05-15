package Miscellanious.QuizQuestions;

public class String_Quiz {

    public static void main(String[] args) {

        String ta = "A ";
        ta = ta.concat("B "); //ab
        String tb = "C ";
        ta = ta + tb;//abc
        ta.replace('C','D'); // here due to no assign , no effect the code !!
        //ta = ta.replace('C','D'); // if we do this it will effect the code
        ta = ta + tb; //abcc
        System.out.println(ta);

        // 6
        String s1 = "abc";
        String s2 = "abc";
        System.out.println("s1 == s2 is:" + s1 == s2); // FALSE
        System.out.println("s1 == s2 is:" + s1.equals(s2)); // TRUE
    }
}
