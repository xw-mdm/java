import test.src.Mylist;

import static sun.plugin2.os.windows.OVERLAPPED.size;

/**
 * Created with Intellij IDEA
 * Description:
 * User: 23871
 * Date: 2021-04-17
 * Time: 8:58
 */
class ListNode{
    public int val;
    public  ListNode prev;
    public ListNode next;  //null

    public ListNode(int val) {
        this.val = val;
    }
}
public class MyList {
    public ListNode head;
    public ListNode tail;
    public MyList(){
        ListNode node=new ListNode(-1);
        this.head=node;
        this.tail=node;

    }


    //头插法
    public void addFirst(int val) {
        ListNode node=new ListNode(val);
        if(head==null){
            head=node;
            tail=node;
        }else {
            node.next=head;
            head.prev=node;
            head=node;
        }
    }
    public void display(){
       ListNode cur =head;
       while(cur!=null){
           System.out.print(cur.val+" ");
           cur=cur.next;
       }

    }
    //尾插法
    public void addLast(int data){
        ListNode node=new ListNode(data);
        if(tail==null){
            head=node;
            tail=node;
        }else {
            tail.next=node;
            node.prev=tail;
            tail=node;
        }

    }
     //任意位置插入,第一个数据节点为0号下标
    public boolean addIndex(int index, int data){
        if (index < 0 || index > size()){
            System.out.println("位置不合法");
            return false;
        }
        if (index == 0) {
            addFirst(data);
            return true;
        }
        if (index == size()) {
            addLast(data);
            return true;
        }
        else{
            ListNode ret=findIndex(index);
            ListNode node = new ListNode(data);
            node.next = ret.next;
            node.prev=ret;
            ret.next = node;
            ret.next.prev=node;
        }
        return true;
    }
    public  ListNode findIndex(int index){
        ListNode cur=head;
        while(index-1!=0){
            cur=cur.next;
            index--;
        }
        return  cur;
    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        ListNode cur=head;
        while(cur!=null){
            if(cur.val==key){
                return  true;
            }
            cur=cur.next;
        }
       return false;
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key){
        ListNode cur=head;
        while(cur!=null){
            if(cur.val==key){
                //删除头结点
                if(this.head.val==key){
                    this.head=head.next;
                    if(this.head!=null){
                        this.head.prev=null;
                        this.tail=null;
                    }

                }else {
                    //中间和尾巴
                    if(cur.next!=null){
                        cur.prev.next = cur.next;
                        cur.next.prev = cur.prev;
                    }else {
                        cur.prev.next = cur.next;
                        tail = cur.prev;
                    }
                }
                return;
                }else {
                        cur=cur.next;
                }
            }

    }
    //删除所有值为key的节点
    public void removeAllKey(int key){
        ListNode cur=head;
        while(cur!=null){
            if(cur.val==key) {
                //删除头结点
                if (this.head.val == key) {
                    this.head = head.next;
                    if (this.head != null) {
                        this.head.prev = null;
                        this.tail = null;
                    }
                } else {
                    //中间和尾巴
                    if (cur.next != null) {
                        cur.prev.next = cur.next;
                        cur.next.prev = cur.prev;
                    } else {
                        cur.prev.next = cur.next;
                        tail = cur.prev;
                    }
                }
            }
                cur=cur.next;
        }
    }
    //得到单链表的长度
    public int size(){
            ListNode cur = this.head;
            int count = 0;
            while (cur != null) {
                count++;
                cur = cur.next;
            }
            return count;
    }
    public void clear(){
        ListNode cur=head;
        while(cur!=null){
            ListNode curNext=cur.next;
            cur.prev=null;
            cur.next=null;
            cur=cur.next;
        }
        head=null;
        tail=null;
    }
}
