package Resources;

import day39_AccessModifiers.PersonalInfo;

public class CheckInfo {

    public static void main(String[] args) {

        System.out.println(PersonalInfo.name);
        System.out.println(PersonalInfo.gender);

//        System.out.println(PersonalInfo.grade);     // default: only accessible within the same package
//        System.out.println(PersonalInfo.age);       // default: only accessible within the same package

//        System.out.println(PersonalInfo.SSN);       // private: accessible in the same class only
//        System.out.println(PersonalInfo.ID);        // private: accessible in the same class only

        PersonalInfo obj = new PersonalInfo();
        System.out.println(obj.name);
        System.out.println(obj.gender);

//        System.out.println(obj.grade);      // default: only accessible within the same package
//        System.out.println(obj.age);        // default: only accessible within the same package

//        System.out.println(obj.SSN);        // private: accessible in the same class only
//        System.out.println(obj.ID);         // private: accessible in the same class only


    }


}
