package Timus;

import java.io.PrintWriter;
import java.util.Scanner;

public class task1877 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String one = in.nextLine();
        String two = in.nextLine();
        int res1 = Integer.parseInt(one);
        int res2 = Integer.parseInt(two);
        if ((res1 % 2 == 0) | (res2 % 2 != 0)) {
            out.println("yes");
        } else {
            out.println("no");
        }
        out.flush();
    }
}
