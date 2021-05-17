package com.sort;

import java.util.Arrays;

/**
 * Created with Intellij IDEA
 * Description:
 * User: 23871
 * Date: 2021-05-15
 * Time: 9:04
 */
public class mergrsortRec {
    public static void main(String[] args) {
        int[]a={15,2,35,6,23,11,5};
        megrsort(a);
        System.out.println(Arrays.toString(a));
    }
    public  static  void megr(int[]a,int gap){
        int []tmparr=new int[a.length];
        int k=0;
        int s1=0;
        int e1=s1+gap-1;
        int s2=e1+1;
        int e2=s2+gap-1>=a.length-1? a.length-1:s2+gap-1;
        while(s2<a.length){
            while (s2<=e2&&s1<=e1){
                if(a[s1]<a[s2]){
                    tmparr[k++]=a[s1++];
                }else{
                    tmparr[k++]=a[s2++];
                }
            }
            while (s2<=e2){
                tmparr[k++]=a[s2++];
            }
            while (s1<=e1){
                tmparr[k++]=a[s1++];
            }
            s1=e2+1;
            e1=s1+gap-1;
            s2=e1+1;
            e2=s2+gap-1>=a.length-1? a.length-1:s2+gap-1;
        }
        while(s1<=a.length-1){
            tmparr[k++]=a[s1++];
        }
        for (int i = 0; i <tmparr.length ; i++) {
            a[i]=tmparr[i];
        }
    }
    public static void megrsort(int[]a){
        for (int gap = 1; gap <a.length ; gap*=2) {
            megr(a,gap);
        }
    }

}
