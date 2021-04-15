/**
 * Created with Intellij IDEA
 * Description:
 * User: 23871
 * Date: 2021-04-12
 * Time: 17:01
 */
import  java.util.*;

/** 一个一个的节点连接而成
 * 链表分类     单向  双向      带头 不带头   循环  不循环
 *单向不带头非循环   单链表
 * 一个节点两个域   放值  和地址    val 和next    尾节点   头结点
 * 顺序表  物理上逻辑上是连续的
 * 链表   物理上不一定连续   逻辑上一定连续   带环链表 （尾节点指向其他的地址或自己地址）
 * 带头的链表第一个存的是地址 值域里面没值
 */


public class TestDemo {
    public static void main(String[] args) {

       /* MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.addLast(22);
        myLinkedList.addLast(22);
        myLinkedList.addLast(22);
        myLinkedList.addFirst(13);
        myLinkedList.addLast(23);
        myLinkedList.addLast(25);
        System.out.println(myLinkedList.getLength());
        myLinkedList.show();
        myLinkedList.addIndex(2,15);
        System.out.println(myLinkedList.contains(99));
        System.out.println(myLinkedList.contains(22));
        myLinkedList.remove(22);
        myLinkedList.show();
        System.out.println();
        myLinkedList.removeAllkey(22);
        myLinkedList.show();
    }*/
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(22);
        myLinkedList.addLast(22);
        myLinkedList.addLast(26);

        myLinkedList.addLast(23);
        myLinkedList.addLast(25);
        myLinkedList.show();
        System.out.println("中间值"+myLinkedList.middleNode().val);

        myLinkedList.removeAllkey(22);
        System.out.println();
        System.out.println("删除完毕");
        myLinkedList.show();
        System.out.println();
        System.out.println("中间值"+myLinkedList.middleNode().val);
        myLinkedList.trunOver();
        myLinkedList.show();
    }
}
