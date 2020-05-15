package day38_Constructors;


public class Car {
    String brand;           // instance variable:brand, model, year, price
    String model;
    int year;
    long price;

    public Car(String brand){   // add a constructor that can initialize brand of car
        this.brand = brand;
    }

    public Car(String brand, String model) {    // add a constructor that can initialize brand and model of the car
        //this("Toyota");                  // (apply constructor call to initialize the brand)
        this(brand);
        this.model = model;
    }

    public Car(String brand, String model, int year){   //add a constructor that can initialize the brand, model, year of the car
        //this("Nissan", "Versa");         // (apply constructor call to initialize brand, model)
        this(brand, model);
        this.year = year;
    }

    public Car(String brand, String model, int year, long price){       // add a constructor that can initialize brand, model, year and price of the car
        //this("Honda", "Accord", 2018);                                // (apply constructor call to initialize brand, model, year)
        this(brand, model, year);
        this.price = price;
    }

    public String toString(){           // add toString method
        return "Brand: " + brand + " Model: " + model + " Year: " + year + "Price: " + price;
    }


    public static void main(String[] args) {
        Car car1 = new Car("Honda", "Accord", 2018);
        System.out.println(car1);
    }
}
