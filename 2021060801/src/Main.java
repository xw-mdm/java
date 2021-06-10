import java.util.Scanner;

/**
 * Created with Intellij IDEA
 * Description:
 * User: 23871
 * Date: 2021-06-08
 * Time: 11:15
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()) {
            int year = scanner.nextInt();
            int mon = scanner.nextInt();
            int day = scanner.nextInt();
            System.out.println(outDay(year,mon,day));
        }

    }
    public  static int outDay(int year,int mon,int day){
        int Day[]={31,28,31,30,31,30,31,31,30,31,30,31};
        int sum=0;
        if(year%100!=0&&year%4==0||year%400==0){
            Day[1]=29;
        }
        if(year<=0||mon<=0||mon>12||day<=0||day>Day[mon-1]){
            return -1;
        }
        for (int i = 0; i <mon-1 ; i++) {
            sum+=Day[i];
        }
        sum+=day;
        return sum;
    }
}
