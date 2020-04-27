package Miscellanious.Replit_Questions_And_Answer;

import java.util.Arrays;
import java.util.Scanner;

public class Replit_147 {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();

        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++){

            arr[i]=inp.nextInt();
        }

        //System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++){
            isPos(arr[i]);
        }

    }


    public static void isPos(int num){
        if (num >= 0 ){
            System.out.println("positive");
        }else{
            System.out.println("not positive");
        }

    }
}
