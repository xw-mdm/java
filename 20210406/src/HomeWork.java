/**
 * Created with Intellij IDEA
 * Description:
 * User: 23871
 * Date: 2021-04-06
 * Time: 19:13
 */
import  java.util.*;
public class HomeWork {
    //有一组数据，只有一个数字是出现一次，其他是两次，请找出这个数字。
   /* public  static int findNum(int []array){
        int ret=0;
        for(int i=0;i<array.length;i++){
            ret^=array[i];

        }
        return ret;
    }
    public static void main(String[] args) {
        int []array={1,2,3,2,1};
        System.out.println(findNum(array));


    }*/
    //求斐波那契数列的第n项。(迭代实现)
  /*  public  static int fib(int n){
        int f1=1;
        int f2=1;
        int f3=1;
        for(int i=3;i<=n;i++)
        {
            f3=f1+f2;
            f1=f2;
            f2=f3;
        }
        return f3;
    }

    public static void main(String[] args) {

        System.out.println(fib(1));
        System.out.println(fib(2));
        System.out.println(fib(3));
        System.out.println(fib(4));


    }*/
    //求阶乘和
   /* public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sum=0;
        int n=input.nextInt();

        for(int i=1;i<=n;i++){
            sum+=foctor(i);
        }
        System.out.println(sum);
    }
    public static  int foctor(int n){
        int result=1;
        for(int i=1;i<=n;i++){
            result*=i;
        }
        return result;
    }
*/
   /* //计算n的阶乘
     public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        System.out.println(foctor(n));
    }
    public static  int foctor(int n){
        int result=1;
        for(int i=1;i<=n;i++){
            result*=i;
        }
        return result;
    }*/
    //在同一个类中,分别定义求两个整数的方法 和 三个小数之和的方法。 并执行代码，求出结果
    /*public static void main(String[] args) {
        int a=10;
        int b=20;
        int ret1=add(a,b);
        System.out.println(ret1);
        double q=20.5;
        double w=30.5;
        double e=50.0;
        double ret2=add(q,w,e);
        System.out.println(ret2);

    }
    public  static int add(int x,int y)
    {
        return x+y;
    }
    public  static  double add(double x,double y,double h){
        return x+y+h;
    }
*/
    //打印*号
/*

    public static void Printx(int n){
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++){
                if(i==j){
                    System.out.print("*");
                }else if(i==n-1-j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");

            }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(scan.hasNextInt()){
            int n=scan.nextInt();
            Printx(n);
        }
    }*/

    //猜数字


/*
    public static void main(String[] args) {
            Random random=new Random();
            Scanner scan=new Scanner(System.in);
            int toGuess=random.nextInt(100);
            while(true){
                System.out.println("请输入你所猜的数（1-100）");
                int guess=scan.nextInt();
                if(guess<toGuess){
                    System.out.println("小了");
                }else if(guess>toGuess){
                    System.out.println("大了");
                }else{
                    System.out.println("猜对了");
                    break;
                }
            }
           scan.close();
    }*/
    //求出0～999之间的所有“水仙花数”并输出。(“水仙花数”是指一个三位数，其各位数字的立方和确好等于该数本 身，如；153＝1＋5＋3?，则153是一个“水仙花数“。）

   /* public  static void func() { //水仙花数
        for(int i=0;i<999;i++){
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

    }

    public static void main(String[] args) {
        func();
    }*/
    //计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值 。

  /* public static void main(String[] args) {
       int i=0;
       double sum=0.0;
       int flag=1;
       for(i=1;i<=100;i++)
       {
           sum=sum+flag*(1.0/i);
           flag=-flag;
       }

       System.out.println(sum);
   }*/
    //求两个数最大公约数

