package Miscellanious.QuizQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Short_Quiz {
    public static void main(String[] args) {
        //3
        ArrayList<Integer> list1= new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        int a = 1;      // PAY ATTENTION , this is index !!!
        list1.remove(a);
        System.out.println(list1);

        // 4
        ArrayList<Integer> list2= new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        Integer b = 1;
        list2.remove(b);
        System.out.println(list1);

        ArrayList<String> names = new ArrayList<>();
        names.add("Robb");
        names.add("Bran");
        names.add("Rick");
        names.add("Bran");

        if (names.remove("Bran")){
            names.remove("John");
        }
        System.out.println(names);

        // 7
        ArrayList<Integer> list3 = new ArrayList<>();
        Integer c = 1;
        System.out.println(list3.remove(c));    // PAY ATTENTION !! remove => turns BOOLEAN (True or false)

        // 9
        ArrayList<Integer> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(1,2,3,4,5));

        list4.set(0,list4.get(4));
        list4.set(4,list4.get(0));    // here get(0), above we changed , pay attention !!!

        System.out.println(list4);



    }
}
