package Miscellanious.Replit_Questions_And_Answer;

import sun.plugin2.gluegen.runtime.CPU;

import java.util.*;

public class Replit_56 {
    public static void main(String[] args) {
        double price = 0;
        String storageType, screenType, cpu;
        int ram = 0;

        int hdd = 0;
        int ssd = 0;

        Scanner scan = new Scanner(System.in);

        //WRITE YOUR CODE HERE
        System.out.println("Select screen size:");
        double screenSize = scan.nextDouble();

        if (screenSize == 13.3) {
            price += 200;
        } else if (screenSize == 15.0) {
            price += 300;
        } else {
            price += 400;
        }
        System.out.println("Select CPU type:");
        cpu = scan.next();

        if (cpu.equalsIgnoreCase("i3")) {
            price += 150;
        } else if (cpu.equalsIgnoreCase("i5")) {
            price += 250;
        } else if (cpu.equalsIgnoreCase("i7")) {
            price += 350;
        }

        //scan.nextLine();

        System.out.println("Select RAM size:");
        ram = scan.nextInt();

        int ramPrice = (ram / 4) * 50;

        price += ramPrice;

        scan.nextLine();

        System.out.println("Select storage type:");
        storageType = scan.nextLine();

        System.out.println("Enter memory size:");
        int memorySize = scan.nextInt();


        if (storageType.equalsIgnoreCase("hhd")) {
            hdd = (memorySize / 500) * 50;
            price += hdd;
        }else if (storageType.equalsIgnoreCase("ssd")){
            ssd = (memorySize / 500) * 100;
            price += ssd;
        }

        scan.nextLine();

        System.out.println("Enter screen resolution:");
        String screenResolution = scan.next();

        if (screenResolution.equalsIgnoreCase("fullhd")) {
            price += 100;
        } else {
            price += 200;
        }

        System.out.println("Laptop price is: $" + price);

    }
}




