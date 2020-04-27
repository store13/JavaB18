package Miscellanious.Replit_Questions_And_Answer;

public class Replit_163 {

    public static boolean validateTask(boolean notEmpty,int taskId,int currentId){

        if (notEmpty == true && taskId == currentId+1){
            return true;
        }else{
            return false;
        }

    }

    public static void main (String [] args){

        boolean result1 = validateTask(false, 5, 4);
        boolean result2 = validateTask(true, 2, 1);
        boolean result3 = validateTask(true, 6, 1);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);


    }

}
