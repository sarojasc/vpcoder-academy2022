package com;

public class Bobblesort {
    public static void sortdown(int[] a) {

        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

    }

    public static void main(String[] args) {

        int[] a = {39, 45, 7, 8, 50, 4};
        sortdown(a);
        for (int x : a) {
            System.out.println(x);
        }

    }
}