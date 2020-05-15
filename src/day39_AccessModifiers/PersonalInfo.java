package day39_AccessModifiers;
/*
Task :
    create a class for Student:
        instance variables:
            name, id, age, gender, grade, SSN
            public: name, gender,
            private: age, grade, id, SSN
 */

public class PersonalInfo {

    public static String name = "Zuura";
    public static char gender = 'F';

    static char grade = 'A';
    static int age = 18;

    private static long SSN = 901234;
    private static long ID = 9876543;

}
