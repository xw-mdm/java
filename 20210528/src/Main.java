/**
 * Created with Intellij IDEA
 * Description:
 * User: 23871
 * Date: 2021-05-28
 * Time: 21:33
 */
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String a = sc.nextLine();
            String b = sc.nextLine();
            System.out.println(count(a,b));
        }
    }
    public static boolean isHuiWen(String str){
        int i = 0;
        int j = str.length() - 1;
        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static int count(String a,String b){
        int count = 0;
        for(int i = 0;i < a.length();i++){
            String str = a.substring(0,i)+b+a.substring(i,a.length());
            if(isHuiWen(str)){
                count++;
            }
        }
        return count;
    }
}

 class Main1{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int maxNum = nums[0];
        int curMax = nums[0];

        for(int i=1;i<n;i++){
            curMax = Math.max(curMax+nums[i],nums[i]);
            if(curMax>maxNum){
                maxNum = curMax;
            }
        }
        System.out.println(maxNum);

    }
}


