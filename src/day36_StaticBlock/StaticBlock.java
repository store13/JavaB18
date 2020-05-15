package day36_StaticBlock;

public class StaticBlock {
    /*
    static: runs first, only runs one time
        executed as soon as class is loaded

        static{
            statements;
        }

     */

    public static void main(String[] args) {
        System.out.println("Main method executed");
    }

    public static void method1(){
        System.out.println("Custom method executed");
    }

    static{ // does not matter where it is. First static will be executed !! And ONE TIME
        System.out.println("static block executed ");
    }




}
