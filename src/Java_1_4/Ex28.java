package Java_1_4;

import java.util.ArrayDeque;
import java.util.Queue;

public class Ex28 {
    /*
        后期优化
        1)  可迭代
        2） 有机会可以讲解
        3） 模版类
     */
    static class oneQueueForStack{
        Queue<Integer> queue = new ArrayDeque<>();

        public void push(int t){
            queue.add(t);
        }

        public int pull(){
            int count = queue.size();
//            System.out.println(count);
            int i = 0;
            while (i < count - 1){
                queue.add(queue.poll());
                i++;
            }
            return queue.poll();
        }
    }

    public static void main(String[] args) {
        oneQueueForStack queueForStack = new oneQueueForStack();

        queueForStack.push(1);
        queueForStack.push(2);
        queueForStack.push(3);

        System.out.println(queueForStack.pull());
    }
}
