import java.util.Scanner;

/**
 * Created with Intellij IDEA
 * Description:
 * User: 23871
 * Date: 2021-06-09
 * Time: 15:02
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            int n=scanner.nextInt();
            System.out.println(findNumbleof1(n));

        }
    }
    public static int findNumbleof1(int n){
        String str="";
        while(n!=0){
            str+=n%2;
            n=n/2;
        }
        int count=0;
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)=='1'){
                count++;
            }
        }
        return count;
    }
}
class Gloves {
    public int findMinimum(int n, int[] left, int[] right) {
        // write code here
        int sum=0;
        int right1=0;
        int left1=0;
        int leftmin=27;
        int rightmin=27;
        for (int i = 0; i <n ; i++) {
            if(left[i]*right[i]==0){
                sum+=(left[i]+right[i]);
            }else{
                left1+=left[i];
                right1+=right[i];
                if(left[i]<leftmin)leftmin=left[i];
                if(right[i]<rightmin)rightmin=right[i];
            }



        }
        left1=left1-leftmin+1;
        right1=right1-rightmin+1;
        if(left1<right1){
            return sum+left1+1;
        }
        return sum+right1+1;
    }
}