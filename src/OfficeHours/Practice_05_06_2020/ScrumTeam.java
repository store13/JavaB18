package OfficeHours.Practice_05_06_2020;

import java.util.ArrayList;

public class ScrumTeam {

    ArrayList<Tester> testersTeam  = new ArrayList<>();
    ArrayList<Developer> devOpTeam = new ArrayList<>();


    public void hireATester(Tester tester){
        testersTeam.add(tester);
    }

    public void fireATester(long employeeID){
        testersTeam.removeIf(eachTester-> eachTester.employeeID == employeeID);
    }

    public void hireADeveloper(Developer developer){
        devOpTeam.add(developer);
    }

    public void fireADeveloper(long employeeID){
        devOpTeam.removeIf(eachDev -> eachDev.employeeID == employeeID);
    }


}
