package day39_AccessModifiers;

public class CheckInfo {

    public static void main(String[] args) {

        System.out.println("Name: " + PersonalInfo.name);
        System.out.println("Gender: " + PersonalInfo.gender);

        System.out.println("Grade: " + PersonalInfo.grade);     // Default: accessible in the same package
        System.out.println("Age: " + PersonalInfo.age);         // Default: accessible in the same package

        // System.out.println("SSN: " + PersonalInfo.SSN);         // private: outside the class is NOT ACCESSIBLE
        // System.out.println("ID: " + PersonalInfo.ID);          // private: outside the class is NOT ACCESSIBLE

        PersonalInfo obj = new PersonalInfo();
        System.out.println(obj.name);
        System.out.println(obj.gender);

        System.out.println(obj.grade);
        System.out.println(obj.age);

        //System.out.println(obj.SSN);        // private: outside the class is NOT ACCESSIBLE
        //System.out.println(obj.ID);         // private: outside the class is NOT ACCESSIBLE




    }
}
