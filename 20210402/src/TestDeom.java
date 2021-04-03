/**
 * Created with Intellij IDEA
 * Description:
 * User: 23871
 * Date: 2021-04-02
 * Time: 18:49
 */
public class TestDeom {
    public static void main1(String[] args) {
        short a=128;
        byte b=(byte)a;
        System.out.println(b);
        System.out.println(a);
    }

    public static void  main2(String[] args) {
        /*System.out.println(5/2);    //2.0
        System.out.println((float)5/2);//强制类型转换2.5
        System.out.println(5/(float)2);  //2.5
        System.out.println((float)(5/2));  //2.0
        System.out.println(5+2);
        System.out.println(5-2);
        System.out.println(5*2);
         */
        System.out.println(11.5%2.0);  //1.5
       // System.out.println(10/0);//错误  异常
    }

    public static void main3(String[] args) {
        /*//增值赋值运算  （+= -= *= /=）都会进行强制类型转换
        int a=10;
        a+=1;
        System.out.println(a);
        short b=6;
        // b=b+2;     b=(short)b+2;
        b+=2;   //此处会自动强制类型转换
        System.out.println(b);
        */
        int a=10;
        a++;
        System.out.println(a);
        int b=++a;
        System.out.println(b);
    }

    public static void main4(String[] args) {
        //关系运算符  ==  ！= < >  <=  >=
        int a = 10;
        int b = 20;
        System.out.println(a == b);
        System.out.println(a < b);
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        //都是布尔表达式   值为 true  /false
        //逻辑运算符   （&&逻辑与两边必须是布尔表达式一个是假都为假）
        System.out.println(10 > 20 && 10 / 0 == 0);
        //（||逻辑或   短路或  两边必须是布尔表达式）
        //只要有一个表达式为真都为真  表达式1为假不计算后面
        //（!）也必须是布尔类型
        System.out.println(!(a == 0));
        //但是 & |操作数为boolen时也是逻辑运算符号   但是不会短路
        //^ 异或    不一样的位为1  一样为0
        //  &  按位与  都为1才是1     | 按位或 只要有1就是1
        // 说有两个数字  1 2 3 1 3 4   2和4只出现了2次  怎样找出来
        //思路    将所有数字进行异或   最后得到  2^4  然后按照第二位为一的数字进行分组在进行异或
        //~  按位取反   0变1 1 变0
        int h = 0x0f;
        System.out.printf("%x", ~h);
        //<<  左移相当于乘法      >> 右移  相当于除法
        System.out.println(-1 >> 1);  //还是-1
        //无符号右移一位  >>>
        System.out.println(-1 >>> 1); //补码中不补符号位  变成一个较大的正整数01111111111111111111111111111111
        //三目运算符   （所有的表达式都是Boolen表达式）
        //表达式1？表达式2 ：表达式3  若表达式1为真  执行表达式2 否则执行表达式3

    }

    public static void main55(String[] args) {
        System.out.println(false==false?(true==true?false:true):true);  //打印false
        System.out.println("aaa");
        System.out.println("bbb");
        System.out.println("ccc");//顺序结构
        //分支结构
        //单分支 if(布尔表达式){    }；可能是多条语句
        //双分支   if(){}     else{};
        //多分支   if(){}   else if(){}  else{};
    }
}
