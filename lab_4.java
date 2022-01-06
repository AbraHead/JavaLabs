package Labs;

import java.util.Arrays;
import java.util.*;

//package com.company;
//
//public class encrypt {
//    public static String getEncryptString(String encryptString, int shift) {
//        char[] ArrayChar = encryptString.toCharArray(); // преобразуем переданную в метод строку в символьный массив
//        long[] ArrayInt = new long[ArrayChar.length]; // создаем массив с типом данных long, размер массива равен размеру символьного массива
//        char[] ArrayCharNew = new char[ArrayChar.length]; // создаем символьный массив в который будем записывать преобразованные символы
//        //в цикле перебираем все символы из которых состоит переданная нами строка и прибавляем к ним число, ключ (сдвиг)
//        for (int i = 0; i< ArrayChar.length; i++)
//        {
//            ArrayInt[i] = ArrayChar[i] + shift; // прибавляем к символу с индексом i сдвиг
//            ArrayCharNew[i] = (char)ArrayInt[i]; // преобразовываем число в символ char и записываем на нужное место в новый массив
//        }
//        encryptString = new String (ArrayCharNew); // преобразовываем новый массив символов в строку
//        return encryptString; // возвращаем строку в метод из которого был вызван текущий метод
//    }
//}
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
        int nrow = 5; // число строк которое необходимо вывести
        int ncolumn = 5;
        int row ; // переменная задает число, необходимое для расчета количества строк
        int column ; // переменная задает число, необходимое для расчета количества колонок (символов в строке)
        int numbersnake = 0;
        int[][] arr = new int[ncolumn][nrow];
        for (column = 0 ; column < ncolumn; column++) {
            for (row = 0; row < nrow; row++) {
                numbersnake++;
//                arr[column][row] = rand.nextInt(nrow * 2);
                arr[column][row] = numbersnake;
            }
            System.out.println(Arrays.toString(arr[column]));
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

    }

}
