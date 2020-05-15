package OfficeHours.Saim_2ndWeek_05_09_2020.day2_StringAndLoops;

public class codingBat {

    public static void main(String[] args) {
        System.out.println(middleTwo("string"));

        System.out.println(nTwice("Chocolate", 3));
        System.out.println(nTwice("Hello", 1));
        // substring (0,1) --> H
        // substring(5 -1)  --> o
        System.out.println(nTwice("Hello", 2));
        // substring (0,2) --> He
        // substring(5-2)  --> lo

        // front = substring (0, n)
        // back = substring(str.length() - n)

        System.out.println(doubleChar("The"));  // → "TThhee"
        System.out.println(doubleChar("AAbb")); // → "AAAAbbbb"
        System.out.println(doubleChar("Hi-There")); // → "HHii--TThheerree"

        System.out.println(countHi("abc hi ho"));   // → 1
        System.out.println(countHi("ABChi hi"));    // → 2
        System.out.println(countHi("hihi")); // → 2


    }

    public static String middleTwo(String str) {

        // if (str.length() > 2 ) {
        //   //return str.substring(str.length()/2, str.length()/2 +1);
        // }
        // return str.substring(str.length()/2 -1, str.length()/2 +1);

        int mid1 = str.length()/2 -1 ;
        int mid2 = str.length()/2  ;

        // String word = "" + str.charAt(mid1) + str.charAt(mid2);
        // return word;

        return str.substring(mid1, mid2+1);
    }

    /*
    Given a string and an int n, return a string made of the first and last n chars from the string. The string length will be at least n.

    nTwice("Hello", 2) → "Helo"
    nTwice("Chocolate", 3) → "Choate"
    nTwice("Chocolate", 1) → "Ce"
     */
    public static String nTwice(String str, int n) {

        String front = str.substring(0,n);
        String back = str.substring(str.length()-n);

        return front+back;
    }

    /*
         Given a string, return a string where for every char in the original, there are two chars.
        doubleChar("The") → "TThhee"
        doubleChar("AAbb") → "AAAAbbbb"
        doubleChar("Hi-There") → "HHii--TThheerree"
     */
    public static String doubleChar(String str) {

        String result = "";
        for(int i = 0; i < str.length(); i++){
           // result += "" + str.charAt(i) + str.charAt(i);
            // result += str.charAt(i) + ""+  str.charAt(i);    // we can write like this as well.
            // substring (better maybe)
            result += str.substring(i, i+1) + str.substring(i,i+1);
        }
        return result;
    }
/*
Return the number of times that the string "hi" appears anywhere in the given string.
countHi("abc hi ho") → 1
countHi("ABChi hi") → 2
countHi("hihi") → 2
 */

public static int countHi(String str) {
// 1st way (While Loop and Replace Method)
//    int count = 0;
//    while (str.contains("hi")) {
//        count++;
//        str = str.replaceFirst("hi", "");
//        //System.out.println(count);
//    }
//    return count;
    // 2nd way
    int count = 0 ;
    for (int i = 0; i < str.length()-1; i++){
        String word = str.substring(i, i+2);
        if(word.equals("hi")){
            count++;
        }
    }
    return count;
}
}
