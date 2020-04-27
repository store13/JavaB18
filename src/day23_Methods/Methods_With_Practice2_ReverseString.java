package day23_Methods;

public class Methods_With_Practice2_ReverseString {

    // 3. Create a function that can reverse any string

    // "Muhtar" ==> rathuM, "Cybertek" ==> ketrebyC

    public static void main(String[] args) {
        String name1 = "Eldon";
        ReverseString(name1);

        String name2 = "Muhtar";
        ReverseString(name2);

        System.out.println("hello");
    }

    public static void ReverseString(String str){
        for (int i = str.length()-1; i >= 0; i--){
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
}
