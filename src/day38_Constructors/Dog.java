package day38_Constructors;

public class Dog {

    String name;
    String breed;
    int age;

    public Dog(){   // sets the default value for all instances
        name = "Unknown";
        breed = "Unknown";
        age = 0;

    }

    public Dog(String breed){
        this.breed = breed;
        name = "Unknown";
        age = 0;
    }

    public Dog(String breed, int age){
        this.breed = breed;
        this.age = age;
        name  = "Unknown";
    }

    public String toString(){
        return "Name: " + name + ", breed: " + breed + ", age: " + age;
    }


}
