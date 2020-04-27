package day23_Methods;

public class Methods {

    /*
    04/16/2020
Topics: Custom Methods
methods: grouping series of statements to perform tasks, function
            step 1: reverse a string
            step 2: statement
            step 3: statement
            step 4: reverse a string
            step 5: statement
            benefits: reusable
                     easy to maintain and fix
                     int a = 100 * 10;
    declaration of methods (with no parameter):
                public       static      void         main (String[] args)
            Access-modifier specifier return-type  methodName(){
                    statements;
            }
            Access modifiers: public, protected, default, private
            specifier: static, final, abstract, synchronized
            return-type: void, any datatype ( all primitives&objects)
            method cannot be declared in another method
    declaring methods (with parameter):
    Why we need parameters : sometime, the function requires extra information in order to complete its task           Access-modifier specifier return-type  methodName(Parameters){
                    statements;
            }

            parameters : any data type
            argument   : an extra info that MUST be needed in order to complete the task



    }

     */

    public static void main(String[] args) {
        System.out.println("Hello Cybertek");
        printHello5Times();
        System.out.println("Hello Batch 18");
        printHello5Times();
        System.out.println("Hello Saim");
        printHello5Times();
        System.out.println("===========================");
        evenNumbers1_100();
        oddNumbers1_100();


    }

    public static void printHello5Times() {

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }
    }

    public static void evenNumbers1_100(){
        for (int i = 1; i <= 100; i++){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void oddNumbers1_100(){
        for (int i = 1; i <= 100; i++){
            if(i % 2 == 1){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

        /*
        step1: void method (without parameter)
        step2: void method (with parameter)
        step3: return method (without parameter)
        step4: return method (with parameter)
        step5: using the method different classes
        step6: overloading

         */

}
