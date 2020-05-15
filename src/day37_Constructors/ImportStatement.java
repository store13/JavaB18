package day37_Constructors;
/*
regular imports:
    syntax:
        import PackageName.ClassName;  // imports one class from package
        import PackageName.*;  // imports all classes from the package

static imports: we can import static variables or methods
    syntax:
        import static PackageName.className.name;  // only imports one static from the class
        import static PackageName.className.*; // imports all static variables and methods from the class

 */

// import java.util.Arrays; // only imports Arrays class from java util

import java.util.*; // imports all the classes from java util

/*
import static day37_Constructor.Data.staticVariable;
import static day37_Constructor.Data.staticMethod;
 */

import static day37_Constructors.Data.*;

public class ImportStatement {

    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        Arrays.sort(arr);

        System.out.println( staticVariable );

        staticMethod();
    }

}