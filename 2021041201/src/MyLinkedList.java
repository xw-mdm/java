/**
 * Created with Intellij IDEA
 * Description:
 * User: 23871
 * Date: 2021-04-12
 * Time: 20:42
 */
class Node{
    public int val;
    public Node next;  //null

    public Node(int val) {
        this.val = val;
    }
}
public class MyLinkedList {
    public Node head=null;

    //穷举的方法创建单链表
   /* public void creatlist(){
        Node node1=new Node(1);
        Node node2=new Node(2);
        Node node3=new Node(3);
        Node node4=new Node(4);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        head.next=node1;

    }
*/

    //头插法
    public void addFirst(int val){
        Node node=new Node(val);
        node.next=this.head;
        this.head=node;

    }
    //尾插法
    public  void addLast(int val){
        Node node =new Node(val);

        if(this.head==null){
            this.head=node;
        }else {
            Node cur =this.head;
            while (cur.next!= null) {
                cur=cur.next;
            }
            cur.next=node;
        }

    }
    //在固定位置插入
    public  void addIndex(int index,int data){
        if(index<0||index>getLength()){
            System.out.println("位置不合法");
            return;
        }if(index==0){
            addFirst(data);
            return;
        }if(index==getLength()){
            addLast(data);
            return;
        }else{
            Node ret=searchSub(index);
            Node node=new Node(data);
            node.next=ret.next;
            ret.next=node;

            }
    }

    //寻找给定位置的Node
    public  Node searchSub(int index){
        Node cur=this.head;
        while(index-1!=0){
            cur=cur.next;
            index--;
        }
        return cur;
    }
    //获取链表长度
    public int getLength(){
        Node cur=this.head;
        int count=0;
        while (cur!=null){
            count++;
            cur=cur.next;
        }
        return count;
    }
    //判断是否存在关键字key在单链表中
    public  boolean contains(int key){
        Node cur=this.head;
        while(cur!=null){
            if(cur.val==key){
                return true;
            }
            cur=cur.next;
        }
        return false;
    }
    //删除第一次出现关键字为key的节点
    public  void remove(int data){
        if(head.val==data){
            this.head=this.head.next;
        }
        Node ret = searchPost(data);
        if(ret==null){
            System.out.println("不存在该关键字");
        }else {

            ret.next = ret.next.next;
        }
    }
    //寻找给定数值的位置
    public Node searchPost(int data){
        Node cur=this.head;
        while(cur.next!=null){
            if(cur.next.val==data){
               return cur;
            }
            cur=cur.next;
        }
        return null;
    }
    //删除所有值为key的
    public  void removeAllkey(int key){
        Node prev=head;
        Node cur=head.next;
        while(cur!=null){
            if(cur.val==key){
              prev.next=cur.next;
              cur=cur.next;
            }
           else {
               prev=cur;
               cur=cur.next;
            }
        }
        if(this.head.val==key){
            head=head.next;
        }
    }
    //清空 链表
    public  void clear(){
        Node cur=head;

        while(cur!=null){
            Node curNext=cur.next;
            cur.next=null;
            cur=curNext;
        }
    }
    //打印单链表
    public void show(){
        Node cur =this.head;
        while(cur!=null){
            System.out.print(cur.val+" ");
            cur=cur.next;
        }

    }
    //链表的中间值
    public Node middleNode(){
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null) {
            fast = fast.next.next;
            slow = slow.next;

        }
        return  slow;
    }
    //链表的反转
    public  Node trunOver(){
        if(head==null||head.next==null){
            return head;
        }
        Node cur=this.head;
        Node prve=cur.next;
        cur.next=null;
        cur=prve;
        while(cur!=null){
            prve=cur.next;
            cur.next=head;
            head=cur;
            cur=prve;
        }
        return  head;
    }

}
