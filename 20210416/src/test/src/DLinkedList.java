package test.src;

/**
 * Created with Intellij IDEA
 * Description:
 * User: 23871
 * Date: 2021-04-18
 * Time: 14:43
 */

class DLinkedNode{
    public int val;
    public DLinkedNode prev = null;
    public DLinkedNode next = null;

    public DLinkedNode(int val){
        this.val = val;
    }
}

public class DLinkedList {
    private DLinkedNode head = null;

    public DLinkedList(){
        //创建傀儡节点
        head = new DLinkedNode(-1);
        //带环
        head.next = head;
        head.prev = head;
    }

    public void addFirst(int data){
        //创建一个新的节点
        DLinkedNode Node = new DLinkedNode(data);
        DLinkedNode dummynode = head.next;

        head.next = Node;
        Node.next = dummynode;

        Node.prev = head;
        dummynode.prev = Node;
    }

    public void display(){
        for(DLinkedNode cur = head.next;
            cur != head;
            cur = cur.next){
            System.out.print(cur.val);
            if(cur.next != head){
                System.out.print(",");
            }
        }
    }
    public void addLast(int data){
        //创建一个新节点
        DLinkedNode newNode = new DLinkedNode(data);
        //记录最后一个节点 此节点是新节点的prev
        DLinkedNode prev = head.prev;
        newNode.next = head;
        head.prev = newNode;
        prev.next = newNode;
        newNode.prev = prev;
    }

    public int size(){
        int size = 0;
        for(DLinkedNode cur = head.next; cur != head; cur = cur.next){
            size++;
        }
        return size;
    }

    //返回指定位置的元素
    public DLinkedNode getPos(int index){
        DLinkedNode cur = head.next;
        for(int i = 0; i < index; i++){
            cur = cur.next;
        }
        return cur;
    }


    public void addIndex(int index,int data){
        //判断位置是否合法
        int size = size();
        if(index < 0 || index > size){
            return;
        }

        //头插情况
        if (index == 0){
            addFirst(data);
            return;
        }

        //尾插情况
        if(index == size){
            addLast(data);
            return;
        }

        //中间元素
        DLinkedNode next = getPos(index);
        DLinkedNode prev = next.prev;

        DLinkedNode newNode = new DLinkedNode(data);
        newNode.next = next;
        next.prev = newNode;
        prev.next = newNode;
        newNode.prev = prev;
    }

    //查找是否包含关键字data
    public boolean contains(int data){
        DLinkedNode cur = head.next;
        while (cur != head){
            if(cur.val == data){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    public DLinkedNode find(int key){
        for(DLinkedNode cur = head.next; cur != head; cur = cur.next){
            if(cur.val == key){
                return cur;
            }
        }
        return null;
    }

    //删除第一次出现的关键字
    public void remove(int key){
        //找到关键字
        DLinkedNode toRemove = find(key);

        if(toRemove == null){
            return;
        }

        DLinkedNode prev = toRemove.prev;
        DLinkedNode next = toRemove.next;
        prev.next = next;
        next.prev = prev;
    }

    public void removeAllKey(int key) {
        while (true) {
            DLinkedNode toRemove = find(key);

            if (toRemove == null) {
                return;
            }

            DLinkedNode prev = toRemove.prev;
            DLinkedNode next = toRemove.next;
            prev.next = next;
            next.prev = prev;
        }
    }

    public void clear(){
        head.next = head;
        head.prev = head;
    }

}