    /*public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int j=sc.nextInt();
        if(i>j){
            int tmp=i;
            i=j;
            j=tmp;

        }
        for(int h=i;h>1;h--){
            if(j%h==0){
                System.out.println(h+"是最大公因数");
            }
        }
*/
   /* //求一个整数，在内存当中存储时，二进制1的个数。
    public static void main(String[] args) {
        //求一个整数，在内存当中存储时，二进制1的个数
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = scanner.nextInt();
        int count = 0;
        for(int i = 0;i < 32;i++) {
            if(((num >> i) & 1) == 1) {
                count++;
            }
        }
        System.out.println(count);
    }
*/


    //获取一个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列
    /*public  static void func2(int n){  //二进制每一位是多少
        for (int i=30;i>=0;i-=2){
            System.out.print(((n>>i)&1)+" ");
        }
        System.out.println();
        for (int i=31;i>=1;i-=2){
            System.out.print(((n>>i)&1)+" ");
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = scanner.nextInt();
        func2(num);

    }*/
    //编写代码模拟三次密码输入的场景。 最多能输入三次密码，密码正确，提示“登录成功”,密码错误， 可以重新输 入，最多输入三次。三次均错，则提示退出程序
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String  arr1="1234";
        int count=3;
        for (int i = 0; i < 3; i++) {
            String arr2 = scanner.nextLine();
            if(arr2.equals(arr1)){
                System.out.println("登陆成功");
                break;
            }
            else{
                System.out.println("输入错误,重新输入");
                count--;
            }
            if(count==0){
                System.out.println("你的机会用完");
            }


        }
    }*/
    //输出一个整数的每一位，如：123的每一位是1 ， 2 ， 3
    /*public static void print(int n, int tmp) {
        if (n < 0) {//当输入一个负数时，先把它变成整数。
            System.out.println("-");
            n = -n;
        }
        if (n > 9) {
            print(n / 10, tmp);//递归
        }
        System.out.print(n % 10);//打印个位数
        if (n != tmp) {
            System.out.print(", ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字：");
        int n = scanner.nextInt();
        int tmp = n;
        print(n, tmp);
    }*/
    //乘法表
   /* public static void main(String[] args) {
        for (int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+i*j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }*/
    //斐波那契数
    /*public  static  int fib(int n){
        if(n==1||n==2){
            return 1;
        }
        return fib(n-1)+fib(n-2);

    }
    public static void main(String[] args) {
        System.out.println(fib(1));
        System.out.println(fib(2));
        System.out.println(fib(3));
        System.out.println(fib(4));
        System.out.println(fib(5));

    }*/
    //写一个递归方法，输入一个非负整数，返回组成它的数字之和
    /*public  static int sum(int n){
        if(n<10){
            return n;
        }
        return n%10+sum(n/10);
    }
    public static void main(String[] args) {
        System.out.println(sum(1234));
    }*/
    //按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4) （递归）
  /*  public  static  void func(int n){
        if(n>9){
            func(n/10);
        }
        System.out.println(n%10);
    }

    public static void main(String[] args) {
        func(1234);
    }*/
    //递归求 1 + 2 + 3 + ... + 10
     /*public static int sum(int n){
       if(n==1){
        return 1;
       }
    return n+sum(n-1);
    }
    public static void main(String[] args) {
        int sum1=sum(10);
        System.out.println(sum1);
    }*/
    //递归求 N 的阶乘
   /* public static int fac(int n) {
        if(n==1){
            return 1;
        }
        return n*fac(n-1);
    }
    public static void main(String[] args) {
        int fac2= fac(5);
        System.out.println(fac2);
    }*/
    //汉诺塔

   /* public static int han(int n){
        if(n>1){
            return 2*han(n-1)+1;
        }
        return 1;
    }
    public static void main(String[] args) {
        System.out.println(han(5));
    }*/
    //青蛙跳台阶   可挑1个  2个   问调到第n个有多少种跳发、
    public  static int frogjump(int n){
        if(n==1){
            return 1;

        }
        if(n==2){
            return 2;
        }
        return frogjump(n-1)+frogjump(n-2);
    }

    public static void main(String[] args) {

        System.out.println(frogjump(5));
    }
}









