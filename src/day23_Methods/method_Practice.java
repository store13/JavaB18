package day23_Methods;

public class method_Practice {
    /*
    step 1 : Hello Cybertek
    step 2 : Hello World 5 times
    step 3 : Hello Batch 18
    step 4 : Hello World 5 times
    step 5 : Hello Saim
    step 6 : Hello World 5 times
     */
    public static void main(String[] args) {

//        System.out.println("Hello Cybertek");
//
//        for (int i = 0; i < 5; i++){
//            System.out.println("Hello World");
//        }
//
//        System.out.println("Hello Batch 18");
//
//        for (int i = 0; i < 5; i++){
//            System.out.println("Hello World");
//        }
//
//        System.out.println("Hello Saim");
//
//        for (int i = 0; i < 5; i++){
//            System.out.println("Hello World");
//        }
        System.out.println("Hello Cybertek");
        printHello5();
        System.out.println("Hello Batch 18");
        printHello5();
        System.out.println("Hello Saim");
        printHello5();


    }
    public static void printHello5() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }
    }
}