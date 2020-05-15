package Miscellanious.Replit_Questions_And_Answer;

import java.util.ArrayList;
import java.util.Arrays;
/*
The highest and lowest scores are thrown out, and the remaining scores are added together.
The sum is then multiplied by the degree of difficulty for that dive.
The degree of difficulty ranges from 1.2 to 3.8 points. The total is then multiplied by 0.6 to determine the divers score.
Use System.out.printf("Total: %.2f",total); in order to get rid of extra floating points.
output: Enter score for judge 1:
input: 1
output: Enter score for judge 2:
input: 5
output: Enter score for judge 3:
input: 5
output: Enter score for judge 4:
input: 5
output: Enter score for judge 5:
input: 5
output: Enter score for judge 6:
input: 8
output: Enter score for judge 7:
input: 9
output: Enter difficulty:
input: 2.1
output: Total: 35.28
 */
public class Replit_Arrays_Diving {
    public static void main(String[] args) {
        //WRITE YOUR CODES HERE
        // 1st step : with help of the for loop , create a scores and put them to ArrayList
        //ArrayList<Float> scores = new ArrayList<>();
        //for (int i = 0; i <  )

        // 2nd step: Find and then extract MIN & MAX scores from Array (use Remove Method) and assign Sum variable, calculate Sum
        // 3rd step: The sum is then multiplied by the degree of difficulty for that dive.

        int [] scores = {1, 5, 5, 5, 5, 8, 9};
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));
        int min = scores[0];
        int max = scores[scores.length-1];
        //int [] newScores = new int[scores.length-2];
        int [] newScores = new int[scores.length];

        for (int i = 1; i < scores.length-1 ; i++){
            newScores[i] = scores[i];
        }
        System.out.println(Arrays.toString(newScores));



        // FINAL OUTPUT
        //System.out.printf("Total: %.2f", total);
    }
}
