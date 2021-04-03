public class TestDemo {
    public static void main(String[] args) {
       // int a=10;  //行注释
        int a=Integer.MAX_VALUE;
        System.out.println(a);
        int b=20;
        //1.字符串拼接任何变量都会变成字符此时+是拼接的意思
        //2.前面不是字符串就先进行在拼接
        System.out.println("a:"+a+"b:"+b);
        System.out.println("a:"+a+b);
        System.out.println(a+b+"a");
        System.out.println("hello");
        //java中int都是4个字节   因此可以跨平台  而且全部为有符号
    }
}
