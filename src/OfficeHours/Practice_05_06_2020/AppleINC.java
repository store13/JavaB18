package OfficeHours.Practice_05_06_2020;

public class AppleINC {

    public static void main(String[] args) {

        Tester tester1 = new Tester();
        Tester tester2 = new Tester();
        Tester tester3 = new Tester();

        tester1.setInfo("Smith", "SDET", 123000, 1234657);
        tester2.setInfo("Onur", "Junior Tester", 75000, 1245);
        tester3.setInfo("Elton", "QA Lead", 130000, 656565656);

        ScrumTeam scrum1 = new ScrumTeam(); // we can use the arrayLists in scrumTeam class
        scrum1.hireATester(tester3);
        scrum1.hireATester(tester1);
        scrum1.hireATester(tester2);

        scrum1.fireATester(1245);

        // scrum1.testersTeam  // returns the TestersTeam arrayList from scrum1

        for(Tester each : scrum1.testersTeam){
            System.out.println(each);
        }

        System.out.println("======================================================");

        Developer dev1 = new Developer();
        Developer dev2 = new Developer();

        dev1.setDeveloperInfo("Barzy", "Sr.Developer", 200000, 112233445);
        dev2.setDeveloperInfo("Emrah", "Just Developer", 100000, 22334411);

        scrum1.hireADeveloper(dev1);
        scrum1.hireADeveloper(dev2);

        scrum1.fireADeveloper(22334411);

        System.out.println(scrum1.devOpTeam.size());

        for (Developer each : scrum1.devOpTeam) {       // arrayList of developer in Scrum Team
            System.out.println(each);
        }

        System.out.println("=============================================================");

        System.out.println("In my scrum team we have " + scrum1.testersTeam.size() +
                            " testers and " + scrum1.devOpTeam.size() + " developers");

        /*
        create scrum2: 4 developers, 2 testers
        create scrum3: 5 developers, 3 testers

        create an array of scrum : {scrum1, scrum2, scrum3};
            1. iterator the array to print out all the testers who have salary  > 120000
            2. print out all the developers who have salary < 120000

        create an ArrayList of scrum: {scrum1, scrum2, scrum3};
               1. remove all the testers who have salary < 100000
               2. remove all the developers who have salary < 120000
           NOTE: DO NOT create any ArrayList of Testers or Developers.
                Use the ArrayLists in ScrumTeam class only
         */
    }
}
