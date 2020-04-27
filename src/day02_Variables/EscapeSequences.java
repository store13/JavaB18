package day02_Variables;

import java.util.Scanner;

public class EscapeSequences {

    public static void main(String[] args) {

        System.out.println("Hello");
        System.out.println("\tHello");
        System.out.println("\t\t\t\t\t\tHello");
                // \t means a paragraph space
        System.out.println("Cybertek School");
        System.out.println("Cybertek\nSchool");        // print yazinca da println yazinca da aynisi

        System.out.println("\n\nMy\nName\nIs\nMuhtar");
                            // \n means new line, starts with new line

        // print: My favorite TV show is "Game of Thrones"

        System.out.println("My favorite TV show is \"Game of Thrones\"");
        System.out.println("My favorite book is \"Magnus Chase\"");

        System.out.println("\\");
            // \\ prints single \
        System.out.println("/");


        System.out.println("My favorite book is \'Java\' ");    // \' -> prints the ' (single qoute)
        System.out.println("My favorite book is 'Java' ");      //  prints ' also     (single qoute)
    }
}
