package Miscellanious.Replit_Questions_And_Answer;

public class Assesment4_1 {

       public static boolean isSort(int[] nums) {

           boolean result = false;

            for (int i = 1; i < nums.length -1 ; i++){
                if (nums[i+1] == nums[i] +1){
                    result = true;
                }else{
                    result = false;
                }
            }
           return result ;
       }

        public static void main (String [] args){

            int [] arr = {2,3,4, 5};

            System.out.println (isSort(arr));
        }
    }
