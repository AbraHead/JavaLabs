package Labs;

import org.apache.groovy.json.internal.ArrayUtils;

import java.util.*;

public class lab_3 {

    public static void task1(int number) {

        switch (number) {
            case 1 -> System.out.println("Понедельник");
            case 2 -> System.out.println("Вторник");
            case 3 -> System.out.println("Среда");
            case 4 -> System.out.println("Четверг");
            case 5 -> System.out.println("Пятница");
            case 6 -> System.out.println("Суббота");
            case 7 -> System.out.println("Воскресенье");
            default -> System.out.println("Введено некорректное значение");
        }
    }

    public static void task2(String day) {

        switch (day) {
            case "Понедельник" -> System.out.println(1);
            case "Вторник" -> System.out.println(2);
            case "Среда" -> System.out.println(3);
            case "Четверг" -> System.out.println(4);
            case "Пятница" -> System.out.println(5);
            case "Суббота" -> System.out.println(6);
            case "Воскресенье" -> System.out.println(7);
            default -> System.out.println("Введено некорректное значение");
        }

//        if (day.equals("Понедельник")) {
//            System.out.println(1);
//        } else if (day.equals("Вторник")) {
//            System.out.println(2);
//        } else if (day.equals("Среда")) {
//            System.out.println(3);
//        } else if (day.equals("Четверг")) {
//            System.out.println(4);
//        } else if (day.equals("Пятница")) {
//            System.out.println(5);
//        } else if (day.equals("Суббота")) {
//            System.out.println(6);
//        } else if (day.equals("Воскресенье")) {
//            System.out.println(7);
//        } else {
//            System.out.println("Введено некорректное значение");
//        }


    }

    public static void task3(int number) {
//        Напишите программу, которая выводит последовательность чисел
//        Фибоначчи. Первые два числа в этой последовательности равны 1, а каждое
//        следующее число равно сумме двух предыдущих (получается последовательность 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 и так далее).
//        Количество чисел в последовательности вводится пользователем.
//        Предложите версии программы, использующие разные операторы цикла.
        int[] fib = new int[number];
        fib[0] = 1;
        switch (number) {
            case 1 -> {}
            case 2 -> fib[1] = 1;
            default -> {
                fib[1] = 1;

                for (int i = 2; i < number; i++) {
                    fib[i] = fib[i - 2] + fib[i - 1];
                }
                System.out.println(Arrays.toString(fib));

                int i = 2;
                while (i < number) {
                    fib[i] = fib[i - 2] + fib[i - 1];
                    i+=1;
                }
                System.out.println(Arrays.toString(fib));

                i = 2;
                do {
                    fib[i] = fib[i - 2] + fib[i - 1];
                    i+=1;
                } while (i < number);
                System.out.println(Arrays.toString(fib));
            }
        }

    }

    public static void task4() {

        //    Напишите программу, в которой пользователем вводится два целых числа.
        //    Программа выводит все целые числа — начиная с наименьшего
        //    (из двух введенных чисел) и заканчивая наибольшим (из двух введенных чисел).
        //    Предложите разные версии программы (с использованием разных операторов цикла).
        System.out.println("Введите начало и конец последовательности");
        int start = new Scanner(System.in).nextInt();
        int stop = new Scanner(System.in).nextInt();
        StringBuilder numbers = new StringBuilder();

        for (int i = start; i <= stop; i++) {
            numbers.append(i);
        }
        System.out.println(numbers);

        numbers = new StringBuilder("");
        int startcycle = start;
        while (startcycle <= stop) {
            numbers.append(startcycle);
            startcycle+=1;
        }
        System.out.println(numbers);

        numbers = new StringBuilder("");
        startcycle = start;
        do {
            numbers.append(startcycle);
            startcycle+=1;
        } while (startcycle <= stop);
        System.out.println(numbers);

    }

    public static void task5(int number) {
        int flag = 0;
        int num = 0;
        int sum = 0;
        while (flag != number) {
            num+=1;
            if ((num % 3 == 1) & (num % 5 == 2)) {
                flag+=1;
                sum+=num;
            }
        }
        System.out.println(sum);

        int[] sumarr = new int[number];
        sumarr[0] = 7;
        for (int i=1; i<number; i++){
            sumarr[i]+= sumarr[i-1] + 15;
        }
        System.out.println(Arrays.stream(sumarr).sum());
        System.out.println(Arrays.toString(sumarr));
    }

    public static void task6(int number) {

        if (number <= 0) {
            System.out.println("Введено некорректное значение!");
            return;
        }

        int[] arr = new int[number];
        arr[0] = 2;
        for (int i=1; i<number; i++){
            arr[i]+= arr[i-1] + 5;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void task7(int number) {
        int startascii = 97;
        char[] alphabet = new char[number];
        for (int i = 0; i < number; i++) {
            alphabet[i] = (char) startascii;
            startascii += i+2;
        }
        System.out.println(Arrays.toString(alphabet));
    }

    public static void task8() {
        // int[] less = new int[] {65, 69, 73, 79, 85};
        char[] arr = new char[10];
        int num = 0, iter = 65;
        while (num < 10) {
            if ((iter == 65) | (iter == 69) | (iter == 73) | (iter == 79) | (iter == 85))  {
                iter+=1;
                continue;
            }
            arr[num] = (char) iter;
            num+=1;
            iter+=1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void task9() {
//        Напишите программу, в которой создается массив п заполняется
//        случайными числами. Массив отображается в консольном окне. В этом
//        массиве необходимо определить элемент с минимальным значением. В
//        частности, программа должна вывести значение элемента с минимальным
//        значением и индекс этого элемента. Если элементов с минимальным
//        значением несколько, должны быть выведены индексы всех этих элементов.
        System.out.println("\nЗадача 9");
        Random rand = new Random();

        int n = rand.nextInt(100);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(n);
        }
        Arrays.sort(arr);
        System.out.println("Отсортированный массив по возрастанию:");
        System.out.println(Arrays.toString(arr));

        System.out.println("Минимальное значение:" + Integer.toString(arr[0]));
        String indexes = "";
        for (int i = 0; i < n; i++){
            if (arr[0] != arr[i]) {
                break;
            }
            indexes = indexes + " " + Integer.toString(i);
        }
        System.out.println("Значение имеет следующие индексы:" + indexes);
    }

    public static void task10() {
        System.out.println("\nЗадача 10");
        Random rand = new Random();

        int n = rand.nextInt(100);
        Integer[] array = new Integer[n];
        for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt(n);
        }
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("Отсортированный массив по убыванию:");
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
//        task1(0);
//        task2("Понедельник");
//        task3(20);
//        task4();
//        task5(20);
//        task6(20);
//        task7(4);
//        task8();
        task9();
        task10();
    }

}
