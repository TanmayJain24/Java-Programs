import org.w3c.dom.Node;

public class DoublyLL {
    public static class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //addFirst
    public void addFirst(int data){//add to first position
        
        //step1 = create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        //step2 = newNode next = head
        newNode.next = head; //Link
        head.prev = newNode;
        newNode.prev = null;
        //step3 - head = newNode
        head = newNode;
    }

    //addLast
    public void addLast(int data){//add to last position
        
        //step1 = create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        //step2 = tail's next = newNode
        tail.next = newNode;
        newNode.prev = tail;
        newNode.next = null;
        //step3 - tail = newNode
        tail = newNode;
    }

    //removeFirst
    public int removeFirst(){
        if(size == 0){
            System.out.println("DLL is empty");
            return Integer.MAX_VALUE;//can return MIN_VALUE also because we have to return a invalid value
        } else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;//condition is for size=1 so we directly assigned the size=0 
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    //removeLast
    public int removeLast(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MAX_VALUE;//can return MIN_VALUE also because we have to return a invalid value
        } else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;//condition is for size=1 so we directly assigned the size=0 
            return val;
        }
        //prev : i = size-2
        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }
        int val = tail.data;
        prev.next = null;
        tail.prev = null;
        tail = prev;
        size--;
        return val;
    }

    //Reverse
    public void reverse(){//O(n)
        Node prev = null;
        Node curr = tail = head;//in java asignment is from left to right so at first head value is stored to tail and then it is stored in curr
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        } 
        head = prev;
    }

    //Print
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"<->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        dll.addFirst(5);
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print();
        // dll.addLast(9);
        // dll.print();
        // System.out.println(dll.size);
        // dll.removeFirst();
        // dll.print();
        // dll.removeLast();
        // dll.print();
        dll.reverse();
        dll.print();
    }
}
