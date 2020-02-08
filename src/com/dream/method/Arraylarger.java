package com.dream.method;

/**
 * Created by lan_jia_nao on 2020/2/7.
 */
public class Arraylarger {

    public void getNext(int a,int b) {
        int size = 0;
        int[] array = new int[a];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            size++;
        }
        int[] newarray = new int[b];
        for (int i = 0; i < size; i++) {
            newarray[i] = array[i];
        }
        array = newarray;
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
        System.out.println(array.length);
    }
}

