package Miscellanious;

import java.util.Scanner;

public class Rabia_Hanim_Sorular {
    public static void main(String[] args) {

        // repl.it - 073. Email 2_String Methods

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter your email");
//        String email = scan.nextLine();
//        //String email = scan.next();
//        // String mail="scott_forstall@apple.com";
//        String firstName = email. substring(0,1).toUpperCase() + email.substring(1,email.indexOf("_")).toLowerCase();
//        //System.out.println(firstName);
//        String lastName = email.substring(email.indexOf("_") +1,email.indexOf("_") +2).toUpperCase() +
//                          email.substring(email.indexOf("_") +2,email.indexOf("@")).toLowerCase();
//        //System.out.println(lastName);
//        String Domain=email.substring( email.indexOf("@")+1, email.indexOf("."));
//        //System.out.println(Domain);
//        String level=email.substring( email.indexOf(".") +1, email.length());
//        //System.out.println(level);
//        System.out.println("First name: "+ firstName);
//        System.out.println("Last name: " + lastName);
//        System.out.println("Domain: "+ Domain);
//        System.out.println("Top-Level Domain: "+ level);

        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //your code here
        if( word1.equalsIgnoreCase(word2)){
            System.out.println("word1 equals to word2");
        }else{System.out.println("word1 does not equal word2");}
    }

    }


