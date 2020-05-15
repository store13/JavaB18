package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObjects {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        /*
        dog1.breed = "Husky";
        dog1.size = "Small";
        dog1.color = "White";
        dog1.name = "Ghost";
        dog1.age = 4;
         */
        dog1.setDogInfo("Husky", "Small", 4, "White", "Ghost");

        Dog dog2 = new Dog();
        dog2.setDogInfo("Alabay", "Extra Big", 5, "Brown", "Ajdar");

        Dog dog3 = new Dog();
        dog3.setDogInfo("Poodle", "Miniature", 2, "White", "Lucy");

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        System.out.println("=================================");

        Dog dog4 = new Dog();
        dog4.setDogInfo("Pomeranian", "Small",4, "White", "Ernie");

        Dog dog5 = new Dog();
        dog5.setDogInfo("Pomeranian", "Small",3, "Brown", "Lilly");


        ArrayList<Dog> puppies = new ArrayList<>();
        puppies.addAll(Arrays.asList(dog1,dog2,dog3));

        for (int i = 0; i < puppies.size(); i++){
            Dog eachDog = puppies.get(i);
            System.out.println(eachDog);
        }

        System.out.println("==============================");

        puppies.removeIf( p-> p.age > 2 );
        for(int i =0; i < puppies.size(); i++){
            Dog eachdog  = puppies.get(i);
            System.out.println( eachdog );
        }

    }


}
