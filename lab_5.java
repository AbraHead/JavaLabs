package Labs;

import java.io.PrintWriter;
import java.io.Writer;
import java.util.Arrays;
import java.util.Scanner;

class task1 {
//    Напишите программу с классом, в котором есть закрытое символьное поле
//    и три открытых метода. Один из методов позволяет присвоить значение полю.
//    Еще один метод при вызове возвращает результатом код символа. Третий
//    метод позволяет вывести в консольное окно символ (значение поля) и его код
    private char pole;

    public void setPole(char pole) {
        this.pole = pole;
    }

    public int getSymbolCode(){
        return (int) this.pole;
    }

    public String getSymbolAndCode(){
        return (int) this.pole + " " + this.pole;
    }

}

class task2 {
//    Напишите программу с классом, у которого есть два символьных поля и
//    метод. Он возвращает результат, и у него нет аргументов.
//    При вызове метод выводит в консольное окно все символы из кодовой таблицы, которые
//    находятся «между» символами, являющимися значениями полей объекта
//    (из которого вызывается метод).

//    Например, если полям объекта присвоены значения ‘A’ и ‘D’,
//    то при вызове метода в консольное окно должны
//    выводиться все символы от ‘A’ до ‘D’ включительно.

    char pole1;
    char pole2;
    public void getSymbols(){
        PrintWriter out = new PrintWriter(System.out);
        for (int i = (int) this.pole1; i <= (int) this.pole2; i++){
            out.print( (char) i + " ");
        }
        out.println("");
        out.flush();
    }

}

class task3 {
//    Напишите программу с классом, у которого есть два целочисленных поля.
//    В классе должны быть описаны конструкторы, позволяющие создавать
//    объекты без передачи аргументов, с передачей одного аргумента и с передачей
//    двух аргументов.

    Integer pole1;
    Integer pole2;

    public void setStandartInts() {
        this.pole1 = 1;
        this.pole2 = 5;
    }

    public void setPole1(int pole1) {
        this.pole1 = pole1;
    }

    public void setPole2(int pole2) {
        this.pole2 = pole2;
    }

    public void setPole1AndPole2(int pole1, int pole2) {
        this.pole1 = pole1;
        this.pole2 = pole2;
    }

    public task3() {
        this.pole1 = 1;
        this.pole2 = 5;
    }

    public task3(Integer pole1, Integer pole2) {
        this.pole1 = pole1;
        this.pole2 = pole2;
    }

    public task3(Integer pole1) {
        this.pole1 = pole1;
        this.pole2 = 32;
    }
}

class task4 extends printutils{
//    Напишите программу с классом, у которого есть два символьных поля и
//    метод. Он возвращает результат, и у него нет аргументов.
//    При вызове метод выводит в консольное окно все символы из кодовой таблицы, которые
//    находятся «между» символами, являющимися значениями полей объекта
//    (из которого вызывается метод).

//    Например, если полям объекта присвоены значения ‘A’ и ‘D’,
//    то при вызове метода в консольное окно должны
//    выводиться все символы от ‘A’ до ‘D’ включительно.

    char pole1;
    Integer pole2;

    public task4(char pole1, Integer pole2) {
        this.pole1 = pole1;
        this.pole2 = pole2;
    }

    public task4(double code) {
        String[] codes = Double.toString(code).split("\\.");
        codes[1] = codes[1].length() < 2 ? codes[1] : codes[1].substring(0, 2);
        this.pole1 = (char) Integer.parseInt(codes[0]);
        this.pole2 = Integer.parseInt(codes[1]);
    }

    public void printvalues(){
        PrintWriter out = new PrintWriter(System.out);
        out.println(this.pole1 + " " + this.pole2);
        out.flush();
    }

}

class task5 {
//    Напишите программу с классом, у которого есть два символьных поля и
//    метод. Он возвращает результат, и у него нет аргументов.
//    При вызове метод выводит в консольное окно все символы из кодовой таблицы, которые
//    находятся «между» символами, являющимися значениями полей объекта
//    (из которого вызывается метод).

//    Например, если полям объекта присвоены значения ‘A’ и ‘D’,
//    то при вызове метода в консольное окно должны
//    выводиться все символы от ‘A’ до ‘D’ включительно.

