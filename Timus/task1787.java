package Timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task1787 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int cars = in.nextInt();
        int minutes = in.nextInt();
        int sumcars = 0;
        for (int i = 0; i < minutes; i++) {
            sumcars += in.nextInt();
            sumcars = Math.max(sumcars - cars, 0);
        }
        out.println(sumcars);
        out.flush();
    }
}
