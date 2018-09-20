package Java_1_4;

import java.util.Stack;

public class Ex26 {
    static class twoStackForQueue{

        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();

        public void push(int node){
             stack1.push(node);
        }

        public int pop(){
            while (!stack1.empty()){
                stack2.push(stack1.pop());
            }
            int temp = stack2.pop();
            while (!stack2.empty()){
                stack1.push(stack2.pop());
            }
            return temp;
        }
    }
    public static void main(String[] args) {
        twoStackForQueue queue = new twoStackForQueue();

        queue.push(1);
        queue.push(2);
        queue.push(3);

        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());

    }
}
