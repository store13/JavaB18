package day14_StringClass;

import java.util.Scanner;

public class credentials {
    /*
        username: cybertek
        password: cybertekschool
    */
    public static void main(String[] args) {
        String validUserName = "cybertek";
        String validPassWord = "cybertekschool";

        Scanner input = new Scanner(System.in);
        System.out.println(" Enter your username");
        String inputUserName = input.next();

        System.out.println(" Enter your password");
        String inputPassWord = input.next();

        boolean validCredentials = inputUserName.equals(validUserName) && inputPassWord.equals(validPassWord);

        if (validCredentials) {
            System.out.println("Log in successfully");
        } else {
            System.out.println("Invalid credentials");
        }

    }



}
