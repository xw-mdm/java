import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created with Intellij IDEA
 * Description:
 * User: 23871
 * Date: 2021-05-24
 * Time: 16:46
 */
public class testhome {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        String str1="";
        String str2="";
        str1=in.nextLine();
        str2=in.nextLine();
        for (int i = 0; i <str2.length(); i++) {
            for (int j = 0; j <str1.length() ; j++) {
                if(str1.charAt(j)==str2.charAt(i)){
                    str1=str1.substring(0,j)+str1.substring(j+1);

                }
            }
        }
        System.out.println(str1);

    }

}
class sloution{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int []a=new int [3*n];
        ArrayList<Integer>arrayList=new ArrayList<>();
        for (int i = 0; i <n*3 ; i++) {
            a[i]=in.nextInt();
        }
       Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        int sum=0;
        int count=n;
        int nn=2*n-1;
        while(count>0){
            sum+=a[nn];
            nn--;
            count--;
        }
        System.out.println(sum);
    }
}
