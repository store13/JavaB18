package Miscellanious.WarmUp_Questions_From_Muhtar;

public class WU_5_11_2020_Evening_Constructor {

}
/*
Part_ 1
1. create a custom class for pizza that should contain the following:
				instance variables:
					  	size (either small, medium, large)
					  	number of cheese topping
					  	number of pepperoni toppings
			  	Add a constructor that can allow user to set the size and toppisngs of the pizza
				instance method:
						calcCost(): returns the total cost as double
						toString(): a String return method that's containing the pizza' size, quantity of each topping, and the pizza cost as calculated by calcCost()
				Pizza cost is determined by:
						Small: $10 + $1.5 per pepperoni topping + 1 per cheese topping
						Medium: $12 + $1.5 per pepperoni topping + 1 per cheese topping
						Large: $14 + $1.5 per pepperoni topping + 1 per cheese topping
	create a class called Order
			create five objects of the pizza
			create an arraylist of pizza and add those 5 objects into it
			calculate the total price of the order (use for each loop)
 */
 class pizza {
     String size;
     int numOfCheese;
     double numOfPepperoni;

 public pizza(String size, int numOfCheese, double numOfPepperoni){
     this.size = size;
     this.numOfCheese =numOfCheese;
     this.numOfPepperoni =numOfPepperoni;
 }
 public double calcCost(String size, int numOfCheese, double numOfPepperoni){
     if (size.equalsIgnoreCase("Small")){
         return 10 + (1.5 * numOfPepperoni) + numOfCheese;
     }else if(size.equalsIgnoreCase("Medium")){
         return 12 + (1.5 * numOfPepperoni) + numOfCheese;
     }else{
         return 14 + (1.5 * numOfPepperoni) + numOfCheese;
     }
 }

}
