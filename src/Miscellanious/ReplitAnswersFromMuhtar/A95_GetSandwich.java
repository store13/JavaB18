package Miscellanious.ReplitAnswersFromMuhtar;

import java.util.Scanner;

public class A95_GetSandwich {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        int countBread = 0;
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.contains("bread")) {
                countBread++;
            }
        }

        if (countBread == 1 || countBread < 10) {
            System.out.println("nothing");
        } else if (countBread > 2) {
            System.out.println(str.substring(str.indexOf("d") + 1, str.lastIndexOf("b")));
        }

    }
}
