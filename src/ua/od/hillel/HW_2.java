package ua.od.hillel;

public class HW_2 {
    public static void main(String[] args) {
        int[] array1 = {-11, 5, 97};
        int[] array2 = {2, 3, 8, 17, 23, 57, 76, 112};
        int length = array1.length + array2.length;
        int[] array3 = new int[length];
        int[] tempArray = new int[3];
        int counter = 0;
        for (int i = 0; i < length; i++) {
            tempArray[0] = 999;
            for (int j1 = 0; j1 < array1.length; j1++) {
                if (array1[j1] < tempArray[0] && array1[j1] != -999) {
                    tempArray[0] = array1[j1];
                    tempArray[1] = j1;
                    tempArray[2] = 0;
                    counter++;
                }
            }
            for (int j2 = 0; j2 < array2.length; j2++) {
                if (array2[j2] < tempArray[0] && array2[j2] != -999) {
                    tempArray[0] = array2[j2];
                    tempArray[1] = j2;
                    tempArray[2] = 1;
                    counter++;
                }
            }
            array3[i] = tempArray[0];
            if (tempArray[2] == 0) {
                array1[tempArray[1]] = -999;
            }
            if (tempArray[2] == 1) {
                array2[tempArray[1]] = -999;
            }
        }

        System.out.println("Counter is: " + counter);
        Utils.printArray(array1);
        Utils.printArray(array2);
        Utils.printArray(array3);
    }
}


