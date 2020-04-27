package day14_StringClass;

public class practice {

    public static void main(String[] args) {

        String gmail = "cybertekschool@gmail.com";

        String userinputGmail = "CybertekSchool@gmail.com";

        boolean result = gmail.equalsIgnoreCase(userinputGmail);   // true , if we use equalIgnoreCase () method

        if(result) {
            System.out.println("Logged in");
        }

        System.out.println("=================================================");

        /*
        valid password MUST contain a special characters such as (!, _, $)
        valid password should NOT contain spaces
         */

        String PassWord = "mmasd 1235";

        if (PassWord.contains(" ")) {
            System.out.println("Password cannot have space in it");
        } else {
            System.out.println("valid password");
        }

        System.out.println("=================================================");

        /*
        every website has "www." at the beginning of the web address
        */

        String webAddress = "Www.amazon.com";
        webAddress = webAddress.toLowerCase();

        if( webAddress.startsWith("www.") ){
            // false
            System.out.println("valid");
        }

        System.out.println("=================================================");

        /*
        every single gmail address ends with @gmail.com
         */

        String email = "CybertekSchool@Yahoo.com";

        if (email.endsWith("@gmail.com")) {
            System.out.println("valid gmail");
        } else {
            System.out.println("Invalid gmail");
        }

        /*
        write a program that can validate if a web address is valid

        valid web address
            MUST start with www.
            Must ends with .com, or .edu, or .net, or .gov
         */

        // This is my solution...
        String webAddress1 = "www.XYZ@gmail.edu";
        //String webAddress2 = "www.XYZ@abc.edu";

        if (webAddress1.startsWith("www.") && (webAddress1.endsWith(".com") || webAddress1.endsWith(".edu")
                || webAddress1.endsWith(".net") || webAddress1.endsWith(".gov"))) {
            System.out.println("Your web address is valid");
        } else {
            System.out.println("Your web address is INVALID");
        }






    }
}
