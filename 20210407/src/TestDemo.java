import java.util.Arrays;

/**
 * Created with Intellij IDEA
 * Description:
 * User: 23871
 * Date: 2021-04-07
 * Time: 18:45
 */
public class TestDemo {
    /*//汉诺塔
    public static void main(String[] args) {
        hanoi(1,'a','b','c');
        System.out.println();
        hanoi(2,'a','b','c');
        System.out.println();
        hanoi(3,'a','b','c');
        System.out.println();
    }
    public  static  void hanoi(int n,char pos1,char pos2,char pos3){
        if(n==1){
            move(pos1,pos3);
        }else{
            hanoi((n-1),pos1,pos3,pos2);
            move(pos1,pos3);
            hanoi((n-1),pos2,pos1,pos3);
        }
    }
    public  static  void move(char pos1,char pos2){
        System.out.println(pos1+"=>"+pos2+" ");
    }*/

    //数组  教学
    public static void main3(String[] args) {

        int [] array={1,2,3,4,5};  //数组
        int [] array2=new int[5];    //局部变量
        int [] array3=new int[]{1,2,3,4,5};
        //数据存放在堆  变量名存在栈内（堆的地址）
        System.out.println(array3);
        //打印出来的是地址  是真实地址hash得来（引用）
        String str="wnag";
        System.out.println(str);//此处也是引用地址  打印的时候函数转化了
        //引用指向的是 对象
        System.out.println(array[0]);
        int [] array4=null;  //引用变量对应的0
        //System.out.println(array4.length);   //报错
        System.out.println(array.length);//数组长度
    }

  /*  public static void main(String[] args) {
        //数组的遍历方式
        int [] array={1,2,3,4,5};  //数组
        int [] array2=new int[5];    //局部变量
        int [] array3=new int[]{1,2,3,4,5};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[1]);
        }
        for (int a:array) {  //foreach   增强for循环  没有下标
            System.out.println(a);
        }
        //将数组按照字符串形式打印
        //Arrays  操作数组工具类
        String str=Arrays.toString(array);
        System.out.println(str);
    }
*/
    //数组的传参
    /*public  static void printArray(int [] array){
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]);
        }
    }
    public  static  void func(int [] array){
        int [] array2=new int [] {1,2,3,4,5};
        for (int i = 0; i <array2.length; i++) {
            array2[i]*=2;
        }
    }
  public static void main(String[] args) {
        int [] array={1,2,3,4,5};
        func(array);
        printArray(array);
  }*/
    //数组作为返回值
   /* public  static  int[] fun3(){
        int [] array={1,2,2,23,1,5};
        return  array;
    }

    public static void main(String[] args) {
        int [] tmp=fun3();
        System.out.println(Arrays.toString(tmp));
    }*/
    //交换数组的奇数位和偶数位的数字  奇数放前面
    public static void swap(int []array){
        int i=0;
        int j=array.length-1;
        int tmp=0;
        while(i<j){
            /*if(array[i]%2!=0){
                i++;
            }*/
            while(i<j&&array[i]%2!=0)
            {
                i++;
            }
           /* if(array[j]%2==0){
                j--;
            }*/
            while(i<j&&array[j]%2==0){
                j--;
            }

                tmp=array[i];
                array[i]=array[j];
                array[j]=tmp;


        }

    }
  public static void main(String[] args) {
        int [] array={1,7,3,5,8,9,10};
        swap(array);
      System.out.println(Arrays.toString(array));

  }

}
