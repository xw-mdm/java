package com.sort;
import java.util.Arrays;

/**
 * Created with Intellij IDEA
 * Description:
 * User: 23871
 * Date: 2021-05-13
 * Time: 20:33
 */
/*
基数排序     比较排序
* 内部排序：数据在内存中排序
* 外部排序：数据在磁盘中排序
* 海量文件进行排序
* 将数据分成N组  进行排序   然后进行归并
* */
//时间复杂  nlogN   空间复杂度 N   稳定
public class mergrsort {
    public static void main(String[] args) {
        int array[]={1,2,6,56,32,55,66};
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void mergeSort(int[] array) {
        mergeSortRec(array,0,array.length-1);
    }
    public static void merge(int[] array,int low,int mid,int high) {
        int[] tmpArr = new int[high-low+1];
        int k = 0;// 数组下标
        int s1 = low;
        int e1 = mid;
        int s2 = mid+1;
        int e2 = high;
        while (s1 <= e1 && s2 <= e2) {
            if(array[s1] <= array[s2]) {
                tmpArr[k++] = array[s1++];
            }else {
                tmpArr[k++] = array[s2++];
            }
        }
        while (s1 <= e1) {
            tmpArr[k++] = array[s1++];
        }
        while (s2 <= e2) {
            tmpArr[k++] = array[s2++];
        }
        for (int i = 0; i < tmpArr.length; i++) {
            array[i+low] = tmpArr[i];
        }
    }
    public static void mergeSortRec(int[] array,int low,int high) {
        if(low >= high) {
            return;
        }
        int mid = (high+low) / 2;
        mergeSortRec(array,low,mid);
        mergeSortRec(array,mid+1,high);
        merge(array,low,mid,high);
    }
}
