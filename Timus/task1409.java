package Timus;
import java.io.PrintWriter;
import java.util.Scanner;

public class task1409 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int b = in.nextInt();

        int sum = a + b - 1;
        int larry = sum - b;
        int garry = sum - a;

        out.println(garry + " " + larry);
        out.flush();
    }

}

