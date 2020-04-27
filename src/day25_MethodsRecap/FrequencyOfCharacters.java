package day25_MethodsRecap;

import Resources.Library;

public class FrequencyOfCharacters {
    /*
    3. (This one I will do it too tomorrow in class) Combine above two methods to write a return method that can return the frequencyt of characters as a stringfrom any given string
		Ex:
			FrequencyOfChars("ABABCB"); ==> "A2B3C1";
			FrequencyOfChars("AAABCCCDD") ==> "A3B1C3D2"
     */

    public static void main(String[] args) {

        String str = "AABBCC";  // A2B2C2

        String NonDup = Library.RemoveDuplicates(str);          // ABC
        //System.out.println(NonDup);

        String result ="";
        for ( int i = 0; i < NonDup.length(); i++){
            String ch = ""+ NonDup.charAt(i);     // 'A'
            int num = Library.Frequency(str,ch);
            //System.out.print(ch + num);
            result += ch+num;
        }
        System.out.println(result);
    }

    public static String FrequencyOfChars(String str){
        String NonDup = Library.RemoveDuplicates(str);          // ABC
        String result ="";

        for ( int i = 0; i < NonDup.length(); i++){
            String ch = ""+ NonDup.charAt(i);     // 'A'
            int num = Library.Frequency(str,ch);
            //System.out.print(ch + num);
            result += ch+num;
        }
        return result;

    }
}
