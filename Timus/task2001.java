package Timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task2001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        int num4 = in.nextInt();
        int num5 = in.nextInt();
        int num6 = in.nextInt();

        int ves2 = num2 - num4;
        int ves1 = num1 - num5;

        out.println(ves1 + " " + ves2);
        out.flush();
    }
}
