package day40_Encapsulation;
/*
Encapsulation: hiding the data
    1. hide the data by giving private access provider
    2.
 */

public class Encapsulation {

    private long SSN ;

    // getter : read only
    public long getSSN(){
        return SSN;
    }

    // setter : write only , modify the private data
    public void setSSN(long SSN){
        this.SSN = SSN;
    }
}
