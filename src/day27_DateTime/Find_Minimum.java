package day27_DateTime;

public class Find_Minimum {
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

        int [] arr = {5, 4, 7, 5};  // 4
        int minimum = arr[0];
        for (int each : arr){
            if (each < minimum){
                minimum = each;
            }
        }
        System.out.println(minimum);

        int [] arr2 = {100, 2000, 3000, 40, 50, -100, -9000};

        System.out.println(minimum(arr2));

        double [] arr3 = {55.5, 10.5, 1.5, 2.5, 0, - 10.25};
        double num1 = minimum(arr3);
        System.out.println(num1);
    }
    //1
    public static int minimum (int [] arr){
        int minimum = arr[0];
        for (int each : arr){
            if (each < minimum){
                minimum = each;
            }
        }
        return minimum;
    }
    //2
    public static double minimum (double [] arr){
        double minimum = arr[0];
        for (double each : arr){
            if (each < minimum){
                minimum = each;
            }
        }
        return minimum;
    }
}
