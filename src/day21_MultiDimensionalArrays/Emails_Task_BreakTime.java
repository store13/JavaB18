package day21_MultiDimensionalArrays;

public class Emails_Task_BreakTime {
    public static void main(String[] args) {
        /*
        Task:
    given an array:
        String[] emails = {"Cybertek@gmail.com", "Cybertek@yahoo.com", "Cybertek@hotmail.com", "Cybertek@outlook.com"}
        elements could be more in the array
    print all the email addresses excluding the gmail addresses
        NOTE: MUST USE FOR EACH LOOP
         */

        String[] emails = {"Cybertek@gmail.com", "Cybertek@yahoo.com", "Cybertek@hotmail.com", "Cybertek@outlook.com"};

        // My solution NOT USE , cybertek@gmailSchool.copm. even it is INVALID, code works !!!
//        for (String eachExcludeGmail : emails){
//            if (!eachExcludeGmail.contains("gmail")){
//                System.out.println(eachExcludeGmail);
//            }
//        }


        // 1 st Solution
        for (String EachEmail : emails){
            if (!EachEmail.endsWith("@gmail.com")){
                System.out.println(EachEmail);
            }
        }

        System.out.println("===========================");
        // 2nd solution
        for (String EachEmail : emails){
            if (EachEmail.endsWith("@gmail.com")){
                continue;
            }
            System.out.println(EachEmail);
        }

    }
}
