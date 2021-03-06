package Miscellanious.Replit_Questions_And_Answer;

public class RowNum {
    /*
    Complete the method so that it takes in a 2-D array and returns the sums of the rows as an integer array.
    For example, the if we run rowSums for the following 2D array:
    {
        {1,1,2}, //sum = 4
        {3,1,2}, //sum = 6
        {3,5,3}, //sum = 11
        {0,1,2}  //sum = 3
    }
        Then we should get the following array back:
        {4,6,11,3}
     */

    public static void main(String[] args){
        int[][] a = {
                {1,1,2}, //sum = 4
                {3,1,2}, //sum = 6
                {3,5,3}, //sum = 11
                {0,1,2}  //sum = 3
        };
        int[] sums = rowSums(a);
        for(int sum : sums)
            System.out.println(sum);
        //this should print 4 6 11 3
    }
    public static int[] rowSums(int[][] nums){
        // 1st way (Hard to understand and execute)
        // int result [] = new int[nums.length];

        // int count = 0;

        // for(int [] each1DArray : nums){
        //   int sum = 0;
        //   for (int eachElement : each1DArray){
        //     sum += eachElement;

        //   }
        //    result[count]= sum;
        //    count++;

        // }

        // return result;

        //2nd way

        int [] result = new int [nums.length];

        for (int i = 0; i < nums.length; i++){
            //int sum = 0;
            for (int j = 0; j < nums[i].length; j++){
                // sum += nums[i][j];
                result[i] += nums[i][j];
            }
            //result[i] = sum;

        }
        return result;

    }
}

