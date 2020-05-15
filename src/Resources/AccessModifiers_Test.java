package Resources;

import day39_AccessModifiers.AccessModifiers;

public class AccessModifiers_Test {

    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();

        // System.out.println(obj.defaultAccess); // default: ONLY Accessible in SAME PACKAGE
        System.out.println(obj.publicAccess);   // open to the world

        // System.out.println(obj.SSN);            // private : only accessible within the same class




    }
}
