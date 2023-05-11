package com.backendhub.firstproject.collectin;

import java.util.HashSet;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int[] a1 = {4, 6, 8, 10};

        int[] a2 = {1, 2, 4, 7, 9, 11};
        int[] a3 = new int[a1.length + a2.length];
        int[] a4 = mergeArray(a1, a2, a1.length, a2.length, a3);
        for (int i = 0; i < a4.length; i++) {
            System.out.println(" " + a4[i]);
        }
        Set<Integer> set1 = new HashSet<>();
    }

    public static int[] mergeArray(int[] a1, int[] a2, int length1, int length2, int[] a3) {
        int i = 0, j = 0, k = 0;
        while (i < length1 && j < length2) {
            if (a1[i] < a2[j]) {
                if (!isPresent(a1[i], a3)) {
                    a3[k++] = a1[i++];
                }
            } else {
                if (!isPresent(a1[j], a3)) {
                    a3[k++] = a2[j++];
                }
            }
        }

        while (i < length1) {
            a3[k++] = a1[i++];
        }

        while (j < length2) {
            a3[k++] = a2[j++];
        }
        return a3;
    }

    public static boolean isPresent(int value, int[] a3) {
        for (int i = 0; i < a3.length; i++) {
            if (a3[i] == value) {
                return true;
            }
        }
        return false;
    }
}
