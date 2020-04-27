package Miscellanious.WarmUp_Questions_From_Muhtar;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class WU_4_21_2010_Night {
    /*
    warmup task:
	1. write a method that can return the maximum number from an int array
	2. write a method that can return the maximum number from a double array
			NOTE: MUST apply method overloading
	3. write a method that can return the minimum number from an int array
	4. write a method that can return the minimum number from a double array
			NOTE: MUST apply method overloading
	5. write an int[] return method that can sort an int array in descending order
	6. write a double[] return method that can sort a double array in descending order
	7. write a char[] return method that can sort a char array in descending order
			NOTE: MUST apply method overloading
     */
    public static void main(String[] args) {

        int arr [] = {23, 65, 6, 7, 9, 60};
       // Double arr1 [] = {23, 6.5, 6, 7.85, 0.9, 60};
        int result = MaxNumber(arr);
       // Double result1 = MaxNumber(arr1);
        int result2 = MinNumber(arr);

        System.out.println(result);
        //System.out.println(result1);
        System.out.println(result2);

        //String [] arrString = {""}

        //result3 = Sort(arr);
    }

    public static int MaxNumber(int [] Arr){
        int max = Arr[0];
        for (int i = 0; i < Arr.length; i++){
            if (Arr[i] > Arr[0]){
                max = Arr[i];
            }
        }
        return max;
    }

//    public static int MaxNumber (Double [] Arr){ // ???
//        Double max = Arr[0];
//        for (int i = 0; i < Arr.length; i++){
//            if (Arr[i] < Arr[0]){
//                max = Arr[i];
//            }
//        }
//        return  max;
//    }

    public static int MinNumber(int [] Arr){
        int min = Arr[0];
        for (int i = 0; i < Arr.length; i++){
            if (Arr[i] < Arr[0]){
                min = Arr[i];
            }
        }
        return min;
    }

    public static Double MinNumber (Double [] Arr){ // ???
        Double min = Arr[0];
        for (int i = 0; i < Arr.length; i++){
            if (Arr[i] < Arr[0]){
                min = Arr[i];
            }
        }
        return min;
    }

    //5. write an int[] return method that can sort an int array in descending order
    public static String Sort(int [] Arr){

        sort(Arr);
        int [] Descending = new int[Arr.length];
        int j= 0;

        for (int i = Arr.length -1; i >= 0; i--){
            Descending[j] = Arr[i];
            j++;
        }

        return Arrays.toString(Descending);
    }


}
