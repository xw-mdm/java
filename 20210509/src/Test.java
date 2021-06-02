import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created with Intellij IDEA
 * Description:
 * User: 23871
 * Date: 2021-05-09
 * Time: 12:27
 */
public class Test {
    public static void main(String[] args) {
        PriorityQueue<Integer>priorityQueue
                =new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        priorityQueue.offer(10);
        priorityQueue.offer(1);
        priorityQueue.offer(14);
        priorityQueue.offer(16);
        System.out.println(priorityQueue.peek());//默认是一个小堆
    }
    public static void main1(String[] args) {
        PriorityQueue<Integer>priorityQueue =new PriorityQueue<>();
        priorityQueue.offer(10);
        priorityQueue.offer(1);
        priorityQueue.offer(14);
        priorityQueue.offer(16);
        System.out.println(priorityQueue.peek());//默认是一个小堆
    }
    public static void main2(String[] args) {
        TestHeap testHeap=new TestHeap(10);
        int []a={27,15,19,18,28,34,65,49,25,37};

        testHeap.creatHeap(a);
        testHeap.push(16);
        testHeap.pop();
        System.out.println("kjsg");
    }
}
