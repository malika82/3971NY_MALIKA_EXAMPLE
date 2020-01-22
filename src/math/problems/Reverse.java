package math.problems;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        String str1;
        String str2=" ";

        Scanner sc= new Scanner(System.in);
        System.out.println("enter a string to reverse");
        str1=sc.nextLine();
         for (int i=0;i<str1.length();i++){
             str2=str1.charAt(i)+ str2;

         }

        System.out.println(str2);

    }


}
