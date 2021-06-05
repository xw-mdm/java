/**
 * Created with Intellij IDEA
 * Description:
 * User: 23871
 * Date: 2021-05-29
 * Time: 13:14
 */
public class Main {


}
 class Solution {
     public static void main(String[] args) {
         String str="+6666 ";

         System.out.println(StrToInt(str));
     }
    public  static int StrToInt(String str) {
        int num = 0;
        int num1=0;
        boolean aa=true;//表示没有字母符号
        str = str.trim();
        if (str.length() == 0 || str == null) {
            return 0;
        }
        int flag = 1;//表示第一个是+
        if (str.charAt(0) == '+') {
            flag = 1;
        }else if (str.charAt(0) == '-') {
            flag = -1;
        }
        else if ((str.charAt(0) - '0') >= 0 && (str.charAt(0) - '0') <= 9) {
            num = (str.charAt(0) - '0') * (int) Math.pow(10, str.length() - 1);
            flag=0;
        }else{
            aa=false;
        }
        int i = 1;
        while( i <str.length() ) {
            if(str.charAt(i)-'0'<0&&str.charAt(i)-'0'>9){
                aa=false;

            }else{
                num1 = num1+(str.charAt(i) - '0') * (int) Math.pow(10, str.length() -1-i);
            }
            i++;

        }
        if(aa==false){
            num=0;
        }else
        if(flag==1&&aa==true){
            num=num1;

        }
        else if(flag==-1&&aa==true){
            num=-num1;
        }
       else if(flag==0&&aa==true){
            num=num+num1;
        }
       return num;
    }




}
