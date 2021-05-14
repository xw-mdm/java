package com.sort;

/**
 * Created with Intellij IDEA
 * Description:
 * User: 23871
 * Date: 2021-05-12
 * Time: 20:26
 */
//大堆   从小到大  时间复杂度n*logN   空间O（1） 不稳定
public class heapSort {
    public static   void adjust(int []a,int parent,int len){
      int child=parent*2+1;
      while(child<len){
          if(child+1<len&&a[child]<a[child+1]){
              child++;
          }
          if(a[parent]<a[child]){
              int tmp=a[child];
              a[child]=a[parent];
              a[parent]=tmp;
              parent=child;
              child=2*parent+1;
          }else {
              break;
          }
      }
    }
    public  static void creatHeap(int []a){
        for (int p = (a.length-1-1)/2; p>=0 ; p--) {
            adjust(a,p,a.length);
        }
    }
    public static void main(String[] args) {
        int  a[]={1,45,63,99,0,3,2,33,25};
        creatHeap(a);
        int end=a.length-1;
        while(end>0){
            int tmp=a[0];
            a[0]=a[end];
            a[end]=tmp;
            adjust(a,0,end);
            end--;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
