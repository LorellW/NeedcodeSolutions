package utils;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Utils {
    public static void printArray(int[] arr) {
        Arrays.stream(arr).forEach(value -> {
            System.out.print(value + ", ");
        });
    }
}
