package Labs;

public class lab_2 {

    public static boolean checknum1(int number) {
        return number % 3 == 0;
    }

    public static boolean checknum2(int number) {
        return (number % 5 == 2) & (number % 7 == 1);
    }

    public static boolean checknum3(int number) {
        return (number % 4 == 0) & (number >= 10);
    }

    public static boolean checknum4(int number) {
        return (number >= 5) & (number <= 10);
    }


//    public static String checknum5(int number) {
//        return Integer.toString(number).split("")[3];
//    }

    public static int checknum5esy(int number) {
        return number / 1000 % 10;
    }

    public static int checknum10(int number) {
        return (number / 8) % 8;
    }

    public static void main(String[] args) {
        System.out.println(checknum1(3));
        System.out.println(checknum2(5555));
        System.out.println(checknum3(5555));
        System.out.println(checknum4(5555));
//        System.out.println(checknum5(5555));
        System.out.println(checknum5esy(91912245));
        System.out.println(checknum10(5125166));
    }

}


