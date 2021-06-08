import com.sun.org.apache.xpath.internal.operations.String;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with Intellij IDEA
 * Description:
 * User: 23871
 * Date: 2021-06-01
 * Time: 11:23
 */
public class update01 {
    //组队竞赛
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int array[]=new int[n];
        for (int i = 0; i <3*n ; i++) {
            array[i]=scanner.nextInt();
        }
        long sum=0;
        Arrays.sort(array);
        for (int i = 0; i <n ; i++) {
            sum+=array[array.length-2*(i+1)];
        }
        System.out.println(sum);
    }
}

class Test {
    static int i = 0;
    public int aMethod(){

        i++;
        return i;
    }
    public static void main(String args[]){
        Test test = new Test();
        test.aMethod();
        int j = test.aMethod();
        System.out.println(j);
    }
}
class Tast2{
    //排序子序列
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int a[]=new int[n+1];
        for (int i = 0; i <n ; i++) {
            a[i]=scanner.nextInt();
        }
        int count=0;
        int i = 0;
        while ( i <n-1 ) {
            if(a[i]<a[i+1]){
                while(a[i]<a[i+1]) {
                    i++;
                }
                count++;
                i++;
            }

            else if(a[i]==a[i+1]){
                i++;

            }else{
                while(a[i]>a[i+1]){
                    i++;
                }
                count++;
                i++;

            }
        }
        System.out.println(count);
    }
}
class buyapple{

        public static void main(String []args){
            Scanner s = new Scanner(System.in);
            while(s.hasNext()){
                int n = s.nextInt();
                int count = n/6;
                boolean flag = true;
                int i,j;
                for(i = 0;i <= n / 6;i++){
                    for(j = 0;j <= n / 8;j++){
                        if(6 * i + 8 * j == n){
                            count = Math.min(count,i + j);
                            flag = false;
                        }
                    }
                }
                if(flag){
                    count = -1;
                }
                System.out.print(count);
            }
        }

}
class countcandy{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int AsubB=scan.nextInt();
        int BsubC=scan.nextInt();
        int AandB=scan.nextInt();
        int BandC=scan.nextInt();
        int A=(AsubB+AandB)/2;
        int B1=(BandC+BsubC)/2;
        int C=(BandC-BsubC)/2;
        int B2=(AandB-AsubB)/2;
        if(B1==B2){
            System.out.println(A+" "+B1+" "+C);
        }else{
            System.out.println("NO");
        }

    }
}
class zhuanhuan{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int num=scan.nextInt();
        int n=scan.nextInt();
        java.lang.String table="0123456789ABCDEF";
        boolean flg=false;
        StringBuilder ret=new StringBuilder();
        if(num<0){
            num=-num;
            flg=true;
        }
        while(num!=0){
            ret.append(table.charAt(num%n));
            num=num/n;
        }
        if(flg){
            ret.append("-");
        }
        ret.reverse();
        System.out.println(ret);


    }
}
