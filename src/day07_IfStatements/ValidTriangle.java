package day07_IfStatements;

public class ValidTriangle {
    /*
    warmup tasks:
    1. A triangle is valid if the sum of all the three angles is equal to 180 degrees.
    Write a program that declares three integers as angles and check whether a triangle is valid or not.
     */
    public static void main(String[] args) {

        double angle1 = 30.5;
        double angle2 = 49.5;
        double angle3 = 100;

        short sumOfAngles = (short) (angle1 + angle2 + angle3);

        // boolean validTriangle = sumOfAngles == 180;

        if (sumOfAngles == 180) {
            System.out.println("The shape is a triangle");
        }
        if (sumOfAngles != 180){
            System.out.println("The shape is NOT a triangle");
        }
    }
}
