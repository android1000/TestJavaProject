package NewPackage;

import java.util.Scanner;
import java.lang.Math;

public class InputClass {
    public static void main(String[] args){
        int a,b,c;
        double d;
        String s;
        a=new Scanner(System.in).nextInt();
        s=new Scanner(System.in).next();
        b=a+5;
        System.out.println(b);
        d=Math.sqrt(b);
        System.out.println(d);
        System.out.println(s);
    }

}
