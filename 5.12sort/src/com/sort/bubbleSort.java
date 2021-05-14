package com.sort;

import java.util.Arrays;

/**
 * Created with Intellij IDEA
 * Description:
 * User: 23871
 * Date: 2021-05-13
 * Time: 18:08
 */

/**时间复杂度：O(n^2)
  * 空间复杂度：O(1)
  * 稳定性：稳定
 */
public class bubbleSort {
    public static void main(String[] args) {
        int  array[]={1,45,63,99,0,3,2,33,25};
        for (int i = 0; i < array.length-1; i++) {
            boolean flg = false;
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    flg = true;
                }
            }
            if(flg == false) {
                break;
            }
        }
        System.out.println(Arrays.toString(array));

    }
}
