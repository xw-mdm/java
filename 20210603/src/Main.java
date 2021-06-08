/**
 * Created with Intellij IDEA
 * Description:
 * User: 23871
 * Date: 2021-06-03
 * Time: 17:39
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int [][]board=new int [3][3];
    }
    public static boolean checkWon(int[][] board) {
        // write code here
        if(board[1][1]==1){
            if(board[0][0]==1&&board[2][2]==1||board[0][2]==1&&board[2][0]==1
                    ||board[0][1]==1&&board[2][1]==1||board[1][0]==1&&board[2][1]==1){
                return true;
            }
        }else {
            if(board[0][0]==1&&board[0][1]==1&&board[0][2]==1||
                    board[2][0]==1&&board[2][1]==1&&board[2][2]==1||
                    board[0][0]==1&&board[1][0]==1&&board[2][0]==1||
                    board[0][2]==1&&board[1][2]==1&&board[2][2]==1){
                return true;
            }
        }
        return  false;
    }
}
class Solution{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()) {
            String password = scanner.next();
            int level = GetPwdSecurity(password);
            if (level >= 90) {
                System.out.println("VERY_SECURE");
            } else if (level >= 80) {
                System.out.println("SECURE");
            } else if (level >= 70) {
                System.out.println("VERY_STRONG");
            } else if (level >= 60) {
                System.out.println("STRONG");
            } else if (level >= 50) {
                System.out.println("AVERAGE");
            } else if (level >= 25) {
                System.out.println("WEAK");
            } else {
                System.out.println("VERY_WEAK");
            }
        }

    }
    public static int GetPwdSecurity(String password){
        int level=0;
        while (true) {
            if (password.length() <= 4) {
                level = level + 5;
            } else if (password.length() <= 7) {
                level = level + 10;
            } else {
                level = level + 25;
            }
            break;
        }

        int max=0;
        int min=0;
        for (int i = 0; i <password.length() ; i++) {

                if(password.charAt(i)<='Z'&&password.charAt(i)>='A'){
                    max++;
                }else if(password.charAt(i)<='z'&&password.charAt(i)>='a'){
                    min++;
                }
            }
            if(max!=0&&min!=0){
                level+=20;
            }else if(max==0&&min!=0||min==0&&max!=0){
                level+=10;
            }else{
                level+=0;
            }

        int num=0;
        for (int i = 0; i <password.length() ; i++) {
            if(password.charAt(i)-'0'<=9&&password.charAt(i)-'0'>=0){
             num++;
            }
        }
        if(num==0){
            level+=0;
        }else if(num==1){
            level+=10;
        }else{
            level+=20;
        }

        int num2=0;
        for (int i = 0; i <password.length() ; i++) {

            if(password.charAt(i)>=21&&password.charAt(i)<=47||password.charAt(i)>=58&&password.charAt(i)<=64||
                    password.charAt(i)>=91&&password.charAt(i)<=96||password.charAt(i)>=123&&password.charAt(i)<=126){
                num2++;
            }

        }
        if(num2==0){
            level+=0;
        }else if(num2==1){
            level+=10;
        }else{
            level+=25;
        }

        if(num!=0&&num2!=0&&max!=0&&min!=0){
            level+=5;
        }else if(num!=0&&num2!=0&&(max!=0||min!=0)){
            level+=3;
        }else if(num!=0&&(max!=0||min!=0)){
            level+=2;
        }
        return level;
    }
}
