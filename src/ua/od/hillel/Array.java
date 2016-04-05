package ua.od.hillel;

public class Array {
    public static void main(String[] args) {
        int[] array = {2, 6, 3, 12, 7, 4, 1, 5, 87, 9};
        int i, j, temp, tempIndex, counter = 0, min;
        for (i = 0; i < array.length - 1; i++) {
            min = array[i];
            tempIndex = -1;
            for (j = i + 1; j < array.length; j++) {
                if (min > array[j]) {
                    min = array[j];
                    tempIndex = j;
                    counter++;
                }
            }
            if (tempIndex != -1) {
                temp = array[i];
                array[i] = array[tempIndex];
                array[tempIndex] = temp;
            }

        }
        Utils.printArray(array);
        System.out.println(counter);
    }

}
