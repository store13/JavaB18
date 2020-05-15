package OfficeHours.Saim_2ndWeek_05_09_2020.day2_StringAndLoops;

public class countHiClass {

    public static void main(String[] args) {
        String str = "java cs java pro";
//        System.out.println(str.replace("java", "c#"));
//        System.out.println(str.replaceFirst("java", "#c"));

        int count = 0;
        while (str.contains("java")){
            count++;
            str = str.replaceFirst("java", "");
            System.out.println(count);
        }
    }
}
