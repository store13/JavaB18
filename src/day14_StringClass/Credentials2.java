package day14_StringClass;

import java.util.Scanner;

public class Credentials2 {
    /*
    valid credentials are:
        username: cybertek
        password: cybertekschool

        precondition : username and password cannot be empty
                        if they are empty ==> please enter the credentials

        if user entered both valid username and password ==> log in
        if valid password, invalid username ==> username is incorrect
        if valid username, invalid password ==> password is incorrect
        if both password and username are invalid ==> invalid username and password
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" Enter your username");
        String inputUserName = input.nextLine();

        System.out.println(" Enter your password");
        String inputPassWord = input.nextLine();

        boolean loggedIn = inputUserName.equals("Cybertek") && inputPassWord.equals("cybertekschool");
            // user entered both valid username and password

        boolean InvalidUserName = ! inputUserName.equals("Cybertek") && inputPassWord.equals("cybertekschool");
            // user entered  invalid username and password

        boolean InvalidPassWord = inputUserName.equals("Cybertek") && ! inputPassWord.equals("cybertekschool");
            // user entered valid username and invalid password

        if ( ! inputUserName.isEmpty() && ! inputPassWord.isEmpty()) { // username and password are not empty
            if (loggedIn) {
                System.out.println("Logged in");
            } else if(InvalidUserName){
                System.out.println("Password is correct, username is incorrect");
            } else if(InvalidPassWord){
                System.out.println("Username is correct, password is incorrect");
            } else{
                System.out.println("Both username and password are incorrect" );
            }

        } else{  // username and password are empty
            System.out.println("Please enter  the credentials");
        }

    }
}
