package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;

public class Quiz {
    /*
    1. write a program that can remove all the special characters from a list of Character
    2. Write a program that can remove all the numbers that can divisible by 3 or 5 in ArrayList
     */
    public static void main(String[] args) {
        // 5
        ArrayList<String> names = new ArrayList<>();
        names.add("Robb");  // 0
        names.add("Bran");  // 1
        names.add("Rick");  // 2
        names.add("Bran");  // 3

        if (names.remove("Bran")){  // {"Robb","Rick","Bran"}
            names.remove("John");
        }
        System.out.println(names);

        // 9
        ArrayList<Integer> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(1,2,3,4,5));

        list4.set(0,list4.get(4));    // {5,2,3,4,5}
            // set (0,5)

        // {5,2,3,4,5}
        System.out.println(list4);

        list4.set(4,list4.get(0));    // {5,2,3,4,5}  here get(0), above we changed , pay attention !!!
        // set (4,5)
        System.out.println(list4);

        // 11
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        // {1,2,3,4,5,6,7}

        for(Integer each: nums) {    // each ; 1,2,3,4,5,6,7
            if (each % 2 != 0) {
                continue;
            }
            System.out.print(each + " ");   // 2
            break;

        }

    }
}
