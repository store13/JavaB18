package day15_ForLoop;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        String str = "Java is fun";
        //    0123

        String reverse1 = ""+ str.charAt(3) + str.charAt(2) + str.charAt(1) + str.charAt(0);

        int lastIndexNum = str.length() - 1;

        String reverse2 = "";

        for (int i = lastIndexNum; i >= 0; i--){
            // System.out.print(str.charAt(i));
            reverse2 += str.charAt(i);
        }
        System.out.println(reverse2);
    }


    }
