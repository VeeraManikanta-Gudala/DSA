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
    public void insertAt(int data, int index){
        Node newNode = new Node(data);
        Node moverNode = head;
        for(int i = 0; i < index ; i++){
            moverNode = moverNode.next;   
        }
        Node temp = moverNode.next;
        moverNode.next = newNode;
        newNode.next = temp;
    }
    public int size(){
        Node movNode = head;
        int s = 0;
        while(movNode.next != null){
            s++;
            movNode = movNode.next;
        }
        return s;
    }

    public static void main(String[] args) {
        LinkedListt ll = new LinkedListt();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.insert(4);
        ll.insert(5);
        ll.insert(6);
        ll.printList();

        int a = ll.remove();
        System.out.println(a + "is removed");
        ll.printList();
        //         ll.insert(3);
        
        ll.deleteFirst();
        ll.printList();
        ll.insertAt(9,2);
        ll.printList();System.out.println(ll.size());

    }

}
