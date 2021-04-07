/**
 * Created with Intellij IDEA
 * Description:
 * User: 23871
 * Date: 2021-04-05
 * Time: 20:31
 */
public class TestDeom {
    //n的阶乘
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
    //求1-n的和
    /*public static int sum(int n){
       if(n==1){
        return 1;
       }
    return n+sum(n-1);
    }
    public static void main(String[] args) {
        int sum1=sum(100);
        System.out.println(sum1);
    }*/

    //顺序打印123456每一位
    /*public static void func1(int n){
        if(n<=9){
            System.out.println(n%10);
            return ;
        }
          func1(n/10);
        System.out.println(n%10);
    }
    public static void  func2(int n){
        if(n>9){
            func2(n/10);
        }
        System.out.println(n%10);
    }
    public static void main(String[] args) {
        func1(123);
        func2(123);
    }*/

    //123各个位相加
    /*public  static int func(int n){
        if(n<=9){
            return n;
        }
        return n%10+func(n/10);
    }

    public static void main(String[] args) {
        System.out.println(func(123));
    }*/

    public static void main(String[] args) {

    }
}
