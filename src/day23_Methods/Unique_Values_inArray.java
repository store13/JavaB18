package day23_Methods;

public class Unique_Values_inArray {
    /*
    warmup task:
	1.  Write a program that can print out the unique values from a String Array
			Ex:
				if arr -> {"A", "A", "B", "C", "C"}
				output: B
				if arr -> {"A", "B", "B", "C"}
				output:  A
						 C
			MUST use for each loop
     */
    public static void main(String[] args) {

        String [] arr = {"A", "A", "B", "C", "D", "F", "B", "E"}; //

        // outer loop will repeat as many times as length of array
        // inner loop will repeat as many times as length of array to compare each element to others

        // solution 1 : Combination of for each loop and regular for loop
        for (String each: arr){ // regular it can be written (3rd solution)
            int count2 = 0;
            for (int i = 0 ; i < arr.length; i++){
                if (arr[i].equals(each)){
                    count2++;
                }
            }
            if (count2== 1){
                System.out.println(each);
            }
        }

        System.out.println("==================================");

        // solution 2 : for each loop
        for (String each2: arr){
            //System.out.println(each2);
            int count = 0;
            for (String each: arr){
                if(each.equals(each2)){
                    count++;
                }
            }
            if(count == 1){ // if the character is unique
                System.out.println(each2);
            }

        }


    }
}
