package Miscellanious.Replit_Questions_And_Answer;

import java.util.*;

public class Replit_DeliveryCalc {

       public static int refuel_times(ArrayList<Integer> deliveries, int max_fuel){
            int refuel_times;
            int sum = 0;
            for (int each : deliveries ){
                sum += each;
            }

           if(sum % max_fuel != 0){
               refuel_times = (sum / max_fuel) + 1;
               //return (sum / max_fuel) + 1;
           }else {
               refuel_times = sum / max_fuel;
               //return (sum / max_fuel);
           }
            return refuel_times;
        }

        public static void main(String[] args){
            //ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(100,200,10));
            ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(9,1));
//            arr.add(3);
//            arr.add(3);
//            arr.add(1);
//            arr.add(2);
//            arr.add(6);
            int times = refuel_times(arr,3);
            System.out.print(times);//should output 5

        }//end main
    }

