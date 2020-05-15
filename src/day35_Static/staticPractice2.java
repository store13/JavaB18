package day35_Static;

public class staticPractice2 {

    String brand;
    String model;
    static boolean  hasWheels = true;

    public void printBrand(){
        System.out.println(brand);
        // System.out.println(hasWheels); // we can call , static can be called from everywhere ...
    }

    public void printModel(){
        System.out.println(model);
    }

    public static void main(String[] args) {    // Static ONLY Accepts Static
        System.out.println(hasWheels);

    }

}
