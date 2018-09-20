package one_Foundation.Java_1_4;

import java.util.Stack;

public class Ex30 {
    static class twoWayQueue{
        Stack<Integer> stack = new Stack<>();
        Ex29.steque ste = new Ex29.steque();

        public void leftPush(int k){
            ste.enqueue(k);
        }

        public void rightPush(int k){
            ste.push(k);
        }

        public int leftPop(){
            while (!ste.empty())
                stack.push(ste.pop());

            int temp = stack.pop();
            while (!stack.empty())
                ste.push(stack.pop());

            return temp;
        }

        public int rightPop(){
            return ste.pop();
        }

        public static void main(String[] args) {
            twoWayQueue twoQueue = new twoWayQueue();

            twoQueue.leftPush(1);
            twoQueue.leftPush(2);
            twoQueue.rightPush(3);
            twoQueue.rightPush(4);

            System.out.println(twoQueue.leftPop());
            System.out.println(twoQueue.leftPop());
            System.out.println(twoQueue.rightPop());
            System.out.println(twoQueue.rightPop());
        }
    }
}
