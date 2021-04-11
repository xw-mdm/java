import java.util.Arrays;

/**
 * Created with Intellij IDEA
 * Description:
 * User: 23871
 * Date: 2021-04-08
 * Time: 12:32
 */
public class HomeWork {
   /* //实现一个方法 avg, 以数组为参数, 求数组中所有元素的平均值(注意方法的返回值类型).
    public static  double avg(double[] array){
        double sum=0;
        int i=0;
        double avg=0.0;
        for (i = 0; i <array.length ; i++) {
            sum+=array[i];
        }

        avg=sum/array.length;
        return avg;
    }

    public static void main(String[] args) {
        double []array={1,2,3,4,5,6};
        double ret=avg(array);
        System.out.println(ret);
    }*/

    //实现一个方法 sum, 以数组为参数, 求数组所有元素之和.
    /*public  static  int sum(int []array){
        int sum=0;
        for (int i = 0; i <array.length ; i++) {
            sum+=array[i];

        }
        return sum;
    }

    public static void main(String[] args) {
        int []array={1,6,8,9,5,6};
        System.out.println(sum(array));
    }*/
    //实现一个方法 transform, 以数组为参数, 循环将数组中的每个元素 乘以 2 , 并设置到对应的数组元素上. 例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}
   /* public  static void transform(int []array){
        for (int i = 0; i <array.length ; i++) {
            array[i]*=2;
        }

    }

    public static void main(String[] args) {
        int []arr=new int[]{1,2,3,};
        System.out.println(Arrays.toString(arr));
        transform(arr);
        System.out.println(Arrays.toString(arr));
    }*/
    //实现一个方法 printArray, 以数组为参数, 循环访问数组中的每个元素, 打印每个元素的值.
    /*public  static  void printArray(int []arr){
        for (int a:arr) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        int []arr={1,5,6,8,9};
        printArray(arr);
    }*/
    //创建一个 int 类型的数组, 元素个数为 100, 并把每个元素依次设置为 1 - 100
    public static void main(String[] args) {
        int []arr=new int[100];
        for (int i = 0; i <100 ; i++) {
            arr[i]=i+1;
        }
        System.out.println(Arrays.toString(arr));
    }
}
