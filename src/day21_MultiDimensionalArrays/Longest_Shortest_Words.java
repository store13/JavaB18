package day21_MultiDimensionalArrays;

public class Longest_Shortest_Words {

    /*
    warmup tasks:
	2. write a program that can return the longest string of text from an array
	3. write a program that can return the shortest string of text from an array
     */
    public static void main(String[] args) {

        String [] names= {"Reem", "Omer", "Muhtar", "Emrah", "Mohammed", "Ana"};

        int maxLengthString = names[0].length();
        //int minLengthString = names[0].length();
        String longestWord = "";

        for ( int i = 1; i < names.length; i++) {
            if (names[i].length() > maxLengthString) {
                maxLengthString = names[i].length();
                longestWord = names[i];
            }

            System.out.println(longestWord);

        }
    }
}
