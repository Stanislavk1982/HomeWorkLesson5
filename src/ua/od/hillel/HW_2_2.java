package ua.od.hillel;

/**
 * Created by Стивен on 05.04.2016.
 */
public class HW_2_2 {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 6, 7, 10, 11};
        int[] array2 = {2, 4, 8, 9, 12, 14,20};
        int x = 0, y = 0, length = array1.length + array2.length;
        int[] array3 = new int[length];
        for (int i = 0; i < length; i++) {
            if (x > array1.length - 1) {
                for (int j = i; j < length; j++) {
                    array3[j] = array2[y];
                    y++;
                }
                break;
            }
            if (y > array2.length - 1) {
                for (int j2 = i; j2 < length; j2++) {
                    array3[j2] = array1[x];
                    x++;
                }
                break;
            }
            if (array1[x] < array2[y]) {
                array3[i] = array1[x];
                x++;
            } else {
                array3[i] = array2[y];
                y++;
            }
        }
        Utils.printArray(array3);
        System.out.println(y);
    }
}
