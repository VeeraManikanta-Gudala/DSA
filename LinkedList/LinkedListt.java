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
    public  void insert(int data){
        Node newnNode = new Node(data);

        System.out.println(newnNode.data);
        if(head == null){
            head = newnNode;
            return;
        }
        else{
            Node moverNode = head;

            while (moverNode.next != null) {
                moverNode = moverNode.next;
            }
            moverNode.next = newnNode;
            
        }

    }
    public void printList(){
        Node moverNode = head;
        while(moverNode.next != null){
            System.out.print(moverNode.data);
            System.out.print("-->");
            moverNode = moverNode.next;
        }
        System.out.print("null\n");
    }
    public int remove(){
        Node moverNode = head;
        while(moverNode.next != null){
            moverNode = moverNode.next;
        }
        int a = moverNode.data;
        moverNode= null;
        return a;
    }
    public void deleteFirst(){
        head = head.next;
    }

    public static void main(String[] args) {
        LinkedListt ll = new LinkedListt();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.printList();

        int a = ll.remove();
        System.out.println(a + "is removed");
        ll.printList();
                ll.insert(3);
        ll.printList();

        ll.deleteFirst();
                ll.printList();

    }

}
