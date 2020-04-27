package day25_MethodsRecap;

import Resources.Library;

public class Test {

    public static void main(String[] args) {

        String str = "ABCDABABAABABABA";
        String result = Library.RemoveDuplicates(str);
        System.out.println(result);

        String str1 = "AABBCDEB";
        String str2 = "B";

        int num1 = Library.Frequency(str1,str2 );
        System.out.println(num1);

        String str3 = "MMMMNNNNJJJLLLLKGYYYYY";
        String result3 = Library.FrequencyOfChars(str3);
        System.out.println(result3);

        float f1 = (true) ? 10:20;
        System.out.println(f1);






    }
}
