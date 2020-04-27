package Miscellanious.Replit_Questions_And_Answer.Secil_Replits;

import java.util.*;

public class Zombie_Attack2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for(int i=0; i<inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }

        //TODO. Write you code below this line.
        int count = 1;
        System.out.print("Day 0 ");
        System.out.println(Arrays.toString(inhabitants));

        int [] last=new int[inhabitants.length];

        while(!Arrays.equals(inhabitants, last)){
            for(int i=0; i<inhabitants.length-1; i++){
                if(inhabitants[i]!=0 && inhabitants[i+1]==0) {
                    inhabitants[i]=inhabitants[i]/2;
                }else if(inhabitants[i]==0 &&inhabitants[i+1]!=0) {
                    inhabitants [i + 1] = inhabitants [i +1] /2;
                    i++;

                }

            }
            System.out.println("Day "+count+" "+ Arrays.toString(inhabitants));
            count++;
        }
        System.out.println("---- EXTINCT ----");
    }
}
