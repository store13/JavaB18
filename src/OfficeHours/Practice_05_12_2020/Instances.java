package OfficeHours.Practice_05_12_2020;

public class Instances {

    String name;

    {
        name = "Zuura";
    }

public static void main(String[] args) {
    Instances obj = new Instances();
    obj.name = "Zuura";

    System.out.println(obj.name);
}

    public void printName(){
        //int name = 100;
        System.out.println("Name is: "+ this.name);
    }
}
