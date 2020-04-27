package Miscellanious.WarmUp_Questions_From_Muhtar;

public class WU_4_13_2020 {
    /*
    warmup tasks:
	1. write a program that can return the average number from an array of integers
			ex:
				[1,2,3]
				average: 2
				[10, 15, 5, 6]
				average: 9
				[4, 5, 6, 7, 8, 10, 20, 30, 0]
				average: 10
	2. write a program that can return the longest string of text from an array
	3. write a program that can return the shortest string of text from an array
     */
    public static void main(String[] args) {
        //WarmUp_1 (4/13/2020)
        int arr [] = {10, 15, 5, 6};
        int avg = 0;
        int total = 0;

        for (int i = 0; i < arr.length; i++){
            total += arr[i];
        }
        avg = total/ arr.length;
        System.out.println(avg);

        //WarmUp_2 & 3 (4/13/2020)

        String arr1 [] = {"abc", "Adam", "Muhtar", "Arnold"};
        String longest = arr1[0];
        String shortest = arr1[0];

        for (int i = 0; i < arr1.length; i++){
            if (arr1[i].length() > longest.length()){
                longest = arr1[i];
            }

            if (arr1[i].length() < shortest.length()){
                shortest = arr1[i];
            }

        }
        System.out.println(longest);
        System.out.println(shortest);
    }
}
