package org.kedos.print;

import java.util.Arrays;

/**
 * Created by shaked on 09/11/2015.
 */
public class PrintUtils {

    /**
     * Prints the given 2D array.
     *
     * @param array 2D array to pretty print.
     */
    public static void print2DArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }

    /**
     * Prints the given 2D array.
     *
     * @param array 2D array to pretty print.
     */
    public static void print2DArray(long[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }

    /**
     * Prints the given 2D array.
     *
     * @param array 2D array to pretty print.
     */
    public static void print2DArray(float[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }

    /**
     * Prints the given 2D array.
     *
     * @param array 2D array to pretty print.
     */
    public static void print2DArray(double[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }

    /**
     * Prints the given 2D array.
     *
     * @param array 2D array to pretty print.
     */
    public static void print2DArray(boolean[][] array) {
        print2DArray(array, false);
    }

    /**
     * Prints the given 2D array.
     *
     * @param array 2D array to pretty print.
     * @param useOnesAndZeroes if true, will use 1\0 instead of @true\@false.
     */
    public static void print2DArray(boolean[][] array, boolean useOnesAndZeroes) {
        if (useOnesAndZeroes) {
            for (int i = 0; i < array.length; i++) {
                System.out.print("[");
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] ? "1" : "0");
                    if (j != array[i].length - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println("]");
            }
        } else {
            for (int i = 0; i < array.length; i++) {
                System.out.println(Arrays.toString(array[i]));
            }
        }
    }

}
