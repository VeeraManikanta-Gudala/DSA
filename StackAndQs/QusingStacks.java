package StackAndQs;

import java.util.Stack;

public class QusingStacks {
    // Implementing a queue using two stacks
    // insert operation is O(1)
    // remove operation is O(n)
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();
    public void insert(int value) {
        stack1.push(value);
    }
    public int remove() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return stack2.pop();
    }
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
    public int peek() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return stack2.peek();
    }
    public static void main(String[] args) {
        QusingStacks queue = new QusingStacks();
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        System.out.println(queue.remove()); // 1
        System.out.println(queue.peek());    // 2
        System.out.println(queue.remove()); // 2
        System.out.println(queue.isEmpty()); // false
        System.out.println(queue.remove()); // 3
        System.out.println(queue.isEmpty()); // true
    }
}