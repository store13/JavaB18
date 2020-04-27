package day20_Arrays_Continue;

public class Array_Size {

    public static void main(String[] args) {

        int [] arr = {1,2,3};    // 0 ~ 2
                //    0 1 2

        // System.out.println(arr[100]);   // array's size is fixed

        int [] nums = new int[2];     // {0,0}  0 ~ 1

        nums[0] = 10;   // {10, 0}
        nums[1] = 20;   // {10, 20}
        // nums[2] = 30;  Array's size is fixed

        System.out.println(nums[0]);    // 10
        System.out.println(nums[1]);    // 20
        //System.out.println(nums[2]);    // INDEXOUTOFBOUND, Error

        nums = new int[3];  // RESET, {0, 0, 0}

        System.out.println(nums[0]);    // 0
        System.out.println(nums[1]);    // 0
        System.out.println(nums[2]);    // 0

    }
}
