package OfficeHours.Saim_2ndWeek_05_09_2020.day2_StringAndLoops;

public class Palindrome {

    public static boolean isPalindrome(String str){
        //racecar
        str= str.toLowerCase();

        for(int i = 0; i < str.length()/2; i++){

            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("abcddcba"));
    }
}
