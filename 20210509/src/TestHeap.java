import java.util.*;

/**
 * Created with Intellij IDEA
 * Description:
 * User: 23871
 * Date: 2021-05-09
 * Time: 11:50
 */


public class TestHeap {
    public int[] elem;
    public int usedsize;

    public TestHeap(int usedsize) {
        this.elem = new int[10];
    }

    public void adjustdown(int parent, int len) {
        int child = 2 * parent + 1;
        while (child < len) {
            if (child + 1 < len && this.elem[child] < this.elem[child + 1]) {
                child++;
            }
            if (this.elem[child] > this.elem[parent]) {
                int tmp = this.elem[child];
                this.elem[child] = this.elem[parent];
                this.elem[parent] = tmp;
                parent = child;
                child = 2 * parent + 1;
            } else {
                break;
            }
        }
    }

    public void creatHeap(int[] array) {
        for (int i = 0; i < array.length; i++) {
            this.elem[i] = array[i];
            this.usedsize++;
        }
        for (int p = (this.usedsize - 1 - 1) / 2; p >= 0; p--) {
            adjustdown(p, usedsize);
        }
    }

    public void adjustup(int child) {
        int parent = (child - 1) / 2;
        while (child > 0) {
            if (this.elem[child] > this.elem[parent]) {
                int tmp = this.elem[child];
                this.elem[child] = this.elem[parent];
                this.elem[parent] = tmp;
                parent = child;
                child = 2 * parent + 1;
            } else {
                break;
            }
        }
    }

    public void push(int key) {
        if (isFull()) {
            this.elem = Arrays.copyOf(this.elem, this.elem.length * 2);
        }
        this.elem[this.usedsize] = key;
        this.usedsize++;
        adjustup(this.usedsize - 1);
    }

    public boolean isFull() {
        return this.usedsize == this.elem.length;
    }

    //出队的情况
    public void pop() {
        if (isEmpty()) {
            return;
        }
        int tmp = this.elem[0];
        this.elem[0] = this.elem[this.usedsize - 1];
        this.elem[this.usedsize - 1] = tmp;
        this.usedsize--;
        adjustdown(0, usedsize);
    }

    public boolean isEmpty() {
        return this.usedsize == 0;
    }

    //得到对顶
    public int gettop() throws UnsupportedOperationException {
        if (isEmpty()) {
            throw new UnsupportedOperationException("优先级队列为空");
        }
        return this.elem[0];
    }

    public void topK(int k, int[] a) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        for (int i = 0; i < a.length; i++) {
            if (k > 0) {
                priorityQueue.offer(a[i]);
                k--;
            } else {

                if (a[i] > priorityQueue.peek()) {
                    priorityQueue.poll();
                    priorityQueue.offer(a[i]);
                }
            }
            System.out.println(priorityQueue);
        }
    }

    class Solution {
        public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
            PriorityQueue<List<Integer>> queue = new PriorityQueue<>(k, (o1, o2) -> {
                return (o2.get(0) + o2.get(1)) - (o1.get(0) + o1.get(1));
            });
            for (int i = 0; i < Math.min(nums1.length, k); i++) {
                for (int j = 0; j < Math.min(nums2.length, k); j++) {
                    if (queue.size() == k && nums1[i] + nums2[j] > queue.peek().get(0) + queue.peek().get(1)) {
                        break;
                    }
                    if (queue.size() == k) {
                        queue.poll();
                    }
                    List<Integer> pair = new ArrayList<>();
                    pair.add(nums1[i]);
                    pair.add(nums2[j]);
                    queue.add(pair);
                }
            }
            List<List<Integer>> res = new LinkedList<>();
            for (int i = 0; i < k && !queue.isEmpty(); i++) {
                res.add(queue.poll());
            }
            return res;
        }
    }
}
class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1, o2) -> o2 - o1);
        for (int s : stones) {
            priorityQueue.offer(s);
        }
        while (priorityQueue.size() > 1) {
            int a = priorityQueue.poll();
            int b = priorityQueue.poll();
            if (a > b) {
                priorityQueue.offer(a - b);
            }
        }
        if (priorityQueue.isEmpty()) {
            return 0;
        }
        return priorityQueue.poll();
    }
}

