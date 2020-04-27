package Miscellanious.Replit_Questions_And_Answer;

import java.util.Scanner;

public class SomeReplitQuestions {

    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String email = scan.next();
            //String email = "mike_tyson@gmail.com";
            String firstName = email.substring(0, email.indexOf("_"));
            String lastName = email.substring(email.indexOf("_") + 1, email.indexOf("@"));
            String result = "";
            if (email.contains("_")) {
                result = lastName + "_" + firstName + "@gmail.com";
                System.out.println(result);
            } else {
                System.out.println(email);
            }
        }
    }

