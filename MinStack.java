public class MinStack{
    private Node node ;
    private class Node {
        int value;
        int min;
        Node next;

        Node(int value, int min) {
            this.value = value;
            this.min = min;
        }
    }
    public void push(int value){
        if(node == null) {
            node = new Node(value, value);
        } else {
            int mini = Math.min(value, node.min);
            Node newNode = new Node(value, mini);
            newNode.next = node;
            node = newNode;
        }
    }
    public int pop(){
        if(node == null) {
            throw new IllegalStateException("Stack is empty");
        }
        int value = node.value;
        node = node.next;
        return value;
    }
}