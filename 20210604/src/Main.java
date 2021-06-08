import java.util.Scanner;

/**
 * Created with Intellij IDEA
 * Description:
 * User: 23871
 * Date: 2021-06-04
 * Time: 14:41
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int Byte = scan.nextInt();
            String str = "";
            while (Byte != 0) {
                str = Byte % 2 + str;
                Byte = Byte / 2;
            }
            int max = 0;
            int num = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) - '0' == 1) {
                    num++;
                }
                if (num > max) {
                    max = num;
                }
                if (str.charAt(i) - '0' == 0) {
                    num = 0;
                }

            }
            System.out.println(max);
        }

    }
}
public class LCA {
    public int getLCA(int a, int b) {
        // write code here
        if(a==b||a==b/2){
            return a;
        }
        if(b==a/2){
            return b;
        }
        while(a!=b){
            if(a>b){
                a=a/2;
            }else{
                b=b/2;
            }
        }
        return a;

    }
}


