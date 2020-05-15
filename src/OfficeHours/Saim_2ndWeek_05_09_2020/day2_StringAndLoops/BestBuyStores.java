package OfficeHours.Saim_2ndWeek_05_09_2020.day2_StringAndLoops;

public class BestBuyStores {

    public static void main(String[] args) {

        BestBuy store1 = new BestBuy();
        store1.numberOfComputers = 10;
        store1.numberOfComputers--;

        System.out.println(BestBuy.numberOfComputers);

        store1.close();

        BestBuy.closeALL();

        String str = "He";

        if (str.length() <2){
            System.out.println("");
            //return "";
        }else{
            //return str.substring(1, str.length()-1);
            System.out.println(str.substring(1, str.length()-1));
        }



    }
}
