package Miscellanious.WarmUp_Questions_From_Muhtar;

import java.util.ArrayList;
import java.util.Arrays;

public class WU_5_1_2020 {
    /*
    warmup tasks:
	Write a program that can move all the zeros to  last indexes of ArrayList
		Ex:
			list:  {1,0,2,0,3,0,4,0};
			output: [1, 2, 3, 4, 0, 0, 0, 0]
			DO NOT USE SORT method, DO NOT declear  any extra lists
	write a program that can return the duplicated values from an ArrayList of String
		Ex:
			list: {"A", "B", "A", "C", "D"};
			output: ["A"]
			list: {"A", "B", "B", "C", "D", "D"};
			output: ["A", "C"]
     */
    public static void main(String[] args) {

        Integer [] numbers =  {1,0,2,0,3,0,4,0};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(numbers));
        System.out.println(list);

        list.removeAll(Arrays.asList(0));

        Integer [] numbers2 = {0,0,0,0};
        list.addAll(Arrays.asList(numbers2));

        System.out.println(list);
    }
}
