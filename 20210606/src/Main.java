import java.util.Collections;
import java.util.Scanner;

/**
 * Created with Intellij IDEA
 * Description:
 * User: 23871
 * Date: 2021-06-06
 * Time: 12:33
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int n=scan.nextInt();
        int j=n/2;
        for (int i = j; i >=0 ; i--) {
            if(sushu(i)==true){
                if(sushu(n-i)==true) {
                    System.out.println(i);
                    System.out.println(n-i);
                    break;
                }
            }
        }

    }
    public static Boolean sushu(int n){
        for (int i = 2; i <=n/2 ; i++) {
            if(n%i==0){
                return false;
            }
        }return true;
    }
}



 class BinInsert {
    public static void main(String[] args) {
        System.out.println(binInsert(1024, 19, 2, 6));
    }
    public static int binInsert(int n, int m, int j, int i) {
        // write code here
        String n1="";
        String m1="";
        while(n!=0){
            n1=n1+n%2;
            n=n/2;
        }
        while(m!=0){
            m1=m1+m%2;
            m=m/2;
        }

        String n2="";
        for (int k = 0; k <n1.length() ; k++) {
            if(k<j){
                n2=n2+n1.charAt(k);
            }else if((i-j+1)<=m1.length()&&k<=i){
                n2+=m1.charAt(k-j);
            }
            else{
                n2+=n1.charAt(k);
            }

        }

        int num=0;
        for (int k = 0; k <n2.length() ; k++) {
            double num1=Math.pow(2,k);
            num+=(n2.charAt(k)-'0')*num1;
        }
        return num;

    }
}

