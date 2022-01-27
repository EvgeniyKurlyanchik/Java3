package lesson1;

import java.util.ArrayList;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {
        String[] array = {"a", "b", "c", "d", "e"};
        transformToArrayLsit(array);


    }

    private static <T> void transformToArrayLsit(T[] array){
        List transformedArray = new ArrayList();
        for (T element:array) {
            transformedArray.add(element);
            System.out.println(element);
        }
    }
}

