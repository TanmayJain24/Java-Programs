package Linked List;

public class LLBasics {
    public static void Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){//add to first position
        if(head == null){
            head = tail = newNode;
            return;
        }
        //step1 = create new node
        Node newNode = new Node(data);

        //step2 = newNode next = head
        newNode.next = head; //Link

        //step3 - head = newNode
        head = newNode;
    }

    public void addLast(int data){//add to last position
        if(head == null){
            head = tail = newNode;
            return;
        }
        //step1 = create new node
        Node newNode = new Node(data);

        //step2 = tail's next = newNode
        tail.next = newNode;

        //step3 - tail = newNode
        tail = newNode;
    }

    public static void main(String args[]){
        LLBasics ll = new LLBasics();//object creation
        ll.addFirst(1);//TC:- O(1)
        ll.addFirst(2);
        ll.addLast(3);//TC:- O(1)
        ll.addLast(4);
    }
}
