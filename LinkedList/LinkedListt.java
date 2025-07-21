package LinkedList;

class Node{
    int data;
    Node next;
    public Node(int data, Node next){
        this.data = data;
        this.next = next;
    }   
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class LinkedListt {
    public static Node head;
    public static void insert(int data){
        Node newnNode = new Node(data);
        Node moverNode = head;

        System.out.println(newnNode.data);
        if(head == null){
            moverNode = newnNode;
            // moverNode.next = null;
            head = moverNode;
            return;
        }
        else{
            // Node moverNode = head;
            while (moverNode.next != null) {
                moverNode = moverNode.next;
            }
            moverNode = newnNode;
            // newnNode.next = null;
            // head = moverNode;
        }

    }
    public static void printList(){
        Node moverNode = head;
        while(moverNode.next != null){
            System.out.print(moverNode.data + "->");
            moverNode = moverNode.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        // Node node = new Node(4);
        // System.out.println(node.data);
        // LinkedListt ll = new LinkedListt();

        LinkedListt.insert(1);

                LinkedListt.insert(2);

                        LinkedListt.insert(3);

       LinkedListt.printList();
        
        
    }

}
