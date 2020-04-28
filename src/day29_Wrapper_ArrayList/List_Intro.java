package day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class List_Intro {
    /*
    ArrayList : part of Collection
                does not support primitives, only support none primitives
                size is dynamic, automatically adjusted
                has index numbers
                int [] arr = {1,2,3,4,5}

                ArrayList <DataType> listName = new ArrayList<DataType> ();

     methods:
                add(): adds Objects to the arrayList
                get(index): gets the object at the given index, returns the Object as it is.
                size() : returns the length (size) of the arrayList as an int


     */

    public static void main(String[] args) {

        // ArrayList <DataType> listName = new ArrayList<DataType> ();
        //            Mandatory                           Optional

        ArrayList<Integer> scores = new ArrayList<>();
                                    // add 5 elements, size:5
                                    // remove 2 elements, size = 3;

        scores.add(10);     // Autoboxing size :1
        scores.add(20);     // Autoboxing size :2
        scores.add(30);     // Autoboxing size :3

        System.out.println(scores);

        Integer a1 = scores.get(2); // none

        int a2 = scores.get(2);     // unboxing

        double a3 = scores.get(2);  // unboxing

        System.out.println(a1);
        System.out.println(a3);

        // System.out.println(scores.get(100)); // Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 100, Size: 3



    }
}
