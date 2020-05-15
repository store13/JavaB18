package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;

public class Duplicates {
    /*
    	write a program that can return the duplicated values from an ArrayList of String
		Ex:
			list: {"A", "B", "A", "C", "D"};
			output: ["A"]
			list: {"A", "B", "B", "C", "D", "D"};
			output: ["A", "C"]
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("A", "B", "A", "C", "D"));
        System.out.println(list);

        ArrayList<String> duplicates = new ArrayList<>();

        for (int i = 0; i < list.size(); i++){
            int count = 0;
            for(String each : list){
                if (each.equals(list.get(i))){
                    count++;
                }
            }
            if (count > 1 && !duplicates.contains(list.get(i))){    // if the frequency is greater than 1,
                                                                    // and if it's not contained in duplicates yet,
                                                                    // then we will add the list .....
                duplicates.add(list.get(i));
            }
        }
        /*
        // list.get(0) ==> "A"
        int count = 0;
        for(String each : list){
            if (each.equals(list.get(0))){
                count++;
            }
        }
        if (count > 1){
            duplicates.add(list.get(0));
        }
         */

        System.out.println(duplicates);

    }
}
