package com.sort;

/**
 * Created with Intellij IDEA
 * Description:
 * User: 23871
 * Date: 2021-05-12
 * Time: 20:01
 */
//时间复杂度 o（n^2）   空间复杂度o（1）     不稳定
public class selectSort {
    public static void main(String[] args) {
        int []a={1,5,9,6,8,3,4};
        for (int i = 0; i <a.length-1 ; i++) {
            for (int j = i+1; j <a.length ; j++) {
                if (a[i] > a[j]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
    }
}
