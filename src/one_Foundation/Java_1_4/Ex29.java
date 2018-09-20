package one_Foundation.Java_1_4;

import java.util.Stack;

public class Ex29 {
    /*
        后期优化
        1)  可迭代
        2） 有机会可以讲解
        3） 模版类
     */
    public static class steque{
        private Stack<Integer> stack1 = new Stack<>();
        private Stack<Integer> stack2 = new Stack<>();

        // 添加对象在尾部
        public void push(int k){
            stack1.push(k);
        }

        public int pop(){
            return stack1.pop();
        }

        public void enqueue(int k){
            while (!stack1.empty())
                stack2.push(stack1.pop());
            stack2.push(k);
            while (!stack2.empty())
                stack1.push(stack2.pop());
        }

        public boolean empty(){
            return stack1.size() == 0;
        }

        public static void main(String[] args) {
            steque ste = new steque();
            ste.push(1);
            ste.push(2);
            ste.enqueue(3);

            System.out.println(ste.pop());
            System.out.println(ste.pop());
            System.out.println(ste.pop());
        }
    }
}
