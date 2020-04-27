package day11_Scanner;

public class Browsers {
    /*
    write a program that can display the selected browser1.
    declare a String variable called browserName2.  Assume that the valid browsers are: chrome, firefox, opera, safari.
    if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser Name
    Note: Do Not use scanner or if statement or ternary for this task
     */
    public static void main(String[] args) {

        String browserName = "opera";     // Firefox, firefox

        switch(browserName){
            case "chrome":
            case "Chrome":
                System.out.println("Chrome is opening");
                break;
            case "firefox":
            case "Firefox":
                System.out.println("Firefox is opening");
                break;
            case "safari":
            case "Safari":
                System.out.println("Safari is opening");
                break;
            case "opera":
            case "Opera":
                System.out.println("Opera is opening");
                break;
            default:
                System.out.println("Invalid browser name. Please give the right browser name");
                // break; // we don't need to write if we write at the end...
        }
    }

}
