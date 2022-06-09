package com;

public class Arrays {
    public static void main(String[] args) {
        int[] array1=new int[5];
        array1[0]=100;
        array1[1]=120;
        array1[2]=110;
        array1[3]=99;
        array1[4]=33;
        System.out.println("length :" +array1.length);
        for( int i=0;i< array1.length;i++){
            System.out.println(array1[i]);
        }
    }
}
