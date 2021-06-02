import java.util.Objects;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GaoBo
 * Date: 2021-05-17
 * Time: 21:06
 */
class Person {
    public String id;

    public Person(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
public class HashBuck2<K,V> {

    static class Node<K,V>{
        public K key;
        public V val;
        public Node<K,V> next;
        public Node(K key,V val) {
            this.key = key;
            this.val = val;
        }
    }

    public Node<K,V>[] array;
    public int usedSize;

    public HashBuck2() {
        this.array = (Node<K,V>[])new Node[8];
    }

    public void put(K key,V val) {
        //如何找到key 的正确的位置 下标
        //int index = key % array.length;
        int hash = key.hashCode();
        int index = hash % array.length;

        Node<K,V> cur = array[index];
        while (cur != null) {
            if(cur.key.equals(key)) {
                cur.val = val;
                return;
            }
            cur = cur.next;
        }

        Node<K,V> node = new Node<>(key,val);
        node.next = array[index];
        array[index] = node;
        this.usedSize++;

    }
    public V get(K key) {
        int hash = key.hashCode();
        int index = hash % array.length;
        Node<K,V> cur = array[index];
        while(cur!=null){
            if(cur.key.equals(key)){
                return cur.val;
            }
                cur=cur.next;

        }
        return null;
    }




    public static void main(String[] args) {
        Person person1 = new Person("1001");
        Person person2 = new Person("1001");
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
    }

}
