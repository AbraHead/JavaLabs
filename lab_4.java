package Labs;

import org.apache.groovy.json.internal.ArrayUtils;

import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.*;
import java.util.Scanner;


public class lab_4 {

    public static void task1(){
        int figure = 11; // число строк которое необходимо вывести
        int i ; // переменная задает число, необходимое для расчета количества строк
        int j ; // переменная задает число, необходимое для расчета количества колонок (символов в строке)
        int z;  // переменная необходима для вывода служебного сообщения о количестве символов в строке;
        for (i = 1 ; i <= figure; i++){
            System.out.print("номер строки: " + i + " ");
            z = 0;
            for (j = -12; j < figure; j++){
                System.out.print("+");
                z = z + 1;
            }
//            System.out.println();
            System.out.println(" Количество символов в строке " + z);
        }


    }

    public static void task2(){
        int figure = 11; // число строк которое необходимо вывести
        int i ; // переменная задает число, необходимое для расчета количества строк
        int j ; // переменная задает число, необходимое для расчета количества колонок (символов в строке)
        for (i = 1 ; i <= figure; i++){
            for (j = 0; j <= i; j++){
                System.out.print("+");
            }
            System.out.println();
        }
    }

    public static void task3(){
        int figure = 5; // число строк которое необходимо вывести
        int i ; // переменная задает число, необходимое для расчета количества строк
        int j ; // переменная задает число, необходимое для расчета количества колонок (символов в строке)
        int[][] arr = new int[figure][figure];
        for (i = 0 ; i < figure; i++){
            for (j = 0; j < figure; j++){
                arr[i][j] = 2;
            }
        }
//        System.out.println(Arrays.deepToString(arr));
        for (i = 0 ; i < figure; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    public static void task4(){
        int figure = 5; // число строк которое необходимо вывести
        int i ; // переменная задает число, необходимое для расчета количества строк
        int j ; // переменная задает число, необходимое для расчета количества колонок (символов в строке)
        int[][] arr = new int[figure][];
        for (i = 0 ; i < figure; i++){
            arr[i] = new int[i+1];
            for (j = 0; j <= i; j++){
                arr[i][j] = 2;
            }
            System.out.println(Arrays.toString(arr[i]));
        }
    }


    public static void task5(){
        //    Напишите программу, в которой создается двумерный
        //    целочисленный массив. Он заполняется случайными числами. Затем в этом
        //    массиве строки и столбцы меняются местами: первая строка становится первым
        //    столбцом, вторая строка становиться вторым столбцом и так далее. Например,
        //    если исходный массив состоял из 3 строк и 5 столбцов, то в итоге получаем
        //    массив из 5 строк и 3 столбцов.
        Random rand = new Random();
        int nrow = 5; // число строк которое необходимо вывести
        int ncolumn = 6;
        int row ; // переменная задает число, необходимое для расчета количества строк
        int column ; // переменная задает число, необходимое для расчета количества колонок (символов в строке)
        int[][] arr = new int[ncolumn][nrow];
        for (column = 0 ; column < ncolumn; column++) {
//            arr[row] = new int[row+1];
            for (row = 0; row < nrow; row++) {
                arr[column][row] = rand.nextInt(nrow * 2);
            }
            System.out.println(Arrays.toString(arr[column]));
        }
        System.out.println("===================================");

        int[][] newarr = new int[nrow][ncolumn];
        for (row = 0; row < nrow; row++) {
//            arr[row] = new int[row+1];
            for (column = 0; column < ncolumn; column++) {
                newarr[row][column] = arr[column][row];
            }
            System.out.println(Arrays.toString(newarr[row]));
        }

    }
    public static void task6(){
        Random rand = new Random();
        int nrow = 5; // число строк которое необходимо вывести
        int ncolumn = 5;
        int row ; // переменная задает число, необходимое для расчета количества строк
        int column ; // переменная задает число, необходимое для расчета количества колонок (символов в строке)
        int[][] arr = new int[ncolumn][nrow];
        for (column = 0 ; column < ncolumn; column++) {
            for (row = 0; row < nrow; row++) {
                arr[column][row] = rand.nextInt(nrow * 2);
            }
            System.out.println(Arrays.toString(arr[column]));
        }
        System.out.println("===================================");
        int delclm = rand.nextInt(ncolumn);
        int delrow = rand.nextInt(nrow);
        System.out.println("delclm = " + delclm + " delrow = " + delrow);

        ncolumn--; nrow--; //Уменьшаем кол-во строк и столбцов в новом массиве
        int[][] newarr = new int[ncolumn][nrow];
        int clm = 0;
        for (column = 0; column < ncolumn; column++) {
            // Если столбец равен удалённому столбцу, тогда в будущем будем брать столбец массива на 1 больше
            if (column == delclm) {
                clm++;
            }
            for (row = 0; row < nrow ; row++) {
                // Если значени строки больще или равно удалённой, то берём из старого массива на 1 индекс дальше
                if (row >= delrow) {
                    newarr[column][row] = arr[column + clm][row + 1];
                    continue;
                }
                newarr[column][row] = arr[column + clm][row];
            }
            System.out.println(Arrays.toString(newarr[column]));
        }
        System.out.println("===================================");

    }
    public static void task7(){
//        Напишите программу, в которой создается двумерный числовой массив
//        и этот массив заполняется «змейкой»: сначала первая строка (слева направо),
//        затем последний столбец (снизу вверх), вторая строка (слева направо) и так далее
        Random rand = new Random();
        int nrow = 5; // длмнна строки
        int ncolumn = 5; // кол-во строк
        int row; // переменная задает число, необходимое для расчета количества строк
        int column ; // переменная задает число, необходимое для расчета количества колонок (символов в строке)
        int numbersnake = 0;
        int[][] arr = new int[ncolumn][nrow];
        for (column = 0 ; column < ncolumn; column++) {
            for (row = 0; row < nrow; row++) {
                numbersnake++;
                if (column % 2 != 0) {
                    arr[column][nrow - 1 - row] = numbersnake;
                    continue;
                }
                arr[column][row] = numbersnake;
            }

            System.out.println(Arrays.toString(arr[column]));
        }
    }
    public static void task8(){
//        Напишите программу «Шифр Цезаря», которая зашифровывает
//        введенный текст. Используете кодовую таблицу символов. При запуске
//        программы в консоль необходимо вывести сообщение: «Введите текст для
//        шифрования», после ввода текста, появляется сообщение: «Введите ключ».
//        После того как введены все данные, необходимо вывести преобразованную
//        строку с сообщением «Текст после преобразования : ». Далее необходимо
//        задать вопрос пользователю: «Выполнить обратное преобразование? (y/n)»,
//        если пользователь вводит «y», тогда выполнить обратное преобразование.
//        Если пользователь вводит «n», того программа выводит сообщение «До
//        свидания!». Если пользователь вводит что-то другое, отличное от «y» или «n»,
//        то программа ему выводит сообщение: «Введите корректный ответ».

        Scanner in = new Scanner(System.in);

        System.out.println("Введите текст для шифрования: ");
        String text = in.nextLine();
        System.out.println("Введите ключ: ");
        int key = in.nextInt();
        char[] textChar = text.toCharArray();
        for (int i = 0; i < textChar.length; i++){
            textChar[i]+=key;
        }
        String enctext = new String (textChar);
        System.out.println(enctext);
        System.out.println("Выполнить обратное преобразование? (y/n)");
        while (true) {
            String reverse = in.next();
            switch (reverse) {
                case "y" -> System.out.println(text);
                case "n" -> System.out.println("До свидания");
                default -> {
                    System.out.println("Введите корректный ответ");
                    continue;
                }
            }
            break;
        }
    }

    public static void task9(){
//        9* (дополнительная задача). Напишите программу «Шифр Цезаря», в которой
//        необходимо реализовать собственный алфавит, остальные условия идентичны
//        задаче 8.
        String alf = "abcdifghklmnopqrstxyz";
        Scanner in = new Scanner(System.in);

        System.out.println("Введите текст для шифрования (abcdifghklmnopqrstxyz): ");
        String text = in.nextLine();
        System.out.println("Введите ключ: ");
        int key = in.nextInt();
        String textEncrypt = "";
        for (int i = 0; i < text.length(); i++){
            textEncrypt = textEncrypt + alf.charAt((alf.indexOf(text.charAt(i)) + key) % alf.length());
        }
        String enctext = new String (textEncrypt);
        System.out.println(enctext);
        System.out.println("Выполнить обратное преобразование? (y/n)");
        while (true) {
            String reverse = in.next();
            switch (reverse) {
                case "y" -> System.out.println(text);
                case "n" -> System.out.println("До свидания");
                default -> {
                    System.out.println("Введите корректный ответ");
                    continue;
                }
            }
            break;
        }
    }

    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
//        task6();
//        task7();
//        task8();
//        task9();
    }


}