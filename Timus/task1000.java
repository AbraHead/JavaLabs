package Timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task1000 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int num1 = in.nextInt();
        int num2 = in.nextInt();

        out.println(num1 + num2);
        out.flush();
    }
}
