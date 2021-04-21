package test.src;

/**
 * Created with Intellij IDEA
 * Description:
 * User: 23871
 * Date: 2021-04-18
 * Time: 13:26
 */

public class TestDeom {

    public static void main(String[] args) {
       /* DLinkedList dLinkedList=new DLinkedList();
        dLinkedList.addLast(5);
        dLinkedList.addLast(5);
        dLinkedList.addLast(5);
        dLinkedList.addLast(5);
        dLinkedList.addLast(6);
        dLinkedList.addLast(6);
        dLinkedList.addLast(6);
        dLinkedList.addLast(6);
        dLinkedList.display();*/
        Mylist mylist=new Mylist();
      /*mylist.addFirst(1);
        mylist.addFirst(2);
        mylist.addFirst(3);
        mylist.addFirst(4);*/

        mylist.addLast(1);
        mylist.addLast(2);
        mylist.addLast(3);
        mylist.addLast(4);
        System.out.println(mylist.size());
        mylist.addLast(4);
        mylist.addFirst(56);
        mylist.addIndex(0,55);
        mylist.addIndex(7,56);
        mylist.removeAllKey(56);
        mylist.display();
        mylist.clear();


        mylist.display();








    }
}
