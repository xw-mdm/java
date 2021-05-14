package com.sort;

import javax.swing.text.Highlighter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

/**
 * Created with Intellij IDEA
 * Description:
 * User: 23871
 * Date: 2021-05-12
 * Time: 21:13
 */

//挖坑法   时间复杂度  最好n*logN   最坏（有序）   N^2   空间复杂度 最好o（logN）     最坏O（N）     稳定性不稳定
public class quickSort {
    public static void main(String[] args) {
        int a[] = {1, 3, 9, 8, 65, 56, 3};
        /*quickSore(a);*/
        fdg(a);
        System.out.println(Arrays.toString(a));

    }

    public static void insertSort2(int[] a, int start, int end) {
        for (int i = start; i <= end; i++) {
            int tmp = a[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (a[j] > tmp) {
                    a[j + 1] = a[j];
                } else {
                    break;
                }
            }
            a[j + 1] = tmp;
        }

    }

    public static void quickSore(int[] a) {
        quickSore1(a, 0, a.length - 1);
    }

    public static void quickSore1(int[] a, int low, int high) {
        if (low >= high) {
            return;
        }
        if (high - low + 1 < 100) {
            insertSort2(a, low, high);
            return;
        }
        //改进 三数字取中
        medianofTree(a, low, high);
        int par = partion(a, low, high);
        quickSore1(a, low, par - 1);
        quickSore1(a, par + 1, high);
    }

    public static void medianofTree(int[] a, int low, int high) {
        int mid = (low + high) / 2;
        if (a[mid] > a[low]) {
            int tmp = a[mid];
            a[mid] = a[low];
            a[low] = tmp;
        }
        if (a[high] < a[low]) {
            int tmp = a[high];
            a[high] = a[low];
            a[low] = tmp;
        }
        if (a[mid] > a[low]) {
            int tmp = a[mid];
            a[mid] = a[low];
            a[low] = tmp;
        }
    }

    public static int partion(int[] array, int start, int end) {
        int tmp = array[start];
        while (start < end) {
            while (start < end && array[end] >= tmp) {
                end--;
            }
            if (start >= end) {
                array[start] = tmp;
                break;
            } else {
                array[start] = array[end];
            }
            while (start < end && array[start] <= tmp) {
                start++;
            }
            if (start >= end) {
                array[start] = tmp;
                break;
            } else {
                array[end] = array[start];
            }
        }
        return start;
    }


    //模拟栈进行递归
    public static void fdg(int []array) {

        Stack<Integer> stack = new Stack<>();
        int low=0;
        int high=array.length-1;
        int par = partion(array, low, high);
        if(par>low+1){//左边有两个元素
            //入栈
            stack.push(low);
            stack.push(par-1);

        }
        if(par<high-1){
            stack.push(par+1);
            stack.push(high);
        }
        while(!stack.isEmpty()){
            high=stack.pop();
            low=stack.pop();
            par=partion(array, low, high);
            if(par>low+1){//左边有两个元素
                //入栈
                stack.push(low);
                stack.push(par-1);

            }
            if(par<high-1){
                stack.push(par+1);
                stack.push(high);
            }
        }
    }
}


