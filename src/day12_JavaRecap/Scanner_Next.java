package day12_JavaRecap;

// import PackageName.class;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Scanner_Next {

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        //String str = scan.next();
        //System.out.println(str);

        // 7921 JonesBranch Dr, McLean VA, 22034
        String fullAddress = "";

        System.out.println("Enter the number of the building: ");
            short Bnumber = input.nextShort();
            fullAddress+=Bnumber+ " ";

        System.out.println("Enter the Street Name: ");
        String streetName = input.next();
        fullAddress += streetName+" ";

        System.out.println("Enter the type of the road");
        String roadType = input.next();
        fullAddress += roadType+", ";

        System.out.println("Enter city name, state, zipcode");
        String cityname = input.next();
        fullAddress += cityname+" ";

        String state = input.next();
        fullAddress += state+",  ";

        int zipcode = input.nextInt();
        fullAddress += zipcode;

        System.out.println("Adress is : " + fullAddress);


    }

}
