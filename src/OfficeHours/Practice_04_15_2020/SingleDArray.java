package OfficeHours.Practice_04_15_2020;

import java.util.Arrays;

public class SingleDArray {

    public static void main(String[] args) {

        int a = 100;
        int [] arr = {100, 200, 300};
        //              0   1    2

        System.out.println(arr[1]); // 200

        for(int i = 0; i < arr.length; i++){    // i: index num of elements
            // System.out.println(i);      // 0 1 2  index number
            int num = arr[i];
            System.out.println(num);
        }

        System.out.println("=======================================");

        // while loop solution

        int j = 0;
        while(j < arr.length){
            int num = arr[j];
            System.out.println(num);
            j++;
        }

        System.out.println("=======================================");

        String [] names = {"John", "Aaron", "Luoise", "Muhtar"};  //4
        int length = names.length;  // 4
        String [] namesRev = new String [length];   // { null, null, null}
                                            //             0    1     2
        /*
        //       i          k
        namesRev[0] = names[2];
        namesRev[1] = names[1];
        namesRev[2] = names[0];
         */

        /*
        // for loop Solution

        int k = length - 1;
        for (int i = 0; i < length; i++){
            namesRev[i] = names[k];
            k--;
        }
         */

        // while loop solution
        int  i = 0;
        int k = length-1;
        while(i < length){
            namesRev[i] = names[k];
            i++;
            k--;
        }

        System.out.println(Arrays.toString(namesRev));

    }
}
