package day21_MultiDimensionalArrays;

import java.util.Arrays;

public class Multi_DimensionalArrays {
    /*
    multi-dimentional array: a variable that can contain arrays
        n dimensional array MUST contain (n-1) dimensional arrays
        2 dimensional array contains 1 dimensional arrays:
                    int[] arr1D = {1,2,3}
                    int[][]  arrayName = {  {1,2,3} , {4,5,6}  };
                            //                0     ,    1
                        each single dimensional arrays are index of the 2D array
                        [index number of each 1Darray] [index num of each value in 1D array]
                                arrayName[0][1]  ==> 2
                                arrayName[1][2]  ==> 6
                                arrayName[0] ==> {1,2,3}
        3 dimensional array can contain 2 dimentional arrays:
                int[][][]  arr3D =  {            };
                    [index num of 2D Array][index num of 1D array][index num of Elements

     */

    public static void main(String[] args) {

        int [] arr= {1, 2, 3};

        int [] [] arr2D = {{1, 2, 3}, {4, 5, 6, 7}};
                    //          0           1

        System.out.println(arr2D.length);

        int [] arr1D = arr2D [0];  // {1, 2, 3}

        System.out.println(Arrays.toString(arr2D[0]));
        // System.out.println(Arrays.toString(arr1D)); // same with above

        int num1 = arr2D [1][3];    // 7
        System.out.println(num1);

        // {'A', 'B'};
         //                   0   1       0    1    2      0   1   2
        char [][] ch2D = {  {'A','B'} , {'D', 'E', 'F'}, {'G','H','I'}      };
        // index:               0              1               2

        char c1 = ch2D[1][0];
        System.out.println(c1);

        char [] ch2 = ch2D[2];    // {'G','H','I'}
        System.out.println(Arrays.toString(ch2));

        //                      0   1   2       0    1    2      0   1   2
        String [][] str2D = { {"A","B","C"} , {"D", "E", "F"}, {"J","H","I"}};
                    //              0                1               2

        //String r1 = str2D[]




    }
}
