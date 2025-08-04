package StackAndQs;
import java.util.Stack;
public class TwoStackGame {
    // given two stacks and a target value,
    // find if we can pop elements from both stacks so that the sum does not exceed the target value
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();
    // we will use recursion to explore all combinations and return the length of the longest valid sequence
    public int longestValidSequence(int target) {
        return longestValidSequenceHelper(target, 0, 0);
    }

    private int longestValidSequenceHelper(int target, int sum1, int sum2) {
        if (sum1 > target || sum2 > target) {
            return 0;
        }
        int maxLength = 0;
        if (!stack1.isEmpty()) {
            int value = stack1.pop();
            maxLength = Math.max(maxLength, 1 + longestValidSequenceHelper(target, sum1 + value, sum2));
            stack1.push(value);
        }
        if (!stack2.isEmpty()) {
            int value = stack2.pop();
            maxLength = Math.max(maxLength, 1 + longestValidSequenceHelper(target, sum1, sum2 + value));
            stack2.push(value);
        }
        return maxLength;
    }
    public static void main(String[] args) {
        TwoStackGame game = new TwoStackGame();
        game.stack1.push(1);
        game.stack1.push(2);
        game.stack2.push(1);
        game.stack2.push(6);
        game.stack1.push(5);
        game.stack2.push(3);
        game.stack2.push(7);
        int target = 8;
        int result = game.longestValidSequence(target);
        System.out.println("Longest valid sequence length: " + result); // Output will depend on the stacks' contents
    }

}
