package day13_StringClass;

public class StringManipulations3 {

    public static void main(String[] args) {

        // indexOf () Method : returns the index number of the first occured character as an int

        String str = "I like Java programming John";
        //            01234567
        int num1 = str.indexOf("John");    // only return very first matching one, if ut is given String like "John" _> 24
        int num2 = str.indexOf("J");       // 7
        System.out.println(num1);
        System.out.println(num2);

        String str2 = "Cybertek school is awesome";
        int firstS = str2.indexOf("s");      // 9
        int secondS = str2.indexOf("is" )+ 1;
        //  str.indexOf("is") ==> returns the index number of i
        System.out.println(firstS);
        System.out.println(secondS);

        int maxIndexNumber = "Cybertek".length() - 1;   // 8-1
        System.out.println(maxIndexNumber);
        String names = "Muhtar";
        int a1 = names.indexOf("Good Guy");
        System.out.println(a1);     // -1

        String fullname = "Rahman Abdalla";
        String firstName = fullname.substring(0,fullname.indexOf(" "));
        String lastName = fullname.substring(fullname.indexOf(" ") + 1);

        System.out.println(firstName);
        System.out.println(lastName);



    }
}
