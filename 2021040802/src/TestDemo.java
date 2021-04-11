/**
 * Created with Intellij IDEA
 * Description:
 * User: 23871
 * Date: 2021-04-08
 * Time: 18:29
 */
import  java.util.Arrays;
public class TestDemo {
    //数组练习
    //数组的字符转换
  /*  public static  String myToString(int []array) {
        if(array==null){
            return null;
        }
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            str = str + array[i];
            if (i != array.length - 1) {
                str = str + ",";
            }
        }
        str = str + "]";
        return str;
    }
    public static void main(String[] args) {
        int[]array={1,2,3,4,5};
        System.out.println(myToString(array));
    }*/
    //数组的拷贝
   /* public  static  int []  copyArray(int []array){
        int []tmp=new int[array.length];
        for (int i = 0; i <array.length ; i++) {
            tmp[i]=array[i];
        }
        return tmp;
    }
    public static void main(String[] args) {
        int []array={1,2,3,4,5};
        int []ret=copyArray(array);
        System.out.println(Arrays.toString(ret));
    }*/
    //数组的克隆   4种方法
    //for循环   Arrays.copyof(数组名，长度)返回数组;  System.arraysopy(原来数组，0，目的数组，0，长度);无返回值native（本地方法栈开辟内存）
    //array(数组名).clone()   复制了一份
    //深拷贝和浅拷贝
    //深拷贝 开辟新的堆       浅拷贝 复制了地址
/*
    public static void main(String[] args) {
        int[] array={1,2,3,4};
        int[]ret=Arrays.copyOfRange(array,1,3);//左闭右开
        System.out.println(Arrays.toString(ret));
    }*/
    //找数组中的元素   二分查找
/*    public static int binarySearch(int [] array,int key){
        int i=0;
        int j=array.length-1;
        //排序   Arrays.sort();
        while(i<=j) {
            int mid=(i+j)/2;
            if (array[mid] > key) {
                j = mid-1;

                mid = (i + j) / 2;
            } else if (array[mid] < key) {
                i = mid+1;
                mid = (i + j) / 2;
            } else {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int []array={1,5,9,45,89,660};
        System.out.println(binarySearch(array, 556));
    }*/
    //   判断是否是有序的
/*    public  static  boolean isSorted(int[]arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int []arr={1,5,6,12,231};
        System.out.println(isSorted(arr));
    }*/
    //冒泡排序
    /*public  static void bubbleSort(int[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            boolean flag=false;
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                    flag=true;
                }
            }
            if(flag==false){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int []arr={6,5,10,9,3};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }*/
    //逆置
   /* public static void reverse(int[] array){
       int i=0;
       int j=array.length-1;
       while(i<j){
           int tmp=array[i];
           array[i]=array[j];
           array[j]=tmp;
           i++;
           j--;
       }
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }*/
    //二维数组
    /*public static void main(String[] args) {
        int [][]arr=new int[2][3];
        int [][]arr1=new int[][]{{1,2,3},{1,2,5,6}};
        int [][]arr3={{1,2,3},{1,2,5,6}};
    }*/
 /*   public static void main(String[] args) {
        int [][]arr=new int[2][3];
        int [][]arr1=new int[][]{{1,2,3},{1,2,5,6}};//不规则数组
        int [][]arr4=new int[2][];
        arr4[0]=new int[2];
        arr4[1]=new int[5];
       // System.out.println(Arrays.deepToString(arr4));//深度打印
        System.out.println(Arrays.toString(arr4[0]));
        int [][]arr3={{1,2,3},{1,2,5,6}};
        //  arr.length  //代表行
       // arr[i].length  //代表列
    }*/
    

}
