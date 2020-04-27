package day26_MethodOverloading;

public class MethodOverLoading_3 {
    /*
first method: can find the sum of two int numbers
second method: can find the sum of two double numbers
 */
    public static void main(String[] args) {

        sum (10, 20);
        sum(1.5, 2.5);

        // 10, 20.0
        //sum(10,20.0);   // result 30.0 Pay Attention !!

        // 10, 15.5
        double num1 = sum(10,15.5);
        System.out.println(num1);

        // 25L, 30L
        double num2 = sum(25L, 30L);
        System.out.println(num2);

        // 5, 4
        //double num3 = sum (5,4);    // void method dos NOT return any value

    }// 40L, 50L
    // int num3 = sum((int ) 40L, (int) 30L); // ??? LOOOK AT that
     //   System.out.println(num3);

    public static void sum(int a, int b){
        System.out.println(a+b);
    }

//    public static void sum(double a, double b){
//        System.out.println(a+b);
//    }

    public static double sum(double a, double b){
        return (a+b);
    }
}
