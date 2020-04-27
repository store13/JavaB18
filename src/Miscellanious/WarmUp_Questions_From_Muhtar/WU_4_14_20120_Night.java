package Miscellanious.WarmUp_Questions_From_Muhtar;

import java.util.Arrays;

public class WU_4_14_20120_Night {
    /*
    1.  write a program that can check if two Strings are build out of same
        Ex:
            if str1 = "aabbbc";  str2 ="cab";
            output: true
            if str1 ="abcd";  str2 ="abc";
            output: false
            Hint: you will need array and Arrays' methods
2.  Write a program that can print out the unique values from an int Array
        Ex:
            if arr -> {1,1,2,3,3}
            output: 2
            if arr -> {1,2,2,3,4,4}
            output:  1  3
3. Write a program that can print out the unique values from  String Array
     */
    // 1
    public static void main(String[] args) {
//        String str1 = "abcd";
//        String str2 = "cab";
//
//        String newstr1 ="";
//
//        for ( int i = 0; i < str1.length(); i++){
//            if(newstr1.contains("" + str1.charAt(i))){
//                continue;
//            }
//            newstr1 += str1.charAt(i);
//        }
//
//        System.out.println(newstr1);
//
//        str1 = newstr1;
//
//        String[] str1Array = str1.split("");
//        System.out.println(Arrays.toString(str1Array));
//
//        String[] str2Array = str2.split("");
//        System.out.println(Arrays.toString(str2Array));
//
//        Arrays.sort(str1Array);
//        Arrays.sort(str2Array);
//
//        System.out.println(Arrays.equals(str1Array, str2Array));
        // Phu's Solution (CharAt)
//        String str1 = "aabbbc";
//        String str2 = "abcd";
//        String nonDup1 ="";
//        String nonDup2 ="";
//        for (int i = 0; i < str1.length(); i++) {
//            if (!nonDup1.contains("" + str1.charAt(i)))
//                nonDup1 += str1.charAt(i);
//        }
//
//        System.out.println(nonDup1);
//        for (int i = 0; i < str2.length(); i++) {
//            if (!nonDup2.contains("" + str2.charAt(i)))
//                nonDup2 += str2.charAt(i);
//        }
//
//        System.out.println(nonDup2);
//
//        char[] arr1 = nonDup1.toCharArray();
//        char[] arr2 = nonDup2.toCharArray();
//        Arrays.sort(arr1);
//        Arrays.sort(arr2);
//        System.out.println(Arrays.equals(arr1,arr2));

        // Phu's Solution (without Arrays' method
        /*
        String str1 = "abcd";
        String str2 = "abc";
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        boolean b = true;
        for (char each : arr1) {
            if (!str2.contains("" + each)) {
                b = false;
                break;
            }
        }
        for (char each : arr2) {
            if (!str1.contains("" + each)) {
                b = false;
                break;
            }
        }
        System.out.println(b);
         */

        // 2nd way (CharAt)
        String str1 = "abcdaabb";
        String str2 = "cabdccdd";

        String newStr1 = "";
        String newStr2 = "";

        for (int i = 0; i < str1.length(); i++){
            if (!newStr1.contains(""+ str1.charAt(i))){
                newStr1 += str1.charAt(i);
            }
        }
        //System.out.println(newStr1);

        for (int i = 0; i < str2.length(); i++){
            if (!newStr2.contains(""+ str2.charAt(i))){
                newStr2 += str2.charAt(i);
            }
        }

        //System.out.println(newStr2);

        char arr1 [] = newStr1.toCharArray();
        char arr2 [] = newStr2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(arr1);
        System.out.println(arr2);

        System.out.println(Arrays.equals(arr1,arr2));



    }
}