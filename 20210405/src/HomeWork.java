/**
 * Created with Intellij IDEA
 * Description:
 * User: 23871
 * Date: 2021-04-05
 * Time: 18:27
 */
import java.util.*;
public class HomeWork {
    /*public  static int  findNum(int[] a){
        int ret=0;
        for(int i=0;i<a.length;i++) {
            ret^=a[i];

        }
    }*/

    /*public  static void func() { //水仙花数
        for(int i=0;i<1000000;i++){
            //1.计算位数
            int tmp=i;
            int count=1;
            while(tmp/10!=0){
                count++;
                tmp=tmp/10;
            }
            tmp=i;
            //2.计算每一位的数
            int sum=0;

            while (tmp!=0){
                //Math.pow(a,b)//a的b次方
                sum+=Math.pow(tmp%10,count);
                tmp=tmp/10;

            }
            if(i==sum){
                System.out.println(i);
            }
        }

    }*/

    public  static void func2(int n){  //二进制每一位是多少
        for (int i=30;i>=0;i-=2){
            System.out.print(((n>>i)&1)+" ");
        }
        System.out.println();
        for (int i=31;i>=1;i-=2){
            System.out.print(((n>>i)&1)+" ");
        }

    }
    public static void main(String[] args) {
       /* int [] array={1,2,3,4,5};
        int ret=findNum(array);
        System.out.println(ret);*/
        //func();
        func2(7);

    }
}
