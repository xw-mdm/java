import com.sun.org.apache.xpath.internal.objects.XString;

/**
 * Created with Intellij IDEA
 * Description:
 * User: 23871
 * Date: 2021-03-30
 * Time: 19:11
 */
public class TestDemo {
    public static void maindfd(String[] args) {
        char ch='a';
        System.out.println(ch);
        char ch2='高';//占两个字节
        System.out.println(ch2);
        char ch3=98; //始终以字符的形式展现
        //char ch4=-10;  不能给负数
        System.out.println(ch3);  //(b)
    }
    public static void main55(String[] args) {
        System.out.println("hello world");

       // float h=12.5;  //C语言是弱类型语言  java是强类型语言
        float h=12.5f;//4个字节 f进行标识
        System.out.println(h);
        double d=12.5;//8个字节
        System.out.println(d);
        int a=1;
        int b=2;
        System.out.println(a/b);
        double c=1.1;
        double f=1.1;
        System.out.println(c*f);
        String str="123";
        System.out.println(Integer.valueOf(str));//转化成为整型
        System.out.println(str);

    }

    public static void main5(String[] args) {
        byte n=10;  //相当于C语言中的char类型 1个字节
        System.out.println(n);//(取值在-128-127)
        byte b1=10;
        byte b2=20;
        //byte b3=b1+b2; 变量不能变量加变量
        //计算机再取数据的时候，都取4个字节 提升速度会提升为这整形进行计算
        //System.out.println(b3);
        int a=20;
        int g=30;
        int h=a+g;
        byte b4=10+20;
        System.out.println(b4);

    }

    public static void main6(String[] args) {
        int a=10;
        long b=20;
       // int c=a+b; 存在整型提升
        long d=a+b;
        System.out.println(d);
    }

    public static void main8(String[] args) {
        boolean flag1=true;
        boolean flag2=false;  //没有0和1的值
    }

    public static void main9(String[] args) {
        String str="wangxupeng";
        System.out.println(str);
        String str2="My name is \"王栩鹏\"";
        System.out.println(str2);
    }

    public static void main20(String[] args) {
        String str1="abf";
        String str2="dfdsa";
        String str3=str1+str2;
        System.out.println(str3);
    }

    public static void main21(String[] args) {
        int a=10;
        {
            a=90;   //此时两个a一样
        }
    }

    public static void main22(String[] args) {
        {
            int a=10;
            //int a;  局部变量必须初始化赋值
            //System.out.println(a);

        }
        //a=20;   此时就需要重新定义a
        int a;
        a=20;    //常量只能初始化一次
        System.out.println(a);

    }

    public static void main23(String[] args) {
        final int a=20;   //类似于c语言中的const   修饰常量
        //  a=20;  此时报错

        int b=555;
        //boolean f=b;   类型不同
        short d=(short)a;  //必须强制转换  隐式转换
    }

    public static void main(String[] args) {
        int a=10;
        String str1=a+"";
        System.out.println(str1);
        String ret;
        ret=String.valueOf(a);
        System.out.println(ret);
        String str2="10";  //此处必须是数字不可以是10a等
        int h=Integer.parseInt(str2);
        System.out.println(h);
        float m=Integer.valueOf(str2);
        System.out.println(m);
        String str3="10.11";  //此处必须是数字不可以是10a等
        double hh=Double.parseDouble(str2);
        System.out.println(hh);
        float mm=Float.valueOf(str2);
        System.out.println(mm);

    }

    public static void main621(String[] args) {
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Character.MAX_VALUE);
        System.out.println(Character.MIN_VALUE);

    }
}


