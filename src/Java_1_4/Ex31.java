package Java_1_4;

import java.util.Stack;

public class Ex31 {
    static class twoWayQueue{
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> stack3 = new Stack<>();

        public void leftPush(int i){
            stack1.push(i);
        }

        public int leftPop(){
            return stack1.pop();
        }

        public void rightPush(int i){
            while (!stack1.empty()){
                stack2.push(stack1.pop());
            }
            stack2.push(i);
            while (!stack2.empty()){
                stack1.push(stack2.pop());
            }
        }
        public int rightPop(){
            while (!stack1.empty()){
                stack2.push(stack1.pop());
            }
            int temp = stack2.pop();
            while (!stack2.empty()){
                stack1.push(stack2.pop());
            }
            return temp;
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
