package day38_Constructors;
/*
Rules:
1. only constructor can call another constructor
2. In order to call a constructor in another constructor ==> MUST use this() keyword (this() is used to call constructors)
    this(): can only be used in a constructor calling another constructor (DO NOT USE NAME OF CONSTRUCTOR)
3. Constructor call MUST be at FIRST step. If we call at later step ==> Compiler error
4. A Constructor can call ONLY ONE Constructor. If we call twice ==> Compiler error
5. A Constructor can NOT call ITSELF. If it calls itself ==> Compiler error
6. A Constructor can NOT contain itself ==> Meaning if a constructor called another, the latter can not call the first (because of rule 5)
 */

public class ConstructorCalls2 {

    public ConstructorCalls2() {
        System.out.println("Default constructor");
    }

    public ConstructorCalls2(int a) {
        this(); // "Default constructor"
        System.out.println("Constructor with int argument");
    }

    public ConstructorCalls2(String str) {
        //   System.out.println(" Hello");
        this(10); // default , & int arguments
        //  this();
        System.out.println("Constructor with String argument");
    }


    public static void main(String[] args) {

        ConstructorCalls2 obj = new ConstructorCalls2("Hello");

    }

    public void method1() {
        // ConstructorCalls2();
    }

    {

    }

}
