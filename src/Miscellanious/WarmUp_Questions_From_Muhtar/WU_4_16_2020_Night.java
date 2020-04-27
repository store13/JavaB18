package Miscellanious.WarmUp_Questions_From_Muhtar;

public class WU_4_16_2020_Night {
    /*
    warm up tasks:
	1. write a method called KmToMiles that can convert km to miles
	 				1 km = 0.612 miles
	2. write a method called GallonsToLitters, that can convert gallons to litters
	 			   1 G = 3.75 L
	3. write a method called Calculation, that can accepts 3 parameters: 2 numbers and one operator, and prints out the calculation
		if operator is not between [-, +, *, /, %] output should be Invalid Operator
		Ex: calculate(10, 2, "*") ==> 20;
	4. write a method called Grade, that can print out the grade based on the score of the student
			if score is 100 ~ 90 ==> A
			if score is 89 ~ 80 ==> B
			if score is 79 ~ 70 ==> C
			if score is 69 ~ 60 ==> D
			if score is 0 ~ 59 ==> F
			otherwise ==> Invalid Score
		Ex:
			Grade(100); ==> A
			Grade(120); ==> Invalid
     */
    public static void main(String[] args) {
        //1
        KmToMiles (1);
        GallonsToLitters(1);
        Calculation(6,3,'^');
        Grade(80);

    }

    public static void KmToMiles (double km){
        double miles = km * 0.612;
        System.out.println(miles);
    }

    public static void GallonsToLitters (double gallon){
        double litters = gallon * 3.75;
        System.out.println(litters);
    }

    public static void Calculation(double num1, double num2, char operator){
        switch (operator){
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            case '%':
                System.out.println(num1%num2);
                break;
            default:
                System.out.println("Invalid Operator");
                //break;
        }

    }

    public static void Grade (int score){
        if (score < 0 || score > 100){
            System.out.println("Invalid");
        }else{
            if(score >= 90 && score <=100){
                System.out.println("Grade is : A");
            }else if(score >= 80 && score < 90){
                System.out.println("Grade is : B");
            }else if(score >= 80 && score < 90){
                System.out.println("Grade is : C");
            }else if(score >= 70 && score < 80){
                System.out.println("Grade is : D");
            }else if(score >= 60 && score < 70){
                System.out.println("Grade is : E");
            }else if(score >= 0 && score < 60){
                System.out.println("Grade is : F");
            }
        }
    }
}
