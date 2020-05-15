package day35_Static;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {

    public static void main(String[] args) {

        Offer offer1 = new Offer();
        offer1.setOfferInfo("VA", "BOA", 100000, true);
        Offer offer2 = new Offer();
        offer2.setOfferInfo("KY", "Capitol One", 120000, false);
        Offer offer3 = new Offer();
        offer3.setOfferInfo("MD","Chase",95000,true);
        Offer offer4 = new Offer();
        offer4.setOfferInfo("BayArea", "Google", 115_000, false);
        Offer offer5 = new Offer();
        offer5.setOfferInfo("Florida", "WaltDisney", 110_000, true);

        Offer [] offers = {offer1, offer2, offer3, offer4, offer5};

        String myLocation ="VA";    // my current State

        ArrayList<Offer> Accept = new ArrayList<>(Arrays.asList(offers));

        Accept.removeIf(each -> each.salary < 100_000 || each.isFullTime == false || !each.location.equals(myLocation)); // we remove thr offer if it's less than 100k and not full time

        System.out.println(Accept.size());

        for (Offer eachOffer : Accept){
            System.out.println(eachOffer);
        }



    }
}
