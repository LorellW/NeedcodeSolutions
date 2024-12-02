package stack;

import java.util.Stack;

public class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> mins;
    public MinStack() {
        this.stack = new Stack<>();
        this.mins = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if(mins.isEmpty() || mins.peek() >= val){
            mins.push(val);
        }
    }

    public void pop() {
        int temp = stack.pop();
        if(!mins.isEmpty() && mins.peek() == temp){
            mins.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return mins.peek();
    }
}
