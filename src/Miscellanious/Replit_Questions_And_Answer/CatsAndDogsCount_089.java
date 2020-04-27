package Miscellanious.Replit_Questions_And_Answer;

import java.util.Scanner;

public class CatsAndDogsCount_089 {
    /*
    Print true if the string "cat" and "dog" appear the same number of times in the given string word.
            Example:
                input: catdog
                output: true

                Example:
                input: catcat
                output: false

                Example:
                input: cat-cheetah-dog-cat
                output: false
     */

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int countOfCats = 0;
            int countOfDogs = 0;
            String word = scan.next();
            boolean catAndDog = true;

            for (int i =0; i < word.length() -2 ; i++){
                if( word.substring(i, i +3).equalsIgnoreCase("cat")){
                    countOfCats++;
                }

                if (word.substring(i, i +3).equalsIgnoreCase("dog")){
                    countOfDogs++;
                }
            }

            // System.out.println(countOfCats);
            // System.out.println(countOfDogs);

            if (countOfCats == countOfDogs){
                System.out.println(catAndDog);
            }else{
                System.out.println(!catAndDog);
            }



        }
    }
