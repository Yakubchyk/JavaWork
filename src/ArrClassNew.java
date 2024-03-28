import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrClassNew {
    public static void main(String[] args) {

      /*  String[] strArr = new String[10]; // одномерный массив
        strArr[4] = "Hei";
        System.out.println(strArr[4]);
*/

        String[] days = {"M", "D", "M"};
        System.out.println(days[2]);

        for (int i = 0; i < days.length; i++) {

            System.out.println(i);
        }

        double[] arr1 = new double[4];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = Math.random();
            System.out.println(arr1[i]);

        }
    }
}

class ArrFruitClass {
    public static void main(String[] args) {
        String[] fruits = new String[]{"Apfel", "Orange", "Pinapple", "Banan"};
        System.out.println(fruits[1] + ", " + fruits[3]);
        System.out.println(fruits.length);
        fruits[2] = "Kivi";
        System.out.println(fruits[2]);

    }
}

class ArrForClass {
    public static void main(String[] args) {

        String[] arrStr = {"Einz", "Zwo", "Drei", "Vier"};
        System.out.println(arrStr.length);

        for (String line : arrStr) { // for_Each
            System.out.print(line + " ");
        }
    }
}

class ArrForZweiClass {
    public static void main(String[] args) {

        String[] arrStr = {"Einz", "Zwo", "Drei", "Vier"};
        System.out.println(arrStr.length);
        for (int i = 0; i < args.length; i++) {

        }
    }
}

class ArrArraysClass {
    public static void main(String[] args) {


        String[] arrStr = {"Einz", "Zwo", "Drei", "Vier"};
        String[] arrStr2 = {"Einz", "Zwo", "Drei", "Vier"};
        String[] newArray = Arrays.copyOf(arrStr2, 50);
        System.out.println(Arrays.compare(arrStr, arrStr2));
        System.out.println(Arrays.equals(arrStr, arrStr2)); //сравнение массива
        Arrays.fill(newArray, "Hei");


    }
}

// бинарная сортировка массива.
class ArrCompClass {
    public static void main(String[] args) {
        int[] ArrSort = {10, 4, 3, 7, 5, 8};
        Arrays.sort(ArrSort);

        int index = Arrays.binarySearch(ArrSort, 7);
        System.out.println(index);
    }
}

class ArrMegaClass {
    public static void main(String[] args) {
        int[] arr = {0, 1, 3, 2, 4, 5, 8, 9, 6}; // N = 9;

        int realSum = 0;
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        for (int i = 0; i <= arr.length; i++) {
            realSum += i;
        }
        int f = realSum - sum;
        System.out.println(f);
    }
}

