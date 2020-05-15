package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_ContainAll {
    /*
    Bulk Operations :
    containsAll(CollectionType): verifies if all objects in CollectionType are contained in the list or not,
                                 returns boolean
    addAll(CollectionType) : adds multiple objects,adds all the objects from given collection type
    removeAll(CollectionType): removes multiple objects, removes matching objects
    retainAll(CollectionType): removes all  UNMATCHING objects
                               {1, 2, 3, 4, 5, 6 ,7 ,1 ,2 ,3 ,4}
                               removeAll(1, 2, 3, 4) ==> {5, 6, 7}
                               retainAll(1, 2, 3, 4) ==> {1, 2, 3, 4, 1 ,2 ,3 ,4}

      Arrays.asList(object1, object2..) : returns the collection type (List)
     */

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(100);
        list1.add(1000);
        list1.add(20);

        // if 10, 20, 60 if all objects are exists in Array List ==> true
        // otherwise  ==> false
        /*
            boolean r1 = list1.contains(10);
            boolean r2 = list1.contains(20);
            boolean r3 = list1.contains(60);

            boolean result = r1 == true && r2 == true && r3 ==true;

            System.out.println(result);
        */

        boolean result2 = list1.containsAll(Arrays.asList(10, 20, 60));
        System.out.println(result2);
        boolean result3 = list1.containsAll(Arrays.asList(10, 20));
        System.out.println(result3);

        // 10, 30, 40
        Integer [] data = {10,30,40};
        boolean result4 = list1.containsAll(Arrays.asList(data));
        System.out.println(result4);







    }
}
