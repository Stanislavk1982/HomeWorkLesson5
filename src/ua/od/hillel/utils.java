package ua.od.hillel;

/**
 * Created by Стивен on 05.04.2016.
 */
class Utils {
    public static void printArray(int[] array) {
        System.out.println("The resulted array");
        for (int i = 0; i < array.length; i++) {
            if (i != 0)
                System.out.print(", ");
            System.out.print(array[i]);
        }
        System.out.println();
    }
}
