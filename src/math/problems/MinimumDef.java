package math.problems;
import com.sun.codemodel.internal.JCatchBlock;

import java.util.Scanner;

public class MinimumDef {
    public static void main(String[] args) {
        int[] a = new int[6];
        int size;
        int min1,min;


        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.println("enter an element");
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        min=a[0]-a[1];
        for (int i=1;i<a.length;i++){
            min1=a[i]-a[i+1];
            if (min1<min){
                min=min1;
            }
        }
        System.out.println(" the smallest minum is "+" "+min);
    }

}
