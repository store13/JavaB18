package day37_Constructors;
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

public class ConstructorIntro {

    // public method(){}  // Constructor Name MUST be same with class name

    public ConstructorIntro(int a){  // constructor with argument

        System.out.println("Constructor with argument of int");
    }

    public static void main(String[] args) {

        //  ConstructorIntro obj = new ConstructorIntro();  // object MUST be created with existing constructor

        ConstructorIntro obj2 = new ConstructorIntro(10);

        ConstructorIntro obj3 = new ConstructorIntro(10);

    }

}
