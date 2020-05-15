package Miscellanious.WarmUp_Questions_From_Muhtar;

public class WU_5_14_2020 {
    /*
    Warmup tasks:
	1. create a class called Car:
				instance variable:
						brand, model, year, price
				add a constructor that can initialize brand of car
				add a constructor that can initialize brand and model of the car
								(apply constructor call to initialize the brand)
				add a constructor that can initialize the brand, model, year of the car
								(apply constructor call to initialize brand, model)
				add a constructor that can initialize brand, model, year and price of the car
								(apply constructor call to initialize brand, model, year)
				add toString method
	2. create a class called Employee:
				instance variables:
						name, jobTitle, ID, salary
				add a constructor that can initialize name of employee
				add a constructor that can initialize name, jobTitle of the employee
							(apply constructor call to initialize the name)
				add a constructor that can initialize name, jobTitle, ID of the employee
							(apply constructor call to initialize the name and jobTitle)
				add a constructor that can initialize name, jobTitle, ID, salary of employee
							(apply constructor call to initialize the name, jobTitle, ID)
				add toString method
     */
    public class Car{           // create a class called Car:
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

    }
//    public static void main(String[] args) {
////        Car car1 = new Car("Honda", "Accord", 2018);
////        System.out.println(car1);
//    }


}
