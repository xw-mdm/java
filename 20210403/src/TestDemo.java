/**
 * Created with Intellij IDEA
 * Description:
 * User: 23871
 * Date: 2021-04-03
 * Time: 8:55
 */
import java.util.Scanner;
public class TestDemo {
    /* //计算0-100之间9的个数
     public static void main(String[] args) {
         int i=0;
         int count =0;
         for(i=0;i<=100;i++){
             if(i%10==9)
                 count++;
             if(i/10==9)
                 count++;
         }
         System.out.printf("9的个数%d\n",count);
     }
 */
   /* //输出1000-2000之间的闰年
    public static void main(String[] args) {
        int i=1000;
        for(i=1000;i<=2000;i++) {
            if ((i % 100 != 0 && i % 4 == 0) || (i % 400 == 0)) {
                System.out.println(i+"是润年");
            }
        }
    }*/
    //1-100之间所有的素数
    /*public static void main(String[] args){
        int j=0;
        for(int i=1;i<=100;i++){
            for( j=2;j<=i;j++){
                if(i%j==0){
                    break;
                }
            }
            if(j==i){
                System.out.println(i);
            }
        }
    }*/
    //判定一个数是素数
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=sc.nextInt();
        int j=0;
        for( j=2;j<=i;j++){
            if(i%j==0){
                break;

            }
        }
        if(j==i){
            System.out.println(i+"是素数");
        }
        else
            System.out.println(i+"不是素数");
    }*/
    //根据输入的年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age=sc.nextInt();
        if(age<=18)
            System.out.println("当前年龄的人是少年");
        else if(age>=19&&age<=28)
            System.out.println("当前年龄的人是青年");
        else if(age>=29&&age<=55)
            System.out.println("当前年龄的人是中年");
        else
            System.out.println("当前年龄得人是老年");
    }
}



