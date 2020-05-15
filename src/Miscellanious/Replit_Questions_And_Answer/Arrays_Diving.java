package Miscellanious.Replit_Questions_And_Answer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/*
In the sport of diving, seven judges award a score between 0 and 10, where each score may be a floating-point value.
The highest and lowest scores are thrown out, and the remaining scores are added together. The sum is then multiplied by the degree of difficulty for that dive.
The degree of difficulty ranges from 1.2 to 3.8 points. The total is then multiplied by 0.6 to determine the divers score.
Use System.out.printf("Total: %.2f",total); in order to get rid of extra floating points.
 */

public class Arrays_Diving {

    public static void main(String[] args) {
        ArrayList<Float> scores = new ArrayList<>();
        for (int i = 1; i < 8; i++){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter score for judge " + i + ":");
            //input.nextInt();
            scores.add(input.nextFloat());
        }
        //Arrays.sort(scores);
        System.out.println(Arrays.asList(scores));


        // FINAL OUTPUT
        //System.out.printf("Total: %.2f", total);
    }

    }

