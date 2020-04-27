package Miscellanious;

public class quiz_Array {
    public static void main(String[] args) {
//        int [] n1 = new int [3];      // [0, 0 , 0]
//        int  [] n2 = {1, 2, 3, 4, 5}; // size : 5
//        n1 = n2;                      // num1 ={1, 2, 3, 4, 5}
//        for (int i =0; i < n1.length; i++){
//            System.out.println(n1[i]);

//        int arr [] = {1, 2, 3, 4};
//        int i = 0;
//        do{
//            System.out.println(arr[i] + " ");
//            i++;
//        } while (i < arr.length -1);
        int wd= 0;      // -1 + 1 + 2 + 2 -1 = 3
        String [] days = {"sun", "mon", "wed", "sat"};

        for (int i = 0; i < days.length; i++){

            switch (days[i]){
                case "sat" :
                case "sun" :
                    wd -= 1;
                    break;
                case "mon" :
                    wd++;
                case "wed" :
                    wd += 2;
            }
        }
        System.out.println(wd);
    }
}

