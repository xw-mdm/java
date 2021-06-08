import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with Intellij IDEA
 * Description:
 * User: 23871
 * Date: 2021-06-01
 * Time: 15:46
 */
class Main1 {
    //最小公倍数
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int max=Math.max(a,b);
        int h=max;
        int min=Math.min(a,b);
         if(max%min==0){
            System.out.println(max);
        }else{
            while(max%min!=0){
                max+=h;
            }
            System.out.println(max);
        }



    }
}
public class Main{
    //两种排序方法
 /*   public static Boolean zidian(int n,String []str){
        int i=0;
        while (i<n-1){
            int j=0;
            while(j<Math.min(str[i].length(),str[i+1].length())){
                if(str[i].charAt(j)<=str[i+1].charAt(j)){
                    j++;
                }else{
                    return false;
                }
            }
            i++;
        }
        return true;


    }*/
    public static Boolean zidian(int n,String []str) {
        int i = 0;
        while (i < n - 1) {
            int h = str[i].compareTo(str[i + 1]);
            if (h <= 0) {
                i++;
            } else {
                return false;
            }
        }
        return true;
    }

        public static  Boolean shunxu(int n,String []str){
        int i=0;
        while(i<n-1){
            if(str[i].length()<=str[i+1].length()){
                i++;
            }else{
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        String []str=new String[n];
        for (int i = 0; i < n; i++) {
            str[i]=scan.next();
        }
        if(zidian(n,str)&&shunxu(n,str)){
            System.out.println("both");
        }else if(zidian(n,str)&&!shunxu(n,str)){
            System.out.println("lexicographically");
        }else if(!zidian(n,str)&&shunxu(n,str)){
            System.out.println("lengths");
        }else{
            System.out.println("none");
        }

    }
}


 class Main2{
    public static String result(int a,String[] strs){
        boolean flat1 = false;
        boolean flat2 = false;
        for (int i = 1; i <strs.length; i++) {
            if(strs[i].compareTo(strs[i-1])<0){
                flat1=true;break;
            }
        }
        for (int i = 0; i <strs.length-1 ; i++) {
            if(strs[i].length()>strs[i+1].length())
                break;
            if(i==a-2)flat2=true;
        }
        if(!flat1&&flat2) return "both";
        else if(!flat1)return "lexicographically";
        else if(flat2)return "lengths";
        else return "none";

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int a = scanner.nextInt();
            String[] strs = new String[a];
            for (int i = 0; i < a; i++)
                strs[i] = scanner.next();
            System.out.println(result(a, strs));
        }
    }
}