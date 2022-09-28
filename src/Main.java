import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        task1();
        System.out.println("Задача 2");
        task2();
        System.out.println("Задача 3");
        task3();
        System.out.println("Задача 4");
        task4();
        System.out.println("Задача 5");
        task5();
    }

    //Задача 1
    public static void task1() {
        getYear(1965);
    }

    public static void getYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - невисокосный год");
        }
    }

    public static void task2() {
        versionApp(2015, 0);
    }

    public static void versionApp(int productYear, int os) {
        if (os != 0 && os != 1) {
            throw new IllegalArgumentException("Wrong OS type");
        }
        int currentYear = LocalDate.now().getYear();
        if (productYear > currentYear) {
            throw new IllegalArgumentException("Wrong manufacturing year");
        }
        String osString = os == 1 ? "Android" : "iOS";
        String versionString = productYear >= 2015 ? "" : "облегченную";
        System.out.printf("Установите %s версию для %s по ссылке%n", versionString, osString);
    }

    public static void task3() {
        int distance = 95;
        System.out.println("Потребуется дней: " + daysForDelivery(distance));
    }

    public static int daysForDelivery(int distance) {
        int days = 0;
        if (distance >= 0 && distance <= 20) {
            days = 1;
        } else if (distance <= 60) {
            days = 2;
        } else if (distance <= 100) {
            days = 3;
        }
        return days;
    }

    //Задачи со звездочкой
    public static void reversedArray(int[] array) {
        int templateI = 0;
        for (int i = 0; i < array.length / 2; i++) {
            templateI = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = templateI;
        }
    }

    public static void task4() {
        int[] array = {6, 0, 4, 3, 1, 7};
        System.out.println(Arrays.toString(array));
        reversedArray(array);
        System.out.println(Arrays.toString(array));
    }

    public static void doublesFinder(String s) {
        char[] chars = s.toCharArray();
        char d = 'a';
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == chars[i + 1]) {
                d = chars[i];
                break;
            }
        }
        System.out.println(d=='a'? "Дублей не найдено" + d : "Найден повторяющийся символ: " + d);
    }

    public static void task5() {
        String s = "abbcde";
        doublesFinder(s);
    }
}


