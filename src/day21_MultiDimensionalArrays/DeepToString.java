package day21_MultiDimensionalArrays;

import java.util.Arrays;

public class DeepToString {
    /*
        Arrays.ToString(arrayName): only for single dimensional array

        Arrays.deeptoString(array): for multidimensional arrays

        3 dimensional array can contain 2 dimentional arrays:
                int[][][]  arr3D =  {            };
                    [index num of 2D Array][index num of 1D array][index num of Elements
     */
    public static void main(String[] args) {

        int [] arr1D = {1,2,3};
        System.out.println(Arrays.toString(arr1D));

        int [] [] arr2D = { {1,2,3}, {4,5,6} };

        // System.out.println(Arrays.toString(arr2D)); // [[I@1b6d3586] (hashCode

        System.out.println(Arrays.deepToString(arr2D));

        //                         0       1               0        1
        int[][][]  arr3D = {   {{1,2,3},{4,5,6}} ,     {{7,8,9},{10,11,12}}    };
        //                             0                          1

        System.out.println(  Arrays.deepToString( arr3D[1] ) );

        System.out.println( Arrays.toString( arr3D[0][1] ) );

        System.out.println(   arr3D[1][1][2]  );
    }

}

