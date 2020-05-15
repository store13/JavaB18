package day40_Encapsulation;

public class Person_Objects {

    public static void main(String[] args) {

        Person Zarina = new Person("Zarina");
        System.out.println(Zarina.name);
        //System.out.println(Zarina.SSN);   // access modifier is PRIVATE , it is NOT VISIBLE out of class without set

        Zarina.setSSN(987654321);
        System.out.println("Zarina' SSN " + Zarina.getSSN());   // 0 --> after SET --> 987654321

        //System.out.println(Zarina.ID);      // access modifier is PRIVATE , it is NOT VISIBLE out of class without set

        Zarina.setID(123098);
        System.out.println("Zarina' ID: " + Zarina.getID());

    }
}
