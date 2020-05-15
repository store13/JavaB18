package Miscellanious.Replit_Questions_And_Answer;

import java.util.ArrayList;
import java.util.Arrays;

/*
Create a static method that:
is called appendPosSum
returns an ArrayList of Integers
takes one parameter: an ArrayList of Integers
This method should:
Create a new ArrayList of Integers
Add only the positive Integers to the new ArrayList
Sum the positive Integers in the new ArrayList and add the Sum as the last element

For example, if the incoming ArrayList contains the Integers (4,-6,3,-8,0,4,3),
the ArrayList that gets returned should be (4,3,4,3,14),
with 14 being the sum of (4,3,4,3).  The original ArrayList should remain unchanged.
 */
public class Replit_ArrayList_appendPosSum {

    public static void main(String[] args) {
        //System.out.println(appendPosSum(4,-6,3,-8,0,4,3));
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(4, -6, 3, -8, 0, 4, 3));
        System.out.println(appendPosSum(arr));
    }
    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> arr) {
        ArrayList<Integer> result = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i)>= 0) {
                result.add(arr.get(i));
                sum += arr.get(i);
            }
        }
        result.add(sum);
        //System.out.println(result);
        return result;
    }


}

