package Miscellanious.Replit_Questions_And_Answer;

import java.util.Scanner;

public class Arrays_Find_NonDuplicateNumber_Loop_Replit_114 {

    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};


            //TODO: write your code below


            for ( int i = 0; i < nums.length; i++){
                int count = 0;
                for (int j = 0; j < nums.length; j++){
                    if (nums[i] == nums[j]){
                        //nonDup = nums[i];
                        count++;

                    }
                }
                //System.out.println(count);

                if (count == 1){
                    System.out.println(nums[i]);
                }
            }
    }
}
