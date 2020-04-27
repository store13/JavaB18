package Miscellanious.WarmUp_Questions_From_Muhtar;

public class WU_4_23_2020 {
    /*
    Warmup task:
		1. write a return method that can return the minimum number from an int array
		2. write a return method that can return the minimum number from a double array
					NOTE: apply method overloading,  DO NOT USE SORT METHOD.
		3. write a method that can print out the unique elements from an int array
					Ex: {1,1,2,3,3} ==> 2
						{6,6,7,7,8,9} ==> 8 9
		4. write a method that can print out the unique elements from a double array
					Note: Apply method overloading
     */
    public static void main(String[] args) {

        int arr1 [] = {34, 67, 7, 8, 9, 12, 1};
        int MIN = minNumber(arr1);
        System.out.println(MIN);

//        double arr2 [] = {12, 6.8, 5.9, 4.54, 89, 90} ;
//        double minD = minNumber(arr2);
//        System.out.println(minD);

    }

    // 1
    public static int minNumber(int [] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < arr[0]){
                min = arr[i];
            }
        }
        return min;
    }
    // 2
    public static Double minNumber(Double[] arr){
        Double min = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < arr[0]) {
                min = arr[i];
            }
        }
        return min;
    }
}
