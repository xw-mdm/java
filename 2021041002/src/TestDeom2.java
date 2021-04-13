/**
 * Created with Intellij IDEA
 * Description:
 * User: 23871
 * Date: 2021-04-13
 * Time: 19:14
 */
public class TestDeom2 {
    public static void main(String[] args) {
        MyArray myArray=new MyArray();
        myArray.add(0,1);
        myArray.add(1,5);
        myArray.add(2,8);
        myArray.add(3,9);
        myArray.display();
        //判定是否包含某个元素
        System.out.println(myArray.contains(5));
        System.out.println(myArray.contains(510));
        //查找元素对应位置
        System.out.println("所要找的元素位置"+myArray.search(5));
        //获取pos位置的元素
        System.out.println("该位置元素是"+myArray.getPos(3));
        //给pos位置的元素设置为value
        myArray.setPos(2,50);
        myArray.display();
        //删除第一次出现的关键字
        myArray.remove(5);
        myArray.display();
        //获取顺序表长度
        System.out.println("顺序表长度"+myArray.size());
        //清空顺序表
        myArray.clear();
        myArray.display();
        //新添加的顺序表
        myArray.add(0,1);
        myArray.display();


    }
}
