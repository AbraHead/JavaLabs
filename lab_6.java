package Labs;

import org.apache.groovy.json.internal.ArrayUtils;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

class l6_task1 {
    char onezero;
    String twozero;

    public l6_task1(){
        this.onezero = '0';
        this.twozero = "0";
        printvalues();
    }

    public void setZero(char zero){
        this.onezero = zero;
        printvalues();
    }
    public void setZero(String zero){
        this.twozero = zero;
        printvalues();
    }

    public void setZero(char[] zero){
        if (zero.length == 1) {
            this.onezero = zero[0];
        } else {
            this.twozero = Arrays.toString(zero);
        }
        printvalues();
    }

    public void printvalues(){
        PrintWriter out = new PrintWriter(System.out);
        out.println("onezero = " + this.onezero + "\ntwozero = " + this.twozero + "\n==========");
        out.flush();
    }
}

class l6_task2 {
    private static Integer one = 0;

    public void printvalues() {
        PrintWriter out = new PrintWriter(System.out);
        out.println("arg = " + one);
        out.flush();
        one++;
    }
}

class l6_task3 {
    public static int avg(Integer[] numbers){
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

    public static void MinMaxAvg(Integer... numbers) {
        Arrays.sort(numbers);
        PrintWriter out = new PrintWriter(System.out);
        out.println("min = " + numbers[0] + " max = " + numbers[numbers.length-1] + " avg = " + avg(numbers));
        out.flush();
    }

}

class l6_task4 {
    private static Integer fact2recursionutil(Integer number, Integer result){
        if (number == 2 | number == 1 | number < 0) {return result;}
        return fact2recursionutil(number-2, result*(number-2));
    }
    public static Integer fact2recursionv2(Integer number){
        return fact2recursionutil(number, number);
    }

    public static void fact2while(Integer number) {
        int sum = number;
        do {
            sum *= number-2;
            number-=2;
        } while (number != 2 & number != 1 & number > 0);
        PrintWriter out = new PrintWriter(System.out);
        out.println(sum);
        out.flush();
    }

}

class l6_task5 {
    private static Integer sumSquereRecursionUtil(Integer number, Integer iter, Integer result){
        if (number < iter) {return result;}
        return sumSquereRecursionUtil(number, iter+1, result+(iter*iter));
    }
    public static Integer sumSquereRecursion(Integer number){
        return sumSquereRecursionUtil(number, 0, 0);
    }

    public static void sumsquerefor(Integer number) {
        int sum = 0;
        for (int i = 0; i <= number; i++){
            sum+=i*i;
        }
        PrintWriter out = new PrintWriter(System.out);
        out.println("Sum = " + sum + " Test = " + (number*(number + 1)*((2*number) + 1)/6));
        out.flush();
    }

}

class l6_task6 {
    public static Integer[] getArray(Integer[] numbers, Integer indexes) {
        return numbers.length > indexes ? Arrays.copyOfRange(numbers, 0, indexes).clone() : numbers.clone();
    }
}
class l6_task7 {
    public static Integer[] getArray(char[] numbers) {
        Integer[] newarr = new Integer[numbers.length];
        for (int i = 0; i<numbers.length; i++){
            newarr[i] = (int) numbers[i];
        }
        return newarr;
    }
}
class l6_task8 {
    public static Integer getAvg(Integer[] numbers) {
        return l6_task3.avg(numbers);
    }
}

class l6_task9 {
    public static char[] reverseSymbols(char[] symbols) {
        char[] newsymbols = new char[symbols.length];
        for (int i = 0; i < symbols.length; i++){
            newsymbols[i] = symbols[symbols.length-i-1];
        }
        return newsymbols;
    }
}

class l6_task10 {
    public static Integer[] getMinMax(Integer... numbers) {
        Arrays.sort(numbers);
        return new Integer[]{numbers[0], numbers[numbers.length-1]};
    }
}

public class lab_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintStream So = System.out;
        printutils printt = new printutils();

        printt.printtask();
        char[] testarr = {'a', 'b', 'c'};
        l6_task1 t1 = new l6_task1();
        t1.setZero('5');
        t1.setZero("abc");
        testarr = new char[] {'a'};
        t1.setZero(testarr);

        printt.printtask();
        l6_task2 t2 = new l6_task2();
        for (int i = 0; i < 6; i++){
            t2.printvalues();
        }

        printt.printtask();
        l6_task3.MinMaxAvg(1, 5, 64, 8);

        printt.printtask();
        l6_task4.fact2while(6);
        So.println(l6_task4.fact2recursionv2(6));
        l6_task4.fact2while(5);
        So.println(l6_task4.fact2recursionv2(5));

        printt.printtask();
        l6_task5.sumsquerefor(6);
        So.println("RecSum = " + l6_task5.sumSquereRecursion(6));
        l6_task5.sumsquerefor(5);
        So.println("RecSum = " + l6_task5.sumSquereRecursion(5));

        printt.printtask();
        Integer[] arr = {1,2,3,4,5,6,7,8,9};
        So.println("OldArr = " + Arrays.toString(arr)+"\nNewArr = " +
                Arrays.toString(l6_task6.getArray(arr, 5)));
        So.println("OldArr = " + Arrays.toString(arr)+"\nNewArr = " +
                Arrays.toString(l6_task6.getArray(arr, 20)));


        printt.printtask();
        char[] charr = {'a', 'b', 'c', 'd', 'i', 'f', 'g'};
        So.println("OldArr = " + Arrays.toString(charr)+"\nNewArr = " +
                Arrays.toString(l6_task7.getArray(charr)));

        printt.printtask();
        So.println("Arr = " + Arrays.toString(arr)+"\nAvg = " + l6_task8.getAvg(arr));

        printt.printtask();
        So.println("OldArr = " + Arrays.toString(charr)+"\nNewArr = " +
                Arrays.toString(l6_task9.reverseSymbols(charr)));

        printt.printtask();
        So.println("Arr = " + Arrays.toString(arr)+"\nMinMax = " +
                Arrays.toString(l6_task10.getMinMax(1,2,3,4,5,6,7,8,9)));
    }
}
