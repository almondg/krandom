package org.kedos.random;

import java.security.SecureRandom;
import java.util.Random;

/**
 * Created by shaked on 08/11/2015.
 *
 * Defines a static utils class to randomly generate
 * common java types and data structures.
 *
 * USAGE:
 * <code>
 *  KRandom.nextIntArray(size)
 * </code>
 * Will generate an array of size 'size' filled with random int numbers.
 *
 * <code>
 *  KRandom.setUseSecure()
 * </code>
 * Will set this @KRandom to use @SecureRandom.
 *
 * <code>
 *  KRandom.setUseNotSecure()
 * </code>
 * Will set this @KRandom to use @Random.
 *
 */
public class KRandom {

    // Java default random instance.
    private static Random r = new Random();
    // Define if should use @Random or @SecureRandom.
    private static boolean USE_SECURE = false;

    /**
     * Sets this @KRandom to use secure random.
     * Initialize a new @SecureRandom instance.
     */
    public static void setUseSecure() {
        USE_SECURE = true;
        r = new SecureRandom();
    }

    /**
     * Sets this @KRandom to use default random.
     * Initialize a new @Random instance.
     */
    public static void setUseNotSecure() {
        USE_SECURE = false;
        r = new Random();
    }

    public static int nextInt() {
        return r.nextInt();
    }

    public static int nextInt(int start, int end) {
        if (end < start) {
            throw new IllegalArgumentException("right bound must be bigger then left bound.");
        }

        return (nextInt() % (end - start)) + start;
    }

    public static int nextEvenInt() {
        int rValue = nextInt();
        if (rValue % 2 != 0) {
            return rValue + 1;
        }

        return rValue;
    }

    public static int nextOddInt() {
        return nextEvenInt() + 1;
    }

    public static int nextEvenInt(int start, int end) {
        if (end < start) {
            throw new IllegalArgumentException("right bound must be bigger then left bound.");
        }
        if (end == start && start % 2 != 0) {
            throw new IllegalArgumentException("can't find even number in those bounds.");
        }

        int rValue = nextInt(start, end);
        if (rValue % 2 != 0) {
            if (rValue < end) {
                return rValue + 1;
            } else if (rValue > start) {
                return rValue - 1;
            }
        }

        return rValue;
    }

    public static int nextOddInt(int start, int end) {
        if (end < start) {
            throw new IllegalArgumentException("right bound must be bigger then left bound.");
        }
        if (end == start && start % 2 != 0) {
            throw new IllegalArgumentException("can't find even number in those bounds.");
        }

        int rValue = nextInt(start, end);
        if (rValue % 2 == 0) {
            if (rValue < end) {
                return rValue + 1;
            } else if (rValue > start) {
                return rValue - 1;
            }
        }

        return rValue;
    }

    public static int[] nextIntArray(int size) {
        int[] randomArray = new int[size];

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = r.nextInt();
        }

        return randomArray;
    }

    public static long[] nextLongArray(int size) {
        long[] randomArray = new long[size];

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = r.nextLong();
        }

        return randomArray;
    }

    public static float[] nextFloatArray(int size) {
        float[] randomArray = new float[size];

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = r.nextFloat();
        }

        return randomArray;
    }

    public static double[] nextDoubleArray(int size) {
        double[] randomArray = new double[size];

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = r.nextDouble();
        }

        return randomArray;
    }

    public static boolean[] nextBooleanArray(int size) {
        boolean[] randomArray = new boolean[size];

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = r.nextBoolean();
        }

        return randomArray;
    }

}
