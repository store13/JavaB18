package Miscellanious.Replit_Questions_And_Answer.Secil_Replits;

import java.util.Scanner;

public class ShoppingList2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "yes";
        double price = 0;
        int count = 1;
        double totalPrice = 0;

        do{
            System.out.println("Enter Item"+count+" and its price:");
            item = scan.next();
            price = scan.nextDouble();

            totalPrice = totalPrice+price;
            System.out.println("Add one more item?");
            countinue = scan.next();
            if(countinue.equalsIgnoreCase("yes")) {

            }
            shoppingListReport+="Item"+count+": "+item+" Price: "+price;
            shoppingListReport = shoppingListReport + ", ";
            count++;

        }while(count<=10 && countinue.equals("yes"));

        System.out.println(shoppingListReport.substring(0, shoppingListReport.length()-2));
        System.out.println("Total price: "+ totalPrice);
    }
}
