package com.sort;

/**
 * Created with Intellij IDEA
 * Description:
 * User: 23871
 * Date: 2021-05-12
 * Time: 18:29
 */

//时间复杂度o（n） o（n^2）    空间复杂度o(1)   稳定性  稳定
public class insertSort {
    public static void main(String[] args) {
        int a[]={10,2,4,6,5};
        for( int i=1;i<a.length;i++){
            int tmp=a[i];
            int j = i-1;
            for (; j>=0 ; j--) {
                if(a[j]>tmp){
                    a[j+1]=a[j];
                }else {
                    break;
                }
            }
            a[j+1]=tmp;
        }
    }
}
