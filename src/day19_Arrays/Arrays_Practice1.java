package day19_Arrays;

public class Arrays_Practice1 {

    public static void main(String[] args) {

        String friends [] = {"Adam", "Abraham", "Smith", "Simon", "Emily"};

        /*
        System.out.println (friends[6] ) ;
        String s1 = friends[2];
        System.out.println(s1);
         */

        for(int i=0; i<friends.length; i++) {
            String name= friends[i];
            //System.out.println(friends[i]);
            System.out.println(name);
        }

        String [] emails = {"cybertek@yahoo.com", "cybertek@gmail.com", "cybertek@hotmail.com", "cybertek@outlook.com"};

        // print out all the users who registered with their gmail
        // max : 4

        for (int i = 0; i <= 3; i++){
            String email = emails[i];
            if (email.endsWith("@gmail.com")){
                System.out.println(email);
            }
        }



    }
}
