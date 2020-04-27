package day21_MultiDimensionalArrays;

public class ScrumTeam {

    public static void main(String[] args) {

                //              0          1        2         3
        String [] DevTeam = {"Zeynep", "Haider", "Jovid", "Muhtar"};

        String [] TestersTeam = {"Rahman", "Aishan", "Osman", "Ali"};

        String [] PO = {"Barzy", "Donald"};

        String [] TesterTeam2 = {"Ilham", "Zarina", "Aizhan", "Asiman"};

        String [][] ScrumTeam = {DevTeam, TestersTeam, PO};
                        //          0           1
        ScrumTeam [0][3] = "Jean";

        ScrumTeam[1] = TesterTeam2;

        System.out.println(ScrumTeam[0][3] );   // Jean

        String info = ScrumTeam [1][2];
        System.out.println(info);   // Osman

        System.out.println("================================");

        for (String eachEmployee : ScrumTeam[1]){   // to retrieve Testers ScrumTeam[1], Dev ScrumTeam[0]
            System.out.println(eachEmployee);
        }
        System.out.println("================================");

        System.out.println(ScrumTeam[2][1]);    // Donald





    }
}
