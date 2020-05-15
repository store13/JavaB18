package OfficeHours.Practice_05_06_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class DevelopersObject {

    public static void main(String[] args) {

        Developer developer1 = new Developer();

        developer1.setDeveloperInfo("Mehmet", "Senior Developer", 125000, 987654345);

        System.out.println(developer1);

        Developer developer2 = new Developer();
        developer2.setDeveloperInfo("Leon", "Sr. Developer", 120000, 654346890);

        developer1.coding();
        developer2.coding();

        developer1.fixingBugs();
        developer2.fixingBugs();

        System.out.println("=========================");

        Developer [] arr = {developer1, developer2};
        /*
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        */
        for(Developer each : arr){
            System.out.println(each.name + " " + each.salary);
        }

        System.out.println("=====================================================");

        ArrayList<Developer> developers = new ArrayList<>(Arrays.asList(arr));
        // developers.addAll(Arrays.asList(developer1, developer2));

             /*
       for(int i=0; i < developers.size(); i++){
           System.out.println(  developers.get(i).name );
       }
    */

        for( Developer each : developers ){
            System.out.println( each.name+" "+each.salary );
        }








    }
}
