package Miscellanious.Replit_Questions_And_Answer;

import java.util.Scanner;

public class ShoppingList2_085 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;

        do{
            System.out.println("Enter Item" + count + " and its price:");
            item = scan.next();
            price = scan.nextDouble();

            System.out.println("Add one more item?");
            countinue = scan.next();

            if (countinue.equalsIgnoreCase("no")){
                shoppingListReport = "Item" + count + ": " + item + " Price: " + price;
                totalPrice = price;
                break;
            }else {
                count++;
                System.out.println("Enter Item" + count + " and its price:");
                item = scan.next();
                price = scan.nextDouble();
                shoppingListReport += ", Item" + count + ": " + item + " Price: " + price;
                totalPrice += price;
            }


        }while(countinue.equalsIgnoreCase("yes"));

        System.out.println (shoppingListReport);
        System.out.println ("Total price:" +totalPrice);


    }
}
