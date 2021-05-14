package com.sort;

import java.util.Random;

/**
 * Created with Intellij IDEA
 * Description:
 * User: 23871
 * Date: 2021-05-12
 * Time: 19:05
 */
//缩小增量法   分组的思想
    //时间复杂度   o（n^1.3）-o(n^1.5)   最坏O(n^2);  序列为素数    最后为1
    //空间复杂的  o（1）   不稳定
public class shellSort {
    public static void main(String[] args) {
        Random random=new Random();
        int H=random.nextInt(10);
        System.out.println(H);
        long start=System.currentTimeMillis();
        int []a={5,0,8,6,4,9,7,12,33,34,22,55,56,89,77};
        int[]gap={5,3,1};
        for (int i = 0; i <gap.length ; i++) {
            insertchild(gap[i],a);
        }
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+" ");
        }
        long end =System.currentTimeMillis();
        System.out.println();

    }
    public  static  void insertchild(int k,int[]a){
        int i=k;
        for (; i <a.length ; i++) {
            int tmp=a[i];
            int j = i-k;
            for (; j >= 0;j= j-k) {
                if(a[j]>tmp){
                    a[j+k]=a[j];
                }else{
                    break;
                }
            }
            a[j+k]=tmp;
        }
    }
}
