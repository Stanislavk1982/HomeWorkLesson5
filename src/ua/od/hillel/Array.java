package ua.od.hillel;

/**
 * Created by Стивен on 05.04.2016.
 */
public class Array {
    public static void main(String[] args) {
        int[] array = {21, 1, 12, 25, 95, 22, 45, 8, 3, 111};
        int tempNumber = 0, counter = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    tempNumber = array[j];
                    array[j] = array[i];
                    array[i] = tempNumber;
                    counter++;
                }
            }


        }
        Utils.printArray(array);
        System.out.println(counter);
    }

}
