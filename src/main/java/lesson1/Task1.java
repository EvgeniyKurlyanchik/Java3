package lesson1;

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {
        String[] array = {"a", "b", "c", "d", "e"};
        try {
            elementsReplace(array, 1, 3);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Введенные значения выходят за пределы массива");
        }


    }

    private static <T> void elementsReplace(T[] array, int elementFirst, int elementSecond) {
        T temporary = array[elementSecond];
        array[elementSecond] = array[elementFirst];
        array[elementFirst] = temporary;
        System.out.println(Arrays.toString(array));
    }

}