    private Integer pole1;

    public task5(Integer pole1) {
        this.pole1 = pole1 < 100 ? pole1 : 100;
    }

    public task5() {
        this.pole1 = 0;
    }

    public void setPole1(Integer pole1) {
        this.pole1 = pole1 < 100 ? pole1 : 100;
    }
    public void setPole1() {
        this.pole1 = 0;
    }

    public Integer getPole1() {
        return pole1;
    }

    public void printvalues(){
        PrintWriter out = new PrintWriter(System.out);
        out.println(this.pole1);
        out.flush();
    }
}

class task6 {
//    Напишите программу с классом, у которого есть два символьных поля и
//    метод. Он возвращает результат, и у него нет аргументов.
//    При вызове метод выводит в консольное окно все символы из кодовой таблицы, которые
//    находятся «между» символами, являющимися значениями полей объекта
//    (из которого вызывается метод).

//    Например, если полям объекта присвоены значения ‘A’ и ‘D’,
//    то при вызове метода в консольное окно должны
//    выводиться все символы от ‘A’ до ‘D’ включительно.

    private Integer min = -1;
    private Integer max = 1;

    public void setMinMax(Integer arg1, Integer arg2) {
        this.min = arg1 < arg2 ? arg1 : arg2;
        this.max = arg1 > arg2 ? arg1 : arg2;

    }

    public void setMinOrMax(Integer arg1) {
        if (this.max > arg1) {
            this.min = arg1;
        } else if (this.max < arg1){
            this.max = arg1;
        }
    }

    public task6(Integer arg1, Integer arg2) {
        this.min = arg1 < arg2 ? arg1 : arg2;
        this.max = arg1 > arg2 ? arg1 : arg2;
    }

    public task6(Integer arg1) {
        if (this.max > arg1) {
            this.min = arg1;
        } else if (this.max < arg1){
            this.max = arg1;
        }
    }

    public void printvalues(){
        PrintWriter out = new PrintWriter(System.out);
        out.println("min = " + this.min + "\nmax = " + this.max + "\n=============");
        out.flush();
    }
}

class printutils{
    private Integer tasknumber = 1;

    public void printtask() {
        PrintWriter out = new PrintWriter(System.out);
        out.println("\ntask" + this.tasknumber);
        out.flush();
        this.tasknumber++;
    }
}

public class lab_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        printutils printt = new printutils();

        printt.printtask();
        task1 t1 = new task1();
        t1.setPole('b');
        out.println(t1.getSymbolCode());
        out.println(t1.getSymbolAndCode());
        out.flush();

        printt.printtask();
        task2 t2 = new task2();
        t2.pole1 = 'A';
        t2.pole2 = 'D';
        t2.getSymbols();
        out.flush();

        printt.printtask();
        task3 t3 = new task3();
        t3.setPole1(1);
        t3.setPole2(4);
        out.println(t3.pole1 + " " + t3.pole2);
        t3.setPole1AndPole2(1, 2);
        out.println(t3.pole1 + " " + t3.pole2);
        t3.setStandartInts();
        out.println(t3.pole1 + " " + t3.pole2);

        out.println("chstt3 and cnstt3_2");
        task3 cnstt3 = new task3(2);
        out.println(cnstt3.pole1 + " " + cnstt3.pole2);
        task3 cnstt3_2 = new task3(2, 5);
        out.println(cnstt3_2.pole1 + " " + cnstt3_2.pole2);
        out.flush();

        printt.printtask();
        new task4('B', 13).printvalues();
        new task4(65.12).printvalues();
        new task4(66.1325).printvalues();

        printt.printtask();
        task5 t5 = new task5();
        t5.setPole1(5);
        t5.printvalues();
        t5.setPole1(196);
        t5.printvalues();
        new task5(5).printvalues();
        new task5(196).printvalues();

        printt.printtask();
        new task6(5).printvalues();
        new task6(6, 1).printvalues();
        new task6(78, 1).printvalues();
        task6 t6 = new task6(1);
        t6.setMinMax(93,21);
        t6.printvalues();
        t6.setMinOrMax(526);
        t6.printvalues();
    }
}
