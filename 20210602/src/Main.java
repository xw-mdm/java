import java.util.Scanner;

/**
 * Created with Intellij IDEA
 * Description:
 * User: 23871
 * Date: 2021-06-02
 * Time: 14:10
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int A=scan.nextInt();
        int B=scan.nextInt();
        System.out.println(addAB(A,B));
    }

        public static int addAB(int A, int B) {
            // write code here
            while(A!=0){
                int tmp =B;
                B=A^B;
                A=A&tmp;
                A<<=1;
            }
            return B;
        }
}

class solution{
    public static int Sum(int A,int B){
        if(A == 1 ||B == 1) {
            return A+B;
        }else  if(A == 0 || B == 0) {
            return 0;
        }else{
            return Sum(A,B-1) + Sum(A-1,B);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(Sum(A,B));
    }
}
 class Main66 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            System.out.println(count(n, m));
        }

        scanner.close();
    }

    private static int count(int n, int m) {

        int[][] path = new int[n + 1][m + 1];

        for (int i = 0; i < path[0].length; i++) {
            path[0][i] = 1;
        }

        for (int i = 0; i < path.length; i++) {
            path[i][0] = 1;
        }

        for (int i = 1; i < path.length; i++) {
            for (int j = 1; j < path[0].length; j++) {
                path[i][j] = path[i - 1][j] + path[i][j - 1];
            }
        }

        return path[n][m];
    }
}
